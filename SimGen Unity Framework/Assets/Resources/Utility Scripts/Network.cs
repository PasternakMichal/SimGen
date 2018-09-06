using UnityEngine;
using System.Collections;
using System.Net.Sockets;
using System.Net;
using System;
using System.Text;
using UnityEngine.UI;



public class Network {

	public bool ON = false;
	private Socket _serverSocket;
	container msgbox;
	int port;

	public Network(int p, string id,int cap){
		port = p;
		msgbox = new container (id, cap);
	}

	public void StartNetwork(){
		StartServer ();
	}

	private void StartServer()
	{
		try 
		{
			//Application.runInBackground = true;
			_serverSocket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
			_serverSocket.Bind(new IPEndPoint(IPAddress.Any, port));
			_serverSocket.Listen(1); // open and bind server socket
			_serverSocket.BeginAccept(new AsyncCallback(AcceptCallback),null);
			Debug.Log("Server Started");
			ON = true;
		}
		catch (Exception ex)
		{
			Debug.Log (ex);
		}
	}

	private void AcceptCallback(IAsyncResult AR)
	{
		try
		{
			Socket _clientSocket;
			_clientSocket = _serverSocket.EndAccept(AR);
			StateObject so2 = new StateObject();
			Debug.Log("connected!");
			so2.workSocket = _clientSocket;
			msgbox.workSocket = _clientSocket;
			so2.id = 1;
			_clientSocket.BeginReceive(so2.buffer,0,StateObject.BUFFER_SIZE,SocketFlags.None, new AsyncCallback(ReceiveCallback), so2);
		}
		catch (Exception ex)
		{
			Debug.Log (ex);
		}

	}


	private void ReceiveCallback(IAsyncResult AR)
	{
		try
		{
			StateObject so = (StateObject) AR.AsyncState;
			Socket _clientSocket = so.workSocket;
			_clientSocket.EndReceive(AR);
			if(msgbox.isFull()){
				Debug.Log("msgbox full. quitting.");
				return;
			}
			string text = Encoding.ASCII.GetString(so.buffer);
			if (!text.Contains(",")){
				Debug.Log("invalid msgs, quitting");
				return;
			}
			Debug.Log("msg from Thread :"+ text+";");
			msgbox.writeToContainer(text); // write message to container
			// check if still should be connected. if not then kill thread. 
			if (ON == true)
			{
				StateObject so2 = new StateObject();
				so2.workSocket = _clientSocket;
				_clientSocket.BeginReceive(so2.buffer,0,StateObject.BUFFER_SIZE,SocketFlags.None, new AsyncCallback(ReceiveCallback), so2);
			}
			else {
				_clientSocket.Shutdown(SocketShutdown.Both);
				_clientSocket.Close();
				_serverSocket.Shutdown(SocketShutdown.Both);
				_serverSocket.Close();
				Debug.Log("Thread terminated.");
			}
			
		}
		catch (Exception ex)
		{
			Debug.Log (ex);
		}

	}
	public void SendMessage(string message){
		try{
			StateObject so2 = new StateObject();
			byte[] buffer = Encoding.ASCII.GetBytes(message+"\n");
			//msgbox.workSocket.Send(buffer);

			so2.workSocket = msgbox.workSocket;
			so2.workSocket.BeginSend(buffer,0,buffer.Length,0,new AsyncCallback(SendCallback),so2.workSocket);

			Debug.Log("length"+message.Length+" tried to send: " + message);
		}
		catch (SocketException){
		} //Server Closed
		catch (Exception ex)
		{
			Debug.Log (ex);
		}


	}
	private void SendCallback(IAsyncResult AR)
	{
		try{
			Socket s = (Socket) AR.AsyncState;
			s.EndSend(AR);
			//StateObject so2 = new StateObject();
			//so2.workSocket = s;
			//s.BeginReceive(so2.buffer,0,StateObject.BUFFER_SIZE,SocketFlags.None, new AsyncCallback(ReceiveCallback),s);

		}
		catch (Exception ex)
		{
			Debug.Log (ex);
		}
	}

	public string getMessage(){
		return msgbox.readFromContainer ();
	}

	public bool isContainerEmpty(){
		return msgbox.isEmpty ();
	}
		
	public bool status(){
		return ON;
	}
	public bool status(bool b){
		ON = b;
		return ON;
	}
}


public class StateObject{
	public int id = 99;
	public Socket workSocket = null;
	public const int BUFFER_SIZE = 2048;
	public byte[] buffer = new byte[BUFFER_SIZE];
	//public StringBuilder sb = new StringBuilder();
}

public class container{ // dual pointer list
	public int capacity;
	public string[] messagequeue;
	public string name = ""; 
	public string containerID = null;
	public int head = 0;
	public int tail = 0;
	public Socket workSocket = null;

	public container(string ID, int capacity1){
		containerID = ID;
		capacity = capacity1;
		messagequeue = new string[capacity];
	}
	public void assignName(string s){
		name = s;
	}

	public void writeToContainer(string text){
		if (isFull () == false) {
			messagequeue [tail] = text;
			if (tail == capacity - 1)
				tail = 0;
			else
				tail++;
		} else {
			Debug.Log ("container #" + containerID + "is Full!");
		}
	}

	public string readFromContainer(){
		string msg;
		if (messagequeue [head] == null){
			Debug.Log ("container " + containerID + " is empty");
			msg = "empty";
			return msg;
		}else {
			msg = messagequeue [head];
			messagequeue [head] = null;
			if (head ==capacity-1)
				head =0;
			else 
				head++;
			return msg;
		}
			

	}
	public bool isFull(){
		if ((tail+1)%capacity == head)
			return true;
		else
			return false;

	}
	public bool isEmpty(){
		if (head == tail)
			return true;
		else
			return false;
	}

}

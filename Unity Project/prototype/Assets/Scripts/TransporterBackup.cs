//using UnityEngine;
//using System.Collections;
//using UnityEngine.Networking;
//using System.Runtime.Serialization.Formatters.Binary; 
//using System.IO;
//
//
//public class Transporter : MonoBehaviour {
//
//	int myReliableChannelId;
//	int socketId;
//	public int socketPort = 8888;
//	public string myIp = "10.217.138.206";
//	int connectionId;
//
//	void Start () {
//		NetworkTransport.Init ();
//		ConnectionConfig config = new ConnectionConfig ();
//
//		myReliableChannelId = config.AddChannel (QosType.Reliable);
//
//		int maxConnections = 10;
//		HostTopology topology = new HostTopology (config, maxConnections);
//		socketId = NetworkTransport.AddHost (topology, socketPort);
//		Debug.Log ("Socket Open. SocketId is: " + socketId);
//	}
//
//	public void Connect (){
//		byte error;
//		connectionId = NetworkTransport.Connect (socketId, myIp, socketPort, 0, out error);
//		Debug.Log ("connected to the server. ConnectionId: " + connectionId);
//
//	}
//	public void SendSocketMessage() {
//		byte error;
//		byte[] buffer = new byte[1024];
//		Stream stream = new MemoryStream (buffer);
//		BinaryFormatter formatter = new BinaryFormatter ();
//		formatter.Serialize (stream, "hies!");
//
//		int bufferSize = 1024;
//		Debug.Log("sending message");
//
//		NetworkTransport.Send (socketId, connectionId, myReliableChannelId, buffer, bufferSize, out error);
//		Debug.Log ("message sent..");
//
//	}
//	public void Disconnect() {
//		byte error;
//		NetworkTransport.Disconnect (socketId, connectionId, out error);
//	}
//
//	void Update () {
//
//		int recHostId;
//		int recConnectionId;
//		int recChannelId;
//		byte[] recBuffer = new byte[1024];
//		int bufferSize = 1024;
//		int dataSize;
//		byte error;
//		NetworkEventType recNetworkEvent = NetworkTransport.Receive (out recHostId, out recConnectionId, out recChannelId, recBuffer, bufferSize, out dataSize, out error);
//
//		switch (recNetworkEvent)
//		{
//		case NetworkEventType.Nothing:
//			break;
//		case NetworkEventType.ConnectEvent:
//			Debug.Log ("incoming connection received ConnectionId: "+recConnectionId);
//			break;
//		case NetworkEventType.DataEvent:
//			Debug.Log ("Data event!");
//			Stream stream = new MemoryStream (recBuffer);
//			BinaryFormatter formatter = new BinaryFormatter ();
//			string message = formatter.Deserialize (stream) as string;
//			Debug.Log ("incoming message...  " + message);
//			break;
//		case NetworkEventType.DisconnectEvent:
//			Debug.Log ("remote client has disconnected, hostID: " + recHostId + " connectionID: "+ recConnectionId);
//			break;
//		}
//	
//	}
//}

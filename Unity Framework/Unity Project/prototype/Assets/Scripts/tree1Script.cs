using System.Collections;
using System.Collections.Generic;
using UnityEngine;
public class tree1Script : MonoBehaviour {
	public sateliteCameraScript cam;
	void Start () {
		Transform t = GetComponentInChildren<Transform>();
		t.localScale = new Vector3 (1f,1f,1f);
		t.localPosition = new Vector3(20f,20f,1f);
		Rigidbody rb = gameObject.GetComponent<Rigidbody> ();
		rb.mass = 1000;
		
		// load all meshes in model and find the specified mesh
		MeshFilter myMeshFilter = gameObject.GetComponent<MeshFilter> ();
		GameObject loadedModel = Resources.Load("tree") as GameObject; 
		// first check object, if not found then check all children.
		if (loadedModel.GetComponent<MeshFilter> () != null && loadedModel.GetComponent<MeshFilter> ().sharedMesh.name ==("Cylinder")) {
			myMeshFilter.mesh = loadedModel.GetComponent<MeshFilter> ().sharedMesh;
		} else {
			MeshFilter[] loadedMeshFilters = loadedModel.GetComponentsInChildren<MeshFilter> ();
			foreach (MeshFilter mf in loadedMeshFilters) { 
				if (mf.sharedMesh.name == "Cylinder") {
					myMeshFilter.mesh = mf.sharedMesh; 
					break;
				}
			}
		}
		// Set the renderer to specified image 
		Renderer myRenderer = gameObject.GetComponent<Renderer>();
		myRenderer.material = new Material(Shader.Find("Diffuse"));
		myRenderer.material.mainTexture = Resources.Load("leaves") as Texture;
		// Set Collider
		MeshCollider myMeshCollider = gameObject.GetComponent<MeshCollider> ();
		myMeshCollider.sharedMesh = myMeshFilter.mesh;
		
	}
	
	void Update () {
		// on going monitoring or changing things based on object
	}
	void focus(){
		cam.observedObject = gameObject;
	}
}   		

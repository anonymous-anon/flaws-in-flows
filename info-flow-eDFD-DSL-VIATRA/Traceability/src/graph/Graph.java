/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Graph#getSubgraphs <em>Subgraphs</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Subgraphs</b></em>' containment reference list.
	 * The list contents are of type {@link graph.Subgraphs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraphs</em>' containment reference list.
	 * @see graph.GraphPackage#getGraph_Subgraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subgraphs> getSubgraphs();

} // Graph

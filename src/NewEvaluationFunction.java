package aima.core.search.informed;

import aima.core.search.framework.EvaluationFunction;
import aima.core.search.framework.HeuristicFunction;
import aima.core.search.framework.Node;
import aima.core.search.framework.PathCostFunction;

//
// Created by Shane Zabel using AStarEvaluationFunction as a template
// New evaluation function 
//
public class NewEvaluationFunction implements EvaluationFunction {

	private PathCostFunction gf = new PathCostFunction();
	private HeuristicFunction hf = null;

	public NewEvaluationFunction(HeuristicFunction hf) {
		this.hf = hf;
	}

//
// Returns <em>0.25*g(n)</em> the cost to reach the node, plus <em>0.75*h(n)</em> the
// heuristic cost to get from the specified node to the goal.
//
// @param n
//            a node
// @return 0.25*g(n) + 0.75*h(n)
//
	public double f(Node n) {
		// f(n) = g(n) + h(n)
		return 0.25*gf.g(n) + 0.75*hf.h(n.getState());
	}
}

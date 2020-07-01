package aima.core.search.informed;

import aima.core.search.framework.HeuristicFunction;
import aima.core.search.framework.QueueSearch;

public class NewSearch extends BestFirstSearch {

	//
	// Created by Shane Zabel using AStarSearch as a template
	// Constructs a modified A* search from the specified search problem and heuristic
	// function. 
	//
	// @param search
	//            a search problem
	// @param hf
	//            a heuristic function <em>h(n)</em>, which estimates the cost
	//            of the cheapest path from the state at node <em>n</em> to a
	//            goal state.
	//
	public NewSearch(QueueSearch search, HeuristicFunction hf) {
		super(search, new NewEvaluationFunction(hf));
	}
}

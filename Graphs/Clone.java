package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clone {
    
    
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


class Solution {
    public Node cloneGraph(Node node) {

        if(node == null) return null;
        Map<Integer, Node> map = new HashMap<>();
        return cloneGraph(node , map);
    }
    private Node cloneGraph(Node node , Map<Integer , Node> map){
        if(map.containsKey(node.val)) return map.get(node.val);
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        for(Node neighbour : node.neighbors) copy.neighbors.add(cloneGraph(neighbour,map));
        return copy;
    }
}
}

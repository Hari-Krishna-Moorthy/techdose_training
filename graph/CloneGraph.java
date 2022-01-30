class CloneGraph {
	public Node cloneGraph(Node node) {
        Stack<Node> stk = new Stack<Node>();
        
        if(node == null) 
            return null;
        List<Node> map = new ArrayList<Node>();
        
        for(int i=0;i<101;i++)
            map.add(null);
                
        Node tempNode = new Node(node.val);
        
        map.set(tempNode.val, tempNode);
        stk.push(node);

        while(!stk.empty()) {
            Node topNode = stk.pop();
            
            for(Node tempNeighorsNode : topNode.neighbors) {
                // System.out.println(tempNeighorsNode.val);
                if(map.get(tempNeighorsNode.val)==null) {
                    map.set(tempNeighorsNode.val , new Node(tempNeighorsNode.val));
                    stk.push(tempNeighorsNode);
                }
                map.get(topNode.val).neighbors.add(map.get(tempNeighorsNode.val));
            } 
        }
        
        // for(Node n : map) {
        //     if(n!=null) {
        //         System.out.print(n.val + " ");
        //         for(Node ne : n.neighbors) 
        //             System.out.print("Neg : " + ne.val + " ");
        //     }
        //     System.out.println();
        // }
        
        return tempNode;
                      
    }
}
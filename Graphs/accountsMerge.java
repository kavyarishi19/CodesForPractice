package Graphs;

import java.util.HashMap;
import java.util.List;

public class accountsMerge {

    int[] par;
    public int findPar(int u){
        if(par[u] == u) return u;

        return par[u] = findPar(par[u]);
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts){
        par = new int[1001];

        for(int i=0;i<1001;i++){
            par[i] = i;
        }

        HashMap<String,Integer> euid = new HashMap<>(); // email to id

        HashMap<String, String> etn = new HashMap<>(); // email to name

        int uid=0;
        for(List<String> account : accounts){
            String name ="";

            for(String email : account){
                if(name == ""){
                    name = email;
                    continue;
                }

                if(euid.containsKey(email)){
                    euid.put(email , uid);
                    uid++;
                }

                if(!etn.containsKey(email)){
                    etn.put(email, name);
                }

                int e1uid = euid.get(account.get(1));
                int cuid = euid.get(email);

                int p1 = findPar(e1uid);
                int p2= findPar(cuid);

                if(p1 != p2){
                    par[p2] = p1;
                }
            }
        }
        
        HashMap<Integer, List<String>> pte= new HashMap<>();

        for(String email : etn.keySet()){
            int uid = euid.get(email);

            int par = findPar(uid);

            if(pte.containsKey(par)){
                pte.get(par).add(email);
            }else{
                pte.put(par, new ArrayList<>());
                pte.get(par).add(email);
            }
        }

        
    
    }

}

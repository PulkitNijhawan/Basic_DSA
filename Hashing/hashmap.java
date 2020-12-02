import java.util.*;
public class hashmap {
     public static class map{
        public class node{
            Integer value;
            Integer key; //we can pass any DT this way
            node(int v,int k){
                this.key=k;this.value=v;
            }
        }
        LinkedList<node>[] hashMap=new LinkedList[10];
        int nodecnt=0;
        public int size(){
            return nodecnt;
        }
        public boolean isEmpty(){
            return nodecnt==0;
        }
        public int hashIdx(Integer key){
            int hc=key.hashCode();
            return hc%hashMap.length;
        }
        public node findNode(Integer key){
            int Idx=hashIdx(key);
            LinkedList<node> temp=hashMap[Idx];
            int size=temp.size();
            if(temp==null)return null;
            node ans=null;
            while(size-->0){
                node found=group.getFirst();
                if(found.key==key) {
                    ans=found;
                    break;
                }

                group.addLast(group.removeFirst());
            
            return rn;
            }
        }
        public boolean containsKey(Integer key){
            node found=findNode(key);
            return found!=null?true:false;
        }
        public Integer get(Integer key){
            node ans=findNode(key);
            return ans!=null?ans.value:null;
        }
        public Integer remove(Integer key){
            node ans=findNode(key);
            if(ans!=null){
                int idx=hashCode();
                LinkedList<node> group=map[idx];
                group.removeFirst();
                nodecnt--;
            }
            return ans!=null?ans.value:null;
        }
        public void put(Integer k,Integer v){
            node already=findNode(k);
            if(already!=null){
                already.value=v;
            }
            else{
                int idx=hashIdx(k);
                LinkedList<node> group=map[idx];
                node n=new node(k,v);
                group.addLast(n);
                nodecnt++;
            }
        }
        

     }
}
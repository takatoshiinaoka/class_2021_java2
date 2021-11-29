class Display{
    private String name;
    private int width;
    private int height;
    private boolean speaker;
    public Display(){
        width=0;
        height=0;
        speaker=false;
    }
    public Display(String s){
        name=s;
        width=0;
        height=0;
        speaker=false;
    }
    public Display(String s,int w,int h){
        name =s;
        width=w;
        height=h;
        speaker=false;
    }
    public Display(String s,int w,int h,boolean sp){
        name =s;
        width=w;
        height=h;
        speaker=sp;
    }
    String getDisplay(){
        // if(speaker){
        //     return (name+"("+(width)+"×"+(height)+")※スピーカー付き");
        // }else{
        //     return (name+"("+(width)+"×"+(height)+")※スピーカー無し");
        // }
        String sp;
        if(speaker){
            sp="付き";
        }
        else{
            sp="無し";
        }
        return (name+"("+(width)+"×"+(height)+")※スピーカー"+sp);
    }
}
class Assignment4_8{
    public static void main(String[] args){
        Display[] ds = new Display[3];
        ds[0] = new Display("Dell P2815Q Ultra HD(4K)", 3840, 2160, true);
        ds[1] = new Display("Iiyama ProLite E2471HSD", 1920, 1080);
        ds[2] = new Display("LG 29UB65-P");
        for(int i=0;i<ds.length;i++){
            System.out.println(ds[i].getDisplay());
        }
    }
}

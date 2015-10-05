

public class FileHelp{
    public static void main(String args[]){
        Help helpobj = new Help("F:\\downloads\\shildt\\src\\helpfile");
        String topic;
        System.out.println("Try the help system or enter 'stop' to exit.");
        do{
            topic = helpobj.getSelection();
            if (!helpobj.helpon(topic)){
                System.out.println("404, you know...");
            }
        }while(topic.compareTo("stop") != 0);
    }
}

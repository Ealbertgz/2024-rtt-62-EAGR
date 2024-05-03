package org.example;

public class StringBufferExample {
    public static void main(String[] args){
        //012345678901
        //filename.txt

        StringBuffer sb = new StringBuffer("filename.txt");
        sb.insert(0, "new_");
        //012345678901
        //new_filename.txt
        System.out.println(sb);

        sb.replace(0,4,"old_");

        //012345678901
        //old_filename.txt
        System.out.println(sb);

        //The thing to memorize for the KBA ...is that ...replace is going to first
        //delete the items from 0 to 4 then insert the string at position start

        sb.replace(0,4,"very_old_");
        System.out.println(sb);

        sb.reverse();
        //012345678901
        //txt.emanelif_dlo.yrev
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
        //012345678901
        //emanelif_dlo.yrev
    }
}


package evnnya;

/**
 *
 * @author efralerma
 */
public class cls_encriptamiento {
     String metodo_encriptamiento(String cadena){
        
        char [] cadena_palabra = cadena.toCharArray();
        char [] cadena_encriptada = new char[cadena.length()]; 
     
        for(int i=0;i<cadena.length();i++){
            if(cadena_palabra[i]=='a'){
                cadena_encriptada[i]='%';
            }
            else if(cadena_palabra[i]=='b'){
                cadena_encriptada[i]='&';
            }

            else if(cadena_palabra[i]=='c'){
                cadena_encriptada[i]='_';
            }
            else if(cadena_palabra[i]=='d'){
                cadena_encriptada[i]='+';
            }
            else if(cadena_palabra[i]=='e'){
                cadena_encriptada[i]='@';
            }
            else if(cadena_palabra[i]=='f'){
                cadena_encriptada[i]='-';
            }
            else if(cadena_palabra[i]=='g'){
                cadena_encriptada[i]='^';
            }
            else if(cadena_palabra[i]=='h'){
                cadena_encriptada[i]='/';
            }
            else if(cadena_palabra[i]=='i'){
                cadena_encriptada[i]='#';
            }
            else if(cadena_palabra[i]=='j'){
                cadena_encriptada[i]='.';
            }
            else if(cadena_palabra[i]=='k'){
                cadena_encriptada[i]=',';
            }
            else if(cadena_palabra[i]=='l'){
                cadena_encriptada[i]=';';
            }
            else if(cadena_palabra[i]=='m'){
                cadena_encriptada[i]='|';
            }
            else if(cadena_palabra[i]=='n'){
                cadena_encriptada[i]='>';
            }
            else if(cadena_palabra[i]=='o'){
                cadena_encriptada[i]='<';
            }
            else if(cadena_palabra[i]=='p'){
                cadena_encriptada[i]='?';
            }
            else if(cadena_palabra[i]=='q'){
                cadena_encriptada[i]='¿';
            }
            else if(cadena_palabra[i]=='r'){
                cadena_encriptada[i]='[';
            }
            else if(cadena_palabra[i]=='s'){
                cadena_encriptada[i]=']';
            }
            else if(cadena_palabra[i]=='t'){
                cadena_encriptada[i]='!';
            }
            else if(cadena_palabra[i]=='u'){
                cadena_encriptada[i]='Ç';
            }
            else if(cadena_palabra[i]=='v'){
                cadena_encriptada[i]='$';
            }
            else if(cadena_palabra[i]=='w'){
                cadena_encriptada[i]='*';
            }
            else if(cadena_palabra[i]=='x'){
                cadena_encriptada[i]='(';
            }
            else if(cadena_palabra[i]=='y'){
                cadena_encriptada[i]=')';
            }
            else if(cadena_palabra[i]=='z'){
                cadena_encriptada[i]='~';
            }
            else if(cadena_palabra[i]=='A'){
                cadena_encriptada[i]='Z';
            }
            else if(cadena_palabra[i]=='B'){
                cadena_encriptada[i]='Y';
            }
            else if(cadena_palabra[i]=='C'){
                cadena_encriptada[i]='X';
            }
            else if(cadena_palabra[i]=='D'){
                cadena_encriptada[i]='W';
            }
            else if(cadena_palabra[i]=='E'){
                cadena_encriptada[i]='V';
            }
            else if(cadena_palabra[i]=='F'){
                cadena_encriptada[i]='U';
            }
            else if(cadena_palabra[i]=='G'){
                cadena_encriptada[i]='T';
            }
            else if(cadena_palabra[i]=='H'){
                cadena_encriptada[i]='S';
            }
            else if(cadena_palabra[i]=='I'){
                cadena_encriptada[i]='R';
            }
            else if(cadena_palabra[i]=='J'){
                cadena_encriptada[i]='Q';
            }
            else if(cadena_palabra[i]=='K'){
                cadena_encriptada[i]='P';
            }
            else if(cadena_palabra[i]=='L'){
                cadena_encriptada[i]='O';
            }
            else if(cadena_palabra[i]=='M'){
                cadena_encriptada[i]='N';
            }
            else if(cadena_palabra[i]=='N'){
                cadena_encriptada[i]='M';
            }
            else if(cadena_palabra[i]=='O'){
                cadena_encriptada[i]='L';
            }
            else if(cadena_palabra[i]=='P'){
                cadena_encriptada[i]='K';
            }
            else if(cadena_palabra[i]=='Q'){
                cadena_encriptada[i]='J';
            }
            else if(cadena_palabra[i]=='R'){
                cadena_encriptada[i]='I';
            }
            else if(cadena_palabra[i]=='S'){
                cadena_encriptada[i]='H';
            }
            else if(cadena_palabra[i]=='T'){
                cadena_encriptada[i]='G';
            }
            else if(cadena_palabra[i]=='U'){
                cadena_encriptada[i]='F';
            }
            else if(cadena_palabra[i]=='V'){
                cadena_encriptada[i]='E';
            }
            else if(cadena_palabra[i]=='W'){
                cadena_encriptada[i]='D';
            }
            else if(cadena_palabra[i]=='X'){
                cadena_encriptada[i]='C';
            }
            else if(cadena_palabra[i]=='Y'){
                cadena_encriptada[i]='B';
            }
            else if(cadena_palabra[i]=='Z'){
                cadena_encriptada[i]='A';
            }
           else if(cadena_palabra[i]=='0'){
                cadena_encriptada[i]='9';
            }
            else if(cadena_palabra[i]=='1'){
                cadena_encriptada[i]='8';
            }
            else if(cadena_palabra[i]=='2'){
                cadena_encriptada[i]='7';
            }
            else if(cadena_palabra[i]=='3'){
                cadena_encriptada[i]='6';
            }
            else if(cadena_palabra[i]=='4'){
                cadena_encriptada[i]='5';
            }
            else if(cadena_palabra[i]=='5'){
                cadena_encriptada[i]='4';
            }
            else if(cadena_palabra[i]=='6'){
                cadena_encriptada[i]='3';
            }
            else if(cadena_palabra[i]=='7'){
                cadena_encriptada[i]='2';
            }
            else if(cadena_palabra[i]=='8'){
                cadena_encriptada[i]='1';
            }
            else if(cadena_palabra[i]=='9'){
                cadena_encriptada[i]='0';
            }
            else{
                cadena_encriptada[i]=cadena_palabra[i];
            }
        }
  
        cadena=String.valueOf(cadena_encriptada);
        //System.out.println(" "+cadena);
        cadena= reverse(cadena);
        return cadena;
    }
    
    
    String metodo_desencriptamiento(String cadena){

    char [] cadena_palabra = cadena.toCharArray();
    char [] cadena_encriptada = new char[cadena.length()]; 

    for(int i=0;i<cadena.length();i++){
        if(cadena_palabra[i]=='%'){
            cadena_encriptada[i]='a';
        }
        else if(cadena_palabra[i]=='&'){
            cadena_encriptada[i]='b';
        }
        else if(cadena_palabra[i]=='_'){
            cadena_encriptada[i]='c';
        }
        else if(cadena_palabra[i]=='+'){
            cadena_encriptada[i]='d';
        }
        else if(cadena_palabra[i]=='@'){
            cadena_encriptada[i]='e';
        }
        else if(cadena_palabra[i]=='-'){
            cadena_encriptada[i]='f';
        }
        else if(cadena_palabra[i]=='^'){
            cadena_encriptada[i]='g';
        }
        else if(cadena_palabra[i]=='/'){
            cadena_encriptada[i]='h';
        }
        else if(cadena_palabra[i]=='#'){
            cadena_encriptada[i]='i';
        }
        else if(cadena_palabra[i]=='.'){
            cadena_encriptada[i]='j';
        }
        else if(cadena_palabra[i]==','){
            cadena_encriptada[i]='k';
        }
        else if(cadena_palabra[i]==';'){
            cadena_encriptada[i]='l';
        }
        else if(cadena_palabra[i]=='|'){
            cadena_encriptada[i]='m';
        }
        else if(cadena_palabra[i]=='>'){
            cadena_encriptada[i]='n';
        }
        else if(cadena_palabra[i]=='<'){
            cadena_encriptada[i]='o';
        }
        else if(cadena_palabra[i]=='?'){
            cadena_encriptada[i]='p';
        }
        else if(cadena_palabra[i]=='¿'){
            cadena_encriptada[i]='q';
        }
        else if(cadena_palabra[i]=='['){
            cadena_encriptada[i]='r';
        }
        else if(cadena_palabra[i]==']'){
            cadena_encriptada[i]='s';
        }
        else if(cadena_palabra[i]=='!'){
            cadena_encriptada[i]='t';
        }
        else if(cadena_palabra[i]=='Ç'){
            cadena_encriptada[i]='u';
        }
        else if(cadena_palabra[i]=='$'){
            cadena_encriptada[i]='v';
        }
        else if(cadena_palabra[i]=='*'){
            cadena_encriptada[i]='w';
        }
        else if(cadena_palabra[i]=='('){
            cadena_encriptada[i]='x';
        }
        else if(cadena_palabra[i]==')'){
            cadena_encriptada[i]='y';
        }
        else if(cadena_palabra[i]=='~'){
            cadena_encriptada[i]='z';
        }
        else if(cadena_palabra[i]=='Z'){
            cadena_encriptada[i]='A';
        }
        else if(cadena_palabra[i]=='Y'){
            cadena_encriptada[i]='B';
        }
        else if(cadena_palabra[i]=='X'){
            cadena_encriptada[i]='C';
        }
        else if(cadena_palabra[i]=='W'){
            cadena_encriptada[i]='D';
        }
        else if(cadena_palabra[i]=='V'){
            cadena_encriptada[i]='E';
        }
        else if(cadena_palabra[i]=='U'){
            cadena_encriptada[i]='F';
        }
        else if(cadena_palabra[i]=='T'){
            cadena_encriptada[i]='G';
        }
        else if(cadena_palabra[i]=='S'){
            cadena_encriptada[i]='H';
        }
        else if(cadena_palabra[i]=='R'){
            cadena_encriptada[i]='I';
        }
        else if(cadena_palabra[i]=='Q'){
            cadena_encriptada[i]='J';
        }
        else if(cadena_palabra[i]=='P'){
            cadena_encriptada[i]='K';
        }
        else if(cadena_palabra[i]=='O'){
            cadena_encriptada[i]='L';
        }
        else if(cadena_palabra[i]=='N'){
            cadena_encriptada[i]='M';
        }
        else if(cadena_palabra[i]=='M'){
            cadena_encriptada[i]='N';
        }
        else if(cadena_palabra[i]=='L'){
            cadena_encriptada[i]='O';
        }
        else if(cadena_palabra[i]=='K'){
            cadena_encriptada[i]='P';
        }
        else if(cadena_palabra[i]=='J'){
            cadena_encriptada[i]='Q';
        }
        else if(cadena_palabra[i]=='I'){
            cadena_encriptada[i]='R';
        }
        else if(cadena_palabra[i]=='H'){
            cadena_encriptada[i]='S';
        }
        else if(cadena_palabra[i]=='G'){
            cadena_encriptada[i]='T';
        }
        else if(cadena_palabra[i]=='F'){
            cadena_encriptada[i]='U';
        }
        else if(cadena_palabra[i]=='E'){
            cadena_encriptada[i]='V';
        }
        else if(cadena_palabra[i]=='D'){
            cadena_encriptada[i]='W';
        }
        else if(cadena_palabra[i]=='C'){
            cadena_encriptada[i]='X';
        }
        else if(cadena_palabra[i]=='B'){
            cadena_encriptada[i]='Y';
        }
        else if(cadena_palabra[i]=='A'){
            cadena_encriptada[i]='Z';
        }
        else if(cadena_palabra[i]=='0'){
            cadena_encriptada[i]='9';
        }
        else if(cadena_palabra[i]=='1'){
            cadena_encriptada[i]='8';
        }
        else if(cadena_palabra[i]=='2'){
            cadena_encriptada[i]='7';
        }
        else if(cadena_palabra[i]=='3'){
            cadena_encriptada[i]='6';
        }
        else if(cadena_palabra[i]=='4'){
            cadena_encriptada[i]='5';
        }
        else if(cadena_palabra[i]=='5'){
            cadena_encriptada[i]='4';
        }
        else if(cadena_palabra[i]=='6'){
            cadena_encriptada[i]='3';
        }
        else if(cadena_palabra[i]=='7'){
            cadena_encriptada[i]='2';
        }
        else if(cadena_palabra[i]=='8'){
            cadena_encriptada[i]='1';
        }
        else if(cadena_palabra[i]=='9'){
            cadena_encriptada[i]='0';
        }

        else{
            cadena_encriptada[i]=cadena_palabra[i];
        }
    }

    cadena=String.valueOf(cadena_encriptada);
    //System.out.println(" "+cadena);
    cadena= reverse(cadena);
    return cadena;
}
    
    public String reverse(String palabra) {
        if (palabra.length() == 1){
            return palabra;
        }  
        else {
            return reverse(palabra.substring(1)) + palabra.charAt(0);
        }
    }
}

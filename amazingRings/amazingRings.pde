int x1=250;
int x2=750;
void setup(){
  size (1000,1000);
  
  
  
}

void draw(){
  background(#504F4D);
  for(int i=1;i<20;i++){
    noFill();
    ellipse(x1,250,i*20,i*20);
     }
     
     x1+=1;
     if (x2<0){
       x2=1000;
     }
  for(int i=1;i<20;i++){
    noFill();
    ellipse(x2,250,i*20,i*20);
  }
  x2-=1;
  if (x1>1000){
    x1=0;
  }
}
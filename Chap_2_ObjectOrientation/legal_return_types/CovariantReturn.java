// Covariant return. We can override and change the return type as long as
// the new return type is a subtype of the return type of the superclass method



class Alpha{
 Alpha doStuff(char c){
 return new Alpha();
 }
}

class Beta{
 Beta doStuff(char c){
  return new Beta();
 }

}

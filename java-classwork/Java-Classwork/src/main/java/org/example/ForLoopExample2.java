//
//
//List<String> stringList = new ArrayList<>();
//stringList.add("First Element"); // position 0
//stringList.add("Two"); // position 1
//stringList.add("Three"); // position 2
//stringList.add("Four"); // position 3
//stringList.add("5"); //position 4
//
////we can use an old style for loop to move accross this list
//for(int pos = 0; pos < stringList.size() - 1); pos >= 0; pos--){
//    System.out.println(stringList.get(pos));
//        }
//
//    //we can use an old style for loop to move accross this list
//for(int pos = stringList.size() - 1); pos >= 0; pos--){
//        System.out.println(stringList.get(pos));
//    }
//
//
//    // nice new for loop
//    for (String element : stringList) {
//
//        if( element.equals("Three")){
//            continue;
//        }
//        System.out.println(element);
//    }
//}
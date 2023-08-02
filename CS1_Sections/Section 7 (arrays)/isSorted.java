public boolean isSorted(double[] list) {
    
    if (list.length == 1) {
        return true;
    }
    
    
    
    for (int i = 0; i < list.length-1; i++) {
        double larger = list[i+1];
        if (list[i] > larger) {
            return false;
        } 
    }
    
    return true;
}

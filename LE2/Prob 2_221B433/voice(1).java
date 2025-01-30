class Voice {
    void prepareVoice() {
        System.out.println("Preparing the voice...");
    }
    
    void hear() {
        System.out.println("Hearing the voice...");
    }
}

class Voice2 {
    void templateMethod() {
        prepareVoice();  
        hear();          
    }

    private void prepareVoice() {
        System.out.println("Preparing the voice...");
    }

    private void hear() {
        System.out.println("Hearing the voice...");
    }
}
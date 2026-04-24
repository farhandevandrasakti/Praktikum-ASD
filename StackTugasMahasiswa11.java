public class StackTugasMahasiswa11 {
    Mahasiswa11[] stack;
    int size;
    int top;

    public StackTugasMahasiswa11(int size) {
        this.size = size;
        stack = new Mahasiswa11[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa11 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Mahasiswa11 pop() {
        if (!isEmpty()) {
            Mahasiswa11 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + " " + stack[i].nim + " " + stack[i].kelas);
            }
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi11 stack = new StackKonversi11();
        if (nilai == 0) return "0";
        
        while (nilai != 0) { 
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    
}
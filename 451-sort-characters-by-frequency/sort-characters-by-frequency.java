class Element implements Comparable<Element> {
    char ch;
    int freq;

    public Element(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(Element that) {
        return that.freq - this.freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freqmp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqmp.put(ch, freqmp.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : freqmp.entrySet()) {
            Element element = new Element(entry.getKey(), entry.getValue());
            pq.offer(element);
        }
        StringBuilder str = new StringBuilder();
        while (pq.size() > 0) {
            Element element = pq.poll();
            while (element.freq > 0) {
                str.append(element.ch);
                element.freq--;
            }
        }

        return str.toString();
    }
}

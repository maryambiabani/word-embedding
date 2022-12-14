import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;

public class LoudingModels {
    public static void main(String[] args) {
        Word2Vec w2vModel = WordVectorSerializer.readWord2VecModel("D:\\util\\GoogleNewsvectorsnegative300.bin");
//        System.out.println(w2vModel.getWordVector("hi").getClass().getName());
//        System.out.println(w2vModel.getWordVector("hi").getClass().getTypeName());
        double[] vec=w2vModel.getWordVector("man");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);

        }
//        System.out.println(w2vModel.wordsNearest("love", 10));
//        System.out.println(w2vModel.similarity("man", "king"));
    }
}

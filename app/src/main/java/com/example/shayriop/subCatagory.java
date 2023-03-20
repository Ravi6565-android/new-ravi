package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class subCatagory extends AppCompatActivity {
ArrayList<String> dosti = new ArrayList<>();
ArrayList<String> yade = new ArrayList<>();
ArrayList<String> bewafa = new ArrayList<>();
ArrayList<String> mohhabat = new ArrayList<>();
ArrayList<String> majedar = new ArrayList<>();
ArrayList<String> bhagvan = new ArrayList<>();
int image;
    subcatagory_custom_adapter subcatagory_custom_adapter;

ListView sublist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_catagory);
        filldosti();fillyayde();fillbewafa();fillmohhabat();fillmajedar();fillbhagavn();
        sublist=findViewById(R.id.subcatagory_list);
                int pos=getIntent().getIntExtra("pos",0);

                if(pos==1){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter= new subcatagory_custom_adapter(subCatagory.this,dosti,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    setonclikc();
                }
                if(pos==2){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,majedar,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",majedar.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==3){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,bhagvan,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",bhagvan.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==7){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter= new subcatagory_custom_adapter(subCatagory.this,yade, image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent = new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",yade.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if (pos == 12) {
            image=getIntent().getIntExtra("image",0);
            subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,bewafa,image);
            sublist.setAdapter(subcatagory_custom_adapter);
            sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                    intent.putExtra("shayri",bewafa.get(i));
                    startActivity(intent);
                }
            });


        }
                if(pos==6){
                  image=getIntent().getIntExtra("image",0);
                  subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,mohhabat,image);
                  sublist.setAdapter(subcatagory_custom_adapter);
                  sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                      @Override
                      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                          Intent intent = new Intent(subCatagory.this,big_shayri_screen.class);
                          intent.putExtra("shayri",mohhabat.get(i));
                          startActivity(intent);
                      }
                  });

              }


    }

    public void setonclikc(){
        sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(subCatagory.this,big_shayri_screen.class);
                intent.putExtra("shayri",dosti.get(i));
                startActivity(intent);
            }
        });
    }
    public void filldosti(){
        dosti.add("सच्चे दोस्त कभी गिरने नहीं देते\nन किसी कि नजरों में,\nन किसी के कदमों में !");
        dosti.add("सच्ची है मेरी दोस्ती आजमा के देख लो,\nकरके यकीं मुझ पे मेरे पास आ के देख लो,\nबदलता नहीं कभी सोना अपना रंग,\nजितनी बार चाहे आग लगा कर देख लो !!");
        dosti.add("जब मोहब्बत हाथ छोड़ देती है,\n" +
                "\n" +
                "तब दोस्त ही कदम से कदम मिलाकर चलते हैं !");
        dosti.add("प्यार में भले ही जूनून है !\n" +
                "\n" +
                "मगर दोस्ती में सुकून है !");
        dosti.add("शबू की तरह मेरी साँसों में रहना;\n" +
                "लहू बनके मेरी नस-नस में बहना;\n" +
                "दोस्ती होती है रिश्तों का अनमोल गहना;\n" +
                "इसलिए दोस्त को कभी अलविदा न कहना।");
        dosti.add("लोग रूप देखते है ,हम दिल देखते है ,\n" +
                "लोग सपने देखते है हम हक़ीकत देखते है,\n" +
                "लोग दुनिया मे दोस्त देखते है,\n" +
                "हम दोस्तो मे दुनिया देखते है।");
        dosti.add("कहीं अंधेरा तो कहीं शाम होगी,\n" +
                "मेरी हर ख़ुशी तेरे नाम होगी,\n" +
                "कभी मांग कर तो देख हमसे ए दोस्त,\n" +
                "होंठो पर हसीं और हथेली पर जान होगी।");
        dosti.add("हर मोड़ पर मुकाम नहीं होता,\n" +
                "दिल के रिश्तो का कोई नाम नहीं होता,\n" +
                "चिराग की रौशनी से ढूँढा है आपको,\n" +
                "आप जैसा दोस्त मिलना आसान नहीं होता।");
        dosti.add("दिन बीत जाते है सुहानी यादें बनकर,\n" +
                "बाते रह जाती है कहानी बनकर,\n" +
                "पर दोस्त तो हमेशा दिल के करीब रहते है,\n" +
                "कभी मुस्कान तो कभी,\n" +
                "आँखों का पानी बनकर।");
        dosti.add("तू दूर है मुझसे और पास भी है,\n" +
                "तेरी कमी का एहसास भी है,\n" +
                "दोस्त तो हमारे लाखो है इस जहाँ में,\n" +
                "पर तू प्यारा भी है और खास भी है।");
        dosti.add("सच्ची है मेरी दोस्ती आजमा के देखलो,\n" +
                "करके यकीं मुझ पे मेरे पास आ के देखलो.\n" +
                "बदलता नहीं कभी सोना अपना रंग,\n" +
                "जितनी बार चाहे आग लगा कर देखलो।");
        dosti.add("रिश्तों की यह दुनिया है निराली,\n" +
                "सब रिश्तों से प्यारी है दोस्ती तुम्हारी,\n" +
                "मंज़ूर है आँसू भी आखो में हमारी,\n" +
                "अगर आजाये मुस्कान होंठों पे तुम्हारी।");
        dosti.add("खुद पे भरोसा है तो खुदा साथ है!\n" +
                "अपनो पे भरोसा है तो दुआ साथ है!\n" +
                "जिदंगी से हारना मत ऐ दोस्त,\n" +
                "ज़माना हो ना हो ये दोस्त तेरे साथ है!");
        dosti.add("“रेत की जरूरत रेगिस्तान को होती है,\n" +
                "सितारों की जरूरत आसमान को होती है,\n" +
                "आप हमें भूल न जाना, क्योंकी\n" +
                "दोस्त की जरूरत हर इंसान को होती है…….”");
    }
    public void fillyayde(){
        yade.add("Kisi Ko Kisi Se Milati Hain Yaadein\n" +
                "Dooriyon Ki Doori Mitati Hain Yaadein\n" +
                "Kisi Ko Hosh Mein Laati Hain Aur\n" +
                "Kisi Ko Paagal Banati Hain Yaadein");
        yade.add("किसी को किसी से मिलाती हैं यादें\n" +
                "दूरियों की दूरी मिटाती हैं यादें\n" +
                "किसी को होश में लाती हैं और\n" +
                "किसी को पागल बनाती हैं यादें");
        yade.add("Sab Sahi Karke Bhi Galat Hoon Main\n" +
                "Ye Kaisi Teri Fariyadein Hain\n" +
                "Maine Dil Ka Kamra Jala Diya\n" +
                "Yahan Phir Bhi Teri Yaadein Hain");
        yade.add("\n" +
                "सब सही करके भी गलत हूँ मैं\n" +
                "ये कैसी तेरी फरियादें हैं\n" +
                "मैंने दिल का कमरा जला दिया\n" +
                "यहाँ फिर भी तेरी यादें हैं");
        yade.add("Kuch Waade Toot Jaat Hain\n" +
                "Bas Baatein Reh Jaati Hain\n" +
                "Milne Wale Bichhad Jaate Hain\n" +
                "Aur Yaadein Reh Jaati Hain");
        yade.add("कुछ वादे टूट जाते हैं\n" +
                "बस बातें रह जाती हैं\n" +
                "मिलने वाले बिछड़ जाते हैं\n" +
                "और यादें रह जाती हैं");
        yade.add("Naam Nahi Lunga Par Suno\n" +
                "Yaad Bahut Aati Hai Tumhari");
        yade.add("नाम नहीं लूंगा पर सुनो\n" +
                "याद बहुत आती है तुम्हारी");
        yade.add("Bhoolna Hi Padta Hai Unhein\n" +
                "Yaadon Ke Sahare Kahan Zindagi Kat’ti Hai");
        yade.add("भूलना ही पड़ता है उन्हें\n" +
                "यादों के सहारे कहाँ ज़िन्दगी कटती है");
        yade.add("ocha To Yehi Tha Ki Yaad Nahi Karenge\n" +
                "Par Ye Dil Kahan Kisi Ki Sunta Hai");
        yade.add("सोचा तो यही था की याद नहीं करेंगे\n" +
                "पर ये दिल कहाँ किसी की सुनता है");
        yade.add("Ishq Ki Baarish Mein Bheeg Rahe Hain Wo\nIk Hum Hain Jo Yaadon Mein Jal Rahe Hai");
        yade.add("इश्क़ की बारिश में भीग रहे हैं वो\n" +
                "इक हम हैं जो यादों में जल रहे हैं");
        yade.add("Zara Bhi Nahi Aati Yaad Unhein\n" +
                "Wo Jo Kehte The Tumhare Bina Mar Jayenge");
        yade.add("ज़रा भी नहीं आती याद उन्हें\n" +
                "वो जो कहते थे तुम्हारे बिना मर जायेंगे");
        yade.add("Kabhi Tumhare Labon Pe\n" +
                "Ye Baat Aati Hogi Naa\n" +
                "Usne Jab Jab Rulaya Tumhein\n" +
                "Meri Yaad Aati Hogi Naa");
        yade.add("Jaate Jaate Mud Kar Dekha Hi Nahi\n" +
                "Usne Apne Kadamon Ko Roka Hi Nahi\n" +
                "Yaadein To Satayegi Zindagi Bhar Par\n" +
                "Usne Mere Baare 2 Pal Socha Hi Nahi");

    }
    public void fillbewafa(){
        bewafa.add("खुदा ने पूछा क्या सजा दूँ उस बेवफा को,\n" +
                "दिल ने कहा मोहब्बत हो जाए उसे भी,\n" +
                "और कोई छोड़ के चले जाये उसे भी !");
        bewafa.add("दिल में आने का तो रास्ता होता है पर,\n" +
                "जाने का नही इस लिए जब भी कोई इंसान जाता है,\n" +
                "दिल तोड़ कर ही जाता है !");
        bewafa.add("तुम क्या जानो बेवफाई की हद ये दोस्त,\n" +
                "वो हमसे इश्क सीखता रहा किसी और के लिए !");
        bewafa.add("हमको दिल से भी निकाला गया, फिर शहर से भी,\n" +
                "हमको पत्थर से भी मारा गया, और जहर से भी !");
        bewafa.add("तेरी बेवफाई का गम तो नहीं,\n" +
                "मगर तू बेवफा है दुःख ये भी कम नहीं !\n");
        bewafa.add("तुम नहीं मिले तो क्या हुआ,\n" +
                "सबक तो मिल गया !\n");
        bewafa.add("जहाँ से जी ना लगे तुम वहीं बिछड़ जाना,\n" +
                "मगर खुदा के लिए बेवफाई ना करना !\n");
        bewafa.add("बेवफा तो वो खुद हैं,\n" +
                "पर इल्ज़ाम किसी और को देते हैं,\n" +
                "पहले नाम था मेरा उनके लबों पर,\n" +
                "अब वो नाम किसी और का लेते हैं !\n");
        bewafa.add("मेरे फन को तराशा है सभी के नेक इरादों ने,\n" +
                "किसी की बेवफाई ने किसी के झूठे वादों ने !\n");
        bewafa.add("अगर तुम अब भी मेरी हो जाओ तो मैं,\n" +
                "दुनिया की हर किताब से बेवफा लफ्ज मिटा दूंगा !\nअपने जुल्म और सितम का हिसाब क्या दोगे,\n" +
                "जब खुद बेवफा हो उसका जवाब क्या दोगे !\n");
        bewafa.add("कुछ न मिला तो तेरा ही नाम लिखूंगा,\n" +
                "ओ बेवफा मैं तुझी पर सारे इल्जाम लिखूंगा !\n");
        bewafa.add("तेरी बेवफाई ने मेरा ये हाल कर दिया है की,\n" +
                "अब मैं नही रोता मुझे देख कर लोग रोते हैं !\n");
        bewafa.add("तुम साथ थी तो जन्नत थी मेरी ज़िन्दगी,\n" +
                "अब तो हर साँस ज़िंदा रहने की वजह पूछती है !\n");
        bewafa.add("खोज तो लेते उन्हें आखिर सच्चा प्यार जो किया था,\n" +
                "पर रोक दी तलाश हमने क्योंकि\n" +
                "वो खोये नहीं बेवफा निकले !\n");
        bewafa.add("हमें न इश्क़ मिली न मोहब्बत मिली,\n" +
                "हमको जो भी मिला बेवफा यार मिला,\n" +
                "अपनी तो बन गयी बेवफ़ा ज़िन्दगी,\n" +
                "हर कोई जरुरत का तलबगार मिला !\n");
        bewafa.add("प्यार करना हमें नहीं आता,\n" +
                "इसलिए अपना प्यार हार गए\n" +
                "हमारी ज़िन्दगी से उन्हें बहुत प्यार था,\n" +
                "इसलिए वो बेवफा हमें जिंदा ही मार गए !\n");
    }
    public void fillmohhabat(){
        mohhabat.add("उजाले अपनी यादों के हमारे साथ रहने दो \n" +
                "\n" +
                "न जाने किस गली में ज़िंदगी की शाम हो जाए \n" +
                "\n" +
                "बशीर बद्र\n");
        mohhabat.add("और भी दुख हैं ज़माने में मोहब्बत के सिवा \n" +
                "\n" +
                "राहतें और भी हैं वस्ल की राहत के सिवा \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़\n");
        mohhabat.add("रंजिश ही सही दिल ही दुखाने के लिए आ \n" +
                "\n" +
                "आ फिर से मुझे छोड़ के जाने के लिए आ \n" +
                "\n" +
                "अहमद फ़राज़");
        mohhabat.add("उस की याद आई है साँसो ज़रा आहिस्ता चलो \n" +
                "\n" +
                "धड़कनों से भी इबादत में ख़लल पड़ता है \n" +
                "\n" +
                "राहत इंदौरी");
        mohhabat.add("मोहब्बत में नहीं है फ़र्क़ जीने और मरने का \n" +
                "\n" +
                "उसी को देख कर जीते हैं जिस काफ़िर पे दम निकले \n" +
                "\n" +
                "मिर्ज़ा ग़ालिब");
        mohhabat.add("और क्या देखने को बाक़ी है \n" +
                "\n" +
                "आप से दिल लगा के देख लिया \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        mohhabat.add("होश वालों को ख़बर क्या बे-ख़ुदी क्या चीज़ है \n" +
                "\n" +
                "इश्क़ कीजे फिर समझिए ज़िंदगी क्या चीज़ है \n" +
                "\n" +
                "निदा फ़ाज़ली");
        mohhabat.add("न जी भर के देखा न कुछ बात की \n" +
                "\n" +
                "बड़ी आरज़ू थी मुलाक़ात की \n" +
                "\n" +
                "बशीर बद्र");
        mohhabat.add("अज़ीज़ इतना ही रक्खो कि जी सँभल जाए \n" +
                "\n" +
                "अब इस क़दर भी न चाहो कि दम निकल जाए \n" +
                "\n" +
                "उबैदुल्लाह अलीम");
        mohhabat.add("चुपके चुपके रात दिन आँसू बहाना याद है \n" +
                "\n" +
                "हम को अब तक आशिक़ी का वो ज़माना याद है \n" +
                "\n" +
                "हसरत मोहानी");
        mohhabat.add("कुछ तो मजबूरियाँ रही होंगी \n" +
                "\n" +
                "यूँ कोई बेवफ़ा नहीं होता \n" +
                "\n" +
                "बशीर बद्र");
        mohhabat.add("इश्क़ नाज़ुक-मिज़ाज है बेहद \n" +
                "\n" +
                "अक़्ल का बोझ उठा नहीं सकता \n" +
                "\n" +
                "अकबर इलाहाबादी\n");
        mohhabat.add("हुआ है तुझ से बिछड़ने के बा'द ये मा'लूम \n" +
                "\n" +
                "कि तू नहीं था तिरे साथ एक दुनिया थी \n" +
                "\n" +
                "अहमद फ़राज़");
        mohhabat.add("ज़िंदगी किस तरह बसर होगी \n" +
                "\n" +
                "दिल नहीं लग रहा मोहब्बत में \n" +
                "\n" +
                "जौन एलिया");
        mohhabat.add("ज़िंदगी किस तरह बसर होगी \n" +
                "\n" +
                "दिल नहीं लग रहा मोहब्बत में \n" +
                "\n" +
                "जौन एलिया");
        mohhabat.add("किस किस को बताएँगे जुदाई का सबब हम \n" +
                "\n" +
                "तू मुझ से ख़फ़ा है तो ज़माने के लिए आ \n" +
                "\n" +
                "अहमद फ़राज़");
        mohhabat.add("वो तो ख़ुश-बू है हवाओं में बिखर जाएगा \n" +
                "\n" +
                "मसअला फूल का है फूल किधर जाएगा \n" +
                "\n" +
                "परवीन शाकिर\n");
    }
    public void fillmajedar(){
        majedar.add("जो गुरुर और रुतबा कल था,\n" +
                "वो आज भी _हे और आगे भी रहेगा,\n" +
                "मेरा Attitude कोई Calendar नही\n" +
                "जो हर साल बदल_जायेगा |");
        majedar.add("ख्वाब टूटे है मगर हौंसले जिन्दा है,\n" +
                "हम तो वो है जिन्हें देख के मुश्किलें भी शर्मिंदा है |");
        majedar.add("बेस्ट मजेदार शायरी\n" +
                "मेरी शराफत को तुम बुझ दिली का नाम मत दो,\n" +
                "क्यूंकि दबे ने जब तक घोड़ा, तब तक बन्दूक भी खिलौना ही होता है |");
        majedar.add("इधर बात ना बने तो उधर Try मारते है,\n" +
                "हम Kamine है जानेमन हार कहाँ मानते है |");
        majedar.add("जिंदगी बेस्ट शायरी\n" +
                "किसी ने _मुझसे पूछा जिंदगी क्या है\n" +
                "मैंने हथेली पर थोड़ी सी धूल ली और फूँक मार कर उड़ा दी |\n");
        majedar.add("किसी के पैरो में गिरकर कामयाबी पाने के बदले,\n" +
                "अपने पैरो पर चलकर कुछ बनने की ठान लोलो");
        majedar.add("बेहतर & बेहतरीन शायरी\n" +
                "जो बेहतर होते है उन्हें इनाम मिलता है,\n" +
                "जो बेहतरीन होते है उनके नाम पर इनाम होता है |");
        majedar.add("रहने दे मुझे अँधेरे में ए ग़ालिब,\n" +
                "उजालो में मुझे अपनों के असली चेहरे नज़र आ जाते है |\n");
        majedar.add("खोटा सिक्का शायरी इन हिन्दी\n" +
                "जो किसी को छलते नहीं,\n" +
                "वही लोग आज कल खोटें _सिक्के जैसे चलते नहीं |\n");
        majedar.add("सुन Babu  आंखों  से पर्दे htalo,\n" +
                "तेरे Rajkumar  का Status  आ गया |\n" +
                "\n");
        majedar.add("होटों की पहचान बेस्ट शायरी \n" +
                "कभी मुहँ में उसका नाम तो कभी सिगरेट का साथ,\n" +
                "मेरे होठों ने हमेशा चिंगारियाँँ ही पसंद की |");
        majedar.add("हम थोड़ी सी Style क्या मारे.. दुश्मनों की आँखे बड़ी हो गयी |\n" +
                "अभी तो _Entry  मारी हैं. आगे-आगे Dekho होता हैं क्या |");
        majedar.add("उड़ान ही पहचान हिन्दी शायरी\n" +
                "जानता हूँ मै कहाँ तक है उड़ान इनकी,\n" +
                "आखिर मेरे ही हाथ से निकले परिंदे है ये\n");
        majedar.add("माना की _औरो के मुकाबले कुछ ज्यादा पाया नहीं मैंने,\n" +
                "पर खुश हूँ की खुद को गिरा का कुछ उठाया नहीं मैंने |");
        majedar.add("हम डूबने वाली किसती नहीं शायरी\n" +
                "डूब जाए आसानी से मै वो कश्ती नहीं,\n" +
                "मिटा सको तुम मुझे ये बात तुम्हारे _बस की नहीं |\n");
        majedar.add("किसी की चंद_गलतियों पर न कीजिये कोई फैसला,\n" +
                "बेशक कुछ कमियां होगी पर खूबियाँ भी तो होंगी |");
        majedar.add("Attitude & पैसा शायरी\n" +
                "सुन be छोरी मेरे पास Attitude है,\n" +
                "तेरे बाप का पैसा नहीं जो खत्म हो जाए |");
        majedar.add("छोरी बोली तू बुरा ना मानिये पर तेरा Style तो जम्मा इ Desi लागै सै,\n" +
                "मै बोल्याअक बावली इस बात का इ तो Attitude सै म्हारे म |");
        majedar.add("मजेदार शौयरी इन हिन्दी\n" +
                "तुम सिखाओ अपने दोस्तों को हथियार चलाना,\n" +
                "हमारे दोस्त तो पहले से ही बारूद है |\n");

    }
    public void fillbhagavn(){
        bhagvan.add("जो लोग ईश्वर को पाना चाहते हैं,\n" +
                "उन्हें वाणी, मन, इंद्रियों की पवित्रता और\n" +
                "एक दयालु हृदय की जरूरत होती हैं।");
        bhagvan.add("जय हो हृदय में बसे नन्द लाल की,\n" +
                "जय हो हृदय में बसे बाल गोपाल की।\n");
        bhagvan.add("शिव की ज्योति से प्रकाश बढ़ता है।\n" +
                "जो भी जाता है भोले के द्वार।\n" +
                "कुछ न कुछ उसे जरुर मिलता है।");
        bhagvan.add("साधू बने तो मोहमाया छूटे,\n" +
                "वैरागी बने तो छूटे तन,\n" +
                "हरि तेरे से सच्चा प्रेम हो जाए तो\n" +
                "तभी छूटे सारे मोह माया के बंधन।");
        bhagvan.add("कर्म अच्छे हो तो वही धर्म बन जाता है,\n" +
                "ऐसा इंसान, ईश्वर का भक्त बन जाता है।");
        bhagvan.add("मुझे आप मिल गये ईश्वर\n" +
                "सहारा हो तो ऐसा हो\n" +
                "जिधर देखू उधर तूम हो\n" +
                "नजारा हो तो ऐसा हो।");
        bhagvan.add("देवो के देव, महादेव आपसे हैं विनती,\n" +
                "मेरी भी हो, आपके ख़ास भगतो में गिनती।");
        bhagvan.add("जीवन रुपी जहाज के है हम खिवैया\n" +
                "अगर तूफ़ान में डूबने लगे आपकी नैया\n" +
                "दोस्त डरना मत,\n" +
                "बेड़ा पार लगाएगा कृष्ण कन्हैया।");
        bhagvan.add("अकेले ही पूरी दुनिया में चिता की भस्म से नहाते हैं,\n" +
                "ऐसे ही नही वो कालों के काल महाकाल कहलाते हैं।\n");
        bhagvan.add("ईश्वर के नाम दिया कभी अल्प नही होता\n" +
                "जो टूट जाए वो दृढ संकल्प नही होता\n" +
                "हार को जीत से दूर ही रखना\n" +
                "क्योकि जीत का कोई विकल्प नही होता।\n");
        bhagvan.add("मोहिनी मूरत, हृदय में छिपाए बैठे हैं, सुंदर-सी छवि आँखों में बसाए बैठे हैं,\n" +
                "बाँसुरी की मधुर तान सुना दे कान्हा, छोटी-सी आस लगाये बैसे हैं।\n");
        bhagvan.add("ॐ में आस्था है ॐ में ही विशवास है\n" +
                "ॐ में ही शक्ति है ॐ में भी भक्ति है\n" +
                "ॐ से ही शुरुआत होती है अच्छे दिन की।।");
        bhagvan.add("महादेव” आप पर क्या लिखूं! कितना लिखूं!\n" +
                "रहोगे आप फिर भी अपरिभाषित चाहे जितना लिखूं!");
        bhagvan.add("प्यार में ताकत हैं दुनिया को झुकाने की,\n" +
                "वरना क्या जरूरत थी राम को झूठे बैर खाने की।");
        bhagvan.add("इस जहाँ के कानून से शिकायत मत करना\n" +
                "अपनी नजरों को कभी शर्मिंदा न करना\n" +
                "ईश्वर सब कुछ देगा आपकों\n" +
                "वक्त से पूर्व पुकार मत करना।\n");
        bhagvan.add("इतना सच्चा हो हमारा विश्वास,\n" +
                "हमारे हृदय में “श्री राम” सदा करे वास।");
        bhagvan.add("शिव की ज्योति से नूर मिलता है,\n" +
                "भोले के भक्तों को सुकून मिलता है\n" +
                "जो भी आता है शंकर के द्वार\n" +
                "सभी को फल जरुर मिलता है।\n");
        bhagvan.add("दिखावे की दुनिया से थोड़ा दूर रहता हूँ मैं,\n" +
                "इसलिए शिव भक्ति में चूर रहता हूँ मैं।\n");
        bhagvan.add("सारा जहा है जिसकी चरण में\n" +
                "नमन है उस शिव के चरण में\n" +
                "बने उस शिव के चरणों की धूल\n" +
                "आओं मिलकर हम चढाए श्रद्धाफूल।\n");
        bhagvan.add("नियत अच्छी हो तो, भक्ति भी सच्ची होती हैं,\n" +
                "भगवान हर हृदय में हैं, घरो में रखने की जरूरत नही होती हैं।\n" +
                "\n");
        bhagvan.add("मन में करो सब शिव जी का ध्यान,\n" +
                "सबसे सुंदर हैं शिव का स्थान,\n" +
                "मिल सभी गुण शिव जी के गाते,\n" +
                "सारी खुशियाँ जीवन में पाते।\n" +
                "\n");
        bhagvan.add("हम उम्मीद करते हैं कि आपको यह “भक्ति शायरी (Bhakti Shayari In Hindi)” पसंद आई होगी। इन्हें आगे शेयर जरूर करें। आपको यह हिंदी शायरी कैसी लगी, हमें कमेंट बॉक्स में जरूर बताएं।\n" +
                "\n");

    }

}
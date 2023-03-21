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
ArrayList<String> sharab = new ArrayList<>();
ArrayList<String> shubhkamna = new ArrayList<>();
ArrayList<String> prernastrot = new ArrayList<>();
ArrayList<String> jivan = new ArrayList<>();
ArrayList<String> rajniti = new ArrayList<>();
ArrayList<String> anya = new ArrayList<>();
ArrayList<String> prem = new ArrayList<>();
ArrayList<String> dard = new ArrayList<>();
ArrayList<String> janmadin = new ArrayList<>();
ArrayList<String> holi = new ArrayList<>();
int image;
    subcatagory_custom_adapter subcatagory_custom_adapter;

ListView sublist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_catagory);
        filldosti();fillyayde();fillbewafa();fillmohhabat();fillmajedar();fillbhagavn();fillsharab();fillshubhkamna();fillprernastrot();
        filljivan();fillrajniti();fillanya();fillprem();fildard();filljanmadin();fillholi();
        sublist=findViewById(R.id.subcatagory_list);
                int pos=getIntent().getIntExtra("pos",0);
                if(pos==0){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,shubhkamna,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",shubhkamna.get(i));
                            startActivity(intent);
                        }
                    });
                }
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
                if(pos==4){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,prernastrot,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",prernastrot.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==5){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,jivan,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",jivan.get(i));
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
                if(pos==8){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter= new subcatagory_custom_adapter(subCatagory.this,anya, image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent = new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",anya.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==9){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter= new subcatagory_custom_adapter(subCatagory.this,rajniti, image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent = new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",rajniti.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==10){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter= new subcatagory_custom_adapter(subCatagory.this,prem, image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent = new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",prem.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==11){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,dard,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",dard.get(i));
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
                if(pos==13){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,sharab,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",sharab.get(i));
                            startActivity(intent);
                        }
                    });

                }
                if(pos==14){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,janmadin,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",janmadin.get(i));
                            startActivity(intent);
                        }
                    });
                }
                if(pos==15){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter=new subcatagory_custom_adapter(subCatagory.this,holi,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    sublist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent= new Intent(subCatagory.this,big_shayri_screen.class);
                            intent.putExtra("shayri",holi.get(i));
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
    public void fillsharab(){
        sharab.add("तुम्हारी आँखों की तौहीन है ज़रा सोचो \n" +
                "\n" +
                "तुम्हारा चाहने वाला शराब पीता है \n" +
                "\n" +
                "मुनव्वर राना");
        sharab.add("आए थे हँसते खेलते मय-ख़ाने में 'फ़िराक़' \n" +
                "\n" +
                "जब पी चुके शराब तो संजीदा हो गए \n" +
                "\n" +
                "फ़िराक़ गोरखपुरी");
        sharab.add("अब तो उतनी भी मयस्सर नहीं मय-ख़ाने में \n" +
                "\n" +
                "जितनी हम छोड़ दिया करते थे पैमाने में \n" +
                "\n" +
                "दिवाकर राही");
        sharab.add("ज़ाहिद शराब पीने दे मस्जिद में बैठ कर \n" +
                "\n" +
                "या वो जगह बता दे जहाँ पर ख़ुदा न हो \n" +
                "\n" +
                "अज्ञात");
        sharab.add("कुछ भी बचा न कहने को हर बात हो गई \n" +
                "\n" +
                "आओ कहीं शराब पिएँ रात हो गई \n" +
                "\n" +
                "निदा फ़ाज़ली");
        sharab.add("बे पिए ही शराब से नफ़रत \n" +
                "\n" +
                "ये जहालत नहीं तो फिर क्या है \n" +
                "\n" +
                "साहिर लुधियानवी");
        sharab.add("इतनी पी जाए कि मिट जाए मैं और तू की तमीज़ \n" +
                "\n" +
                "यानी ये होश की दीवार गिरा दी जाए \n" +
                "\n" +
                "फ़रहत शहज़ाद");
        sharab.add("ज़ाहिद शराब पीने से काफ़िर हुआ मैं क्यूँ \n" +
                "\n" +
                "क्या डेढ़ चुल्लू पानी में ईमान बह गया \n");
        sharab.add("शब जो हम से हुआ मुआफ़ करो \n" +
                "\n" +
                "नहीं पी थी बहक गए होंगे \n" +
                "\n" +
                "जौन एलिया");
        sharab.add("ग़म-ए-दुनिया भी ग़म-ए-यार में शामिल कर लो \n" +
                "\n" +
                "नश्शा बढ़ता है शराबें जो शराबों में मिलें \n" +
                "\n" +
                "अहमद फ़राज़");
        sharab.add("आए कुछ अब्र कुछ शराब आए \n" +
                "\n" +
                "इस के ब'अद आए जो अज़ाब आए \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        sharab.add("बारिश शराब-ए-अर्श है ये सोच कर 'अदम' \n" +
                "\n" +
                "बारिश के सब हुरूफ़ को उल्टा के पी गया \n" +
                "\n" +
                "अब्दुल हमीद अदम");
        sharab.add("शब को मय ख़ूब सी पी सुब्ह को तौबा कर ली \n" +
                "\n" +
                "रिंद के रिंद रहे हाथ से जन्नत न गई \n" +
                "\n" +
                "जलील मानिकपूरी");
        sharab.add("पीता हूँ जितनी उतनी ही बढ़ती है तिश्नगी \n" +
                "\n" +
                "साक़ी ने जैसे प्यास मिला दी शराब में \n" +
                "\n" +
                "अज्ञात");
        sharab.add("लुत्फ़-ए-मय तुझ से क्या कहूँ ज़ाहिद \n" +
                "\n" +
                "हाए कम-बख़्त तू ने पी ही नहीं \n" +
                "\n" +
                "दाग़ देहलवी");
        sharab.add("तर्क-ए-मय ही समझ इसे नासेह \n" +
                "\n" +
                "इतनी पी है कि पी नहीं जाती \n" +
                "\n" +
                "शकील बदायूनी");
        sharab.add("पहले शराब ज़ीस्त थी अब ज़ीस्त है शराब \n" +
                "\n" +
                "कोई पिला रहा है पिए जा रहा हूँ मैं \n" +
                "\n" +
                "जिगर मुरादाबादी");
        sharab.add("शिकन न डाल जबीं पर शराब देते हुए \n" +
                "\n" +
                "ये मुस्कुराती हुई चीज़ मुस्कुरा के पिला ");

    }
    public void fillshubhkamna(){
        shubhkamna.add("ये रात चाँदनी बनकर आँगन में आये,\n" +
                "\n" +
                "ये तारे लोरी गा कर आपको सुनाएं,\n" +
                "\n" +
                "आयें आपको इतने प्यारे सपने यार...\n" +
                "\n" +
                "कि नींद में भी आप हलके से मुस्कुराएं।");
        shubhkamna.add("ईश्वर न करे आपको कोई ग़म हो,\n" +
                "\n" +
                "और सिर्फ खुशियाँ और हँसी मिले,\n" +
                "\n" +
                "ग़म जब भी बढ़ चले आपकी ओर,\n" +
                "\n" +
                "ईश्वर करे रास्ते में उसे पहले हम मिले।");
        shubhkamna.add("जन्मदिन के ये बहुत ख़ास लम्हे मुबारक,\n" +
                "\n" +
                "आँखों में बसे नए नए ख्वाब मुबारक,\n" +
                "\n" +
                "जिंदगी जो लेकर आयी है आपके लिए आज,\n" +
                "\n" +
                "वो तमाम खुशियों की हसी सौगात मुबारक।\n");
        shubhkamna.add("ज़िन्दगी की कुछ खास दुआएं लेलो हमसे,\n" +
                "\n" +
                "जन्मदिन पर कुछ नजराने लेलो हमसे,\n" +
                "\n" +
                "भर दे रंग जो तेरे जीवन के पलो में,\n" +
                "\n" +
                "आज वो हँसी मुबारक-बाद लेलो हमसे।\n");
        shubhkamna.add("खुशी से बीते हर दिन\n" +
                "\n" +
                "हर सुहानी रात हो,\n" +
                "\n" +
                "जिस तरफ आपके कदम पड़े\n" +
                "\n" +
                "फूलों की बरसात हो।\n" +
                "\n" +
                "जन्मदिवस की शुभकामनाये...!");
        shubhkamna.add("दिल से मेरी दुआ है के खुश रहो तुम,\n" +
                "\n" +
                "मिले न कोई गम जहाँ भी रहो तुम,\n" +
                "\n" +
                "समंदर की तरह दिल है गहरा तुम्हारा,\n" +
                "\n" +
                "सदा खुशी से भरा रहे दामन तुम्हारा।\n");
        shubhkamna.add("ये दिन ये महिना ये तारीख जब जब आयी,\n" +
                "\n" +
                "हमने प्यार से जन्मदिन की महफ़िल सजाई,\n" +
                "\n" +
                "हर शमा पर नाम लिख दिया दोस्ती का,\n" +
                "\n" +
                "इसकी रौशनी में चाँद जैसी तेरी सूरत समाई।\n");
        shubhkamna.add("सुबह का मौसम और आपकी याद;\n" +
                "\n" +
                "हलकी सी ठंडक और चाय की प्यास;\n" +
                "\n" +
                "यारों की यारी और यारी की मिठास;\n" +
                "\n" +
                "शुरू कीजिए अपना दिन मेरी सुप्रभात के साथ।\n" +
                "\n" +
                "सुप्रभात!");
        shubhkamna.add("एक और प्यारी सी सुबह हो गई;\n" +
                "\n" +
                "ज़िंदगी की खुशनुमा फ़िज़ा हो गई;\n" +
                "\n" +
                "मुबारक हो आपको आज का दिन;\n" +
                "\n" +
                "जिसमें शामिल आपकी दुआ हो गई।\n" +
                "\n" +
                "सुप्रभात!");
        shubhkamna.add("ये भी एक दुआ है खुदा से;\n" +
                "\n" +
                "किसी का दिल ना दुखे मेरी वजह से;\n" +
                "\n" +
                "ऐ खुदा कर दे कुछ ऐसी इनायत मुझ पर,\n" +
                "\n" +
                "कि खुशियाँ ही खुशियाँ मिलें सबको मेरी वजह से।\n" +
                "\n" +
                "सुप्रभात!");
        shubhkamna.add("आँखें खोलो भगवान का नाम लो,\n" +
                "\n" +
                "सांस लो ठंडी हवा का जाम लो,\n" +
                "\n" +
                "फिर ज़रा मोबाइल हाथ में थाम लो,\n" +
                "\n" +
                "और हमसे दिलकश सुबह का पैगाम लो.\n" +
                "\n" +
                "सुप्रभात");
        shubhkamna.add("सूरज निकल रहा है पूरब से;\n" +
                "\n" +
                "दिन शुरू हुआ आपकी याद से;\n" +
                "\n" +
                "कहना चाहते हैं हम आपको दिल से;\n" +
                "\n" +
                "हर दिन हो जाये अच्छा आपकी प्यारी सी मुस्कान से।\n" +
                "\n" +
                "सुप्रभात!\n");
        shubhkamna.add("आसमान का चाँद तेरी बाहों में हो;\n" +
                "\n" +
                "तू जो चाहे तेरी राहों में हो;\n" +
                "\n" +
                "हर वो ख्वाब हो पूरा जो तेरी आँखों में हो;\n" +
                "\n" +
                "खुश किस्मती की हर लकीर तेरे हाथो में हो।\n" +
                "\n" +
                "तह दिल से बहुत सारी शुभकामनाएं।");
        shubhkamna.add("तमन्नाओ से भरी हो ज़िन्दगी;\n" +
                "\n" +
                "ख्वाहिशों से भरा हो हर पल;\n" +
                "\n" +
                "दामन भी छोटा लगने लगे;\n" +
                "\n" +
                "इतनी खुशियाँ दे आपको आने वाला पल।\n" +
                "\n" +
                "जीवन के हर कार्य को शिकस्त करने की शुभकामनाएं।\n");
        shubhkamna.add("\n" +
                "भीगे मौसम की खुशबु हवाओं में हो;\n" +
                "\n" +
                "आपके साथ का एहसास इन फिजाओं में हो;\n" +
                "\n" +
                "यूहीं सदा रहे आपके होंठो पर मुस्कुराहट;\n" +
                "\n" +
                "इतना असर मेरी दुआओं में हो!\n" +
                "\n" +
                "शुभकामनाएं!");
        shubhkamna.add("\n" +
                "भीगे मौसम की खुशबु हवाओं में है;\n" +
                "\n" +
                "आपके साथ का एहसास इन फिजाओं में है;\n" +
                "\n" +
                "यूहीं सदा रहे आपके होंठो पर मुस्कुराहट;\n" +
                "\n" +
                "इतना असर तो मेरी दुआओं में है।");
        shubhkamna.add("ये दुनिया एक छोटा सा ख्वाब है;\n" +
                "\n" +
                "जियो अपनी जिंदगी ऐसे;\n" +
                "\n" +
                "जैसे जी रहा गुलाब है;\n" +
                "\n" +
                "रहकर साथ आप कांटो के भी;\n" +
                "\n" +
                "मुस्कुराओ हमेशा जैसे मुस्कुराता गुलाब है।");
        shubhkamna.add("\n" +
                "जितने हैं आसमान में सितारे;\n" +
                "\n" +
                "उतनी जिंदगी हो तेरी;\n" +
                "\n" +
                "किसी की बुरी नजर न लगे;\n" +
                "\n" +
                "हर कामयाबी कदम चूमें तेरी;\n" +
                "\n" +
                "आज दिन है दिल से दुआ देने का;\n" +
                "\n" +
                "तू सदा खुश रहे ये ही इल्तिजा है मेरी। \n");
        shubhkamna.add("\n" +
                "भीगे मौसम की खुशबु हवाओं में हो;\n" +
                "\n" +
                "आपके साथ का एहसास इन फिजाओं में हो;\n" +
                "\n" +
                "यूहीं सदा रहे आपके होंठो पे मुस्कुराहट;\n" +
                "\n" +
                "इतना असर मेरी दुआओं में हो।");
        shubhkamna.add("\n" +
                "खुदा हर नजर से बचाए आपको;\n" +
                "\n" +
                "चाँद सितारों से ज्यादा सजाए आपको;\n" +
                "\n" +
                "दुःख क्या होता है ये कभी पता न चले;\n" +
                "\n" +
                "खुदा जिंदगी में इतना हँसाए आपको।\n");
        shubhkamna.add("\n" +
                "फूलों की वादियों में हो बसेरा तेरा;\n" +
                "\n" +
                "सितारों के आँगन में हो घर तेरा;\n" +
                "\n" +
                "दुआ है एक दोस्त की एक दोस्त को;\n" +
                "\n" +
                "कि तुझसे भी खूबसूरत हो मुक़द्दर तेरा।\n" +
                "\n" +
                "तह-ए-दिल से बहुत सारी शुभकामनाएं!\n");
    }
    public void fillprernastrot(){
        prernastrot.add("और भी दुख हैं ज़माने में मोहब्बत के सिवा \n" +
                "\n" +
                "राहतें और भी हैं वस्ल की राहत के सिवा \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        prernastrot.add("दिल ना-उमीद तो नहीं नाकाम ही तो है \n" +
                "\n" +
                "लम्बी है ग़म की शाम मगर शाम ही तो है \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        prernastrot.add("ख़ुदी को कर बुलंद इतना कि हर तक़दीर से पहले \n" +
                "\n" +
                "ख़ुदा बंदे से ख़ुद पूछे बता तेरी रज़ा क्या है \n" +
                "\n" +
                "अल्लामा इक़बाल");
        prernastrot.add("मैं अकेला ही चला था जानिब-ए-मंज़िल मगर \n" +
                "\n" +
                "लोग साथ आते गए और कारवाँ बनता गया \n" +
                "\n" +
                "मजरूह सुल्तानपुरी");
        prernastrot.add("सितारों से आगे जहाँ और भी हैं \n" +
                "\n" +
                "अभी इश्क़ के इम्तिहाँ और भी हैं \n" +
                "\n" +
                "अल्लामा इक़बाल");
        prernastrot.add("वो अफ़्साना जिसे अंजाम तक लाना न हो मुमकिन \n" +
                "\n" +
                "उसे इक ख़ूब-सूरत मोड़ दे कर छोड़ना अच्छा \n" +
                "\n" +
                "साहिर लुधियानवी");
        prernastrot.add("हम को मिटा सके ये ज़माने में दम नहीं \n" +
                "\n" +
                "हम से ज़माना ख़ुद है ज़माने से हम नहीं \n" +
                "\n" +
                "जिगर मुरादाबादी");
        prernastrot.add("जहाँ रहेगा वहीं रौशनी लुटाएगा \n" +
                "\n" +
                "किसी चराग़ का अपना मकाँ नहीं होता \n");
        prernastrot.add("दुश्मनी जम कर करो लेकिन ये गुंजाइश रहे \n" +
                "\n" +
                "जब कभी हम दोस्त हो जाएँ तो शर्मिंदा न हों \n" +
                "\n" +
                "बशीर बद्र");
        prernastrot.add("न हम-सफ़र न किसी हम-नशीं से निकलेगा \n" +
                "\n" +
                "हमारे पाँव का काँटा हमीं से निकलेगा \n" +
                "\n" +
                "राहत इंदौरी");
        prernastrot.add("कश्तियाँ सब की किनारे पे पहुँच जाती हैं \n" +
                "\n" +
                "नाख़ुदा जिन का नहीं उन का ख़ुदा होता है \n" +
                "\n" +
                "अमीर मीनाई");
        prernastrot.add("धूप में निकलो घटाओं में नहा कर देखो \n" +
                "\n" +
                "ज़िंदगी क्या है किताबों को हटा कर देखो \n" +
                "\n" +
                "निदा फ़ाज़ली");
        prernastrot.add("हज़ार बर्क़ गिरे लाख आँधियाँ उट्ठें \n" +
                "\n" +
                "वो फूल खिल के रहेंगे जो खिलने वाले हैं \n" +
                "\n" +
                "साहिर लुधियानवी");
        prernastrot.add("उठो ये मंज़र-ए-शब-ताब देखने के लिए \n" +
                "\n" +
                "कि नींद शर्त नहीं ख़्वाब देखने के लिए \n" +
                "\n" +
                "इरफ़ान सिद्दीक़ी");
        prernastrot.add("तू शाहीं है परवाज़ है काम तेरा \n" +
                "\n" +
                "तिरे सामने आसमाँ और भी हैं \n" +
                "\n" +
                "अल्लामा इक़बाल");
        prernastrot.add("मिरे जुनूँ का नतीजा ज़रूर निकलेगा \n" +
                "\n" +
                "इसी सियाह समुंदर से नूर निकलेगा \n" +
                "\n" +
                "अमीर क़ज़लबाश");
        prernastrot.add("बच्चों के छोटे हाथों को चाँद सितारे छूने दो \n" +
                "\n" +
                "चार किताबें पढ़ कर ये भी हम जैसे हो जाएँगे \n" +
                "\n" +
                "निदा फ़ाज़ली");
        prernastrot.add("कैसे आकाश में सूराख़ नहीं हो सकता \n" +
                "\n" +
                "एक पत्थर तो तबीअ'त से उछालो यारो \n" +
                "\n" +
                "दुष्यंत कुमार");
        prernastrot.add("तिरे माथे पे ये आँचल बहुत ही ख़ूब है लेकिन \n" +
                "\n" +
                "तू इस आँचल से इक परचम बना लेती तो अच्छा था ");
        prernastrot.add("रंज से ख़ूगर हुआ इंसाँ तो मिट जाता है रंज \n" +
                "\n" +
                "मुश्किलें मुझ पर पड़ीं इतनी कि आसाँ हो गईं \n" +
                "\n" +
                "मिर्ज़ा ग़ालिब");
        prernastrot.add("जो तूफ़ानों में पलते जा रहे हैं \n" +
                "\n" +
                "वही दुनिया बदलते जा रहे हैं \n" +
                "\n" +
                "जिगर मुरादाबादी");
        prernastrot.add("सरफ़रोशी की तमन्ना अब हमारे दिल में है \n" +
                "\n" +
                "देखना है ज़ोर कितना बाज़ू-ए-क़ातिल में है \n" +
                "\n" +
                "बिस्मिल अज़ीमाबादी");
        prernastrot.add("घर से मस्जिद है बहुत दूर चलो यूँ कर लें \n" +
                "\n" +
                "किसी रोते हुए बच्चे को हँसाया जाए \n" +
                "\n" +
                "निदा फ़ाज़ली");
        prernastrot.add("कोशिश भी कर उमीद भी रख रास्ता भी चुन \n" +
                "\n" +
                "फिर इस के ब'अद थोड़ा मुक़द्दर तलाश कर \n" +
                "\n" +
                "निदा फ़ाज़ली");
        prernastrot.add("ढूँड उजड़े हुए लोगों में वफ़ा के मोती \n" +
                "\n" +
                "ये ख़ज़ाने तुझे मुमकिन है ख़राबों में मिलें \n" +
                "\n" +
                "अहमद फ़राज़");

    }
    public void filljivan(){
        jivan.add("जो गुज़ारी न जा सकी हम से \n" +
                "\n" +
                "हम ने वो ज़िंदगी गुज़ारी है \n" +
                "\n" +
                "जौन एलिया");
        jivan.add("होश वालों को ख़बर क्या बे-ख़ुदी क्या चीज़ है \n" +
                "\n" +
                "इश्क़ कीजे फिर समझिए ज़िंदगी क्या चीज़ है \n" +
                "\n" +
                "निदा फ़ाज़ली");
        jivan.add("ज़िंदगी तू ने मुझे क़ब्र से कम दी है ज़मीं \n" +
                "\n" +
                "पाँव फैलाऊँ तो दीवार में सर लगता है \n" +
                "\n" +
                "बशीर बद्र");
        jivan.add("ज़िंदगी किस तरह बसर होगी \n" +
                "\n" +
                "दिल नहीं लग रहा मोहब्बत में \n" +
                "\n" +
                "जौन एलिया");
        jivan.add("ज़िंदगी ज़िंदा-दिली का है नाम \n" +
                "\n" +
                "मुर्दा-दिल ख़ाक जिया करते हैं \n" +
                "\n" +
                "इमाम बख़्श नासिख़");
        jivan.add("सैर कर दुनिया की ग़ाफ़िल ज़िंदगानी फिर कहाँ \n" +
                "\n" +
                "ज़िंदगी गर कुछ रही तो ये जवानी फिर कहाँ \n" +
                "\n" +
                "ख़्वाजा मीर दर्द");
        jivan.add("उम्र-ए-दराज़ माँग के लाई थी चार दिन \n" +
                "\n" +
                "दो आरज़ू में कट गए दो इंतिज़ार में \n" +
                "\n" +
                "सीमाब अकबराबादी");
        jivan.add("मौत का भी इलाज हो शायद \n" +
                "\n" +
                "ज़िंदगी का कोई इलाज नहीं \n" +
                "\n" +
                "फ़िराक़ गोरखपुरी");
        jivan.add("तुम मोहब्बत को खेल कहते हो \n" +
                "\n" +
                "हम ने बर्बाद ज़िंदगी कर ली \n" +
                "\n" +
                "बशीर बद्र");
        jivan.add("देखा है ज़िंदगी को कुछ इतने क़रीब से \n" +
                "\n" +
                "चेहरे तमाम लगने लगे हैं अजीब से \n" +
                "\n" +
                "साहिर लुधियानवी");
        jivan.add("धूप में निकलो घटाओं में नहा कर देखो \n" +
                "\n" +
                "ज़िंदगी क्या है किताबों को हटा कर देखो \n" +
                "\n" +
                "निदा फ़ाज़ली");
        jivan.add("ज़िंदगी शायद इसी का नाम है \n" +
                "\n" +
                "दूरियाँ मजबूरियाँ तन्हाइयाँ \n" +
                "\n" +
                "कैफ़ भोपाली");
        jivan.add("अब तो ख़ुशी का ग़म है न ग़म की ख़ुशी मुझे \n" +
                "\n" +
                "बे-हिस बना चुकी है बहुत ज़िंदगी मुझे \n" +
                "\n" +
                "शकील बदायूनी");
        jivan.add("ज़िंदगी एक फ़न है लम्हों को \n" +
                "\n" +
                "अपने अंदाज़ से गँवाने का \n" +
                "\n" +
                "जौन एलिया");
        jivan.add("ग़रज़ कि काट दिए ज़िंदगी के दिन ऐ दोस्त \n" +
                "\n" +
                "वो तेरी याद में हों या तुझे भुलाने में \n" +
                "\n" +
                "फ़िराक़ गोरखपुरी");
        jivan.add("ज़िंदगी क्या किसी मुफ़लिस की क़बा है जिस में \n" +
                "\n" +
                "हर घड़ी दर्द के पैवंद लगे जाते हैं \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        jivan.add("ले दे के अपने पास फ़क़त इक नज़र तो है \n" +
                "\n" +
                "क्यूँ देखें ज़िंदगी को किसी की नज़र से हम \n" +
                "\n" +
                "साहिर लुधियानवी");
        jivan.add("अब मिरी कोई ज़िंदगी ही नहीं \n" +
                "\n" +
                "अब भी तुम मेरी ज़िंदगी हो क्या \n" +
                "\n" +
                "जौन एलिया");
        jivan.add("यूँ तो मरने के लिए ज़हर सभी पीते हैं \n" +
                "\n" +
                "ज़िंदगी तेरे लिए ज़हर पिया है मैं ने \n" +
                "\n" +
                "ख़लील-उर-रहमान आज़मी");
        jivan.add("इस तरह ज़िंदगी ने दिया है हमारा साथ \n" +
                "\n" +
                "जैसे कोई निबाह रहा हो रक़ीब से \n" +
                "\n" +
                "साहिर लुधियानवी");
        jivan.add("ज़िंदगी क्या है अनासिर में ज़ुहूर-ए-तरतीब \n" +
                "\n" +
                "मौत क्या है इन्हीं अज्ज़ा का परेशाँ होना \n");
    }
    public void fillrajniti(){
        rajniti.add("सिर्फ हंगामा खड़ा करना मिरा मक्सद नहीं,\n" +
                "मेरी कोशिश है कि ये सूरत बदलनी चाहिए।\n" +
                "\n");
        rajniti.add("चुनाव है लोकतंत्र की एकता का आधार, \n" +
                "मतदान करके इसके महत्व को करो साकार।\n");
        rajniti.add("\n" +
                "सियासत नफ़रतों का जख्म भरने ही नहीं देती,\n" +
                "जहाँ भरने पे आता हैं तो मक्खी बैठ जाती हैं.");
        rajniti.add("\n" +
                "हम भी आराम उठा सकते थे घर पर रह कर,\n" +
                "हम को भी माँ-बाप ने पाला था दुःख सह-सह कर.");
        rajniti.add("सच है, विपत्ति जा आती हैं,\n" +
                "कायर को ही दहलाती हैं,\n" +
                "सूरमा नहीं विचलित होते,\n" +
                "क्षण एक नहीं धीरज खोते.\n" +
                "\n");
        rajniti.add("\n" +
                "जब हौसला बना लिया ऊंची उड़ान का,\n" +
                "फिर देखना फिजूल है कद आसमान का।");
        rajniti.add("\n" +
                "उसे गुमाँ है कि मेरी उड़ान कुछ कम है,\n" +
                "मुझे यक़ीं है कि ये आसमान कुछ कम है।");
        rajniti.add("\n" +
                "चोर, बेईमान और भ्रष्ट नेताओं की क्यों करते हो बात।\n" +
                "लोकतंत्र की ताकत है जनता में, दिखला दो इनकी औकात।\n");
        rajniti.add("बदल जाओ वक्त के साथ या फिर वक्त बदलना सीखो,\n" +
                "मजबूरियों को मत कोसो हर हाल में चलना सीखो।\n");
        rajniti.add("\n" +
                "फ़दाली कर रहे हैं रोज निंदा, \n" +
                "बात कुछ होगी अकेले उड़ रहा है जो परिंदा, \n" +
                "बात कुछ होगी ठगी के दौर में बेईमानियों के, \n" +
                "बीच में रह के किसी में अब भी है ईमान जिंदा, \n" +
                "बात कुछ होगी।");
        rajniti.add("\n" +
                "अपनी तिजोरी तो हर कोई भरता है ,\n" +
                "ऐसा नेता चुनो जो देश के लिए कुछ करता है ।\n");
        rajniti.add("\n" +
                "राहुल जी की जुबान पर\n" +
                "रहते हमेशा मोदी।\n" +
                "अतः मोदीवादी कहते\n" +
                "जाओ बैठो मम्मी की गोदी।।");
        rajniti.add("केजरीवाल की खांसी से जंग है\n" +
                "दिल्ली प्यारी खांसी के संग है।\n" +
                "क्योंकि दिल्ली में प्रदुषण रंग है\n" +
                "यही केजरी के जीतने का ढंग है।");
        rajniti.add("हर किसी से ये फरियाद करेंगे ,\n" +
                "बस केवल नौजवानो को ही याद करेंगे , \n" +
                "खुद तो बुढे होकर राजनीति के मजे ले रहे है \n" +
                "तो युवाओ के लिए क्या खाक करेंगे ।\n" +
                "\n");
        rajniti.add("\n" +
                "राजनीति का रंग भी बड़ा अजीब होता है ,\n" +
                "वही दुश्मन बनता है जो सबसे करीब होता है।\n" +
                "\n");
        rajniti.add("\n" +
                "पसीने की स्याही से जो लिखते हैं इरादें को,\n" +
                "उसके मुक्कद्दर के सफ़ेद पन्ने कभी कोरे नही होते।\n");
        rajniti.add(""+
                "नेता की बातों में सच्चाई का अभाव होता है,\n" +
                "झूठ बोलना तो इनका स्वभाव होता हैं।");
        rajniti.add("समर शेष है नहीं पाप का भागी केवल व्याध\n" +
                "जो तटस्थ हैं समय लिखेगा उनके भी अपराध.");
        rajniti.add("\n" +
                "गुरूर में इंसान को कभी इंसान नहीं दिखता,\n" +
                "जैसे छत पर चढ़ जाओ तो अपना ही मकान नहीं दिखता.\n");
        rajniti.add("\n" +
                "छप के बिकते थे जो अखबार…\n" +
                "सुना है इन दिनों वो बिक के छपा करते है.\n");
        rajniti.add("सरहदों पर बहुत तनाव है क्या,\n" +
                "कुछ पता तो करो चुनाव है क्या,\n" +
                "और खौफ बिखरा है दोनों समतो में,\n" +
                "तीसरी समत का दबाव है क्या।");
        rajniti.add("लोकतंत्र की मर्यादा का रखों मान, चुनाव में वोट डालकर ही करो जलपान।\n");
        rajniti.add(
                "न मस्जिद को जानते हैं न शिवालो को जानते हैं,\n" +
                "जो भूखे पेट हैं वो सिर्फ निवालों को जानते हैं।\n");
        rajniti.add("मन से बड़ा कोई धाम न मिलेगा\n" +
                "विभीषण अगर बन भी गए,\n" +
                "तो अब राम ना मिलेगा.");

    }
    public void fillanya(){
        anya.add("किस ने भीगे हुए बालों से ये झटका पानी \n" +
                "\n" +
                "झूम के आई घटा टूट के बरसा पानी \n" +
                "\n" +
                "आरज़ू लखनवी");
        anya.add("अगर फ़ुर्सत मिले पानी की तहरीरों को पढ़ लेना \n" +
                "\n" +
                "हर इक दरिया हज़ारों साल का अफ़्साना लिखता है \n" +
                "\n" +
                "बशीर बद्र");
        anya.add("वो जो प्यासा लगता था सैलाब-ज़दा था \n" +
                "\n" +
                "पानी पानी कहते कहते डूब गया है \n" +
                "\n" +
                "आनिस मुईन");
        anya.add("हम इंतिज़ार करें हम को इतनी ताब नहीं \n" +
                "\n" +
                "पिला दो तुम हमें पानी अगर शराब नहीं \n" +
                "\n" +
                "नूह नारवी");
        anya.add("मैं ने अपनी ख़ुश्क आँखों से लहू छलका दिया \n" +
                "\n" +
                "इक समुंदर कह रहा था मुझ को पानी चाहिए \n" +
                "\n" +
                "राहत इंदौरी");
        anya.add("ये पानी ख़ामुशी से बह रहा है \n" +
                "\n" +
                "इसे देखें कि इस में डूब जाएँ \n" +
                "\n" +
                "अहमद मुश्ताक़");
        anya.add("दूर तक फैला हुआ पानी ही पानी हर तरफ़ \n" +
                "\n" +
                "अब के बादल ने बहुत की मेहरबानी हर तरफ़ \n" +
                "\n" +
                "शबाब ललित");
        anya.add("ऐसी प्यास और ऐसा सब्र \n" +
                "\n" +
                "दरिया पानी पानी है \n" +
                "\n" +
                "विकास शर्मा राज़");
        anya.add("अंदर अंदर खोखले हो जाते हैं घर \n" +
                "\n" +
                "जब दीवारों में पानी भर जाता है \n" +
                "\n" +
                "ज़ेब ग़ौरी");
        anya.add("अगर ऐ नाख़ुदा तूफ़ान से लड़ने का दम-ख़म है \n" +
                "\n" +
                "इधर कश्ती न ले आना यहाँ पानी बहुत कम है \n" +
                "\n" +
                "दिवाकर राही");
        anya.add("हँसता पानी रोता पानी \n" +
                "\n" +
                "मुझ को आवाज़ें देता था \n" +
                "\n" +
                "नासिर काज़मी");
        anya.add("हर्फ़ अपने ही मआनी की तरह होता है \n" +
                "\n" +
                "प्यास का ज़ाइक़ा पानी की तरह होता है \n" +
                "\n" +
                "फ़ैसल अजमी");
        anya.add("उस से कहना कि धुआँ देखने लाएक़ होगा \n" +
                "\n" +
                "आग पहने हुए जाउँगा मैं पानी की तरफ़ \n" +
                "\n" +
                "अभिषेक शुक्ला");
        anya.add("वो धूप थी कि ज़मीं जल के राख हो जाती \n" +
                "\n" +
                "बरस के अब के बड़ा काम कर गया पानी \n" +
                "\n" +
                "लईक़ आजिज़");
        anya.add("क़िस्से से तिरे मेरी कहानी से ज़ियादा \n" +
                "\n" +
                "पानी में है क्या और भी पानी से ज़ियादा \n" +
                "\n" +
                "अबरार अहमद");
        anya.add("दोस्तो ढूँड के हम सा कोई प्यासा लाओ \n" +
                "\n" +
                "हम तो आँसू भी जो पीते हैं तो पानी की तरह \n" +
                "\n" +
                "वाली आसी");
        anya.add("वो मजबूरी मौत है जिस में कासे को बुनियाद मिले \n" +
                "\n" +
                "प्यास की शिद्दत जब बढ़ती है डर लगता है पानी से \n" +
                "\n" +
                "मोहसिन असरार");
        anya.add("हैरान मत हो तैरती मछली को देख कर \n" +
                "\n" +
                "पानी में रौशनी को उतरते हुए भी देख \n" +
                "\n" +
                "मोहम्मद अल्वी");
        anya.add("अनगिनत सफ़ीनों में दीप जगमगाते हैं \n" +
                "\n" +
                "रात ने लुटाया है रंग-ओ-नूर पानी पर \n" +
                "\n" +
                "अक़ील नोमानी");
        anya.add("पानी ने जिसे धूप की मिट्टी से बनाया \n" +
                "\n" +
                "वो दाएरा-ए-रब्त बिगड़ने के लिए था \n" +
                "\n" +
                "हनीफ़ तरीन");


    }
    public void fillprem(){
        prem.add("मेरे प्रेम की शायरी तुम हो\n" +
                "पागलपन की समझदारी तुम हो\n" +
                "जब भी कुछ लिखने बैठा तो\n" +
                "मेरी कलम मेरी डायरी तुम हो");
        prem.add("मेरे दिल को तेरे दिल से बेहद प्रेम हो गया\n" +
                "तुझे याद करना धड़कन से ज़रूरी काम हो गया\n" +
                "कुछ तो जादूगरी है तेरे क़िरदार में\n" +
                "तुझसे मोहब्बत करके मेरा नाम हो गया\n" +
                "पढ़ें: जन्मदिन बधाई पर 20 शानदार शायरियां");
        prem.add("तेरा प्रेम मेरी सांसो का चलना\n" +
                "मेरे इस दिल की धड़कन का धड़कना\n" +
                "बस यूँ ही रहना संग मेरे ताउम्र\n" +
                "बदले ज़माना पर तुम ना बदलना");
        prem.add("तुझे देखूँ तो दिल मचल जाता है\n" +
                "प्रेम में तेरे खोकर सीने से फिसल जाता है\n" +
                "ना जाने कौन सी अदा है तेरी मुस्कान में\n" +
                "मुस्कुराते हैं दिल खुशी से उछल जाता है");
        prem.add("तेरे प्रेम के लिए ग़म भी सह लेंगे\n" +
                "तेरे साथ दुनिया में कहीं भी रह लेंगे\n" +
                "आपको खुशी मिले जाकर कहना पड़े\n" +
                "ख़ुदा के पास तो जाकर कह देंगे");
        prem.add("दौलत कहाँ हम तो तेरा प्यार चाहते हैं\n" +
                "प्रेम में होना तेरे गिरफ्तार चाहते हैं\n" +
                "मेरा दिल भी अब यह सुनना चाहता है\n" +
                "कि तुम भी मुझे बेशुमार चाहते हैं");
        prem.add("प्रेम का नशा सबसे निराला है\n" +
                "झूमे वही जिसने भी पिया यह प्याला है\n" +
                "प्रेम में दीवानी मीरा ज़हर पी गई\n" +
                "डूबी जिसके प्रेम में वह सब का रखवाला है");
        prem.add("देखने के बाद भी जिसे देखने का मन करें\n" +
                "तो समझो उससे आपको बेहद प्रेम है\n" +
                "जिससे मिलने के बाद दूर जाने का मन ना करे\n" +
                "तो समझो वह तुम्हारे दिल के बहुत क़रीब है");
        prem.add("सच्चे प्रेम की तलाश में निकले हो तो\n" +
                "दिल और दिल के विचारों पर ध्यान देना\n" +
                "रंग रूप तो एक दिन ढल ही जाता है");
        prem.add("पढ़ें: विश्वास पर कथन \n" +
                "कितना भी समेटूँ खुद को,\n" +
                "तेरी एक याद मुझे बिखेर देती है\n" +
                "जब भी दिखती है सूरत तेरी\n" +
                "प्रेम के सागर की उफनती लहरें मुझे घेर लेती है");
        prem.add("जब आँखें खुले तो सामने तेरा चेहरा हो\n" +
                "तेरे साथ ही मेरी ज़िंदगी का हर सवेरा हो\n" +
                "इस प्रेम में मेरी एक ही ख़्वाहिश बाकी\n" +
                "मेरी हर ख़ुशी तेरी और तेरा हर ग़म मेरा हो");
        prem.add("प्रेम कोई बंधन नहीं जो बाँधा जाए\n" +
                "प्रेम तो एक ख़ुशबू है जिसे चढ़ जाए\n" +
                "वो हरदम हवा में बस उड़ता जाता है\n" +
                "");
        prem.add("सीने में दिल और दिल की तड़पन तुम हो\n" +
                "धड़कती इन सांसों की धड़कन तुम हो\n" +
                "तेरे प्रेम का न जाने कैसा खुमार चढ़ा है\n" +
                "आँखों में नींदें और नींदों के स्वप्न तुम हो");
        prem.add("जिसे देखते ही धड़कन तेज भागे\n" +
                "खोकर यादों में जिसकी आँखें जागे\n" +
                "जिससे दिल से हो जाए सच्चा प्रेम\n" +
                "उसके आगे दुनिया में कुछ भी ना फिर प्यारा लागे");
        prem.add("डूब चुका हूँ अब बहना बाकी है\n" +
                "इश्क है तुझसे यह कहना बाकी है\n" +
                "तेरे प्रेम से सजा रखा है दिल का मंदिर\n" +
                "आकर तेरा इसमें बस रहना बाकी है");
        prem.add("लगता है दिल को कुछ होने जा रहा है\n" +
                "किसी की यादों में यह खोने जा रहा है\n" +
                "पूछा हकीम से इस मर्ज की दवा क्या है\n" +
                "बोला कुछ नहीं तुझे इश्क होने जा रहा");
        prem.add("जिस तरह चाँद बिना रातें अधूरी लगती है\n" +
                "ख़ुशबू बिना फूल अधूरे लगते हैं\n" +
                "उसी तरह तेरे प्रेम बिना मुझको\n" +
                "यह ज़िंदगी मेरी अधूरी लगती है");
        prem.add("मेरी ज़िंदगी का मक़सद तेरी मुस्कान है\n" +
                "तेरी ख़ुशी के लिए मेरा सब कुछ कुर्बान है\n" +
                "इस दिल में बस गई है मुरत तेरे प्यार की\n" +
                "मैं हूँ प्रेम पुजारी और तू मेरा भगवान है");
        prem.add("प्रेम का जिनको हम पाठ पढ़ाने निकले\n" +
                "वो तो किसी और के दीवाने निकले\n" +
                "फिर दिल ने सोचा कि भूल जाएँ उनको\n" +
                "भूलने बैठे तो याद करने के बहाने निकले");
        prem.add("जिनको अपना समझा वही बेगाने निकले\n" +
                "जिसे ख़ुशी समझा वो ग़म के ख़ज़ाने निकले\n" +
                "अब तक हमने जो भी सुनी प्रेम की कहानी\n" +
                "उसमे मिलने के कम बिछड़ने के ज़्यादा बहाने निकले");

    }
    public void fildard(){
        dard.add("ऐ मोहब्बत तिरे अंजाम पे रोना आया \n" +
                "\n" +
                "जाने क्यूँ आज तिरे नाम पे रोना आया \n" +
                "\n" +
                "शकील बदायूनी");
        dard.add("अब तो ख़ुशी का ग़म है न ग़म की ख़ुशी मुझे \n" +
                "\n" +
                "बे-हिस बना चुकी है बहुत ज़िंदगी मुझे \n" +
                "\n" +
                "शकील बदायूनी");
        dard.add("कब ठहरेगा दर्द ऐ दिल कब रात बसर होगी \n" +
                "\n" +
                "सुनते थे वो आएँगे सुनते थे सहर होगी \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        dard.add("ज़िंदगी क्या किसी मुफ़लिस की क़बा है जिस में \n" +
                "\n" +
                "हर घड़ी दर्द के पैवंद लगे जाते हैं \n" +
                "\n" +
                "फ़ैज़ अहमद फ़ैज़");
        dard.add("इश्क़ से तबीअत ने ज़ीस्त का मज़ा पाया \n" +
                "\n" +
                "दर्द की दवा पाई दर्द-ए-बे-दवा पाया \n" +
                "\n" +
                "मिर्ज़ा ग़ालिब");
        dard.add("मेरे हम-नफ़स मेरे हम-नवा मुझे दोस्त बन के दग़ा न दे \n" +
                "\n" +
                "मैं हूँ दर्द-ए-इश्क़ से जाँ-ब-लब मुझे ज़िंदगी की दुआ न दे \n" +
                "\n" +
                "शकील बदायूनी");
        dard.add("दर्द ऐसा है कि जी चाहे है ज़िंदा रहिए \n" +
                "\n" +
                "ज़िंदगी ऐसी कि मर जाने को जी चाहे है \n" +
                "\n" +
                "कलीम आजिज़");
        dard.add("बे-नाम सा ये दर्द ठहर क्यूँ नहीं जाता \n" +
                "\n" +
                "जो बीत गया है वो गुज़र क्यूँ नहीं जाता \n" +
                "\n" +
                "निदा फ़ाज़ली");
        dard.add("दोस्तों को भी मिले दर्द की दौलत या रब \n" +
                "\n" +
                "मेरा अपना ही भला हो मुझे मंज़ूर नहीं \n" +
                "\n" +
                "हफ़ीज़ जालंधरी");
        dard.add("आज तो दिल के दर्द पर हँस कर \n" +
                "\n" +
                "दर्द का दिल दुखा दिया मैं ने \n" +
                "\n" +
                "ज़ुबैर अली ताबिश");
        dard.add("जुदाइयों के ज़ख़्म दर्द-ए-ज़िंदगी ने भर दिए \n" +
                "\n" +
                "तुझे भी नींद आ गई मुझे भी सब्र आ गया \n" +
                "\n" +
                "नासिर काज़मी");
        dard.add("अब ये भी नहीं ठीक कि हर दर्द मिटा दें \n" +
                "\n" +
                "कुछ दर्द कलेजे से लगाने के लिए हैं \n" +
                "\n" +
                "जाँ निसार अख़्तर");
        dard.add("क्यूँ हिज्र के शिकवे करता है क्यूँ दर्द के रोने रोता है \n" +
                "\n" +
                "अब इश्क़ किया तो सब्र भी कर इस में तो यही कुछ होता है \n" +
                "\n" +
                "हफ़ीज़ जालंधरी");
        dard.add("जब हुआ ज़िक्र ज़माने में मोहब्बत का 'शकील' \n" +
                "\n" +
                "मुझ को अपने दिल-ए-नाकाम पे रोना आया \n" +
                "\n" +
                "शकील बदायूनी");
        dard.add("मुझे छोड़ दे मेरे हाल पर तिरा क्या भरोसा है चारागर \n" +
                "\n" +
                "ये तिरी नवाज़िश-ए-मुख़्तसर मेरा दर्द और बढ़ा न दे \n" +
                "\n" +
                "शकील बदायूनी");
        dard.add("इश्क़ की चोट का कुछ दिल पे असर हो तो सही \n" +
                "\n" +
                "दर्द कम हो या ज़ियादा हो मगर हो तो सही \n" +
                "\n" +
                "जलाल लखनवी");
        dard.add("दर्द हो दिल में तो दवा कीजे \n" +
                "\n" +
                "और जो दिल ही न हो तो क्या कीजे \n" +
                "\n" +
                "मंज़र लखनवी");
        dard.add("अगर दर्द-ए-मोहब्बत से न इंसाँ आश्ना होता \n" +
                "\n" +
                "न कुछ मरने का ग़म होता न जीने का मज़ा होता \n" +
                "\n" +
                "चकबस्त ब्रिज नारायण");
        dard.add("आदत के ब'अद दर्द भी देने लगा मज़ा \n" +
                "\n" +
                "हँस हँस के आह आह किए जा रहा हूँ मैं \n" +
                "\n" +
                "जिगर मुरादाबादी");
        dard.add("दर्द-ए-दिल कितना पसंद आया उसे \n" +
                "\n" +
                "मैं ने जब की आह उस ने वाह की \n" +
                "\n" +
                "आसी ग़ाज़ीपुरी");
        dard.add("वही कारवाँ वही रास्ते वही ज़िंदगी वही मरहले \n" +
                "\n" +
                "मगर अपने अपने मक़ाम पर कभी तुम नहीं कभी हम नहीं \n" +
                "\n" +
                "शकील बदायूनी");
        dard.add("ज़ख़्म कहते हैं दिल का गहना है \n" +
                "\n" +
                "दर्द दिल का लिबास होता है \n" +
                "\n" +
                "गुलज़ार");
        dard.add("दिल हिज्र के दर्द से बोझल है अब आन मिलो तो बेहतर हो \n" +
                "\n" +
                "इस बात से हम को क्या मतलब ये कैसे हो ये क्यूँकर हो \n" +
                "\n" +
                "इब्न-ए-इंशा");
    }
    public void filljanmadin(){
        janmadin.add("गुल ने गुलशन से पैगाम भेजा है,\n" +
                "सूरज ने गगन से सलाम भेजा है,\n" +
                "आंखों में देखे सारे ख्वाब पूरे हो,\n" +
                "यही दिल से हमने पैगाम भेजा है,\n" +
                "जन्मदिन मुबारक हो।");
        janmadin.add("नसीब और ऊंचे हो तुम्हारे,\n" +
                "सबका प्यार यूं ही मिलता रहे तुम्हें,\n" +
                "दुआ है रब से हर सफलता मिले तुम्हें,\n" +
                "जन्मदिन बहुत-बहुत शुभकामनाएं।");
        janmadin.add("आज दिन बड़ा सुहाना है,\n" +
                "आज कोई सबसे न्यारा है,\n" +
                "मेरा भाई सबसे प्यारा है,\n" +
                "जन्मदिन मुबारक हो।");
        janmadin.add("तुम्हारी राह का हर पत्थर फूल बन जाए,\n" +
                "खुशियों के बादल झूम के बरस जाए,\n" +
                "जो मांगा है तुमने रब से वो तुमको मिल जाए,\n" +
                "जन्मदिन की शुभकामनाएं…\n");
        janmadin.add("हर मन्नत पूरी हो तुम्हारी,\n" +
                "जन्नत से भी ज्यादा खुशियां मिले तुम्हें,\n" +
                "सबका प्यार और दुलार मिले तुम्हें,\n" +
                "Happy Birthday Dear\n");
        janmadin.add("\n" +
                "जिंदगी से चुरा लू गम सारे तुम्हारे,\n" +
                "खुशियों से भर दूं दामन तुम्हारा,\n" +
                "हर साल यूं ही मनाते रहो तुम जन्मदिन,\n" +
                "बस यही है इरादा हमारा,\n" +
                "जन्मदिन की बहुत-बहुत शुभकामनाएं।");
        janmadin.add("रिश्तो को निभाना कोई तुमसे सीखे,\n" +
                "बहन को मनाना कोई तुमसे सीखे,\n" +
                "सबसे प्यारे भैया बनना कोई तुमसे सीखे,\n" +
                "हैप्पी बर्थडे भैया…");
        janmadin.add("आप आए तो रोशन हुआ सवेरा,\n" +
                "आप मुस्कुराए तो खिले फूल,\n" +
                "हम क्या दुआ दे आपको,\n" +
                "आप तो खुद ही दुआ हो,\n" +
                "जन्मदिन की बधाई हो!!");
        janmadin.add("तुम्हारी दोस्ती का कोई जवाब नहीं,\n" +
                "ए दोस्त तुझको क्या उपहार दूं,\n" +
                "तू तो खुद ही लाजवाब है,\n" +
                "हैप्पी बर्थडे दोस्त");
        janmadin.add("हैप्पी वाला बर्थडे मुबारक हो,\n" +
                "बड़ी-बड़ी खुशियां मिले तुम्हें,\n" +
                "खुशियों के दिन भी बड़े बड़े हो।\n");
        janmadin.add("आपके जन्मदिन पर दुआ है रब से,\n" +
                "खिलता गुलाब खुशबू दे आपको,\n" +
                "ख्वाब जो देखा है वो पूरा हो आपका,\n" +
                "खुशी का यह लम्हा मुबारक हो आपको।\n");
        janmadin.add("ईश्वर की भेजी अनमोल विरासत हो आप,\n" +
                "हीरे नहीं कोहिनूर हो आप,\n" +
                "दोस्त नहीं भाई हो आप,\n" +
                "हैप्पी बर्थडे की बधाई हो आपको।\n");
        janmadin.add("आज दिन बड़ा शुभ आया है,\n" +
                "लगता है आज के दिन फरिश्ता कोई आया है,\n" +
                "वो कोई और नहीं आप हो क्योंकि,\n" +
                "आज जन्मदिन आपका आया है,\n" +
                "हैप्पी बर्थडे..");
        janmadin.add("जिंदगी का हर दिन खास हो आपका,\n" +
                "हर खास लम्हा मुबारक हो आप,\n" +
                "जिंदगी जो लेकर आई है आपके लिए आज,\n" +
                "वो तमाम खुशियों की सौगात मुबारक हो आपको,\n" +
                "जन्मदिन की बहुत बधाई हो आपको।");
        janmadin.add("जिंदगी का सबसे नायाब तोहफा हो आप,\n" +
                "सबसे खास आप हो आपसे खास कोई ना हो,\n" +
                "दुआ है रब से हर दुआ कबूल हो आपकी,\n" +
                "Happy Birthday to You\n");
        janmadin.add("धरती से आसमान तक नाम हो आपका,\n" +
                "खुशियों का हर चमन हो आपका,\n" +
                "हम तो रहते है छोटी सी दुनिया में,\n" +
                "ईश्वर करे सारा जहां हो आपका,\n" +
                "जन्मदिन की शुभकामनाएं…");
        janmadin.add("खुदा की रहमत बरसती रहे आप पर,\n" +
                "खुशियों का नीर बहे आपके घर में,\n" +
                "जो मांगी थी दुआ अपने रब से,\n" +
                "वो सब कबूल हो यही दुआ है रब से,\n" +
                "जन्मदिन की आपको बहुत-बहुत बधाई।");
        janmadin.add("चांद की चांदनी भी फीकी पड़ जाए,\n" +
                "आपके चेहरे पर इतना नूर है,\n" +
                "आपके चेहरे का नूर और मुस्कान यूं ही बनी रहे,\n" +
                "जन्मदिन की बहुत-बहुत बधाई हो..");
        janmadin.add("\n" +
                "तुम्हारे जन्मदिन पर अर्जी भेजी है खुदा को,\n" +
                "खुशियों की सौगात मिले तुमको,\n" +
                "जन्नत से भी बढ़कर कोई दुनिया हो तो वो मिले,\n" +
                "जिंदगी लंबी और ऊंची शान मिले,\n" +
                "आपके जन्मदिन पर तहे दिल से शुभकामनाएं..\n");
        janmadin.add("चांद ने सूरज के हाथ पैगाम भेजा है,\n" +
                "हर लम्हा रोशन हो जाए तुम्हारा,\n" +
                "खुशियों से भर जाए जीवन तुम्हारा,\n" +
                "जन्मदिन की बहुत-बहुत बधाइयां।");

    }
    public void fillholi(){
        holi.add("जमाने के लिए आज होली है,\n" +
                "मुझे तो तेरी यादे रोज रंग देती है…\n" +
                "Happy Holi\n");
        holi.add("मोहब्ब्बत के रंग तुम पर बरसा देंगे आज,\n" +
                "अपने प्यार की बौछार से तुम्हे भीगा देंगे आज\n" +
                "तुम पे बस निशान हमारे ही दिखेंगे\n" +
                "कुछ इस तरह रंग तुम्हे लगा देंगे आज.\n" +
                "Happy Holi Meri Jaan\n");
        holi.add("Bhiga ke tujh paani mein,\n" +
                "Tere sath bheeg jana hai,\n" +
                "Ho kar rango se rangeen aaj\n" +
                "Apne gaalo se rang tere, \n" +
                "gaaalo pe lagana hai. \n" +
                "Happy Holi My Wife/My Heart/My Softi");
        holi.add("सब रंगो को मिला कर पानी में,\n" +
                "सतरंगी नदियाँ बहाई हैं…\n" +
                "कर देंगे सबके चेहरों को लाल\n" +
                "होली की ऐसी खुमारी छायी है\n" +
                "लगा दो रंग आज कोई बचके ना जा पाए\n" +
                "क्युकी सबसे सतरंगी होली आयी है\n" +
                "हैप्पी होली दोस्तों\n");
        holi.add("फागुन की मस्ती लायी है ये होलीभीगा है,\n" +
                " हर लहंगा हर चोली..\n" +
                "डूबे है सभी मस्ती में आजघूम रही है, \n" +
                "मस्तानो की टोली, \n" +
                "भूल जाओ गीले शिकवे डुबो मस्ती में,\n" +
                "आज हर जुबान यही गीत है,\n" +
                "बोलीरंग ले खुद को इन खूबसूरत रंगों में आ गयी है,\n" +
                "फिर तुम्हे भिगोने ये हो,\n" +
                " हैप्पी होली की हार्दिक शुभकामनाएं");
        holi.add("प्यार के रंगों से भरो पिचकारी, \n" +
                "स्नेह के रंगों से रंग दो दुनिया सारी, \n" +
                "ये रंग न जाने न कोई जात न बोली, \n" +
                "सबको हो मुबारक ये हैप्पी होली!");
        holi.add("निकलो गलियों में बना के टोली, \n" +
                "भीगा दो आज हर लड़की की चोली, \n" +
                "मुस्करा दे तो उसे बाहों में भर लो.. \n" +
                "वरना निकल लो कह के हैप्पी होली।");
        holi.add("दिल सपनो से houseful है, \n" +
                "पूरे होंगे वो doubtful है, \n" +
                "इस दुनिया में हर चीज़ wonderful है, \n" +
                "पर ज़िन्दगी आप जैसे लोगों से ही colorful है!");
        holi.add("इस बार होली ऐसी मनाऊँगा, \n" +
                "खुद को करके काला पीला, \n" +
                "तेरी गली पहुँच जाऊँगा.. तू सोचती रह जाएगी, \n" +
                "और तेरे भाई के सामने तुझे रंग लगा जाऊँगा…. \n" +
                "Happy holi");
        holi.add("ए खुदा आज तो रहम कर दे..\n" +
                "मेरे दोस्त आज नहीं रह पाएँगे, \n" +
                "लगवा दे किसी लड़की के हाथों इन्हे रंग, \n" +
                "ये कमीने पूरे साल नहीं नहायेंगे …. Happy Holi");
        holi.add("सूरज की पहली किरण में 7 रंग हो,\n" +
                "बागों में फूलों की खुशबू संग हो, \n" +
                "आप जब भी खोलें अपनी पलकें, \n" +
                "आपके चहरे पर होली का रंग हो..Happy Holi\n");
        holi.add("अर्ज़ है … सर में दर्द हो तो खा लो, \n" +
                "सिरदर्द की गोली… वाह …वाह .. \n" +
                "सर में दर्द हो तो खा लो सिरदर्द की गोली,\n" +
                ".. वाह …वाह ..मुबारक हो,\n" +
                "आपको हैप्पी होली.. हैप्पी होली।");
        holi.add("बदरी छाई है फागुन की, \n" +
                "फिर हुड़दंग मचाएंगे एक रंग में सबको,\n" +
                "रंगकर फिर से होली मनाएंगे… Happy Holi\n");
        holi.add("त्यौहार ये रंग का; त्यौहार ये भंग का; \n" +
                "मस्ती में मस्त हो जाओ आज; \n" +
                "होली है आई; होली में दुगना मज़ा है,\n" +
                "यार के संग का! होली मुबारक हो!\n");
        holi.add("\n" +
                "भगवान् करे हर साल चाँद बन के आये, \n" +
                "दिन का उजाला बन के आए …\n" +
                "कभी दूर ना हो आपके चेहरे से हँसी, \n" +
                "ये होली का त्यौहार ऐसा मेहमान बन के आये,\n" +
                "Happy Holi");
        holi.add("पिचकारी की धार, \n" +
                "गुलाल की बौछार, \n" +
                "अपनों का प्यार, \n" +
                "यही है यारों होली का त्यौहार।");
        holi.add("लाल हो या पीला, \n" +
                "हरा हो या नीला, \n" +
                "सुखा हो या गिला, \n" +
                "एक बार रंग लग जाये,\n" +
                "तो हो जाये रंगीला… \n" +
                "HAPPY HOLI");
        holi.add("तमन्नाओं से भरी हो ज़िन्दगी , \n" +
                "ख्वाइशों से भरा हो हर पल ….. \n" +
                "दामन भी छोटा लगे इतनी खुशियाँ दे.. \n" +
                "आपको आनेवाला हर पल,\n" +
                "Happy Colorful & Joyfull Holi\n");
        holi.add("होली.. होली होती है दीवाली मत समझना , \n" +
                "हम तुम्हारे घर आये तो हमे मवाली मत समझना \n" +
                "Happy Holi");
    }

}
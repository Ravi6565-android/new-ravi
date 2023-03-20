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
int image;
    subcatagory_custom_adapter subcatagory_custom_adapter;

ListView sublist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_catagory);
        filldosti();fillyayde();
        sublist=findViewById(R.id.subcatagory_list);
                int pos=getIntent().getIntExtra("pos",0);

                if(pos==1){
                    image=getIntent().getIntExtra("image",0);
                    subcatagory_custom_adapter= new subcatagory_custom_adapter(subCatagory.this,dosti,image);
                    sublist.setAdapter(subcatagory_custom_adapter);
                    setonclikc();
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
}
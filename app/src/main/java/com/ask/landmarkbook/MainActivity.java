package com.ask.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ask.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();
        Landmark pisa = new Landmark("Leaning Tower of Pisa", "Italy", R.drawable.pisa, "The Leaning Tower of Pisa is an iconic structure located in Pisa, Italy. Known for its distinct tilt, the tower is a fascinating architectural marvel that attracts visitors from around the world. Built in the 12th century, the tower's lean adds to its charm and makes it a must-see landmark in Italy.");
        Landmark eiffel = new Landmark("Eiffel Tower", "France", R.drawable.eifel, "The Eiffel Tower, located in the heart of Paris, France, is a monumental iron lattice tower that has become the enduring symbol of both the city and the country. Designed by Gustave Eiffel and completed in 1889, the tower stands at a height of 324 meters (1,063 feet). Its intricate structure consists of over 18,000 individual iron pieces and has three observation decks offering breathtaking views of the city. The Eiffel Tower exemplifies the architectural brilliance and innovative spirit of the French, and it remains an iconic landmark attracting millions of visitors each year.");
        Landmark londonBrigde = new Landmark("London Bridge", "UK", R.drawable.londonbridge, "London Bridge is an iconic symbol of the city's rich history and architectural grandeur. Spanning across the River Thames in London, United Kingdom, it has been a crossing point since Roman times. The current bridge, completed in 1972, is a modern structure that replaced the original 19th-century bridge. London Bridge is not only a vital transportation link but also a sightseeing attraction, offering stunning views of the river and the city's iconic landmarks, including the Tower of London and the Shard. Its historical significance and picturesque location make it a beloved landmark, capturing the essence of London's timeless charm.");
        Landmark greatWallOfChina = new Landmark("Great Wall of China", "China", R.drawable.greatwall, "Spanning over 21,000 kilometers (13,000 miles) across the historical northern borders of China, the Great Wall of China is a colossal feat of human engineering. Built over centuries, it was primarily constructed to protect China from invasions. The wall consists of various sections, some restored and others in a more rugged state. It weaves through mountains, deserts, and grasslands, offering stunning vistas. The Great Wall is not only a testament to the ancient Chinese civilization but also a UNESCO World Heritage site and a symbol of China's rich history and cultural heritage.");
        Landmark statueOfLiberty = new Landmark("Statue of Liberty", "United States", R.drawable.statueofliberty, "Standing proudly on Liberty Island in New York Harbor, the Statue of Liberty is an iconic symbol of freedom and democracy. This colossal neoclassical sculpture was gifted to the United States by France in 1886. The statue, designed by Frédéric Auguste Bartholdi, represents Libertas, the Roman goddess of freedom, holding a torch and a tablet inscribed with the date of the American Declaration of Independence. The Statue of Liberty has welcomed millions of immigrants to America, symbolizing hope, opportunity, and the American dream.");
        Landmark operaHouse = new Landmark("Sydney Opera House", "Australia", R.drawable.operahouse, "Gracefully perched on Bennelong Point in Sydney, Australia, the Sydney Opera House is a globally recognized architectural masterpiece. Designed by Danish architect Jørn Utzon and opened in 1973, its distinctive sail-like roof and unique design have made it an iconic landmark. The Opera House is home to multiple performance venues, including concert halls and theaters, hosting a diverse range of cultural and artistic events. It represents Australia's vibrant arts scene, showcasing world-class performances and serving as a symbol of the nation's creativity and passion.");
        Landmark tajMahal = new Landmark("Taj Mahal", "India", R.drawable.tajmahal, "Situated in Agra, India, the Taj Mahal is a mesmerizing white marble mausoleum that stands as an eternal symbol of love and devotion. Commissioned by Mughal Emperor Shah Jahan in the 17th century, the Taj Mahal was built in memory of his beloved wife, Mumtaz Mahal. Its symmetrical architecture, intricate carvings, and exquisite details make it one of the most enchanting structures in the world. The Taj Mahal is a UNESCO World Heritage site and attracts visitors from all corners of the globe, who come to marvel at its timeless beauty and learn about the rich Mughal history and culture.");
        Landmark colloseum = new Landmark("Colloseum", "Italy", R.drawable.colloseum, "Nestled in the heart of Rome, Italy, the Colosseum, also known as the Flavian Amphitheatre, is an awe-inspiring testament to the grandeur and engineering marvels of the ancient Roman Empire. Constructed in the 1st century AD, it was the largest amphitheater ever built, accommodating up to 50,000 spectators. The Colosseum was the site of gladiatorial contests, animal hunts, and other spectacles that entertained the citizens of ancient Rome. Today, it stands as a striking reminder of the city's glorious past and serves as a popular tourist attraction, allowing visitors to explore its underground chambers and imagine the splendor of ancient Roman entertainment.");
        Landmark giza = new Landmark("Pyramids of Giza", "Egypt", R.drawable.giza, "Rising from the sandy plains near Cairo, Egypt, the Pyramids of Giza have captivated the imagination of people worldwide for centuries. These monumental structures, including the Great Pyramid of Khufu, the Pyramid of Khafre, and the Pyramid of Menkaure, were built as tombs for the pharaohs during the Old Kingdom period. The precision of their construction, the sheer scale of the pyramids, and the mysteries surrounding their building techniques make them an architectural wonder. The Pyramids of Giza stand as a testament to the advanced civilization of ancient Egypt and provide a glimpse into the country's rich cultural heritage.");
        Landmark bigBen = new Landmark("Big Ben", "UK", R.drawable.bigben, "Standing tall amidst the grandeur of the Palace of Westminster in London, United Kingdom, Big Ben is an iconic clock tower that has become synonymous with the city's skyline. Officially known as the Elizabeth Tower, the clock tower features the Great Bell, which strikes the hour with its resonant chimes. Completed in 1859, the tower stands at a height of 96 meters (315 feet) and has become an enduring symbol of British heritage and the seat of parliamentary democracy.");
        Landmark christTheRedeemer = new Landmark("Christ the Redeemer", "Brazil", R.drawable.christ,"Standing atop the Corcovado mountain overlooking Rio de Janeiro, Brazil, Christ the Redeemer is an imposing statue of Jesus Christ with outstretched arms, embracing the city below. Designed by French sculptor Paul Landowski and built by Brazilian engineer Heitor da Silva Costa, the statue symbolizes the warmth and hospitality of the Brazilian people. Completed in 1931, it stands at a height of 30 meters (98 feet) and has become an iconic landmark, representing Brazil's strong religious heritage and offering breathtaking views of Rio de Janeiro.");
        Landmark mountFuji = new Landmark("Mount Fuji", "Japan", R.drawable.fuji, "Majestically rising at a height of 3,776 meters (12,389 feet), Mount Fuji is an active stratovolcano located southwest of Tokyo, Japan. Revered by the Japanese for centuries, it holds a significant place in the country's culture and art. Mount Fuji is characterized by its symmetrical cone shape, often capped with a snow-capped peak. It has been the subject of numerous poems, paintings, and photographs, embodying the beauty and tranquility of nature. Recognized as a UNESCO World Heritage site, Mount Fuji attracts climbers, hikers, and nature enthusiasts who seek to witness its awe-inspiring presence and experience the spiritual connection it holds in Japanese traditions.");
        Landmark maidensTower = new Landmark("Maiden's Tower", "Turkey", R.drawable.maidenstower, "Maiden's Tower, also known as Leander's Tower, is a historic structure located on a small islet at the entrance of the Bosphorus Strait in Istanbul, Turkey. The tower has a rich history dating back to ancient times and has served various purposes throughout the centuries, including a lighthouse, defense outpost, and quarantine station. Today, it stands as a popular tourist attraction, offering breathtaking views of the city and serving as a venue for cultural events and dining experiences. The Maiden's Tower holds a special place in Istanbul's folklore and adds a touch of mystique to the city's stunning skyline.");


        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(londonBrigde);
        landmarkArrayList.add(greatWallOfChina);
        landmarkArrayList.add(statueOfLiberty);
        landmarkArrayList.add(operaHouse);
        landmarkArrayList.add(tajMahal);
        landmarkArrayList.add(colloseum);
        landmarkArrayList.add(giza);
        landmarkArrayList.add(bigBen);
        landmarkArrayList.add(christTheRedeemer);
        landmarkArrayList.add(mountFuji);
        landmarkArrayList.add(maidensTower);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
//                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
//        );
//
//        binding.listView.setAdapter(arrayAdapter);
//
//        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                //Toast.makeText(MainActivity.this, landmarkArrayList.get(i).name, Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
//
//                intent.putExtra("landmark",landmarkArrayList.get(i));
//                startActivity(intent);
//            }
//        });




    }
}
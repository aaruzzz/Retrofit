package com.research.retrofitjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private TextView nameTextResult;
    private TextView cityTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

//<<<<!!!!-------  GSON TEST FROM Address, Employee, FamilyMember  -------!!!!>>>>
        Gson gson = new Gson();

        Address address = new Address("Nepal", "Kathmandu");

        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Father", 45));
        family.add(new FamilyMember("Mother", 42));
        family.add(new FamilyMember("Son", 22));


        Employee employee = new Employee("World", 999999999, "helloworld@gmail.com", address, family);
        String json = gson.toJson(employee);

        String json = "{\"address\":{\"city\":\"Kathmandu\",\"country\":\"Nepal\"},\"age\":999999999,\"first_name\":\"World\",\"mail\":\"helloworld@gmail.com\"}\n";
        Employee employee = gson.fromJson(json, Employee.class);
 */

/*

//<<<<!!!!-------  Retrofit TEST GET JSON DATA FROM jsonplaceholder.typicode.com/posts  -------!!!!>>>>
//        <<<<!!!!-------            Includes JsonPlaceHolderApi, Post            -------!!!!>>>>


        textViewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(GsonConverterFactory.create()).build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Post>> call = jsonPlaceHolderApi.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()){
                    textViewResult.setText("Code error:"+response.code());
                    return;
                }
                List<Post> posts = response.body();
                for (Post post : posts){
                    String content = "";
                    content += "ID: " + post.getId();
                    content += "\nUserID: " + post.getUserId();
                    content += "\nTitle: " + post.getTitle();
                    content += "\nBody: " + post.getText() + "\n\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
*/

/*

//<<<<!!!!-------  Retrofit TEST GET JSON DATA FROM mocki.io/v1/d4867d8b-b5d5-4a48-a4ab-79131b5809b8  -------!!!!>>>>
//           <<<<!!!!-------            Includes ProductsPlaceHolder, Products            -------!!!!>>>>

        nameTextResult = findViewById(R.id.name_text);
        cityTextResult = findViewById(R.id.city_text);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://mocki.io/").addConverterFactory(GsonConverterFactory.create()).build();
        ProductsPlaceHolder productPlaceHolder = retrofit.create(ProductsPlaceHolder.class);

        Call<List<Products>> call = productPlaceHolder.getProducts();
        call.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {
                if(!response.isSuccessful()){
                    nameTextResult.setText("Code error: "+response.code());
                    cityTextResult.setText("Code error: "+response.code());
                    return;
                }
                List<Products> products = response.body();
                for (Products product : products){
                    String name = "Name: " + product.getName() + "\n";
                    String city = "City: " + product.getCity() + "\n";
                    nameTextResult.append(name);
                    cityTextResult.append(city);
                }
            }

            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {
                nameTextResult.setText(t.getMessage());
                cityTextResult.setText(t.getMessage());
            }
        });

*/

//<<<<!!!!-------  Retrofit TEST GET JSON DATA FROM dummyjson.com/users  -------!!!!>>>>
//  <<<<!!!!-------         Includes UsersPlaceHolderApi, Users         -------!!!!>>>>

        nameTextResult = findViewById(R.id.name_text);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://dummyjson.com/").addConverterFactory(GsonConverterFactory.create()).build();
        UsersPlaceHolderApi usersPlaceHolder = retrofit.create(UsersPlaceHolderApi.class);

        Call<Users> call = usersPlaceHolder.getUsers();
        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {

                if(!response.isSuccessful()){
                    nameTextResult.setText("Code error: "+response.code());
                    cityTextResult.setText("Code error: "+response.code());
                    return;
                }
                List<Users.users> users = response.body().getUsers();
                for (Users.users users1 : users){
                    String id = "ID: " + users1.getId() + "\n";
                    String first_name = "First name: " + users1.getFirstName() + "\n";
                    String last_name = "Last name: " + users1.getLastName() + "\n";
                    String age = "Age: " + users1.getAge() + "\n\n";
                    nameTextResult.append(id+first_name+last_name+age);
                }
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                nameTextResult.setText(t.getMessage());
            }
        });



    }
}
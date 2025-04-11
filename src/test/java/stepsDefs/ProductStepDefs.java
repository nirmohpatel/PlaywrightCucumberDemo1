package stepsDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.ProductPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProductStepDefs {
    ProductPage productPage=new ProductPage();
    @Then("the user navigates to the {string} page successfully.")
    public void theUserNavigatesToThePageSuccessfully(String pageTitle) {
        assertThat(productPage.verifyTheProductPageTitle(pageTitle),is(true));

    }

    @Then("the user should be able to verify the all the products with price.")
    public void theUserShouldBeAbleToVerifyTheAllTheProductsWithPrice(DataTable dataTable) {
            List<List<String>> productListWithPrice= dataTable.asLists(String.class);
            for (List<String> productWithPrice : productListWithPrice){
                assertThat(productPage.verifyTheProductsNameWithPrice(productWithPrice),is(true));
            }
    }
}

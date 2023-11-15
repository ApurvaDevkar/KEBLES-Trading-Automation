package KeblesTrading.stepdef;

import KeblesTrading.pages.HomePage;
import KeblesTrading.utilities.BasePage;
import KeblesTrading.utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class kebles_stepdef extends TestBase {
    //object creation
	BasePage baseclass = new BasePage();
	HomePage page = new HomePage(driver);

	@Given("Launch Browser and open URL")
	public void launch_Browser_and_open_URL() throws Exception {
		launchUrl();
	}

	@When("User should navigate to home page of Kebles Trading")
	public void user_should_navigate_to_home_page_of_Kebles_Trading() {
		page.user_should_navigate_to_home_page_of_Kebles_Trading();
	}

	@Given("All Product options should be visible on Home Page")
	public void all_Product_options_should_be_visible_on_Home_Page() {
        page.all_Product_options_should_be_visible_on_Home_Page();
	}

	@When("User click on wire rope product option")
	public void user_click_on_wire_rope_product_option() {
		page.user_click_on_wire_rope_product_option();
	}

	@Then("Verify user should able to see all wire rope relevant product or Details")
	public void verify_user_should_able_to_see_all_wire_rope_relevant_product_or_Details() {
		page.verify_user_should_able_to_see_all_wire_rope_relevant_product_or_Details();
	}

	@When("User click on Rigging product option")
	public void user_click_on_Rigging_product_option() {
         page.user_click_on_Rigging_product_option();
	}

	@Then("Verify user should able to see all Rigging relevant product or Details")
	public void verify_user_should_able_to_see_all_Rigging_relevant_product_or_Details() {
	    page.verify_user_should_able_to_see_all_Rigging_relevant_product_or_Details();
	}

	@When("User click on Material Handling option")
	public void user_click_on_Material_Handling_option() {
        page.user_click_on_Material_Handling_option();
	}

	@Then("Verify user should able to see all Material Handling relevant product or Details")
	public void verify_user_should_able_to_see_all_Material_Handling_relevant_product_or_Details() {
		page.verify_user_should_able_to_see_all_Material_Handling_relevant_product_or_Details();
	}

	@When("User click on Handrails option")
	public void user_click_on_Handrails_option() {
        page.user_click_on_Handrails_option();
	}

	@Then("Verify user should able to see all Handrails relevant product or Details")
	public void verify_user_should_able_to_see_all_Handrails_relevant_product_or_Details() {
		page.verify_user_should_able_to_see_all_Handrails_relevant_product_or_Details();
	}

	@Then("Verify if user enter any text in search box field, appropriate search result should display")
	public void verify_if_user_enter_any_text_in_search_box_field_appropriate_search_result_should_display() {
		page.verify_if_user_enter_any_text_in_search_box_field_appropriate_search_result_should_display();
	}
	
	@Given("User should be on home page of Kebles Trading")
	public void user_should_be_on_home_page_of_Kebles_Trading() {
		page.user_should_be_on_home_page_of_Kebles_Trading();
	}

	@When("All View more button should be visible and clickable on Home page")
	public void all_View_more_button_should_be_visible_and_clickable_on_Home_page() {
		page.all_View_more_button_should_be_visible_and_clickable_on_Home_page();
	}

	@When("User click on Wire Rope View more button")
	public void user_click_on_Wire_Rope_View_more_button() {
	    
	}

	@Then("User should navigate to Wire Rope details page")
	public void user_should_navigate_to_Wire_Rope_details_page() {
	    
	}

	@When("User click on Rigging View more button")
	public void user_click_on_Rigging_View_more_button() {
	   
	}

	@Then("User should navigate to Rigging details page")
	public void user_should_navigate_to_Rigging_details_page() {
	   
	}

	@When("User click on Material Handling View more button")
	public void user_click_on_Material_Handling_View_more_button() {
	    
	}

	@Then("User should navigate to Material Handling details page")
	public void user_should_navigate_to_Material_Handling_details_page() {
	   
	}

	@When("User click on Handrails View more button")
	public void user_click_on_Handrails_View_more_button() {
	   
	}

	@Then("User should navigate to Handrails details page")
	public void user_should_navigate_to_Handrails_details_page() {
	    
	}
	
//*********************************************************************************************************************************//

//	@Then("Verify user should able to see all wire rop relevant product")
//	public void verify_user_should_able_to_see_all_wire_rop_relevant_product() {
//
//	}
//
//	@Then("Verify user should able to select or click on any product")
//	public void verify_user_should_able_to_select_or_click_on_any_product() {
//
//	}
//
//	@Then("Verify user should navigate to filter by page")
//	public void verify_user_should_navigate_to_filter_by_page() {
//
//	}
//
//	@Then("Verify according to filter by, search result should display")
//	public void verify_according_to_filter_by_search_result_should_display() {
//
//	}
//
//	@Then("Verify user should able to see all Rigging relevant product")
//	public void verify_user_should_able_to_see_all_Rigging_relevant_product() {
//
//	}
//
//	@Then("Verify user should able to see all Material Handling relevant product")
//	public void verify_user_should_able_to_see_all_Material_Handling_relevant_product() {
//
//	}
//
//	@Then("Verify user should able to see all Handrails relevant product")
//	public void verify_user_should_able_to_see_all_Handrails_relevant_product() {
//
//	}
//
//	@When("User navigating to legal information section")
//	public void user_navigating_to_legal_information_section() {
//
//	}
//
//	@Then("Verify Privacy Policy should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Privacy_Policy_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Terms of Use  should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Terms_of_Use_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Disclaimers should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Disclaimers_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@When("User navigationg to  INFORMATION RESOURCES section")
//	public void user_navigationg_to_INFORMATION_RESOURCES_section() {
//
//	}
//
//	@Then("Verify FAQs link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_FAQs_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Videos link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Videos_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Testimonials link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Testimonials_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Guides & How-to’s link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Guides_How_to_s_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Positions Vacant link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Positions_Vacant_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Careers link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Careers_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@When("User navigationg to BUYING INFORMATION section")
//	public void user_navigationg_to_BUYING_INFORMATION_section() {
//
//	}
//
//	@Then("Verify Credit Terms link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Credit_Terms_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Payment Information  link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Payment_Information_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Shipping & Returns link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Shipping_Returns_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@When("User navigate to Quick links section")
//	public void user_navigate_to_Quick_links_section() {
//
//	}
//
//	@Then("Verify Home link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Home_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify About us  link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_About_us_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Promotions link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Promotions_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Contact Us link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Contact_Us_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Blog link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Blog_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Industrial Partners link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Industrial_Partners_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Then("Verify Brochures link should be visible and clickable and Once click it should navigate to appropraite page")
//	public void verify_Brochures_link_should_be_visible_and_clickable_and_Once_click_it_should_navigate_to_appropraite_page() {
//
//	}
//
//	@Given("User should be on homepage")
//	public void user_should_be_on_homepage() {
//
//	}
//
//	@When("User select any product & add for enquiry")
//	public void user_select_any_product_add_for_enquiry() {
//
//	}
//
//	@Then("Verify User navigate to product enquiry form")
//	public void verify_User_navigate_to_product_enquiry_form() {
//
//	}
//
//	@Then("Verify once user enter all details form should be submitted")
//	public void verify_once_user_enter_all_details_form_should_be_submitted() {
//
//	}
//
//	@Then("Verify add to cart number should be increase and should display")
//	public void verify_add_to_cart_number_should_be_increase_and_should_display() {
//
//	}
//
//	@When("User click on enquiry button")
//	public void user_click_on_enquiry_button() {
//
//	}
//
//	@Then("Verify user should navigate to enquiry page")
//	public void verify_user_should_navigate_to_enquiry_page() {
//
//	}
//
//	@When("User click on know more button")
//	public void user_click_on_know_more_button() {
//
//	}
//
//	@Then("Verify user should navigate to PDF or information page")
//	public void verify_user_should_navigate_to_PDF_or_information_page() {
//
//	}
//
//	@When("User navigate to contact request form")
//	public void user_navigate_to_contact_request_form() {
//
//	}
//
//	@Then("Verify mandatory fields for the form")
//	public void verify_mandatory_fields_for_the_form() {
//
//	}
//
//	@Then("Verify user should able to enter details")
//	public void verify_user_should_able_to_enter_details() {
//
//	}
//
//	@Then("Verify user should able to submit details")
//	public void verify_user_should_able_to_submit_details() {
//
//	}
//
//	@When("User navigate to WELCOME TO KEBLE’S TRADING section")
//	public void user_navigate_to_WELCOME_TO_KEBLE_S_TRADING_section() {
//
//	}
//
//	@Then("Verify user should able to play video")
//	public void verify_user_should_able_to_play_video() {
//
//	}
//
//	@When("User navigate to latest Post section")
//	public void user_navigate_to_latest_Post_section() {
//
//	}
//
//	@Then("Verify all images with Read more button should visible and clickable")
//	public void verify_all_images_with_Read_more_button_should_visible_and_clickable() {
//
//	}
//
//	@Then("Verify once click on read more button user should navigate to detail page")
//	public void verify_once_click_on_read_more_button_user_should_navigate_to_detail_page() {
//
//	}
//
//	@Then("verify validation for leave reply form")
//	public void verify_validation_for_leave_reply_form() {
//
//	}
//
//	@Then("verify user should able to fill leave reply form and submit it")
//	public void verify_user_should_able_to_fill_leave_reply_form_and_submit_it() {
//
//	}
//
//	@Then("verify Search field functionality and there search results")
//	public void verify_Search_field_functionality_and_there_search_results() {
//
//	}
//
//	@Then("verify category functionality and there search results")
//	public void verify_category_functionality_and_there_search_results() {
//
//	}
//
//	@Then("verify tag functionality and there search results")
//	public void verify_tag_functionality_and_there_search_results() {
//
//	}
//
//	@When("User navigate to instagram feed section")
//	public void user_navigate_to_instagram_feed_section() {
//
//	}
//
//	@Then("verify all images should be  display")
//	public void verify_all_images_should_be_display() {
//
//	}
//
//	@Then("verify if click on any image the user should navigate to insta feed page")
//	public void verify_if_click_on_any_image_the_user_should_navigate_to_insta_feed_page() {
//
//	}
//
//	@When("User navigate to store location section")
//	public void user_navigate_to_store_location_section() {
//
//	}
//
//	@Then("verify all address should be display")
//	public void verify_all_address_should_be_display() {
//
//	}
//
//	@Then("verify if click on any address according to that search resuly should display")
//	public void verify_if_click_on_any_address_according_to_that_search_resuly_should_display() {
//
//	}
//
//	@When("User navigate to SIGNUP TO OUR NEWSLETTER section")
//	public void user_navigate_to_SIGNUP_TO_OUR_NEWSLETTER_section() {
//
//	}
//
//	@Then("verify validation for SIGNUP TO OUR NEWSLETTER")
//	public void verify_validation_for_SIGNUP_TO_OUR_NEWSLETTER() {
//
//	}
//
//	@Then("verify user should able toenter mail id and submit it")
//	public void verify_user_should_able_toenter_mail_id_and_submit_it() {
//
//	}

}

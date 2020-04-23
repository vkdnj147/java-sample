package com.sample.app.api.sample.common.exception;

public enum ErrorMessageCode {

    SUCCESS(200000, "success"),
    ERROR(500000, "error"),

    AUTH_NOT_FOUND(500100, "auth.not.found"),
    ROLE_NOT_FOUND(500101, "role.not.found"),

    USERNAME_NOT_FOUND(500102, "username.not.found"),
    AUTHENTICATION_FAILED_EXCEPTION(500104, "authentication.failed.exception"),


    USERNAME_IS_REQUIRED(500200, "username.is.required"),
    PASSWORD_IS_REQUIRED(500201, "password.is.required"),
    CONFIRMPASSWORD_IS_REQUIRED(500202, "confirmpassword.is.required"),
    LASTNAME_IS_REQUIRED(500203, "lastname.is.required"),
    FIRSTNAME_IS_REQUIRED(500204, "firstname.is.required"),
    USERNAME_IS_ALREADY_EXISTS(500205, "username.is.already_exists"),
    USERNAME_PATTERN_IS_NOT_ALLOWED(500206, "username.pattern.is.not.allowed"),
    USER_PASSWORD_PATTERN_IS_NOT_ALLOWED(500207, "user.password.pattern.is.not.allowed"),
    USER_CONFIRMPASSWORD_PATTERN_IS_NOT_ALLOWED(500208, "user.confirmpassword.pattern.is.not.allowed"),
    USER_PASSWORD_IS_NOT_EQUALS(500209, "user.password.is.not.equals"),
    SNSID_IS_REQUIRED(500210, "snsid.is.required"),
    SNSTYPE_IS_REQUIRED(500211, "snstype.is.required"),
    SNSTOKEN_IS_REQUIRED(500212, "snstoken.is.required"),
    SNS_TYPE_IS_INCORRENT_EXCEPTION(500213, "sns.type.is.incorrent.exception"),
    MEMBER_NOT_FOUND(500214, "member.not.found"),
    MEMBER_PROFILE_NOT_FOUND(500215, "memberprofile.not.found"),
    MEMBER_FOLLOW_NOT_FOUND(500216, "member.follow.not.found"),
    MEMBER_FOLLOW_IS_ALREADY_EXISTS(500217, "member.follow.is.already.exists"),
    ISAGREE_IS_REQUIRED(500218, "isagree.is.required"),
    AGREE_IS_REQUIRED(500219, "agree.is.required"),
    SAMPLE_TITLE_IS_REQUIRED(500229, "sample.is.required"),
    SAMPLE_IS_ALREADY_EXISTS(500228, "sample.is.already.exists"),
    SAMPLE_NOT_FOUND(500228, "sample.not.found"),
    BRAND_NOT_FOUND(500328, "brand.not.found"),
    IMAGE_NOT_FOUND(500313, "image.not.found"),

    MEMBER_AUTH_CERTPHONENUMBER_IS_REQUIRED(500220, "member.auth.certphonenumber.is.required"),
    MEMBER_AUTH_GENDER_IS_REQUIRED(500221, "member.auth.gender.is.required"),
    MEMBER_AUTH_CERTNAME_IS_REQUIRED(500222, "member.auth.certname.is.required"),
    MEMBER_AUTH_RECEIPTID_IS_REQUIRED(500223, "member.auth.receiptId.is.required"),
    MEMBER_AUTH_REQUESTEDAT_IS_REQUIRED(500224, "member.auth.requestedat.is.required"),
    MEMBER_AUTH_PURCHASEDAT_IS_REQUIRED(500225, "member.auth.purchasedat.is.required"),
    MEMBER_AUTH_ORDERID_IS_REQUIRED(500226, "member.auth.orderid.is.required"),
    MEMBER_AUTH_BIRTHDAY_IS_REQUIRED(500227, "member.auth.birthday.is.required"),
    MEMBER_AUTH_IS_REQUIRED(500228, "member.auth.is.required"),
    MEMBER_AUTH_NOT_FOUND(500229, "member.auth.not.found"),
    MEMBER_ADDRESS_FOUND(500230, "member.address.not.found"),
    MEMBER_PRODUCT_IS_ALREADY_EXISTS(500231, "member.product.is.already.exists"),
    MEMBER_PRODUCT_PRODUCTID_IS_REQUIRED(500232, "member.product.productid.is.required"),
    MEMBER_PRODUCT_SIZE_IS_REQUIRED(500232, "member.product.size.is.required"),
    MEMBER_PRODUCT_NOT_FOUND(500233, "member.product.size.not.fount"),
    PASSWORD_NOT_MATCHED(500234, "password.no.tmatched"),
    NICKNAME_IS_ALREADY_EXISTS(500235, "nickname.is.already.exists"),
    MEMBER_AUTH_IS_ALREADY_EXISTS(500236, "member.auth.is.already.exists"),
    TOKEN_IS_REQUIRED(500237, "token.is.required"),
    SECRET_REQUEST_NOT_FOUND(500238, "secret.request.not.found"),
    TOKEN_IS_EXPIRED(500239, "token.is.expired"),

    CUSTOMERSERVICE_NOT_FOUND(500401, "customerservice.is.required"),
    CUSTOMERSERVICE_TITLE_IS_REQUIRED(500402, "customerservice.title.is.required"),
    CUSTOMERSERVICE_CATEGORY_IS_REQUIRED(500403, "customerservice.category.is.required"),
    CUSTOMERSERVICE_DESCRIPTION_IS_REQUIRED(500404, "customerservice.description.is.required"),
    FREQUENTLYASKEDQUESTION_NOT_FOUND(500405, "frequentlyAskedQuestion.title.is.required"),
    CUSTOMERSERVICE_IMAGE_IS_REQUIRED(500406, "frequentlyAskedQuestion.title.is.required"),
    CUSTOMERSERVICE_IMAGE_NOT_FOUND(500407, "frequentlyAskedQuestion.title.is.required"),
    LOW_BALANCE_EXCEPTION(500924, "low.balance.exception"),

    CONTENT_NOT_FOUND(500520, "content.not.found"),
    EVENT_NOT_FOUND(500530, "event.not.found"),
    COUPON_NOT_FOUND(500420, "coupon.not.found"),
    NOTICE_NOT_FOUND(500500, "notice.not.found"),

    PRODUCT_NOT_FOUND(500300, "Product not found"),
    PRODUCT_NAME_IS_EMPTY(500301, "Product name is empty."),
    PRODUCT_MODEL_NAME_IS_EMPTY(500302, "Product model name is empty."),
    PRODUCT_MODEL_NUM_IS_EMPTY(500303, "Product model num is empty."),
    PRODUCT_RELEASEAT_IS_EMPTY(500304, "Product releaseat is empty."),
    PRODUCT_BRANDID_IS_EMPTY(500305, "Product brandid is empty."),
    PRODUCT_COLOR_IS_EMPTY(500306, "Product color is empty."),
    PRODUCT_IMAGE_IS_EMPTY(500307, "Product image is empty"),
    PRODUCT_IMAGE_NOT_FOUND(500308, "Product image not found"),
    PRODUCT_IMAGE_IS_REQUIRED(500309, "Product image is required"),
    PRODUCT_SIZE_NOT_FOUND(500310, "Product Size not found"),
    SIZE_IS_REQUIRED(500311, "Size is required"),
    PRODUCT_SIZETYPE_NOT_FOUND(500312, "Product SizeType not found"),


    COUPON_MEMBER_NOT_FOUND(500450, "coupon.member.not.found"),
    COUPON_ALREADY_ISSUED(500450, "coupon.already.issued"),

    SELLACCOUNT_WITHRAW_AMOUNT_IS_NOT_ALLOWED(500921, "sellaccount.withraw.amount.not.allowed"),
    SELLACCOUNT_WITHRAW_REQUEST_AMOUNT_IS_REQUIRED(500922, "sellaccount.withraw.request.amount.is.required"),
    SELLERCONFIRM_NOT_FOUND(500800, "sellerconfirm.not.found"),
    SELLERCONFIRM_BANK_CODE_IS_REQUIRED(500801, "sellerconfirm.bank.code.is.required"),
    SELLERCONFIRM_BANK_ACCOUNT_IS_REQUIRED(500802, "sellerconfirm.bank.acconut.is.required"),
    SELLERCONFIRM_BANK_ACCOUNTNAME_IS_REQUIRED(500803, "sellerconfirm.bank.acconutname.is.required"),
    SELLER_ACCOUNT_CHANGE_IS_ALREADY_DOING(500804, "seller.account.change.is.already.doing"),
    SELLER_ACCOUNT_CHANGE_BANK_CODE_IS_REQUIRED(500805, "seller.account.change.bank.code.is.required"),
    SELLER_ACCOUNT_CHANGE_BANK_ACCOUNT_IS_REQUIRED(500806, "seller.account.change.bank.acconut.is.required"),
    SELLER_ACCOUNT_CHANGE_BANK_ACCOUNTNAME_IS_REQUIRED(500807, "seller.account.change.bank.acconutname.is.required"),

    DUMMY(900000, "Dummy");


    ErrorMessageCode(final int codeValue, final String messageCode) {
        this.codeValue = codeValue;
        this.responseValue = messageCode;
    }

    private int codeValue;
    private String defaultMessage;
    private String responseValue;

    public int getCode() {
        return codeValue;
    }


    public String getResponseValue() {
        return responseValue;
    }

}


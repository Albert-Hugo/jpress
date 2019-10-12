package io.jpress.module.product.model;

import com.jfinal.core.JFinal;
import io.jboot.db.annotation.Table;
import io.jboot.utils.StrUtil;
import io.jpress.JPressOptions;
import io.jpress.commons.utils.JsoupUtils;
import io.jpress.module.product.model.base.BaseProduct;

/**
 * Generated by JPress.
 */
@Table(tableName = "product", primaryKey = "id")
public class Product extends BaseProduct<Product> {

    private static final long serialVersionUID = 1L;

    public static final String STATUS_NORMAL = "normal";
    public static final String STATUS_DRAFT = "draft";
    public static final String STATUS_TRASH = "trash";


    public boolean isNormal() {
        return STATUS_NORMAL.equals(getStatus());
    }

    public boolean isDraft() {
        return STATUS_DRAFT.equals(getStatus());
    }

    public boolean isTrash() {
        return STATUS_TRASH.equals(getStatus());
    }


    public String getUrl() {
        if (StrUtil.isBlank(getSlug())) {
            return JFinal.me().getContextPath() + "/product/" + getId() + JPressOptions.getAppUrlSuffix();
        } else {
            return JFinal.me().getContextPath() + "/product/" + getSlug() + JPressOptions.getAppUrlSuffix();
        }
    }

    public String getHtmlView() {
        return StrUtil.isBlank(getStyle()) ? "product.html" : "product_" + getStyle().trim() + ".html";
    }

    public String getText() {
        return StrUtil.escapeHtml(JsoupUtils.getText(getContent()));
    }

    public boolean isCommentEnable() {
        Boolean cs = getCommentStatus();
        return cs != null && cs == true;
    }




}

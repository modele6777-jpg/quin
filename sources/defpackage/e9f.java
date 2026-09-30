package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class e9f extends d8c {
    public static int C(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font z(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : Constants.MINIMAL_ERROR_STATUS_CODE, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iC = C(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iC2 = C(fontStyle, font2.getStyle());
            if (iC2 < iC) {
                font = font2;
                iC = iC2;
            }
        }
        return font;
    }

    public final FontFamily A(er5[] er5VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (er5 er5Var : er5VarArr) {
            if (Objects.equals(er5Var.a.getScheme(), "systemfont")) {
                fontBuild = B(er5Var);
            } else {
                try {
                    Uri uri = er5Var.a;
                    String str = er5Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(er5Var.c).setSlant(er5Var.d ? 1 : 0).setTtcIndex(er5Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    b1.n("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font B(er5 er5Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.d8c
    public final Typeface m(Context context, qq5 qq5Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (rq5 rq5Var : qq5Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, rq5Var.f).setWeight(rq5Var.b).setSlant(rq5Var.c ? 1 : 0).setTtcIndex(rq5Var.e).setFontVariationSettings(rq5Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(z(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            b1.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.d8c
    public final Typeface n(Context context, er5[] er5VarArr, int i) {
        try {
            FontFamily fontFamilyA = A(er5VarArr, context.getContentResolver());
            if (fontFamilyA == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyA).setStyle(z(fontFamilyA, i).getStyle()).build();
        } catch (Exception e) {
            b1.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.d8c
    public final Typeface o(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyA = A((er5[]) list.get(0), contentResolver);
            if (fontFamilyA == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyA);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyA2 = A((er5[]) list.get(i2), contentResolver);
                if (fontFamilyA2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyA2);
                }
            }
            return customFallbackBuilder.setStyle(z(fontFamilyA, i).getStyle()).build();
        } catch (Exception e) {
            b1.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.d8c
    public final Typeface p(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            b1.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}

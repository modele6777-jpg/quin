package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hyb {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, p90 p90Var, boolean z) throws Throwable {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            ej8 ej8Var = a9f.b;
            Typeface typeface = (Typeface) ej8Var.c(a9f.b(resources, i, string, i3, i2));
            int i4 = 12;
            if (typeface != null) {
                if (p90Var != null) {
                    new Handler(Looper.getMainLooper()).post(new xu8(i4, p90Var, typeface));
                }
                typefaceA = typeface;
            } else {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        pq5 pq5VarL = rxg.L(resources.getXml(i), resources);
                        if (pq5VarL == null) {
                            b1.d("ResourcesCompat", "Failed to find font-family tag");
                            if (p90Var != null) {
                                p90Var.i(-3);
                            }
                        } else {
                            typefaceA = a9f.a(context, pq5VarL, resources, i, string, typedValue.assetCookie, i2, p90Var, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceP = a9f.a.p(context, resources, i, string);
                        if (typefaceP != null) {
                            ej8Var.d(a9f.b(resources, i, string, i5, i2), typefaceP);
                        }
                        if (p90Var != null) {
                            if (typefaceP != null) {
                                new Handler(Looper.getMainLooper()).post(new xu8(i4, p90Var, typefaceP));
                            } else {
                                p90Var.i(-3);
                            }
                        }
                        typefaceA = typefaceP;
                    }
                } catch (IOException e) {
                    b1.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (p90Var != null) {
                        p90Var.i(-3);
                    }
                } catch (XmlPullParserException e2) {
                    b1.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (p90Var != null) {
                        p90Var.i(-3);
                    }
                }
            }
        } else if (p90Var != null) {
            p90Var.i(-3);
        }
        if (typefaceA != null || p90Var != null) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}

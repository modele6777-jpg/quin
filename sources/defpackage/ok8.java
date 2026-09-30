package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.R;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ok8 {
    public static Method A = null;
    public static Method B = null;
    public static boolean C = false;
    public static gx6 D = null;
    public static final int E = 9;
    public static final int F = 10;
    public static final int G = 12;
    public static gx6 H;
    public static volatile ah6 a;
    public static final c1b b = new c1b(new jl0(9));
    public static final dd2 c = new dd2(new md2(12), false, 2097196444);
    public static final dd2 d = new dd2(new yd2(24), false, -1264265624);
    public static final dd2 e = new dd2(new he2(7), false, -1067948196);
    public static final n82 f;
    public static final n82 g;
    public static final float h;
    public static final n82 i;
    public static final float j;
    public static final n82 k;
    public static final float l;
    public static final n82 m;
    public static final float n;
    public static final g5d o;
    public static final float p;
    public static final n82 q;
    public static final float r;
    public static final float s;
    public static final String[] t;
    public static final String[] u;
    public static final String[] v;
    public static final String[] w;
    public static final String[] x;
    public static final String[] y;
    public static final String[] z;

    static {
        n82 n82Var = n82.z;
        f = n82Var;
        n82 n82Var2 = n82.v;
        g = n82Var2;
        h = 0.38f;
        i = n82Var2;
        j = 0.38f;
        k = n82Var2;
        l = 0.12f;
        m = n82Var;
        n = 44.0f;
        o = g5d.d;
        p = 4.0f;
        q = n82.Y;
        r = 16.0f;
        s = 4.0f;
        t = new String[]{"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
        u = new String[]{"ad_impression"};
        v = new String[]{"ad_impression", "in_app_purchase"};
        w = new String[]{"ad_impression"};
        x = new String[]{"ad_impression", "in_app_purchase"};
        y = new String[]{"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
        z = new String[]{"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    }

    public static final int A(od0 od0Var, Object obj, int i2) {
        int i3 = od0Var.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iQ = cgg.q(i3, i2, od0Var.a);
            if (iQ < 0 || pa7.t(obj, od0Var.b[iQ])) {
                return iQ;
            }
            int i4 = iQ + 1;
            while (i4 < i3 && od0Var.a[i4] == i2) {
                if (pa7.t(obj, od0Var.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iQ - 1; i5 >= 0 && od0Var.a[i5] == i2; i5--) {
                if (pa7.t(obj, od0Var.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            qc0.e();
            return 0;
        }
    }

    public static final ed4 B(gd4 gd4Var, String str, boolean z2) {
        if (!z2) {
            if (str != null && !v4e.Q(str)) {
                return new fd4(gd4Var, str);
            }
            if (gd4Var.f) {
                return new fd4(gd4Var, null);
            }
        }
        return gd4Var;
    }

    public static final lyd C(wj5 wj5Var, aw2 aw2Var) {
        return ynb.V(aw2Var, null, null, new gk5(wj5Var, null), 3);
    }

    public static int D(int i2, int i3, int i4) throws IOException {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        yg5.m(ks0.k("PROTOCOL_ERROR padding ", i4, " > remaining length ", i2));
        return 0;
    }

    public static final j09 E(j09 j09Var, a26 a26Var) {
        return j09Var.D(new gn9(a26Var));
    }

    public static final long F(int i2, int i3, boolean z2, boolean z3) {
        long j2 = i2;
        long j3 = ((long) i3) & 2147483647L;
        long j4 = z2 ? (j2 << 32) | Long.MIN_VALUE : (j2 << 32) & Long.MAX_VALUE;
        if (z3) {
            j3 |= 2147483648L;
        }
        return j3 | j4;
    }

    public static final boolean G(l46 l46Var) {
        Context context = (Context) l46Var.k(uq.b);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        boolean zG = l46Var.g(context) | l46Var.h(zBooleanValue);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = Boolean.valueOf(!zBooleanValue && Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f);
            l46Var.p0(objR);
        }
        return ((Boolean) objR).booleanValue();
    }

    public static final boolean H(long j2) {
        return (j2 & Long.MIN_VALUE) != 0;
    }

    public static final boolean I(long j2) {
        return (j2 & 2147483648L) != 0;
    }

    public static final int J(long j2) {
        return (int) ((j2 & 9223372032559808512L) >>> 32);
    }

    public static void K(Context context, AppWidgetManager appWidgetManager, int i2) {
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i2);
        appWidgetOptions.getClass();
        if (appWidgetOptions.getInt("appWidgetMinWidth", 0) > appWidgetOptions.getInt("appWidgetMinHeight", 0)) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_daily_fortune_wide);
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("source", "widget");
            remoteViews.setOnClickPendingIntent(R.id.widget_root, PendingIntent.getActivity(context, 0, intent, 201326592));
            LocalDate localDateNow = LocalDate.now();
            remoteViews.setTextViewText(R.id.widget_wide_date_day, String.valueOf(localDateNow.getDayOfMonth()));
            remoteViews.setTextViewText(R.id.widget_wide_date_month, localDateNow.format(DateTimeFormatter.ofPattern("MMM", Locale.getDefault())));
            q3c.j(context, remoteViews, true);
            appWidgetManager.updateAppWidget(i2, remoteViews);
            return;
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_daily_fortune);
        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
        intent2.putExtra("source", "widget");
        remoteViews2.setOnClickPendingIntent(R.id.widget_root, PendingIntent.getActivity(context, 0, intent2, 201326592));
        LocalDate localDateNow2 = LocalDate.now();
        String strValueOf = String.valueOf(localDateNow2.getDayOfMonth());
        String str = localDateNow2.format(DateTimeFormatter.ofPattern("MMM", Locale.getDefault()));
        remoteViews2.setTextViewText(R.id.widget_date_day, strValueOf);
        remoteViews2.setTextViewText(R.id.widget_date_month, str);
        String string = context.getString(R.string.widget_daily_fortune_title);
        string.getClass();
        remoteViews2.setTextViewText(R.id.widget_square_subtitle, string + "·" + localDateNow2.format(DateTimeFormatter.ofPattern(context.getString(R.string.widget_date_month_day_pattern), Locale.getDefault())));
        q3c.j(context, remoteViews2, false);
        appWidgetManager.updateAppWidget(i2, remoteViews2);
    }

    public static final void a(j09 j09Var, String str, String str2, int i2, kt8 kt8Var, dvd dvdVar, boolean z2, boolean z3, String str3, x16 x16Var, a26 a26Var, l46 l46Var, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        String str4;
        Object next;
        y6c y6cVar;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1636550505);
        int i6 = i3 | 6;
        if ((i3 & 48) == 0) {
            i6 |= l46Var2.g(str) ? 32 : 16;
        }
        int i7 = i3 & 384;
        int i8 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i7 == 0) {
            i6 |= l46Var2.g(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 = i2;
            i6 |= l46Var2.e(i4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            i4 = i2;
        }
        if ((i3 & 24576) == 0) {
            i6 |= (32768 & i3) == 0 ? l46Var2.g(kt8Var) : l46Var2.i(kt8Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i6 |= (i3 & 262144) == 0 ? l46Var2.g(dvdVar) : l46Var2.i(dvdVar) ? 131072 : 65536;
        }
        int i9 = i6 | 14155776;
        if ((100663296 & i3) == 0) {
            i9 |= l46Var2.h(z2) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i9 |= l46Var2.h(z3) ? 536870912 : 268435456;
        }
        int i10 = (l46Var2.g(str3) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16);
        if (l46Var2.i(a26Var)) {
            i8 = 256;
        }
        int i11 = i10 | i8;
        if (l46Var2.W(i9 & 1, ((306783379 & i9) == 306783378 && (i11 & 147) == 146) ? false : true)) {
            boolean zG = l46Var2.g(kt8Var != null ? kt8Var.b : null);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                pzd pzdVar = ale.a;
                if (kt8Var == null || (str4 = kt8Var.b) == null) {
                    i5 = i9;
                } else {
                    pzdVar.getClass();
                    String lowerCase = str4.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    Iterator it = ale.d.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            i5 = i9;
                            next = null;
                            break;
                        }
                        next = it.next();
                        Context context = cn1.P0;
                        context.getClass();
                        Resources resources = context.getResources();
                        i5 = i9;
                        String[] stringArray = resources.getStringArray(((ale) next).h());
                        stringArray.getClass();
                        int length = stringArray.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = i12;
                            String str5 = stringArray[i13];
                            str5.getClass();
                            int i14 = length;
                            String lowerCase2 = str5.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            if (v4e.F(lowerCase, lowerCase2, false)) {
                                break loop0;
                            }
                            i12 = i13 + 1;
                            length = i14;
                        }
                        i9 = i5;
                    }
                    ale aleVar = (ale) next;
                    if (aleVar != null) {
                        objR = aleVar;
                    }
                    l46Var2.p0(objR);
                }
                pzdVar.getClass();
                objR = pzd.g(i4);
                l46Var2.p0(objR);
            } else {
                i5 = i9;
            }
            Object obj = objR;
            boolean zG2 = l46Var2.g(obj) | ((i5 & 458752) == 131072 || ((i5 & 262144) != 0 && l46Var2.g(dvdVar)));
            Object objR2 = l46Var2.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = zrd.b(new v6(2, dvdVar, obj));
                l46Var2.p0(objR2);
            }
            h0e h0eVar = (h0e) objR2;
            boolean z4 = (dvdVar == null || dvdVar.equals(obj)) ? false : true;
            boolean zF = k8b.f((e8b) l46Var2.k(l8b.a));
            float f2 = we6.e(l46Var2) ? 24.0f : 20.0f;
            j09 j09VarB0 = ynb.b0(we6.e(l46Var2) ? 0.0f : 20.0f, 0.0f, b.c, 2);
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(xc0.g, jx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z5 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z5) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            int i15 = 0;
            j09 j09VarD0 = mh3.d0(new jw7(1.0f, true), mh3.T(l46Var2), false, 14);
            c92 c92VarA2 = a92.a(new uc0(zF ? 0.0f : 16.0f, true, new qc0(i15)), jx0Var, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            int i16 = 0;
            jgb.C(null, false, ynb.q(f2, 0.0f, 2), af1.b0(-1832140708, new w7(4, str, str2), l46Var2), l46Var2, 3072, 3);
            if (z4) {
                l46Var2.f0(66555301);
                l46Var2.r(false);
            } else {
                l46Var2.f0(65711543);
                jgb.C(null, false, ynb.q(f2, 0.0f, 2), af1.b0(-1255215007, new xk(kt8Var, i16), l46Var2), l46Var2, 3072, 3);
                l46Var2.r(false);
            }
            jgb.C(null, false, ynb.q(f2, 0.0f, 2), af1.b0(2097405445, new w43(a26Var, obj, z4, h0eVar, zF), l46Var2), l46Var2, 3072, 3);
            l46Var2.r(true);
            g09 g09Var = g09.a;
            if (z2) {
                l46Var2.f0(517071119);
                l46Var2.r(false);
            } else {
                l46Var2.f0(516237932);
                if (z3) {
                    l46Var2.f0(516251448);
                    hfc.a(i11 & 14, l46Var2, ynb.d0(0.0f, 16.0f, 0.0f, 20.0f, 5, ynb.b0(f2, 0.0f, b.c(g09Var, 1.0f), 2)), str3);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(516521954);
                    j09 j09VarB = b.b(0.0f, 56.0f, ynb.d0(0.0f, 16.0f, 0.0f, 20.0f, 5, ynb.b0(f2, 0.0f, b.c(g09Var, 1.0f), 2)), 1);
                    if (zF) {
                        l46Var2.f0(1679238233);
                        y6cVar = eze.a(l46Var2).a.j;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(1679238622);
                        l46Var2.r(false);
                        y6cVar = a7c.a;
                    }
                    dd ddVar = dd.E0;
                    bx9 bx9Var = v51.a;
                    c8b.j(j09VarB, null, false, ddVar, 0.0f, y6cVar, v51.a(eze.a(l46Var2).b.z(l46Var2), eze.a(l46Var2).b.A(l46Var2), 0L, 0L, l46Var, 12), null, false, x16Var, l46Var, ((i11 << 24) & 1879048192) | 3072, 406);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                l46Var2.r(false);
            }
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yk(j09Var2, str, str2, i2, kt8Var, dvdVar, z2, z3, str3, x16Var, a26Var, i3);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void b(defpackage.tr2 r29, defpackage.kzd r30, int r31, defpackage.kt8 r32, defpackage.l46 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok8.b(tr2, kzd, int, kt8, l46, int):void");
    }

    public static final void c(int i2, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(1013990225);
        if (l46Var.W(i2 & 1, i2 != 0)) {
            boolean zS = g21.S(l46Var);
            l46Var2 = l46Var;
            f(zS ? R.raw.img_classic_hero : R.raw.img_classic_hero_dark, zS ? R.drawable.img_classic_hero_poster : R.drawable.img_classic_hero_dark_poster, G(l46Var), b21.u(bzd.x(b.c, new nd8(10)), new nd8(9)), l46Var2, 0);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i2, 28);
        }
    }

    public static final void d(a56 a56Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-2136986524);
        int i3 = i2 | (l46Var.e(a56Var == null ? -1 : a56Var.ordinal()) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            rs0.f(null, false, af1.b0(910144647, new n50(x16Var2, (Object) a56Var, x16Var, x16Var3, (m26) a26Var, 6), l46Var), l46Var, 384, 3);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm((Object) a56Var, (Object) a26Var, (m26) x16Var, (m26) x16Var2, (m26) x16Var3, i2, 12);
        }
    }

    public static final void e(int i2, x16 x16Var, l46 l46Var, j09 j09Var, boolean z2) {
        int i3;
        x16 x16Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-177954651);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            x16Var2 = x16Var;
            i3 |= l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            x16Var2 = x16Var;
        }
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            WeakHashMap weakHashMap = m8g.w;
            float fD = m93.q(q7c.k(l46Var2).f, l46Var2).d() + 64.0f + 32.0f;
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i4)), jx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(12.0f, fD, 12.0f, 0.0f, 8, b.c(g09Var, 1.0f));
            c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(i4)), jx0Var, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strQ = afc.q(R.string.home_main_action_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarO = pue.o(l46Var2);
            ar5 ar5Var = ar5.d;
            yp5 yp5Var = ((y8b) l46Var2.k(x8b.a)).a;
            pr4 pr4Var = l8b.a;
            int i5 = i3;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, ar5Var, yp5Var, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarO, l46Var, 1572864, 0, 129850);
            nte.b(afc.q(R.string.home_main_action_subtitle, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
            String strQ2 = afc.q(R.string.main_start_reading, l46Var2);
            if (z2) {
                l46Var2.f0(-373972457);
                q8b.a(strQ2, x16Var2, b.p(g09Var, 168.0f), r8b.Medium, false, l46Var2, ((i5 >> 3) & 112) | 3456, 16);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-373780815);
                nk8.i(strQ2, x16Var, b.q(168.0f, 0.0f, g09Var, 2), 0.0f, 44.0f, 0.0f, false, null, null, null, false, l46Var, ((i5 >> 3) & 112) | 196992, 0, 4056);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cv(j09Var, z2, x16Var, i2, 3);
        }
    }

    public static final void f(int i2, int i3, boolean z2, j09 j09Var, l46 l46Var, int i4) {
        e89 e89Var;
        boolean z3;
        g09 g09Var;
        l46Var.h0(653627547);
        int i5 = i4 | (l46Var.e(i2) ? 4 : 2) | (l46Var.e(i3) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
            Context context = (Context) l46Var.k(uq.b);
            boolean zG = l46Var.g(context) | ((i5 & 14) == 4);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = Uri.parse("android.resource://" + context.getPackageName() + "/" + i2);
                l46Var.p0(objR);
            }
            Uri uri = (Uri) objR;
            boolean zG2 = l46Var.g(uri);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            boolean zG3 = l46Var.g(uri);
            Object objR3 = l46Var.R();
            if (zG3 || objR3 == obj) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR3);
            }
            e89 e89Var3 = (e89) objR3;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            int i6 = 3;
            g09 g09Var2 = g09.a;
            d31 d31Var = d31.a;
            if (!z2 || ((Boolean) e89Var3.getValue()).booleanValue()) {
                e89Var = e89Var2;
                z3 = false;
                g09Var = g09Var2;
                l46Var.f0(-754648031);
                l46Var.r(false);
            } else {
                l46Var.f0(-754903657);
                uri.getClass();
                j09 j09VarB = d31Var.b(g09Var2);
                boolean zG4 = l46Var.g(e89Var2);
                Object objR4 = l46Var.R();
                if (zG4 || objR4 == obj) {
                    objR4 = new x08(e89Var2, i6);
                    l46Var.p0(objR4);
                }
                x16 x16Var = (x16) objR4;
                boolean zG5 = l46Var.g(e89Var3);
                Object objR5 = l46Var.R();
                if (zG5 || objR5 == obj) {
                    objR5 = new x08(e89Var3, 4);
                    l46Var.p0(objR5);
                }
                x16 x16Var2 = (x16) objR5;
                e89Var = e89Var2;
                g09Var = g09Var2;
                z3 = false;
                r8c.b(uri, j09VarB, true, 0, true, x16Var, x16Var2, l46Var, 24960, 8);
                l46Var.r(false);
            }
            if (z2 && ((Boolean) e89Var.getValue()).booleanValue() && !((Boolean) e89Var3.getValue()).booleanValue()) {
                l46Var.f0(-754393087);
                l46Var.r(z3);
            } else {
                l46Var.f0(-754583365);
                feg.j(od4.A(i3, (i5 >> 3) & 14, l46Var), null, d31Var.b(g09Var), null, an2.a, 0.0f, null, l46Var, 24632, 104);
                l46Var.r(z3);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xx1(i2, i3, z2, j09Var, i4);
        }
    }

    public static final void g(dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(-709502251);
        int i3 = 7;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = wcc.a;
            ucc uccVar = (ucc) l46Var.k(pr4Var);
            rcc rccVarL = scc.l(l46Var);
            Object[] objArr = {uccVar};
            vea veaVar = new vea(i3, new sz5(25), new so5(23, uccVar, rccVarL));
            boolean zI = l46Var.i(uccVar) | l46Var.i(rccVarL);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new jf6(17, uccVar, rccVarL);
                l46Var.p0(objR);
            }
            o18 o18Var = (o18) vfh.J(objArr, veaVar, (x16) objR, l46Var, 0);
            mh3.a(pr4Var.a(o18Var), af1.b0(-412824043, new rk6(9, dd2Var, o18Var), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i2, i3);
        }
    }

    public static final void h(int i2, x16 x16Var, l46 l46Var, j09 j09Var) {
        x16 x16Var2;
        x16Var.getClass();
        l46Var.h0(-1967216475);
        int i3 = (l46Var.i(x16Var) ? 32 : 16) | i2;
        int i4 = 3;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            x16Var2 = x16Var;
            j09 j09VarF = oa7.F(androidx.compose.foundation.b.c(dj6.w(j09Var, 1.228125f), false, null, null, x16Var2, 15));
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarF);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            c(0, l46Var);
            e(((i3 << 3) & 896) | 48, x16Var2, l46Var, d31.a.b(g09.a), true);
            l46Var.r(true);
        } else {
            x16Var2 = x16Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var2, i2, i4);
        }
    }

    public static final void i(int i2, x16 x16Var, l46 l46Var, j09 j09Var) {
        x16 x16Var2;
        l46 l46Var2;
        x16Var.getClass();
        l46Var.h0(-1189249756);
        int i3 = i2 | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            boolean zG = G(l46Var);
            e89 e89VarJ = z8c.j(zG, l46Var, 0, 6);
            x16Var2 = x16Var;
            j09 j09VarF = oa7.F(androidx.compose.foundation.b.c(dj6.w(j09Var, 1.228125f), false, null, null, x16Var, 15));
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarF);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            FillElement fillElement = b.c;
            boolean zG2 = l46Var.g(e89VarJ);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG2 || objR == i8cVar) {
                objR = new wh1(10, e89VarJ);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            f(R.raw.neo_main_entrance_bg, R.drawable.neo_main_entrance_bg_poster, zG, bzd.x(fillElement, (a26) objR), l46Var2, 0);
            j09 j09VarB = d31.a.b(g09.a);
            boolean zG3 = l46Var2.g(e89VarJ);
            Object objR2 = l46Var2.R();
            if (zG3 || objR2 == i8cVar) {
                objR2 = new wh1(11, e89VarJ);
                l46Var2.p0(objR2);
            }
            e(((i3 << 3) & 896) | 48, x16Var2, l46Var2, tm7.L(j09VarB, (a26) objR2), false);
            l46Var2.r(true);
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var2, i2, 2);
        }
    }

    public static final Integer j(int i2) {
        return new Integer(i2);
    }

    public static void k(String str, boolean z2) {
        if (z2) {
            return;
        }
        qc0.j(str);
    }

    public static void l(boolean z2) {
        if (z2) {
            return;
        }
        cva.s();
    }

    public static void m(String str, int i2, int i3, int i4) {
        if (i2 < i3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i3 + ", " + i4 + "] (too low)");
        }
        if (i2 <= i4) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i3 + ", " + i4 + "] (too high)");
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r82.g(str);
    }

    public static void o(String str, boolean z2) {
        if (z2) {
            return;
        }
        qc0.p(str);
    }

    public static final Object p(wj5 wj5Var, l26 l26Var, xn2 xn2Var) {
        int i2 = am5.a;
        Object objB = ym8.q(am5.a(wj5Var, new zl5(l26Var, null)), 0).b(rg9.a, xn2Var);
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (objB != bw2Var) {
            objB = wefVar;
        }
        return objB == bw2Var ? objB : wefVar;
    }

    public static final float q(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final Object r(xj5 xj5Var, wj5 wj5Var, gbe gbeVar) throws Throwable {
        if (xj5Var instanceof twe) {
            throw ((twe) xj5Var).a;
        }
        Object objB = wj5Var.b(xj5Var, gbeVar);
        return objB == bw2.a ? objB : wef.a;
    }

    public static void s(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            bp.p(canvas, z2);
            return;
        }
        if (!C) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    A = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    B = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    A = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    B = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = A;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = B;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            C = true;
        }
        if (z2) {
            try {
                Method method4 = A;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = B) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final j09 u(j09 j09Var, fo5 fo5Var) {
        return j09Var.D(new go5(fo5Var));
    }

    public static final gx6 v() {
        gx6 gx6Var = D;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(19.0f, 6.41f);
        s71Var.n(17.59f, 5.0f);
        s71Var.n(12.0f, 10.59f);
        s71Var.n(6.41f, 5.0f);
        s71Var.n(5.0f, 6.41f);
        s71Var.n(10.59f, 12.0f);
        s71Var.n(5.0f, 17.59f);
        s71Var.n(6.41f, 19.0f);
        s71Var.n(12.0f, 13.41f);
        s71Var.n(17.59f, 19.0f);
        s71Var.n(19.0f, 17.59f);
        s71Var.n(13.41f, 12.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        D = gx6VarB;
        return gx6VarB;
    }

    public static ScheduledExecutorService w() {
        if (a != null) {
            return a;
        }
        synchronized (ok8.class) {
            try {
                if (a == null) {
                    a = new ah6(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final int x(b19 b19Var) {
        b19Var.getClass();
        return b19Var.ordinal() + 1;
    }

    public static final gx6 y() {
        gx6 gx6Var = H;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(6.0f, 19.0f);
        s71Var.m(4.0f);
        s71Var.n(10.0f, 5.0f);
        s71Var.n(6.0f, 5.0f);
        s71Var.t(14.0f);
        s71Var.h();
        s71Var.p(14.0f, 5.0f);
        s71Var.t(14.0f);
        s71Var.m(4.0f);
        s71Var.n(18.0f, 5.0f);
        s71Var.m(-4.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        H = gx6VarB;
        return gx6VarB;
    }

    public static final boolean z(List list) {
        list.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            ot8 ot8Var = (ot8) it.next();
            if ((ot8Var instanceof et8) && ((et8) ot8Var).c) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return false;
        }
        List listR0 = s72.r0(list, i2 + 1);
        if (listR0.isEmpty()) {
            return false;
        }
        Iterator it2 = listR0.iterator();
        while (it2.hasNext()) {
            if (((ot8) it2.next()) instanceof nt8) {
                return true;
            }
        }
        return false;
    }
}

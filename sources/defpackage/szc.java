package defpackage;

import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class szc implements u81, ks7, is7, js7, rsd, f1b, f8e {
    public static szc f;
    public static final String[] g = {"id", "key", "metadata"};
    public static final o4e v = new o4e("_root_");
    public static int w;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public szc(ih9 ih9Var) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        this.a = 27;
        this.e = new Bundle();
        this.d = ih9Var;
        Context context = ih9Var.a;
        ArrayList arrayList3 = ih9Var.x;
        ArrayList arrayList4 = ih9Var.c;
        ArrayList arrayList5 = ih9Var.d;
        this.b = context;
        Notification.Builder builder = new Notification.Builder(context, ih9Var.t);
        this.c = builder;
        Notification notification = ih9Var.v;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(ih9Var.e).setContentText(ih9Var.f).setContentInfo(null).setContentIntent(ih9Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0).setNumber(ih9Var.i).setProgress(0, 0, false);
        IconCompat iconCompat = ih9Var.h;
        builder.setLargeIcon(iconCompat == null ? null : ynb.n0(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(ih9Var.j);
        for (eh9 eh9Var : ih9Var.b) {
            IconCompat iconCompatA = eh9Var.b;
            if (iconCompatA == null && (i2 = eh9Var.d) != 0) {
                iconCompatA = IconCompat.a(i2);
                eh9Var.b = iconCompatA;
            }
            Bundle bundle = eh9Var.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatA != null ? ynb.n0(iconCompatA, context2) : context2, eh9Var.e, eh9Var.f);
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", true);
            builder2.setAllowGeneratedReplies(true);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                s.e0(builder2);
            }
            if (i3 >= 29) {
                bp.M(builder2);
            }
            if (i3 >= 31) {
                xq.x(builder2);
            }
            if (i3 >= 37) {
                gq.b(builder2);
                gq.d(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", eh9Var.c);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle3 = ih9Var.q;
        if (bundle3 != null) {
            ((Bundle) this.e).putAll(bundle3);
        }
        ((Notification.Builder) this.c).setShowWhen(ih9Var.k);
        ((Notification.Builder) this.c).setLocalOnly(ih9Var.m);
        ((Notification.Builder) this.c).setGroup(null);
        ((Notification.Builder) this.c).setSortKey(null);
        ((Notification.Builder) this.c).setGroupSummary(false);
        ((Notification.Builder) this.c).setCategory(ih9Var.p);
        ((Notification.Builder) this.c).setColor(ih9Var.r);
        ((Notification.Builder) this.c).setVisibility(ih9Var.s);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw kv2.g(it);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    od0 od0Var = new od0(arrayList3.size() + arrayList2.size());
                    od0Var.addAll(arrayList2);
                    od0Var.addAll(arrayList3);
                    arrayList3 = new ArrayList(od0Var);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) this.c).addPerson((String) it2.next());
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle4 = ih9Var.q;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                ih9Var.q = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i4 = 0;
            while (i4 < arrayList5.size()) {
                String string = Integer.toString(i4);
                eh9 eh9Var2 = (eh9) arrayList5.get(i4);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatA2 = eh9Var2.b;
                if (iconCompatA2 == null && (i = eh9Var2.d) != 0) {
                    iconCompatA2 = IconCompat.a(i);
                    eh9Var2.b = iconCompatA2;
                }
                Bundle bundle9 = eh9Var2.a;
                ArrayList arrayList6 = arrayList4;
                bundle8.putInt("icon", iconCompatA2 != null ? iconCompatA2.b() : 0);
                bundle8.putCharSequence("title", eh9Var2.e);
                bundle8.putParcelable("actionIntent", eh9Var2.f);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean("android.support.allowGeneratedReplies", true);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", eh9Var2.c);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i4++;
                arrayList4 = arrayList6;
            }
            arrayList = arrayList4;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = ih9Var.q;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                ih9Var.q = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList4;
        }
        ((Notification.Builder) this.c).setExtras(ih9Var.q);
        ((Notification.Builder) this.c).setRemoteInputHistory(null);
        ((Notification.Builder) this.c).setBadgeIconType(0);
        ((Notification.Builder) this.c).setSettingsText(null);
        ((Notification.Builder) this.c).setShortcutId(null);
        ((Notification.Builder) this.c).setTimeoutAfter(0L);
        ((Notification.Builder) this.c).setGroupAlertBehavior(0);
        if (ih9Var.o) {
            ((Notification.Builder) this.c).setColorized(ih9Var.n);
        }
        if (!TextUtils.isEmpty(ih9Var.t)) {
            ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw kv2.g(it3);
            }
        }
        if (i5 >= 29) {
            bp.I((Notification.Builder) this.c, ih9Var.u);
            bp.L((Notification.Builder) this.c);
        }
        if (i5 >= 36) {
            r6.g((Notification.Builder) this.c);
        }
        if (ih9Var.w) {
            ((ih9) this.d).getClass();
            ((Notification.Builder) this.c).setVibrate(null);
            ((Notification.Builder) this.c).setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            ((Notification.Builder) this.c).setDefaults(i6);
            ((ih9) this.d).getClass();
            if (TextUtils.isEmpty(null)) {
                ((Notification.Builder) this.c).setGroup("silent");
            }
            ((Notification.Builder) this.c).setGroupAlertBehavior(1);
        }
    }

    public static synchronized szc L() {
        szc szcVar;
        szcVar = f;
        if (szcVar == null) {
            szcVar = new szc(0);
            f = szcVar;
        }
        return szcVar;
    }

    public static void x(szc szcVar, xb9 xb9Var) {
        szcVar.getClass();
        xb9Var.getClass();
        if (((LinkedHashSet) szcVar.d).add(xb9Var)) {
            ac9 ac9Var = (ac9) szcVar.c;
            if (xb9Var.c != null) {
                cva.u(xb9Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            ac9Var.e.addFirst(xb9Var);
            xb9Var.c = szcVar;
            ac9Var.b();
        }
    }

    public void A(SQLiteDatabase sQLiteDatabase, t81 t81Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        hbc.U0(t81Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(t81Var.a));
        contentValues.put("key", t81Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public sx0 B() {
        mtg mtgVarM;
        ArrayList arrayList = (ArrayList) this.d;
        rx0 rx0Var = null;
        if (arrayList == null || arrayList.isEmpty()) {
            qc0.j("Details of the products must be provided.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) this.d;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((qx0) it.next()) == null) {
                    qc0.j("ProductDetailsParams cannot be null.");
                    return null;
                }
            }
        }
        sx0 sx0Var = new sx0();
        sx0Var.a = !((qx0) ((ArrayList) this.d).get(0)).a.b.optString("packageName").isEmpty();
        sx0Var.b = (String) this.b;
        sx0Var.c = (String) this.c;
        v71 v71Var = (v71) this.e;
        boolean z = (TextUtils.isEmpty((String) v71Var.c) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z && !zIsEmpty) {
            qc0.j("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        } else if (v71Var.a || z || !zIsEmpty) {
            rx0Var = new rx0();
            rx0Var.a = (String) v71Var.c;
            rx0Var.b = v71Var.b;
        } else {
            qc0.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        sx0Var.d = rx0Var;
        sx0Var.f = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.d;
        if (arrayList3 != null) {
            mtgVarM = mtg.m(arrayList3);
        } else {
            vsg vsgVar = mtg.b;
            mtgVarM = aug.e;
        }
        sx0Var.e = mtgVarM;
        return sx0Var;
    }

    public void C() {
        vx6 vx6Var;
        p8c.m();
        hbc hbcVar = (hbc) this.d;
        p8c.m();
        ko0 ko0Var = (ko0) hbcVar.e;
        Objects.requireNonNull(ko0Var);
        sbc sbcVar = (sbc) hbcVar.b;
        Objects.requireNonNull(sbcVar);
        sbc sbcVar2 = (sbc) hbcVar.c;
        vx6 vx6Var2 = ko0Var.c;
        Objects.requireNonNull(vx6Var2);
        vx6Var2.a();
        vx6 vx6Var3 = ko0Var.c;
        Objects.requireNonNull(vx6Var3);
        bm8.J(vx6Var3.e).b(new nm1(sbcVar, 0), ok8.w());
        vx6 vx6Var4 = ko0Var.e;
        int i = 1;
        if (vx6Var4 != null) {
            vx6Var4.a();
            bm8.J(ko0Var.e.e).b(new nm1(null, i), ok8.w());
        }
        if (ko0Var.h.size() <= 1 || (vx6Var = ko0Var.d) == null) {
            return;
        }
        vx6Var.a();
        bm8.J(ko0Var.d.e).b(new nm1(sbcVar2, 2), ok8.w());
    }

    public void D(zb9 zb9Var, vb9 vb9Var) {
        ac9 ac9Var = (ac9) this.c;
        if (ac9Var.g != 0) {
            return;
        }
        xb9 xb9VarC = ac9Var.c(-1);
        ac9Var.f = xb9VarC;
        ac9Var.g = -1;
        ac9Var.h = zb9Var;
        if (vb9Var != null) {
            if (xb9VarC != null) {
                xb9VarC.d(vb9Var);
            }
            ac9Var.a.n(null, new cc9(vb9Var));
        }
    }

    public void E(hia hiaVar, boolean z) {
        via viaVar = (via) this.e;
        List list = hiaVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((oia) list.get(i)).c()) {
                U(hiaVar);
                return;
            }
        }
        yf9 yf9Var = (yf9) this.b;
        if (yf9Var == null) {
            qc0.p("layoutCoordinates not set");
            return;
        }
        m93.P(hiaVar, yf9Var.N(0L), new kz8(23, this, viaVar), false);
        if (((uia) this.c) == uia.b) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((oia) list.get(i2)).a();
                }
            }
            egh eghVar = hiaVar.b;
            if (eghVar != null) {
                eghVar.b = !viaVar.c;
            }
        }
    }

    public kx5 F(String str) {
        fy5 fy5Var = (fy5) ((HashMap) this.c).get(str);
        if (fy5Var != null) {
            return fy5Var.c;
        }
        return null;
    }

    public kx5 G(String str) {
        for (fy5 fy5Var : ((HashMap) this.c).values()) {
            if (fy5Var != null) {
                kx5 kx5VarG = fy5Var.c;
                if (!str.equals(kx5VarG.e)) {
                    kx5VarG = kx5VarG.K0.c.G(str);
                }
                if (kx5VarG != null) {
                    return kx5VarG;
                }
            }
        }
        return null;
    }

    public ArrayList H() {
        ArrayList arrayList = new ArrayList();
        for (fy5 fy5Var : ((HashMap) this.c).values()) {
            if (fy5Var != null) {
                arrayList.add(fy5Var);
            }
        }
        return arrayList;
    }

    public ArrayList I() {
        ArrayList arrayList = new ArrayList();
        for (fy5 fy5Var : ((HashMap) this.c).values()) {
            if (fy5Var != null) {
                arrayList.add(fy5Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public u09 J(j22 j22Var, List list) {
        j22Var.getClass();
        return (u09) ((be8) this.e).d(new ug9(j22Var, list));
    }

    public List K() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public Enum M(wn7 wn7Var, Object obj) {
        wn7Var.getClass();
        return (Enum) ((mx4) ((lx4) this.d)).get(((j87) ((ni5) this.c).e(((Number) ((hn7) this.b).get(obj)).intValue())).a());
    }

    public boolean N(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean O(Context context) {
        Boolean boolValueOf = (Boolean) this.c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.c = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void P(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.b;
        str.getClass();
        ptf.b(sQLiteDatabase, 1, str);
        String str2 = (String) this.e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void Q(fy5 fy5Var) {
        kx5 kx5Var = fy5Var.c;
        String str = kx5Var.e;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(kx5Var.e, fy5Var);
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + kx5Var);
        }
    }

    public void R(fy5 fy5Var) {
        HashMap map = (HashMap) this.c;
        kx5 kx5Var = fy5Var.c;
        if (kx5Var.R0) {
            ((by5) this.e).i(kx5Var);
        }
        if (map.get(kx5Var.e) == fy5Var && ((fy5) map.put(kx5Var.e, null)) != null && zx5.I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + kx5Var);
        }
    }

    public Bundle S(String str, Bundle bundle) {
        HashMap map = (HashMap) this.d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void T(hq7 hq7Var, wn7 wn7Var, Enum r5) {
        wn7Var.getClass();
        hn7 hn7Var = (hn7) this.b;
        ji5 ji5Var = (ji5) ((ArrayList) this.e).get(r5.ordinal());
        int iIntValue = ((Number) hn7Var.get(hq7Var)).intValue();
        int i = (1 << ji5Var.b) - 1;
        int i2 = ji5Var.a;
        hn7Var.v(hq7Var, Integer.valueOf((iIntValue & (~(i << i2))) + (ji5Var.c << i2)));
    }

    public void U(hia hiaVar) {
        if (((uia) this.c) == uia.b) {
            yf9 yf9Var = (yf9) this.b;
            if (yf9Var == null) {
                qc0.p("layoutCoordinates not set");
                return;
            } else {
                m93.P(hiaVar, yf9Var.N(0L), new p59(15, (via) this.e), true);
            }
        }
        this.c = uia.c;
    }

    public hc2 V(int i, j22 j22Var, rmb rmbVar) {
        fr8 fr8Var = new fr8(((fr8) this.b).a + '@' + i);
        a90 a90Var = (a90) this.e;
        HashMap map = (HashMap) a90Var.c;
        List arrayList = (List) map.get(fr8Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(fr8Var, arrayList);
        }
        return ((hbc) a90Var.b).i0(j22Var, rmbVar, arrayList);
    }

    @Override // defpackage.js7
    public is7 a(j22 j22Var) {
        ArrayList arrayList = new ArrayList();
        return new szc(((hbc) this.c).h0(j22Var, ntd.T, arrayList), this, arrayList);
    }

    @Override // defpackage.u81
    public void b(HashMap map) throws td3 {
        try {
            SQLiteDatabase writableDatabase = ((myd) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                P(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    A(writableDatabase, (t81) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.d).clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new td3(e);
        }
    }

    @Override // defpackage.u81
    public void c(t81 t81Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.d;
        int i = t81Var.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.is7
    public void d() {
        switch (this.a) {
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((a90) this.d).c).put((fr8) this.b, arrayList);
                }
                break;
            case 9:
                ((hc2) this.c).d();
                ((ArrayList) ((szc) this.d).b).add(new f10((u00) s72.X0((ArrayList) this.e)));
                break;
            default:
                hc2 hc2Var = (hc2) this.e;
                t99 t99Var = (t99) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                xrf xrfVarY = cn1.y(t99Var, (u09) hc2Var.e);
                if (xrfVarY != null) {
                    HashMap map = (HashMap) hc2Var.b;
                    List listZ = z7f.z(arrayList2);
                    tt7 type = xrfVarY.getType();
                    type.getClass();
                    map.put(t99Var, new z8f(listZ, type));
                    break;
                } else if (((hbc) hc2Var.d).d0((j22) hc2Var.f) && pa7.t(t99Var.b(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof f10) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) hc2Var.g;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((u00) ((f10) it.next()).a);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rsd
    public mtd e() {
        return (at3) this.d;
    }

    @Override // defpackage.js7
    public void f(Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        hbc hbcVar = (hbc) this.c;
        t99 t99Var = (t99) this.d;
        Object objR = af8.r((x09) hbcVar.c, obj);
        if (objR == null) {
            objR = new ty4("Unsupported annotation argument: " + t99Var);
        }
        arrayList.add(objR);
    }

    @Override // defpackage.h1b
    public Object get() {
        return new qg5((ff5) ((ze) this.b).a, (m1d) ((f1b) this.c).get(), (pv2) ((f1b) this.d).get(), (k1d) ((f1b) this.e).get());
    }

    @Override // defpackage.is7
    public void h(t99 t99Var, Object obj) {
        ((hc2) this.b).h(t99Var, obj);
    }

    @Override // defpackage.js7
    public void i(j22 j22Var, t99 t99Var) {
        ((ArrayList) this.b).add(new rx4(j22Var, t99Var));
    }

    @Override // defpackage.u81
    public void j(t81 t81Var) {
        ((SparseArray) this.d).put(t81Var.a, t81Var);
    }

    @Override // defpackage.u81
    public boolean k() throws td3 {
        try {
            SQLiteDatabase readableDatabase = ((myd) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return ptf.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new td3(e);
        }
    }

    @Override // defpackage.u81
    public void l(HashMap map) throws td3 {
        SparseArray sparseArray = (SparseArray) this.d;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((myd) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    t81 t81Var = (t81) sparseArray.valueAt(i);
                    if (t81Var == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        A(writableDatabase, t81Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new td3(e);
        }
    }

    @Override // defpackage.is7
    public void m(t99 t99Var, m22 m22Var) {
        ((hc2) this.b).m(t99Var, m22Var);
    }

    @Override // defpackage.is7
    public js7 n(t99 t99Var) {
        return ((hc2) this.b).n(t99Var);
    }

    @Override // defpackage.u81
    public void o(long j) {
        String hexString = Long.toHexString(j);
        this.b = hexString;
        this.e = ub3.i("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.is7
    public void p(t99 t99Var, j22 j22Var, t99 t99Var2) {
        ((hc2) this.b).p(t99Var, j22Var, t99Var2);
    }

    @Override // defpackage.u81
    public void q(HashMap map, SparseArray sparseArray) throws td3 {
        myd mydVar = (myd) this.c;
        pa7.J(((SparseArray) this.d).size() == 0);
        try {
            SQLiteDatabase readableDatabase = mydVar.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (ptf.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = mydVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    P(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = mydVar.getReadableDatabase();
            String str2 = (String) this.e;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, g, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new t81(i, string, hbc.x0(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new td3(e);
        }
    }

    @Override // defpackage.u81
    public void r() throws td3 {
        myd mydVar = (myd) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = mydVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = ptf.a;
                try {
                    String str2 = pqf.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(strConcat));
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new td3(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new td3(e2);
        }
    }

    @Override // defpackage.rsd
    public wkd r0() {
        return (zs3) this.e;
    }

    @Override // defpackage.f8e
    public void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        t03 t03Var;
        int i3;
        int i4;
        int iZ;
        int i5;
        int i6;
        int iC;
        mca mcaVar = (mca) this.d;
        int[] iArr = mcaVar.b;
        d0a d0aVar = mcaVar.a;
        d0a d0aVar2 = (d0a) this.c;
        d0a d0aVar3 = (d0a) this.b;
        d0aVar3.K(bArr, i + i2);
        d0aVar3.M(i);
        Inflater inflater = (Inflater) this.e;
        if (inflater == null) {
            inflater = new Inflater();
            this.e = inflater;
        }
        String str = pqf.a;
        if (d0aVar3.a() > 0 && d0aVar3.j() == 120 && pqf.C(d0aVar3, d0aVar2, inflater)) {
            d0aVar3.K(d0aVar2.a, d0aVar2.c);
        }
        int i7 = 0;
        mcaVar.d = 0;
        mcaVar.e = 0;
        mcaVar.f = 0;
        mcaVar.g = 0;
        mcaVar.h = 0;
        mcaVar.i = 0;
        d0aVar.J(0);
        mcaVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (d0aVar3.a() >= 3) {
            int i8 = d0aVar3.c;
            int iZ2 = d0aVar3.z();
            int iG = d0aVar3.G();
            int i9 = d0aVar3.b + iG;
            if (i9 > i8) {
                d0aVar3.M(i8);
                i3 = i7;
                t03Var = null;
            } else {
                char c = 128;
                if (iZ2 != 128) {
                    switch (iZ2) {
                        case 20:
                            if (iG % 5 == 2) {
                                d0aVar3.N(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iG / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iZ3 = d0aVar3.z();
                                    char c2 = c;
                                    double dZ = d0aVar3.z();
                                    double dZ2 = d0aVar3.z() - 128;
                                    double dZ3 = d0aVar3.z() - 128;
                                    iArr[iZ3] = pqf.h((int) ((dZ3 * 1.772d) + dZ), 0, 255) | (d0aVar3.z() << 24) | (pqf.h((int) ((1.402d * dZ2) + dZ), 0, 255) << 16) | (pqf.h((int) ((dZ - (0.34414d * dZ3)) - (dZ2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    mcaVar = mcaVar;
                                }
                                mcaVar.c = true;
                            }
                            break;
                        case 21:
                            if (iG >= 4) {
                                d0aVar3.N(3);
                                int i12 = iG - 4;
                                if (((128 & d0aVar3.z()) != 0 ? 1 : i7) == 0) {
                                    i5 = d0aVar.b;
                                    i6 = d0aVar.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        d0aVar3.k(d0aVar.a, i5, iMin);
                                        d0aVar.M(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iC = d0aVar3.C()) >= 4) {
                                    mcaVar.h = d0aVar3.G();
                                    mcaVar.i = d0aVar3.G();
                                    d0aVar.J(iC - 4);
                                    i12 = iG - 11;
                                    i5 = d0aVar.b;
                                    i6 = d0aVar.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        d0aVar3.k(d0aVar.a, i5, iMin2);
                                        d0aVar.M(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iG >= 19) {
                                mcaVar.d = d0aVar3.G();
                                mcaVar.e = d0aVar3.G();
                                d0aVar3.N(11);
                                mcaVar.f = d0aVar3.G();
                                mcaVar.g = d0aVar3.G();
                            }
                            break;
                    }
                    t03Var = null;
                    i3 = 0;
                } else {
                    if (mcaVar.d == 0 || mcaVar.e == 0 || mcaVar.h == 0 || mcaVar.i == 0 || (i4 = d0aVar.c) == 0 || d0aVar.b != i4 || !mcaVar.c) {
                        t03Var = null;
                    } else {
                        d0aVar.M(0);
                        int i13 = mcaVar.h * mcaVar.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iZ4 = d0aVar.z();
                            if (iZ4 != 0) {
                                iZ = i14 + 1;
                                iArr2[i14] = iArr[iZ4];
                            } else {
                                int iZ5 = d0aVar.z();
                                if (iZ5 != 0) {
                                    iZ = ((iZ5 & 64) == 0 ? iZ5 & 63 : ((iZ5 & 63) << 8) | d0aVar.z()) + i14;
                                    Arrays.fill(iArr2, i14, iZ, (iZ5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0 ? iArr[0] : iArr[d0aVar.z()]);
                                }
                            }
                            i14 = iZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, mcaVar.h, mcaVar.i, Bitmap.Config.ARGB_8888);
                        float f2 = mcaVar.f;
                        float f3 = mcaVar.d;
                        float f4 = f2 / f3;
                        float f5 = mcaVar.g;
                        float f6 = mcaVar.e;
                        t03Var = new t03(null, null, null, bitmapCreateBitmap, f5 / f6, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, mcaVar.h / f3, mcaVar.i / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    mcaVar.d = 0;
                    mcaVar.e = 0;
                    mcaVar.f = 0;
                    mcaVar.g = 0;
                    mcaVar.h = 0;
                    mcaVar.i = 0;
                    d0aVar.J(0);
                    mcaVar.c = false;
                }
                d0aVar3.M(i9);
            }
            if (t03Var != null) {
                arrayList.add(t03Var);
            }
            i7 = i3;
        }
        xl2Var.accept(new w03(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.is7
    public is7 t(j22 j22Var, t99 t99Var) {
        return ((hc2) this.b).t(j22Var, t99Var);
    }

    public String toString() {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                String string = ((Socket) this.b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ks7
    public is7 u(j22 j22Var, rmb rmbVar) {
        return ((hbc) ((a90) this.d).b).i0(j22Var, rmbVar, (ArrayList) this.c);
    }

    @Override // defpackage.js7
    public void v(m22 m22Var) {
        ((ArrayList) this.b).add(new rm7(new pm7(m22Var)));
    }

    public void w(kx5 kx5Var) {
        if (((ArrayList) this.b).contains(kx5Var)) {
            yg5.r(kx5Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(kx5Var);
        }
        kx5Var.y = true;
    }

    public void y(zb9 zb9Var) {
        if (((LinkedHashSet) this.e).add(zb9Var)) {
            ((ac9) this.c).a(this, zb9Var, -1);
        }
    }

    public void z(om9 om9Var, int i) {
        if (i != 1 && i != 0) {
            qc0.o(tec.e(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.e).add(om9Var)) {
            ((ac9) this.c).a(this, om9Var, i);
        }
    }

    public /* synthetic */ szc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public szc(hn7 hn7Var, ni5 ni5Var, lx4 lx4Var, ArrayList arrayList) {
        this.a = 15;
        lx4Var.getClass();
        this.b = hn7Var;
        this.c = ni5Var;
        this.d = lx4Var;
        this.e = arrayList;
    }

    public szc(ge8 ge8Var, w09 w09Var) {
        this.a = 26;
        w09Var.getClass();
        this.b = ge8Var;
        this.c = w09Var;
        this.d = ge8Var.b(new tg9(this, 0));
        this.e = ge8Var.b(new tg9(this, 1));
    }

    public szc(Drawable.Callback callback) {
        this.a = 18;
        this.b = new w37(1);
        this.c = new HashMap();
        this.d = new HashMap();
        if (!(callback instanceof View)) {
            gf8.b("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
        } else {
            this.e = ((View) callback).getContext().getAssets();
        }
    }

    public szc(hr7 hr7Var) {
        this.a = 2;
        this.b = hr7Var;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.c = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = concurrentHashMap;
        o4e o4eVar = v;
        nfc nfcVar = new nfc(o4eVar, "_root_", null, hr7Var, 8);
        this.e = nfcVar;
        setNewSetFromMap.add(o4eVar);
        concurrentHashMap.put("_root_", nfcVar);
    }

    public szc(Socket socket) {
        this.a = 13;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new at3(this);
        this.e = new zs3(this);
    }

    public szc(via viaVar) {
        this.a = 29;
        this.e = viaVar;
        this.c = uia.a;
    }

    public szc(r45 r45Var) {
        this.a = 25;
        this.b = r45Var;
        this.c = new ac9();
        new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
    }

    public /* synthetic */ szc(int i, boolean z) {
        this.a = i;
    }

    public szc(vi1 vi1Var, if1 if1Var, mk1 mk1Var, vea veaVar) {
        this.a = 11;
        vi1Var.getClass();
        if1Var.getClass();
        mk1Var.getClass();
        veaVar.getClass();
        this.b = vi1Var;
        this.c = if1Var;
        this.d = mk1Var;
        this.e = veaVar;
    }

    public szc(Typeface typeface, bv8 bv8Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = 23;
        this.e = typeface;
        this.b = bv8Var;
        this.d = new dv8(UserMetadata.MAX_ATTRIBUTE_SIZE);
        int iB = bv8Var.b(6);
        if (iB != 0) {
            int i5 = iB + bv8Var.a;
            i = ((ByteBuffer) bv8Var.d).getInt(((ByteBuffer) bv8Var.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int iB2 = bv8Var.b(6);
        if (iB2 != 0) {
            int i6 = iB2 + bv8Var.a;
            i2 = ((ByteBuffer) bv8Var.d).getInt(((ByteBuffer) bv8Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            g9f g9fVar = new g9f(this, i7);
            av8 av8VarB = g9fVar.b();
            int iB3 = av8VarB.b(4);
            Character.toChars(iB3 != 0 ? ((ByteBuffer) av8VarB.d).getInt(iB3 + av8VarB.a) : 0, (char[]) this.c, i7 * 2);
            av8 av8VarB2 = g9fVar.b();
            int iB4 = av8VarB2.b(16);
            if (iB4 != 0) {
                int i8 = iB4 + av8VarB2.a;
                i3 = ((ByteBuffer) av8VarB2.d).getInt(((ByteBuffer) av8VarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            ok8.k("invalid metadata codepoint length", i3 > 0);
            dv8 dv8Var = (dv8) this.d;
            av8 av8VarB3 = g9fVar.b();
            int iB5 = av8VarB3.b(16);
            if (iB5 != 0) {
                int i9 = iB5 + av8VarB3.a;
                i4 = ((ByteBuffer) av8VarB3.d).getInt(((ByteBuffer) av8VarB3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            dv8Var.a(g9fVar, 0, i4 - 1);
        }
    }

    public szc(Context context) {
        this.a = 6;
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = ndb.N0;
        if (context == null) {
            this.e = bj0.f;
        }
    }

    public szc(iv6 iv6Var, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int iIntValue;
        yl2 yl2Var;
        he1 he1VarT;
        he1 he1VarT2;
        yu8 yu8Var;
        lw6 lw6Var;
        int i;
        yu8 yu8Var2;
        this.a = 20;
        p8c.m();
        this.b = iv6Var;
        ik1 ik1Var = (ik1) iv6Var.a(xjf.h0, null);
        if (ik1Var != null) {
            final int i2 = 2;
            r1f r1fVar = new r1f(2);
            ik1Var.a(iv6Var, r1fVar);
            this.c = r1fVar.j();
            final hbc hbcVar = new hbc();
            hbcVar.a = null;
            hbcVar.f = null;
            this.d = hbcVar;
            Executor executor = (Executor) iv6Var.a(cd7.P, dd7.a());
            Objects.requireNonNull(executor);
            final ej0 ej0Var = new ej0(executor, cameraCharacteristics);
            ArrayList arrayList = new ArrayList();
            if (((Integer) iv6Var.a(wv6.D, 0)).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(256);
            } else {
                Integer num = (Integer) iv6Var.a(iv6.e, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    Integer num2 = (Integer) iv6Var.a(wv6.C, null);
                    if (num2 == null || num2.intValue() != 4101) {
                        iIntValue = (num2 == null || num2.intValue() != 32) ? 256 : 32;
                    } else {
                        iIntValue = 4101;
                    }
                }
                arrayList.add(Integer.valueOf(iIntValue));
            }
            int iL = iv6Var.l();
            if (iv6Var.a(iv6.g, null) == null) {
                is4 is4Var = new is4();
                is4 is4Var2 = new is4();
                ko0 ko0Var = new ko0(size, iL, arrayList, z, is4Var, is4Var2);
                this.e = ko0Var;
                final int i3 = 1;
                ok8.o("CaptureNode does not support recreation yet.", ((ko0) hbcVar.e) == null && ((sbc) hbcVar.b) == null);
                hbcVar.e = ko0Var;
                ie1 ie1Var = new ie1(i3, hbcVar);
                boolean z2 = arrayList.size() > 1;
                if (!z) {
                    if (z2) {
                        i = 0;
                        yu8 yu8Var3 = new yu8(size.getWidth(), size.getHeight(), 256, 4);
                        he1 he1VarT3 = an1.t(ie1Var, yu8Var3.b);
                        yu8Var = new yu8(size.getWidth(), size.getHeight(), 32, 4);
                        he1VarT2 = an1.t(ie1Var, yu8Var.b);
                        yu8Var2 = yu8Var3;
                        he1VarT = he1VarT3;
                    } else {
                        i = 0;
                        yu8 yu8Var4 = new yu8(size.getWidth(), size.getHeight(), iL, 4);
                        he1VarT = an1.t(ie1Var, yu8Var4.b);
                        he1VarT2 = null;
                        yu8Var = null;
                        yu8Var2 = yu8Var4;
                    }
                    final int i4 = i;
                    yl2Var = new yl2() { // from class: mm1
                        @Override // defpackage.yl2
                        public final void accept(Object obj) {
                            int i5 = i4;
                            hbc hbcVar2 = hbcVar;
                            switch (i5) {
                                case 0:
                                    hbcVar2.u0((uva) obj);
                                    break;
                                case 1:
                                    uva uvaVar = (uva) obj;
                                    hbcVar2.u0(uvaVar);
                                    w84 w84Var = (w84) hbcVar2.f;
                                    ok8.o("Pending request should be null", ((uva) w84Var.c) == null);
                                    w84Var.c = uvaVar;
                                    break;
                                default:
                                    hbcVar2.F0((nq0) obj);
                                    break;
                            }
                        }
                    };
                    lw6Var = yu8Var2;
                } else {
                    w84 w84Var = new w84(new egh(ImageReader.newInstance(size.getWidth(), size.getHeight(), iL, 4)));
                    hbcVar.f = w84Var;
                    yl2Var = new yl2() { // from class: mm1
                        @Override // defpackage.yl2
                        public final void accept(Object obj) {
                            int i5 = i3;
                            hbc hbcVar2 = hbcVar;
                            switch (i5) {
                                case 0:
                                    hbcVar2.u0((uva) obj);
                                    break;
                                case 1:
                                    uva uvaVar = (uva) obj;
                                    hbcVar2.u0(uvaVar);
                                    w84 w84Var2 = (w84) hbcVar2.f;
                                    ok8.o("Pending request should be null", ((uva) w84Var2.c) == null);
                                    w84Var2.c = uvaVar;
                                    break;
                                default:
                                    hbcVar2.F0((nq0) obj);
                                    break;
                            }
                        }
                    };
                    he1VarT = ie1Var;
                    he1VarT2 = null;
                    yu8Var = null;
                    lw6Var = w84Var;
                }
                ko0Var.a = he1VarT;
                if (z2 && he1VarT2 != null) {
                    ko0Var.b = he1VarT2;
                }
                Surface surface = lw6Var.getSurface();
                Objects.requireNonNull(surface);
                ok8.o("The surface is already set.", ko0Var.c == null);
                ko0Var.c = new vx6(surface, size, iL);
                hbcVar.b = new sbc(lw6Var);
                int i5 = 8;
                lw6Var.h0(new jv2(i5, hbcVar), ok8.w());
                if (z2 && yu8Var != null) {
                    Surface surface2 = yu8Var.getSurface();
                    ok8.o("The secondary surface is already set.", ko0Var.d == null);
                    ko0Var.d = new vx6(surface2, size, iL);
                    hbcVar.c = new sbc(yu8Var);
                    yu8Var.h0(new jv2(i5, hbcVar), ok8.w());
                }
                is4Var.b = yl2Var;
                is4Var2.b = new yl2() { // from class: mm1
                    @Override // defpackage.yl2
                    public final void accept(Object obj) {
                        int i6 = i2;
                        hbc hbcVar2 = hbcVar;
                        switch (i6) {
                            case 0:
                                hbcVar2.u0((uva) obj);
                                break;
                            case 1:
                                uva uvaVar = (uva) obj;
                                hbcVar2.u0(uvaVar);
                                w84 w84Var2 = (w84) hbcVar2.f;
                                ok8.o("Pending request should be null", ((uva) w84Var2.c) == null);
                                w84Var2.c = uvaVar;
                                break;
                            default:
                                hbcVar2.F0((nq0) obj);
                                break;
                        }
                    }
                };
                is4 is4Var3 = new is4();
                is4 is4Var4 = new is4();
                wp0 wp0Var = new wp0(is4Var3, is4Var4, iL, arrayList);
                hbcVar.d = wp0Var;
                ej0Var.c = wp0Var;
                final int i6 = 0;
                is4Var3.b = new yl2() { // from class: pva
                    @Override // defpackage.yl2
                    public final void accept(Object obj) throws Exception {
                        int i7 = i6;
                        ej0 ej0Var2 = ej0Var;
                        xp0 xp0Var = (xp0) obj;
                        switch (i7) {
                            case 0:
                                if (!xp0Var.a.g.g) {
                                    ((Executor) ej0Var2.b).execute(new qva(ej0Var2, xp0Var, 1));
                                } else {
                                    xp0Var.b.close();
                                }
                                break;
                            default:
                                if (!xp0Var.a.g.g) {
                                    ((Executor) ej0Var2.b).execute(new qva(ej0Var2, xp0Var, 0));
                                } else {
                                    b21.W("ProcessingNode", "The postview image is closed due to request aborted");
                                    xp0Var.b.close();
                                }
                                break;
                        }
                    }
                };
                final int i7 = 1;
                is4Var4.b = new yl2() { // from class: pva
                    @Override // defpackage.yl2
                    public final void accept(Object obj) throws Exception {
                        int i8 = i7;
                        ej0 ej0Var2 = ej0Var;
                        xp0 xp0Var = (xp0) obj;
                        switch (i8) {
                            case 0:
                                if (!xp0Var.a.g.g) {
                                    ((Executor) ej0Var2.b).execute(new qva(ej0Var2, xp0Var, 1));
                                } else {
                                    xp0Var.b.close();
                                }
                                break;
                            default:
                                if (!xp0Var.a.g.g) {
                                    ((Executor) ej0Var2.b).execute(new qva(ej0Var2, xp0Var, 0));
                                } else {
                                    b21.W("ProcessingNode", "The postview image is closed due to request aborted");
                                    xp0Var.b.close();
                                }
                                break;
                        }
                    }
                };
                ej0Var.d = new jy4(19);
                ej0Var.e = new m6c((k9b) ej0Var.y);
                int i8 = 9;
                ej0Var.g = new yx4(i8);
                ej0Var.f = new m8c(14);
                ej0Var.v = new eu4(10);
                ej0Var.x = new yx4(7);
                if (iL == 35 || ej0Var.a) {
                    ej0Var.w = new y25(i8);
                    return;
                }
                return;
            }
            r3.f();
            throw null;
        }
        s8f.h((String) iv6Var.a(kfe.a0, iv6Var.toString()), "Implementation is missing option unpacker for ");
        throw null;
    }

    public szc(a90 a90Var, fr8 fr8Var) {
        this.a = 3;
        this.e = a90Var;
        this.a = 3;
        this.d = a90Var;
        this.b = fr8Var;
        this.c = new ArrayList();
    }

    public szc(mf7 mf7Var, f8f f8fVar, lw7 lw7Var) {
        this.a = 22;
        f8fVar.getClass();
        this.b = mf7Var;
        this.c = f8fVar;
        this.d = lw7Var;
        this.e = new ta0(this, f8fVar);
    }

    public szc(int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 28:
                this.b = new d0a();
                this.c = new d0a();
                this.d = new mca();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public szc(hbc hbcVar, t99 t99Var, hc2 hc2Var) {
        this.a = 10;
        this.c = hbcVar;
        this.d = t99Var;
        this.e = hc2Var;
        this.b = new ArrayList();
    }

    public szc(hc2 hc2Var, szc szcVar, ArrayList arrayList) {
        this.a = 9;
        this.c = hc2Var;
        this.d = szcVar;
        this.e = arrayList;
        this.b = hc2Var;
    }

    public szc(rr5 rr5Var) {
        this.a = 4;
        this.b = rr5Var;
        this.c = null;
        this.d = gye.a;
        this.e = null;
    }

    public szc(d04 d04Var) {
        this.a = 14;
        this.e = d04Var;
        List listO0 = d04Var.e.o0();
        listO0.getClass();
        int i = 10;
        int iF = bm8.F(t72.u(listO0, 10));
        int i2 = 16;
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF < 16 ? 16 : iF);
        for (Object obj : listO0) {
            linkedHashMap.put(i7h.v((u99) d04Var.z.c, ((yya) obj).A()), obj);
        }
        this.b = linkedHashMap;
        d04 d04Var2 = (d04) this.e;
        this.c = ((tz3) d04Var2.z.b).a.c(new d5(i, this, d04Var2));
        ge8 ge8Var = ((tz3) ((d04) this.e).z.b).a;
        j5 j5Var = new j5(i2, this);
        ge8Var.getClass();
        this.d = new ee8(ge8Var, j5Var);
    }

    public szc(yob yobVar, n99 n99Var, fz3 fz3Var, n99 n99Var2) {
        Object objO;
        this.a = 24;
        if (yobVar != null) {
            objO = jy6.o(yobVar);
        } else {
            ey6 ey6Var = jy6.b;
            objO = yob.e;
        }
        this.b = objO;
        this.c = n99Var;
        this.d = fz3Var;
        this.e = n99Var2;
    }

    public szc(AudioTrack audioTrack, ssg ssgVar) {
        this.a = 5;
        this.b = audioTrack;
        this.c = ssgVar;
        Handler handlerN = pqf.n(null);
        this.d = handlerN;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: vk0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                szc szcVar = this.a;
                if (((vk0) szcVar.e) == null) {
                    return;
                }
                rs0.A().execute(new fe(11, szcVar, audioRouting));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerN);
    }

    public szc(myd mydVar) {
        this.a = 1;
        this.c = mydVar;
        this.d = new SparseArray();
    }
}

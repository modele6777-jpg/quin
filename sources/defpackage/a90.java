package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class a90 implements s36, s8c, ne2, ezc, pz9, fm3, ydg, x91, yb3 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final String[] e = {"name", "length", "last_touch_timestamp"};
    public static final Object f = new Object();
    public static gag g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public a90(int i) {
        this.a = i;
        switch (i) {
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                this.b = new hpb();
                this.c = vpf.o(pu4.a);
                break;
            case 17:
                this.b = xu4.a;
                this.c = qu4.a;
                break;
            case 27:
                t72.I("Question Analysis", "问题分析", "問題分析", "質問分析", "질문 분석", "Análisis de la pregunta");
                this.b = t72.I("Spread Layout", "牌阵布局", "牌陣布局", "スプレッドレイアウト", "스프레드 레이아웃", "Diseño de tirada");
                this.c = t72.I("Spread Explanation", "牌阵解释", "牌陣解釋", "スプレッド解説", "스프레드 설명", "Explicación de la tirada");
                break;
        }
    }

    public static Task A(Context context, Intent intent, boolean z) {
        gag gagVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f) {
            try {
                gagVar = g;
                if (gagVar == null) {
                    gagVar = new gag(context);
                    g = gagVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = 1;
        if (!z) {
            return gagVar.b(intent).f(new mc0(i), new pd4(16));
        }
        if (szc.L().O(context)) {
            synchronized (qk2.E0) {
                try {
                    qk2.t(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        qk2.F0.a();
                    }
                    gagVar.b(intent).b(new r45(27, intent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            gagVar.b(intent);
        }
        return Tasks.d(-1);
    }

    public boolean B(int i) {
        return ((ki5) this.b).a.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    public v00 C(kya kyaVar, u99 u99Var) {
        Map mapW;
        kyaVar.getClass();
        u99Var.getClass();
        u09 u09VarR = od4.r((w09) this.b, i7h.u(u99Var, kyaVar.q()), (szc) this.c);
        if (kyaVar.o() == 0 || sy4.f(u09VarR)) {
            mapW = qu4.a;
        } else {
            int i = oz3.a;
            if (oz3.l(u09VarR, l22.ANNOTATION_CLASS)) {
                Collection collectionP = u09VarR.p();
                collectionP.getClass();
                z12 z12Var = (z12) s72.Y0(collectionP);
                if (z12Var != null) {
                    List listG = z12Var.G();
                    listG.getClass();
                    int iF = bm8.F(t72.u(listG, 10));
                    if (iF < 16) {
                        iF = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                    for (Object obj : listG) {
                        linkedHashMap.put(((xrf) obj).getName(), obj);
                    }
                    List<iya> listP = kyaVar.p();
                    listP.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (iya iyaVar : listP) {
                        iyaVar.getClass();
                        xrf xrfVar = (xrf) linkedHashMap.get(t99.d(u99Var.getString(iyaVar.n())));
                        Object iy9Var = null;
                        if (xrfVar != null) {
                            t99 t99VarD = t99.d(u99Var.getString(iyaVar.n()));
                            tt7 type = xrfVar.getType();
                            type.getClass();
                            hya hyaVarO = iyaVar.o();
                            hyaVarO.getClass();
                            bl2 bl2VarT = T(type, hyaVarO, u99Var);
                            iy9Var = D(bl2VarT, type, hyaVarO) ? bl2VarT : null;
                            if (iy9Var == null) {
                                iy9Var = new ty4("Unexpected argument value: actual type " + hyaVarO.J() + " != expected type " + type);
                            }
                            iy9Var = new iy9(t99VarD, iy9Var);
                        }
                        if (iy9Var != null) {
                            arrayList.add(iy9Var);
                        }
                    }
                    mapW = bm8.W(arrayList);
                } else {
                    mapW = qu4.a;
                }
            } else {
                mapW = qu4.a;
            }
        }
        return new v00(u09VarR.S(), mapW, ntd.T);
    }

    public boolean D(bl2 bl2Var, tt7 tt7Var, hya hyaVar) {
        w09 w09Var = (w09) this.b;
        gya gyaVarJ = hyaVar.J();
        int i = gyaVarJ == null ? -1 : w00.a[gyaVarJ.ordinal()];
        if (i != 10) {
            if (i != 13) {
                return pa7.t(bl2Var.a(w09Var), tt7Var);
            }
            if (bl2Var instanceof pd0) {
                Object obj = ((pd0) bl2Var).a;
                if (((List) obj).size() == hyaVar.B().size()) {
                    tt7 tt7VarG = w09Var.f().g(tt7Var);
                    if (tt7VarG != null) {
                        Iterable iterableB = t72.B((Collection) obj);
                        if ((iterableB instanceof Collection) && ((Collection) iterableB).isEmpty()) {
                            return true;
                        }
                        Iterator it = iterableB.iterator();
                        while (((y67) it).c) {
                            int iNextInt = ((q67) it).nextInt();
                            bl2 bl2Var2 = (bl2) ((List) obj).get(iNextInt);
                            hya hyaVarA = hyaVar.A(iNextInt);
                            hyaVarA.getClass();
                            if (!D(bl2Var2, tt7VarG, hyaVarA)) {
                            }
                        }
                        return true;
                    }
                }
            }
            ho7.w(bl2Var, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        y22 y22VarM = tt7Var.c0().m();
        u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
        if (u09Var == null) {
            return true;
        }
        t99 t99Var = xr7.e;
        if (xr7.b(u09Var, syd.Q)) {
            return true;
        }
        return false;
    }

    public HashMap E() throws td3 {
        try {
            ((String) this.c).getClass();
            Cursor cursorQuery = ((myd) this.b).getReadableDatabase().query((String) this.c, e, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new j81(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new td3(e2);
        }
    }

    public boolean F(wn7 wn7Var, Object obj) {
        wn7Var.getClass();
        ji5 ji5Var = (ji5) this.c;
        return ((((Number) ((hn7) this.b).get(obj)).intValue() >>> ji5Var.a) & ((1 << ji5Var.b) - 1)) == ji5Var.c;
    }

    public void G(long j) throws td3 {
        myd mydVar = (myd) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (ptf.a(mydVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = mydVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    ptf.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new td3(e2);
        }
    }

    public void H(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        psd psdVarX = psd.x(absSeekBar.getContext(), attributeSet, d, i);
        Drawable drawableQ = psdVarX.q(0);
        if (drawableQ != null) {
            if (drawableQ instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableQ;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableX = X(animationDrawable.getFrame(i2), true);
                    drawableX.setLevel(10000);
                    animationDrawable2.addFrame(drawableX, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableQ = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableQ);
        }
        Drawable drawableQ2 = psdVarX.q(1);
        if (drawableQ2 != null) {
            absSeekBar.setProgressDrawable(X(drawableQ2, false));
        }
        psdVarX.z();
    }

    public void I(String str) {
        str.getClass();
        Iterator it = ((List) ((zh0) this.c).a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed((hpb) this.b);
        }
    }

    public void J(String str) {
        str.getClass();
        Iterator it = ((List) ((zh0) this.c).a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((hpb) this.b);
        }
    }

    public void K(String str) {
        str.getClass();
        Iterator it = ((List) ((zh0) this.c).a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured((hpb) this.b);
        }
    }

    public void L(cd cdVar) {
        kxa kxaVar = (kxa) this.b;
        ((ActionMode.Callback) kxaVar.a).onDestroyActionMode(kxaVar.e(cdVar));
        q80 q80Var = (q80) this.c;
        if (q80Var.K0 != null) {
            q80Var.z.getDecorView().removeCallbacks(q80Var.L0);
        }
        if (q80Var.J0 != null) {
            swf swfVar = q80Var.M0;
            if (swfVar != null) {
                swfVar.b();
            }
            swf swfVarA = nvf.a(q80Var.J0);
            swfVarA.a(0.0f);
            q80Var.M0 = swfVarA;
            swfVarA.d(new k80(2, this));
        }
        q80Var.I0 = null;
        ViewGroup viewGroup = q80Var.O0;
        WeakHashMap weakHashMap = nvf.a;
        viewGroup.requestApplyInsets();
        q80Var.L();
    }

    public boolean M(cd cdVar, Menu menu) {
        ViewGroup viewGroup = ((q80) this.c).O0;
        WeakHashMap weakHashMap = nvf.a;
        viewGroup.requestApplyInsets();
        kxa kxaVar = (kxa) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) kxaVar.a;
        y8e y8eVarE = kxaVar.e(cdVar);
        wid widVar = (wid) kxaVar.d;
        Menu ps8Var = (Menu) widVar.get(menu);
        if (ps8Var == null) {
            ps8Var = new ps8((Context) kxaVar.b, (qr8) menu);
            widVar.put(menu, ps8Var);
        }
        return callback.onPrepareActionMode(y8eVarE, ps8Var);
    }

    public void N(String str, CameraDevice.StateCallback stateCallback) {
        qwe qweVar = (qwe) this.c;
        CameraManager cameraManager = (CameraManager) ((h1b) this.b).get();
        try {
            Trace.beginSection(((Object) ig1.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                s.S(cameraManager, str, (Executor) qweVar.j.getValue(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, qweVar.a());
            }
        } finally {
            Trace.endSection();
        }
    }

    public FileInputStream O() {
        File file = (File) this.b;
        File file2 = (File) this.c;
        if (file2.exists()) {
            file.delete();
            file2.renameTo(file);
        }
        return a.b(file, new FileInputStream(file));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    public as9 P(sw6 sw6Var, ykd ykdVar) {
        Context context;
        ykd ykdVar2;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        Context context2 = sw6Var.a;
        zdc zdcVar = sw6Var.p;
        bpa bpaVar = sw6Var.q;
        zd5 zd5Var = sw6Var.e;
        m81 m81Var = sw6Var.i;
        m81 m81Var2 = sw6Var.j;
        m81 m81Var3 = sw6Var.k;
        q95 q95Var = yw6.b;
        Bitmap.Config config = (Bitmap.Config) b21.z(sw6Var, q95Var);
        q95 q95Var2 = yw6.g;
        boolean zBooleanValue = ((Boolean) b21.z(sw6Var, q95Var2)).booleanValue();
        q95 q95Var3 = vw6.a;
        boolean z3 = ((List) b21.z(sw6Var, q95Var3)).isEmpty() || qd0.V(erf.a, (Bitmap.Config) b21.z(sw6Var, q95Var));
        if (qk2.G((Bitmap.Config) b21.z(sw6Var, q95Var))) {
            if (!qk2.G((Bitmap.Config) b21.z(sw6Var, q95Var)) || ((Boolean) b21.z(sw6Var, yw6.f)).booleanValue()) {
                context = context2;
                ykdVar2 = ykdVar;
                if (((jh6) this.c).b(ykdVar2)) {
                }
                if (z3 || !z) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) b21.z(sw6Var, q95Var3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                linkedHashMap = new LinkedHashMap(bm8.L(sw6Var.t.n.a, sw6Var.r.a));
                if (config != ((Bitmap.Config) b21.z(sw6Var, q95Var))) {
                    if (config != null) {
                        linkedHashMap.put(q95Var, config);
                    } else {
                        linkedHashMap.remove(q95Var);
                    }
                }
                if (z2 != ((Boolean) b21.z(sw6Var, q95Var2)).booleanValue()) {
                    linkedHashMap.put(q95Var2, Boolean.valueOf(z2));
                }
                return new as9(context, ykdVar2, zdcVar, bpaVar, null, zd5Var, m81Var, m81Var2, m81Var3, new r95(vpf.U(linkedHashMap)));
            }
            context = context2;
            ykdVar2 = ykdVar;
            z = false;
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z2 = false;
            } else {
                z2 = false;
            }
            linkedHashMap = new LinkedHashMap(bm8.L(sw6Var.t.n.a, sw6Var.r.a));
            if (config != ((Bitmap.Config) b21.z(sw6Var, q95Var))) {
                if (config != null) {
                    linkedHashMap.put(q95Var, config);
                } else {
                    linkedHashMap.remove(q95Var);
                }
            }
            if (z2 != ((Boolean) b21.z(sw6Var, q95Var2)).booleanValue()) {
                linkedHashMap.put(q95Var2, Boolean.valueOf(z2));
            }
            return new as9(context, ykdVar2, zdcVar, bpaVar, null, zd5Var, m81Var, m81Var2, m81Var3, new r95(vpf.U(linkedHashMap)));
        }
        context = context2;
        ykdVar2 = ykdVar;
        z = true;
        if (z3) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z2 = false;
        } else {
            z2 = false;
        }
        linkedHashMap = new LinkedHashMap(bm8.L(sw6Var.t.n.a, sw6Var.r.a));
        if (config != ((Bitmap.Config) b21.z(sw6Var, q95Var))) {
            if (config != null) {
                linkedHashMap.put(q95Var, config);
            } else {
                linkedHashMap.remove(q95Var);
            }
        }
        if (z2 != ((Boolean) b21.z(sw6Var, q95Var2)).booleanValue()) {
            linkedHashMap.put(q95Var2, Boolean.valueOf(z2));
        }
        return new as9(context, ykdVar2, zdcVar, bpaVar, null, zd5Var, m81Var, m81Var2, m81Var3, new r95(vpf.U(linkedHashMap)));
    }

    public Task Q(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.b;
        mc0 mc0Var = (mc0) this.c;
        int i = 1;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.b(mc0Var, new vh2(i, context, intent)).g(mc0Var, new yn2() { // from class: xa5
            @Override // defpackage.yn2
            public final Object h(Task task) {
                return ((Integer) task.i()).intValue() != 402 ? task : a90.A(context, intent, z2).f(new mc0(1), new pd4(15));
            }
        }) : A(context, intent, z2);
    }

    public void R(Set set) throws td3 {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((myd) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new td3(e2);
        }
    }

    public InputMethodManager S() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.c;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.b).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.c = inputMethodManager2;
        return inputMethodManager2;
    }

    public bl2 T(tt7 tt7Var, hya hyaVar, u99 u99Var) {
        u99Var.getClass();
        boolean zBooleanValue = oi5.S.e(hyaVar.F()).booleanValue();
        gya gyaVarJ = hyaVar.J();
        switch (gyaVarJ == null ? -1 : w00.a[gyaVarJ.ordinal()]) {
            case 1:
                byte bH = (byte) hyaVar.H();
                return zBooleanValue ? new z9f(bH) : new c71(bH);
            case 2:
                return new jx1(Character.valueOf((char) hyaVar.H()));
            case 3:
                short sH = (short) hyaVar.H();
                return zBooleanValue ? new z9f(sH) : new bfd(sH);
            case 4:
                int iH = (int) hyaVar.H();
                return zBooleanValue ? new z9f(iH) : new g77(iH);
            case 5:
                long jH = hyaVar.H();
                return zBooleanValue ? new z9f(jH) : new hg8(jH);
            case 6:
                return new h11(hyaVar.G());
            case 7:
                return new h11(hyaVar.D());
            case 8:
                return new h11(Boolean.valueOf(hyaVar.H() != 0));
            case 9:
                return new t4e(u99Var.getString(hyaVar.I()));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new rm7(i7h.u(u99Var, hyaVar.C()), hyaVar.z());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new rx4(i7h.u(u99Var, hyaVar.C()), t99.d(u99Var.getString(hyaVar.E())));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                kya kyaVarX = hyaVar.x();
                kyaVarX.getClass();
                return new f10((Object) C(kyaVarX, u99Var));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List<hya> listB = hyaVar.B();
                listB.getClass();
                ArrayList arrayList = new ArrayList(t72.u(listB, 10));
                for (hya hyaVar2 : listB) {
                    tjd tjdVarE = ((w09) this.b).f().e();
                    hyaVar2.getClass();
                    arrayList.add(T(tjdVarE, hyaVar2, u99Var));
                }
                return new z8f(arrayList, tt7Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + hyaVar.J() + " (expected " + tt7Var + ')').toString());
        }
    }

    public void U(String str, long j, long j2) throws td3 {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((myd) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e2) {
            throw new td3(e2);
        }
    }

    public void V(wn7 wn7Var, Object obj) {
        wn7Var.getClass();
        if (((mz3) this.c).a) {
            qc0.p("Cannot modify readonly DescriptorRendererOptions");
        } else {
            this.b = obj;
        }
    }

    public th0 W() throws IOException {
        File file = (File) this.c;
        File file2 = (File) this.b;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                xo1.V("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new th0(file2);
        } catch (FileNotFoundException e2) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e2);
            }
            try {
                return new th0(file2);
            } catch (FileNotFoundException e3) {
                throw new IOException("Couldn't create " + file2, e3);
            }
        }
    }

    public Drawable X(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = X(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public as9 Y(as9 as9Var) {
        boolean z;
        r95 r95Var = as9Var.j;
        q95 q95Var = yw6.b;
        if (!qk2.G((Bitmap.Config) b21.A(as9Var, q95Var)) || ((jh6) this.c).h()) {
            z = false;
        } else {
            r95Var.getClass();
            LinkedHashMap linkedHashMapY = bm8.Y(r95Var.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapY.put(q95Var, config);
            } else {
                linkedHashMapY.remove(q95Var);
            }
            r95Var = new r95(vpf.U(linkedHashMapY));
            z = true;
        }
        return z ? new as9(as9Var.a, as9Var.b, as9Var.c, as9Var.d, as9Var.e, as9Var.f, as9Var.g, as9Var.h, as9Var.i, r95Var) : as9Var;
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        switch (this.a) {
            case 3:
                ok8.o(null, ((la1) this.b).b(null));
                break;
            default:
                break;
        }
    }

    @Override // defpackage.ydg
    public float b() {
        yg1 yg1Var = ((gh1) this.b).b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        key.getClass();
        Object objValueOf = Float.valueOf(1.0f);
        nc1 nc1Var = (nc1) yg1Var;
        nc1Var.getClass();
        Object objC = nc1Var.c(key);
        if (objC != null) {
            objValueOf = objC;
        }
        Float f2 = (Float) objValueOf;
        float fFloatValue = f2.floatValue();
        if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d) {
            return f2.floatValue();
        }
        if (b21.F(5, "CXCP")) {
            b1.l("CXCP", "Invalid max zoom ratio of " + f2 + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    @Override // defpackage.fm3
    public Object c(zxa zxaVar, Object obj) {
        return t(zxaVar, obj);
    }

    @Override // defpackage.ydg
    public float d() {
        return 1.0f;
    }

    @Override // defpackage.fm3
    public Object e(xrf xrfVar, Object obj) {
        return null;
    }

    @Override // defpackage.fm3
    public Object f(p5 p5Var, Object obj) {
        return null;
    }

    @Override // defpackage.fm3
    public Object g(nw7 nw7Var, Object obj) {
        return null;
    }

    @Override // defpackage.ezc
    public xn7 h(em7 em7Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsR = af1.R(em7Var);
        Object i81Var = concurrentHashMap.get(clsR);
        if (i81Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsR, (i81Var = new i81((xn7) ((a26) this.b).d(em7Var))))) != null) {
            i81Var = objPutIfAbsent;
        }
        return ((i81) i81Var).a;
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        switch (this.a) {
            case 3:
                if (!(th instanceof uae)) {
                    ok8.o(null, ((la1) this.b).b(null));
                } else {
                    ok8.o(null, ((pa1) this.c).cancel(false));
                }
                break;
            default:
                p8c.m();
                uva uvaVar = (uva) this.b;
                hbc hbcVar = (hbc) this.c;
                if (uvaVar == ((uva) hbcVar.a)) {
                    b21.W("CaptureNode", "request aborted, id=" + ((uva) hbcVar.a).a);
                    w84 w84Var = (w84) hbcVar.f;
                    if (w84Var != null) {
                        w84Var.c = null;
                    }
                    hbcVar.a = null;
                }
                break;
        }
    }

    @Override // defpackage.x91
    public Type k() {
        return (Type) this.b;
    }

    @Override // defpackage.x91
    public Object l(fm9 fm9Var) {
        Executor executor = (Executor) this.c;
        return executor == null ? fm9Var : new pp3(executor, fm9Var);
    }

    @Override // defpackage.yb3
    public ac3 l0() {
        return new tp3((Context) this.b, ((yb3) this.c).l0());
    }

    @Override // defpackage.fm3
    public Object m(dya dyaVar, Object obj) {
        return t(dyaVar, obj);
    }

    @Override // defpackage.fm3
    public Object n(n18 n18Var, Object obj) {
        return null;
    }

    @Override // defpackage.fm3
    public Object o(s04 s04Var, Object obj) {
        return null;
    }

    @Override // defpackage.s8c
    public q8c p(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        ld5 ld5Var = (ld5) this.c;
        if (!str.equals(":memory:")) {
            str = ((sd3) ld5Var.d).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        z25 z25Var = new z25(str, (ld5Var.b || ld5Var.c || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = z25Var.a;
        reentrantLock.lock();
        w84 w84Var = z25Var.b;
        if (w84Var != null) {
            try {
                w84Var.a1();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (ld5Var.c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                q8c q8cVarP = ((s8c) this.b).p(str);
                if (ld5Var.b) {
                    ld5.b(q8cVarP);
                    if (((sd3) ld5Var.d).g == t5c.b) {
                        p8c.o(q8cVarP, "PRAGMA synchronous = NORMAL");
                    } else {
                        p8c.o(q8cVarP, "PRAGMA synchronous = FULL");
                    }
                    ((gt4) ld5Var.e).s(q8cVarP);
                } else {
                    try {
                        ld5Var.c = true;
                        ld5Var.c(q8cVarP);
                        ld5Var.c = false;
                    } catch (Throwable th2) {
                        ld5Var.c = false;
                        throw th2;
                    }
                }
                if (w84Var != null && (fileChannel2 = (FileChannel) w84Var.c) != null) {
                    try {
                        fileChannel2.close();
                        w84Var.c = null;
                    } catch (Throwable th3) {
                        w84Var.c = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return q8cVarP;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            if (w84Var != null && (fileChannel = (FileChannel) w84Var.c) != null) {
                try {
                    fileChannel.close();
                } finally {
                    w84Var.c = null;
                }
            }
            throw th5;
        }
        th = th4;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // defpackage.fm3
    public Object q(x09 x09Var, Object obj) {
        return null;
    }

    @Override // defpackage.pz9
    public Object r(em7 em7Var, ArrayList arrayList) {
        Object dzbVar;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsR = af1.R(em7Var);
        Object oz9Var = concurrentHashMap.get(clsR);
        if (oz9Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsR, (oz9Var = new oz9()))) != null) {
            oz9Var = objPutIfAbsent;
        }
        oz9 oz9Var2 = (oz9) oz9Var;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new go7((yn7) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = oz9Var2.a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                dzbVar = (xn7) ((l26) this.b).z(em7Var, arrayList);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            ezb ezbVar = new ezb(dzbVar);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, ezbVar);
            obj = objPutIfAbsent2 == null ? ezbVar : objPutIfAbsent2;
        }
        return ((ezb) obj).b();
    }

    @Override // defpackage.fm3
    public Object s(yxa yxaVar, Object obj) {
        int i;
        xm7 xm7Var = (xm7) this.c;
        List listT = yxaVar.T();
        listT.getClass();
        if (listT.isEmpty()) {
            i = (yxaVar.J0 != null ? 1 : 0) + (yxaVar.K0 != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (yxaVar.g) {
            if (i == -1) {
                return new by3(xm7Var, yxaVar, dm7.j);
            }
            if (i == 0) {
                return new vx3(xm7Var, yxaVar, dm7.j);
            }
            if (i == 1) {
                return new xx3(xm7Var, yxaVar, dm7.j);
            }
            if (i == 2) {
                return new zx3(xm7Var, yxaVar, dm7.j);
            }
        } else {
            if (i == -1) {
                return new wy3(xm7Var, yxaVar, dm7.j);
            }
            if (i == 0) {
                return new ny3(xm7Var, yxaVar, dm7.j);
            }
            if (i == 1) {
                return new qy3(xm7Var, yxaVar, dm7.j);
            }
            if (i == 2) {
                return new ty3(xm7Var, yxaVar, dm7.j);
            }
        }
        ho7.m(yxaVar, "Unsupported property: ");
        return null;
    }

    @Override // defpackage.fm3
    public Object t(c36 c36Var, Object obj) {
        return new tx3((xm7) this.b, c36Var);
    }

    public String toString() {
        switch (this.a) {
            case 29:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ydg
    public nu3 u(ajf ajfVar) {
        ajfVar.getClass();
        return ajfVar.f(t72.H(CaptureRequest.SCALER_CROP_REGION), zif.b);
    }

    @Override // defpackage.ydg
    public nu3 v(ajf ajfVar) {
        ajfVar.getClass();
        Rect rect = (Rect) this.c;
        if (Math.abs(1.0f) < ((double) Math.ulp(Math.abs(1.0f))) * 2.0d && b21.F(5, "CXCP")) {
            b1.l("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
        }
        float fWidth = rect.width() / 1.0f;
        float fHeight = rect.height() / 1.0f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return ajf.b(ajfVar, bm8.G(new iy9(CaptureRequest.SCALER_CROP_REGION, new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight)))));
    }

    @Override // defpackage.fm3
    public Object w(u09 u09Var, Object obj) {
        return null;
    }

    @Override // defpackage.fm3
    public Object x(lw9 lw9Var, Object obj) {
        return null;
    }

    @Override // defpackage.s8c
    public boolean y() {
        return ((s8c) this.b).y();
    }

    @Override // defpackage.fm3
    public Object z(z12 z12Var, Object obj) {
        return t(z12Var, obj);
    }

    @Override // defpackage.ne2
    public void j() {
    }

    public /* synthetic */ a90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ a90(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public a90(xm7 xm7Var) {
        this.a = 22;
        xm7Var.getClass();
        this.b = xm7Var;
        this.c = xm7Var;
    }

    public a90(hn7 hn7Var, ji5 ji5Var) {
        this.a = 13;
        this.b = hn7Var;
        this.c = ji5Var;
        if (ji5Var.b == 1 && ji5Var.c == 1) {
            return;
        }
        qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var, " was passed"));
        throw null;
    }

    public a90(w09 w09Var, szc szcVar) {
        this.a = 8;
        w09Var.getClass();
        szcVar.getClass();
        this.b = w09Var;
        this.c = szcVar;
    }

    public a90(mib mibVar) {
        Object jy4Var;
        this.a = 6;
        this.b = mibVar;
        int i = 2;
        if (kh6.a) {
            jy4Var = new f17(false, i);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 != 26 && i2 != 27) {
                jy4Var = new f17(true, i);
            } else {
                jy4Var = new jy4(11);
            }
        }
        this.c = jy4Var;
    }

    public a90(File file) {
        this.a = 11;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a90(Context context, int i) {
        this(context, new kb6(12));
        this.a = i;
        switch (i) {
            case 26:
                break;
            default:
                this.b = context;
                this.c = new mc0(1);
                break;
        }
    }

    public a90(ld5 ld5Var, s8c s8cVar) {
        this.a = 12;
        s8cVar.getClass();
        this.c = ld5Var;
        this.b = s8cVar;
    }

    public /* synthetic */ a90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public a90(gh1 gh1Var) {
        this.a = 23;
        this.b = gh1Var;
        yg1 yg1Var = gh1Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        objC.getClass();
        this.c = (Rect) objC;
    }

    public a90(Context context, yb3 yb3Var) {
        this.a = 26;
        this.b = context.getApplicationContext();
        this.c = yb3Var;
    }

    public a90(hbc hbcVar, HashMap map, HashMap map2) {
        this.a = 4;
        this.b = hbcVar;
        this.c = map;
    }

    public a90(ki5 ki5Var, SparseArray sparseArray) {
        this.a = 5;
        this.b = ki5Var;
        SparseBooleanArray sparseBooleanArray = ki5Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            pa7.C(i, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i);
            pl plVar = (pl) sparseArray.get(iKeyAt);
            plVar.getClass();
            sparseArray2.append(iKeyAt, plVar);
        }
        this.c = sparseArray2;
    }

    public a90(h1b h1bVar, qwe qweVar) {
        this.a = 15;
        h1bVar.getClass();
        qweVar.getClass();
        this.b = h1bVar;
        this.c = qweVar;
    }

    public a90(a26 a26Var) {
        this.a = 20;
        this.b = a26Var;
        this.c = new ConcurrentHashMap();
    }

    public a90(l26 l26Var) {
        this.a = 21;
        this.b = l26Var;
        this.c = new ConcurrentHashMap();
    }

    public a90(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 24;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public a90(gu3 gu3Var) {
        this.a = 28;
        this.c = gu3Var;
    }
}

package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import coil3.compose.AsyncImagePainter;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.fy9;
import defpackage.pa7;
import io.sentry.android.core.b1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k47 implements j47, b67, s36, d52, n00, x00, hfe, pjb, ha1 {
    public static final k47 d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        d = new k47(2, new jy9(fValueOf2, fValueOf2), new jy9(fValueOf, fValueOf));
    }

    public k47(int i) {
        this.a = i;
        switch (i) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                break;
            case 14:
                this.b = new float[]{0.0f, 0.0f, 0.0f};
                this.c = new float[]{0.3f, 0.525f, 0.11f};
                break;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            default:
                this.b = ByteBuffer.allocateDirect(500);
                break;
            case 17:
                vg1 vg1Var = new vg1();
                vg1Var.a = vpf.o(pu4.a);
                this.b = vg1Var;
                this.c = new a90(16);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static k47 r(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new k47(25, channel, fileLockLock);
                } catch (IOException e) {
                    e = e;
                    b1.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    b1.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    b1.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    public ClipboardManager A() {
        ClipboardManager clipboardManager = (ClipboardManager) this.c;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.b).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.c = clipboardManager2;
        return clipboardManager2;
    }

    public l95 B(Object... objArr) {
        Constructor constructorB;
        synchronized (((AtomicBoolean) this.c)) {
            try {
                if (!((AtomicBoolean) this.c).get()) {
                    try {
                        constructorB = ((oo3) this.b).b();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.c).set(true);
                        constructorB = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorB = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorB == null) {
            return null;
        }
        try {
            return (l95) constructorB.newInstance(objArr);
        } catch (Exception e2) {
            ho7.r("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public InputMethodManager C() {
        return (InputMethodManager) ((lw7) this.c).getValue();
    }

    public KeyListener D(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof tt4)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new tt4(keyListener);
    }

    public ArrayList E(List list, List list2, u99 u99Var) {
        if (list.isEmpty()) {
            list = list2 == null ? pu4.a : list2;
        }
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (kya kyaVar : list) {
            kyaVar.getClass();
            u99Var.getClass();
            arrayList.add(((a90) this.c).C(kyaVar, u99Var));
        }
        return arrayList;
    }

    public void F(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, hbb.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            J(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public qt4 G(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ssg ssgVar = (ssg) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            w84 w84Var = (w84) ssgVar.b;
            if (!(inputConnection instanceof qt4)) {
                inputConnection = new qt4(editorInfo, inputConnection, (EditText) w84Var.b);
            }
            inputConnection2 = inputConnection;
        }
        return (qt4) inputConnection2;
    }

    public void H(nq5 nq5Var) {
        ft ftVar = (ft) this.c;
        oid oidVar = (oid) this.b;
        int i = nq5Var.b;
        if (i != 0) {
            ftVar.execute(new qa1(oidVar, i, 0));
        } else {
            ftVar.execute(new v36(13, oidVar, nq5Var.a));
        }
    }

    public void I() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            b1.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void J(boolean z) {
        bu4 bu4Var = (bu4) ((w84) ((ssg) this.c).b).c;
        if (bu4Var.c != z) {
            if (bu4Var.b != null) {
                jt4 jt4VarA = jt4.a();
                au4 au4Var = bu4Var.b;
                jt4VarA.getClass();
                ok8.n(au4Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jt4VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jt4VarA.b.remove(au4Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            bu4Var.c = z;
            if (z) {
                bu4.a(bu4Var.a, jt4.a().c());
            }
        }
    }

    public void K(ArrayList arrayList) {
        fl9 fl9Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((el9) arrayList.get(i)).a == 1) {
                try {
                    fl9Var = new fl9((el9) arrayList.get(i));
                } catch (dl9 unused) {
                    fl9Var = null;
                }
                this.c = fl9Var;
            }
        }
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        ((yl2) this.b).accept(new kq0(0, (Surface) this.c));
    }

    @Override // defpackage.n00
    public Object c(m0b m0bVar, kza kzaVar, tt7 tt7Var) {
        return null;
    }

    @Override // defpackage.x00
    public List d(m0b m0bVar, kza kzaVar) {
        List listN0 = kzaVar.n0();
        listN0.getClass();
        return E(listN0, null, m0bVar.a);
    }

    @Override // defpackage.x00
    public ArrayList f(vza vzaVar, u99 u99Var) {
        vzaVar.getClass();
        u99Var.getClass();
        List listP = vzaVar.P();
        listP.getClass();
        return E(listP, (List) vzaVar.m(((f51) this.b).k), u99Var);
    }

    @Override // defpackage.n00
    public Object g(m0b m0bVar, kza kzaVar, tt7 tt7Var) {
        hya hyaVar = (hya) vpf.F(kzaVar, ((f51) this.b).i);
        if (hyaVar == null) {
            return null;
        }
        return ((a90) this.c).T(tt7Var, hyaVar, m0bVar.a);
    }

    @Override // defpackage.x00
    public ArrayList h(a0b a0bVar, u99 u99Var) {
        a0bVar.getClass();
        u99Var.getClass();
        List listG = a0bVar.G();
        listG.getClass();
        return E(listG, (List) a0bVar.m(((f51) this.b).l), u99Var);
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        ok8.o("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof uae);
        ((yl2) this.b).accept(new kq0(1, (Surface) this.c));
    }

    @Override // defpackage.x00
    public List j(m0b m0bVar, yya yyaVar) {
        m0bVar.getClass();
        List listZ = yyaVar.z();
        listZ.getClass();
        return E(listZ, (List) yyaVar.m(((f51) this.b).h), m0bVar.a);
    }

    @Override // defpackage.x00
    public List k(m0b m0bVar, kza kzaVar) {
        List listH0 = kzaVar.h0();
        listH0.getClass();
        return E(listH0, null, m0bVar.a);
    }

    @Override // defpackage.x00
    public List l(m0b m0bVar, ut8 ut8Var, int i) {
        f51 f51Var = (f51) this.b;
        u99 u99Var = m0bVar.a;
        if (i == 0) {
            throw null;
        }
        if (ut8Var instanceof qya) {
            qya qyaVar = (qya) ut8Var;
            List listF = qyaVar.F();
            listF.getClass();
            return E(listF, (List) qyaVar.m(f51Var.b), u99Var);
        }
        if (ut8Var instanceof dza) {
            dza dzaVar = (dza) ut8Var;
            List listX = dzaVar.X();
            listX.getClass();
            return E(listX, (List) dzaVar.m(f51Var.d), u99Var);
        }
        if (!(ut8Var instanceof kza)) {
            pd4.i(ut8Var, "Unknown message: ");
            return null;
        }
        int iB = kv2.B(i);
        if (iB == 1) {
            kza kzaVar = (kza) ut8Var;
            List listG0 = kzaVar.g0();
            listG0.getClass();
            return E(listG0, (List) kzaVar.m(f51Var.e), u99Var);
        }
        if (iB == 2) {
            kza kzaVar2 = (kza) ut8Var;
            List listQ0 = kzaVar2.q0();
            listQ0.getClass();
            return E(listQ0, (List) kzaVar2.m(f51Var.f), u99Var);
        }
        if (iB != 3) {
            qc0.p("Unsupported callable kind with property proto");
            return null;
        }
        kza kzaVar3 = (kza) ut8Var;
        List listZ0 = kzaVar3.z0();
        listZ0.getClass();
        return E(listZ0, (List) kzaVar3.m(f51Var.g), u99Var);
    }

    @Override // defpackage.x00
    public List m(m0b m0bVar, ut8 ut8Var, int i, int i2, d0b d0bVar) {
        if (i == 0) {
            throw null;
        }
        List listN = d0bVar != null ? n(m0bVar, ut8Var, i, i2, d0bVar) : null;
        return listN == null ? pu4.a : listN;
    }

    @Override // defpackage.x00
    public List n(m0b m0bVar, ut8 ut8Var, int i, int i2, d0b d0bVar) {
        if (i == 0) {
            throw null;
        }
        d0bVar.getClass();
        List listF = d0bVar.F();
        listF.getClass();
        return E(listF, (List) d0bVar.m(((f51) this.b).j), m0bVar.a);
    }

    @Override // defpackage.pjb
    public eb7 o(ojb ojbVar, Object obj) {
        eb7 eb7VarO;
        rg2 rg2Var = (rg2) this.b;
        if (rg2Var == null) {
            rg2Var = null;
        }
        eb7 eb7Var = eb7.a;
        if (rg2Var == null || (eb7VarO = rg2Var.o(ojbVar, obj)) == null) {
            eb7VarO = eb7Var;
        }
        if (eb7VarO != eb7Var) {
            return eb7VarO;
        }
        g49 g49Var = (g49) this.c;
        g49Var.f = s72.R0(g49Var.f, new iy9(ojbVar, obj));
        return eb7.b;
    }

    @Override // defpackage.ha1
    public void p(u91 u91Var, qyb qybVar) {
        ((pp3) this.c).a.execute(new c0(this, (ha1) this.b, qybVar, 9));
    }

    @Override // defpackage.hfe
    public void q(bv6 bv6Var) {
        fy9 fy9VarK;
        sw6 sw6Var = (sw6) this.b;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.c;
        final fy9 fy9VarP = bv6Var != null ? cgg.p(bv6Var, sw6Var.a, asyncImagePainter.E0) : null;
        if (fy9VarP == null && ((Boolean) b21.z(sw6Var, ww6.a)).booleanValue() && (fy9VarK = asyncImagePainter.k()) != null) {
            fy9VarP = fy9VarK;
        }
        asyncImagePainter.o(new yg0(fy9VarP) { // from class: coil3.compose.AsyncImagePainter$State$Loading
            private final fy9 painter;

            {
                this.painter = fy9VarP;
            }

            @Override // defpackage.yg0
            /* JADX INFO: renamed from: a, reason: from getter */
            public final fy9 getPainter() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AsyncImagePainter$State$Loading) && pa7.t(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
            }

            public final int hashCode() {
                fy9 fy9Var = this.painter;
                if (fy9Var == null) {
                    return 0;
                }
                return fy9Var.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        });
    }

    @Override // defpackage.x00
    public List s(k0b k0bVar) {
        k0bVar.getClass();
        nya nyaVar = k0bVar.d;
        List listI0 = nyaVar.i0();
        listI0.getClass();
        return E(listI0, (List) nyaVar.m(((f51) this.b).c), k0bVar.a);
    }

    @Override // defpackage.x00
    public List t(m0b m0bVar, ut8 ut8Var, int i) {
        String str;
        u99 u99Var = m0bVar.a;
        if (i == 0) {
            throw null;
        }
        if (ut8Var instanceof dza) {
            List listE0 = ((dza) ut8Var).e0();
            listE0.getClass();
            return E(listE0, null, u99Var);
        }
        if (!(ut8Var instanceof kza)) {
            pd4.i(ut8Var, "Unknown message: ");
            return null;
        }
        int iB = kv2.B(i);
        if (iB == 1 || iB == 2 || iB == 3) {
            List listO0 = ((kza) ut8Var).o0();
            listO0.getClass();
            return E(listO0, null, u99Var);
        }
        if (i == 1) {
            str = "FUNCTION";
        } else if (i == 2) {
            str = "PROPERTY";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PROPERTY_SETTER";
        } else {
            str = "PROPERTY_GETTER";
        }
        throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
    }

    @Override // defpackage.b67
    public w57 toInstant() {
        throw new y57(((String) this.b) + " when parsing an Instant from \"" + hkg.R0((CharSequence) this.c, 64) + '\"');
    }

    public String toString() {
        switch (this.a) {
            case 19:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                p89 p89Var = (p89) this.b;
                Object[] objArr = p89Var.a;
                int i = p89Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    wv1 wv1Var = (wv1) objArr[i2];
                    int i3 = wv1Var.c;
                    int i4 = wv1Var.d;
                    int i5 = wv1Var.a;
                    int i6 = wv1Var.b;
                    StringBuilder sbN = ib8.n(i3, i4, "(", ",", ")->(");
                    sbN.append(i5);
                    sbN.append(",");
                    sbN.append(i6);
                    sbN.append(")");
                    sb.append(sbN.toString());
                    if (i2 < ((p89) this.b).c - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(wv1 wv1Var, int i, int i2, int i3, boolean z) {
        int i4;
        p89 p89Var = (p89) this.c;
        int i5 = p89Var.c;
        boolean z2 = true;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            r3.n("MutableVector is empty.");
            return;
        } else {
            wv1 wv1Var2 = (wv1) p89Var.a[i5 - 1];
            i4 = wv1Var2.b - wv1Var2.d;
        }
        if (wv1Var == null) {
            int i6 = i - i4;
            wv1Var = new wv1(z, i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (!wv1Var.e && !z) {
                z2 = false;
            }
            wv1Var.e = z2;
            if (wv1Var.a > i) {
                wv1Var.a = i;
                wv1Var.c = i;
            }
            int i7 = wv1Var.b;
            if (i2 > i7) {
                int i8 = i7 - wv1Var.d;
                wv1Var.b = i2;
                wv1Var.d = i2 - i8;
            } else {
                i2 = i7;
            }
            wv1Var.b = i2 + i3;
        }
        p89Var.b(wv1Var);
    }

    public void v() {
        ((p89) this.b).g();
    }

    @Override // defpackage.ha1
    public void w(u91 u91Var, Throwable th) {
        ((pp3) this.c).a.execute(new c0(this, (ha1) this.b, th));
    }

    public hu0[] x(Handler handler, t45 t45Var, t45 t45Var2, t45 t45Var3, t45 t45Var4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.b;
        ep8 ep8Var = new ep8(context);
        vd9 vd9Var = (vd9) this.c;
        ep8Var.c = vd9Var;
        ep8Var.d = 5000L;
        ep8Var.e = handler;
        ep8Var.f = t45Var;
        ep8Var.g = 50;
        pa7.J(!ep8Var.b);
        Handler handler2 = ep8Var.e;
        pa7.J((handler2 == null && ep8Var.f == null) || !(handler2 == null || ep8Var.f == null));
        ep8Var.b = true;
        arrayList.add(new gp8(ep8Var));
        fp3 fp3Var = new fp3(context);
        pa7.J(!fp3Var.b);
        fp3Var.b = true;
        if (((ta0) fp3Var.d) == null) {
            fp3Var.d = new ta0(new ak0[0]);
        }
        cl0 cl0Var = (cl0) fp3Var.f;
        so3 so3Var = (so3) fp3Var.g;
        if (cl0Var == null) {
            if (so3Var == null) {
                fp3Var.g = new so3(context);
            }
            if (((ndb) fp3Var.e) == null) {
                fp3Var.e = ndb.N0;
            }
            szc szcVar = new szc(context);
            bj0 bj0Var = context != null ? null : (bj0) fp3Var.c;
            Context context2 = (Context) szcVar.b;
            if (context2 == null) {
                szcVar.e = bj0Var;
            }
            so3 so3Var2 = (so3) fp3Var.g;
            szcVar.c = so3Var2;
            szcVar.d = (ndb) fp3Var.e;
            if (so3Var2 == null) {
                szcVar.c = new so3(context2);
            }
            fp3Var.f = new cl0(szcVar);
        } else {
            pa7.J(so3Var == null);
            pa7.J(((ndb) fp3Var.e) == null);
        }
        arrayList.add(new qo8((Context) this.b, vd9Var, handler, t45Var2, new jp3(fp3Var)));
        arrayList.add(new gue(t45Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new cv8(t45Var4, looper));
        }
        arrayList.add(new ah1());
        arrayList.add(new ow6(new dz0(context, 0)));
        return (hu0[]) arrayList.toArray(new hu0[0]);
    }

    public void y(qm3 qm3Var) {
        synchronized (qm3Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new fe(9, this, qm3Var));
        }
    }

    public Object z(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objD = ((a26) this.b).d(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objD);
        return objPutIfAbsent == null ? objD : objPutIfAbsent;
    }

    @Override // defpackage.pjb
    public void b() {
    }

    @Override // defpackage.pjb
    public void e(Object obj) {
    }

    public /* synthetic */ k47(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public k47(String str, n16 n16Var, gec gecVar) {
        this.a = 9;
        this.c = str;
        this.b = n16Var;
    }

    public k47(w09 w09Var, szc szcVar, f51 f51Var) {
        this.a = 8;
        w09Var.getClass();
        f51Var.getClass();
        this.b = f51Var;
        this.c = new a90(w09Var, szcVar);
    }

    public k47(a26 a26Var) {
        this.a = 21;
        this.b = a26Var;
        this.c = new ConcurrentHashMap();
    }

    public k47(k47 k47Var) {
        p89 p89Var;
        this.a = 19;
        this.b = new p89(0, new wv1[16]);
        this.c = new p89(0, new wv1[16]);
        if (k47Var == null || (p89Var = (p89) k47Var.b) == null) {
            return;
        }
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            wv1 wv1Var = (wv1) objArr[i2];
            ((p89) this.b).b(new wv1(wv1Var.e, wv1Var.a, wv1Var.b, wv1Var.c, wv1Var.d));
        }
    }

    public k47(hr7 hr7Var) {
        this.a = 23;
        this.b = hr7Var;
        this.c = new ArrayList();
    }

    public k47(EditText editText) {
        this.a = 10;
        this.b = editText;
        this.c = new ssg(editText);
    }

    public k47(ff5 ff5Var, of5 of5Var, di2 di2Var, wh2 wh2Var, Context context, String str, li2 li2Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = 22;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.c = new ii2(ff5Var, of5Var, di2Var, wh2Var, context, str, linkedHashSet, li2Var, scheduledExecutorService);
    }

    public k47(View view) {
        this.a = 0;
        this.b = view;
        this.c = eb3.N(z18.c, new zv6(2, this));
    }

    public /* synthetic */ k47(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public k47(pp3 pp3Var, ha1 ha1Var) {
        this.a = 27;
        this.c = pp3Var;
        this.b = ha1Var;
    }

    public k47(Context context) {
        this.a = 29;
        this.b = context;
        this.c = new vd9(14, context);
    }

    public k47(oo3 oo3Var) {
        this.a = 28;
        this.b = oo3Var;
        this.c = new AtomicBoolean(false);
    }

    public k47(CharSequence charSequence, String str) {
        this.a = 3;
        charSequence.getClass();
        this.b = str;
        this.c = charSequence;
    }
}

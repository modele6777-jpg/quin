package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class egh implements lw6, oo8, ut7 {
    public static final egh e;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;

    static {
        Object obj = null;
        e = new egh(true, obj, obj, 0);
    }

    public egh(yg1 yg1Var) {
        this.a = 5;
        yg1Var.getClass();
        this.c = yg1Var;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        this.b = iArr != null ? qd0.T(iArr, 18) : false;
        this.d = q6.g(yg1Var);
    }

    public static boolean e(qr4 qr4Var, qr4 qr4Var2) {
        int i;
        boolean zB = qr4Var2.b();
        int i2 = qr4Var2.a;
        if (zB) {
            int i3 = qr4Var.a;
            return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = qr4Var.b) == 0 || i == qr4Var2.b);
        }
        r82.e(qr4Var2, " not actually fully specified.", "Fully specified range ");
        return false;
    }

    public static boolean g(qr4 qr4Var, qr4 qr4Var2, Set set) {
        if (set.contains(qr4Var2)) {
            return e(qr4Var, qr4Var2);
        }
        if (!b21.F(3, "CXCP")) {
            return false;
        }
        Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + qr4Var + "\nCandidate dynamic range:\n  " + qr4Var2);
        return false;
    }

    public static qr4 i(qr4 qr4Var, LinkedHashSet linkedHashSet, Set set) {
        if (qr4Var.a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                qr4 qr4Var2 = (qr4) it.next();
                int i = qr4Var2.a;
                if (!qr4Var2.b()) {
                    qc0.p("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
                if (i != 1 && g(qr4Var, qr4Var2, set)) {
                    return qr4Var2;
                }
            }
        }
        return null;
    }

    public static void k(Set set, qr4 qr4Var, vd9 vd9Var) {
        Set set2 = set;
        ok8.o("Cannot update already-empty constraints.", !set2.isEmpty());
        vd9Var.getClass();
        qr4Var.getClass();
        Set setC = ((tr4) vd9Var.b).c(qr4Var);
        Set set3 = setC;
        if (set3.isEmpty()) {
            return;
        }
        Set setO1 = s72.o1(set);
        set.retainAll(set3);
        if (set2.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + qr4Var + "\nConstraints:\n  " + setC + "\nExisting constraints:\n  " + setO1).toString());
        }
    }

    public static egh o(String str) {
        return new egh(false, str, null, 0 == true ? 1 : 0);
    }

    public static egh p(Exception exc, String str) {
        return new egh(false, str, exc, 0 == true ? 1 : 0);
    }

    @Override // defpackage.lw6
    public iw6 A0() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new ls(imageAcquireNextImage);
        }
    }

    @Override // defpackage.lw6
    public void B() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.ut7
    public boolean a(j7f j7fVar, j7f j7fVar2) {
        boolean z = this.b;
        ca1 ca1Var = (ca1) this.c;
        ca1 ca1Var2 = (ca1) this.d;
        if (j7fVar.equals(j7fVar2)) {
            return true;
        }
        y22 y22VarM = j7fVar.m();
        y22 y22VarM2 = j7fVar2.m();
        if ((y22VarM instanceof c8f) && (y22VarM2 instanceof c8f)) {
            return hj6.F0.h((c8f) y22VarM, (c8f) y22VarM2, z, new fw0(6, ca1Var, ca1Var2));
        }
        return false;
    }

    public boolean b(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((w84) this.d).b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (kn2.E(((qia) obj).a, j)) {
                break;
            }
            i++;
        }
        qia qiaVar = (qia) obj;
        if (qiaVar != null) {
            return qiaVar.h;
        }
        return false;
    }

    @Override // defpackage.lw6
    public int c() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.lw6
    public void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    @Override // defpackage.lw6
    public int d() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // defpackage.lw6
    public Surface getSurface() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.oo8
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public mh0 f(hbc hbcVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        ro8 oh0Var;
        int i;
        String str = ((to8) hbcVar.a).a;
        mh0 mh0Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    oh0Var = new oh0(mediaCodecCreateByCodecName, (HandlerThread) ((lh0) this.d).get());
                    i = 0;
                } else {
                    oh0Var = new oid(1, mediaCodecCreateByCodecName);
                    i = 4;
                }
                mh0 mh0Var2 = new mh0(mediaCodecCreateByCodecName, (HandlerThread) ((lh0) this.c).get(), oh0Var, (zi8) hbcVar.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) hbcVar.d;
                    if (surface == null && ((to8) hbcVar.a).h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    mh0Var2.u((MediaFormat) hbcVar.b, surface, (MediaCrypto) hbcVar.e, i);
                    return mh0Var2;
                } catch (Exception e2) {
                    e = e2;
                    mh0Var = mh0Var2;
                    if (mh0Var != null) {
                        mh0Var.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // defpackage.lw6
    public void h0(final kw6 kw6Var, final Executor executor) {
        Handler handler;
        synchronized (this.d) {
            this.b = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: ms
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    egh eghVar = this.a;
                    Executor executor2 = executor;
                    kw6 kw6Var2 = kw6Var;
                    synchronized (eghVar.d) {
                        try {
                            if (!eghVar.b) {
                                executor2.execute(new fe(4, eghVar, kw6Var2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.c;
            if (nk8.a != null) {
                handler = nk8.a;
            } else {
                synchronized (nk8.class) {
                    try {
                        if (nk8.a == null) {
                            nk8.a = tq.r(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                handler = nk8.a;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0212  */
    /* JADX WARN: Code duplicated, block: B:82:0x021c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x023b A[EDGE_INSN: B:91:0x023b->B:95:0x0261 BREAK  A[LOOP:4: B:80:0x0216->B:125:0x0216]] */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x023b, please report this as an issue */
    public LinkedHashMap j(ArrayList arrayList, List list, List list2) {
        qr4 qr4Var;
        qr4 qr4VarI;
        Iterator it;
        qr4 qr4Var2;
        Set set;
        LinkedHashSet linkedHashSet;
        Iterator it2;
        qr4 qr4VarT;
        vd9 vd9Var = (vd9) this.d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            qr4 qr4Var3 = ((eo0) it3.next()).d;
            qr4Var3.getClass();
            linkedHashSet2.add(qr4Var3);
        }
        Set setA = ((tr4) vd9Var.b).a();
        Set setN1 = s72.n1(setA);
        Iterator it4 = linkedHashSet2.iterator();
        while (it4.hasNext()) {
            k(setN1, (qr4) it4.next(), vd9Var);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (true) {
            boolean zHasNext = it5.hasNext();
            qr4Var = qr4.c;
            if (!zHasNext) {
                break;
            }
            xjf xjfVar = (xjf) list.get(((Number) it5.next()).intValue());
            qr4 qr4Var4 = (qr4) xjfVar.a(wv6.E, qr4Var);
            qr4Var4.getClass();
            if (qr4Var4.equals(qr4Var)) {
                arrayList4.add(xjfVar);
            } else {
                int i = qr4Var4.a;
                int i2 = qr4Var4.b;
                if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
                    arrayList3.add(xjfVar);
                } else {
                    arrayList2.add(xjfVar);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            xjf xjfVar2 = (xjf) it6.next();
            qr4 qr4Var5 = (qr4) xjfVar2.a(wv6.E, qr4Var);
            qr4Var5.getClass();
            String str = (String) xjfVar2.c(kfe.a0);
            str.getClass();
            if (qr4Var5.b()) {
                linkedHashSet = linkedHashSet2;
                set = setA;
                it = it6;
                if (setN1.contains(qr4Var5)) {
                    qr4VarI = qr4Var5;
                    qr4Var2 = qr4Var;
                } else {
                    qr4Var2 = qr4Var;
                    qr4VarI = null;
                }
            } else {
                int i3 = qr4Var5.a;
                int i4 = qr4Var5.b;
                qr4 qr4Var6 = qr4.d;
                if (i3 != 1 || i4 != 0) {
                    qr4VarI = i(qr4Var5, linkedHashSet2, setN1);
                    it = it6;
                    qr4Var2 = qr4Var;
                    set = setA;
                    linkedHashSet = linkedHashSet2;
                    if (qr4VarI == null) {
                        qr4VarI = i(qr4Var5, linkedHashSet3, setN1);
                        if (qr4VarI == null) {
                            if (!g(qr4Var5, qr4Var6, setN1)) {
                                if (i3 != 2 || (i4 != 10 && i4 != 0)) {
                                    it2 = setN1.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            qr4VarI = null;
                                            break;
                                        }
                                        qr4VarI = (qr4) it2.next();
                                        if (qr4VarI.b()) {
                                            qc0.p("Candidate dynamic range must be fully specified.");
                                            return null;
                                        }
                                        if (!qr4VarI.equals(qr4Var6) && e(qr4Var5, qr4VarI)) {
                                            if (b21.F(3, "CXCP")) {
                                                break;
                                            }
                                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + qr4Var5 + "\n->\n" + qr4VarI);
                                            break;
                                        }
                                    }
                                } else {
                                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        qr4VarT = q6.t((yg1) this.c);
                                        if (qr4VarT != null) {
                                            linkedHashSet4.add(qr4VarT);
                                        }
                                    } else {
                                        qr4VarT = null;
                                    }
                                    linkedHashSet4.add(qr4.e);
                                    qr4 qr4VarI2 = i(qr4Var5, linkedHashSet4, setN1);
                                    if (qr4VarI2 == null) {
                                        it2 = setN1.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                qr4VarI = null;
                                                break;
                                            }
                                            qr4VarI = (qr4) it2.next();
                                            if (qr4VarI.b()) {
                                                qc0.p("Candidate dynamic range must be fully specified.");
                                                return null;
                                            }
                                            if (!qr4VarI.equals(qr4Var6)) {
                                                if (b21.F(3, "CXCP")) {
                                                    break;
                                                }
                                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + qr4Var5 + "\n->\n" + qr4VarI);
                                                break;
                                            }
                                        }
                                    } else {
                                        if (b21.F(3, "CXCP")) {
                                            StringBuilder sbP = tec.p("DynamicRangeResolver: Resolved dynamic range for use case ", str, "from ");
                                            sbP.append(qr4VarI2.equals(qr4VarT) ? "recommended" : "required");
                                            sbP.append(" 10-bit supported dynamic range.\n");
                                            sbP.append(qr4Var5);
                                            sbP.append("\n->\n");
                                            sbP.append(qr4VarI2);
                                            Log.d("CXCP", sbP.toString());
                                        }
                                        qr4VarI = qr4VarI2;
                                    }
                                }
                            } else if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " to no compatible HDR dynamic ranges.\n" + qr4Var5 + "\n->\n" + qr4Var6);
                            }
                        } else if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from concurrently bound use case.\n" + qr4Var5 + "\n->\n" + qr4VarI);
                        }
                    } else if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from existing attached surface.\n" + qr4Var5 + "\n->\n" + qr4VarI);
                    }
                } else if (setN1.contains(qr4Var6)) {
                    linkedHashSet = linkedHashSet2;
                    set = setA;
                    it = it6;
                    qr4Var2 = qr4Var;
                } else {
                    qr4VarI = null;
                    linkedHashSet = linkedHashSet2;
                    set = setA;
                    it = it6;
                    qr4Var2 = qr4Var;
                }
                qr4VarI = qr4Var6;
            }
            if (qr4VarI == null) {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) xjfVar2.c(kfe.a0)) + "\nRequested dynamic range:\n  " + qr4Var5 + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + setN1);
            }
            k(setN1, qr4VarI, vd9Var);
            linkedHashMap.put(xjfVar2, qr4VarI);
            linkedHashSet2 = linkedHashSet;
            if (!linkedHashSet2.contains(qr4VarI)) {
                linkedHashSet3.add(qr4VarI);
            }
            it6 = it;
            qr4Var = qr4Var2;
            setA = set;
        }
        return linkedHashMap;
    }

    public String l() {
        return (String) this.c;
    }

    public void m(xch xchVar) {
        synchronized (this.c) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.d;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.d = arrayDeque;
                }
                arrayDeque.add(xchVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(Task task) {
        xch xchVar;
        synchronized (this.c) {
            if (((ArrayDeque) this.d) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.c) {
                        try {
                            xchVar = (xch) ((ArrayDeque) this.d).poll();
                            if (xchVar == null) {
                                this.b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    xchVar.b(task);
                }
            }
        }
    }

    @Override // defpackage.lw6
    public iw6 q() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new ls(imageAcquireLatestImage);
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "JavaTypeEnhancementState(jsr305=" + ((nj7) this.c) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lw6
    public int v() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.lw6
    public int v0() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    public /* synthetic */ egh(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    public egh(nj7 nj7Var, x xVar) {
        this.a = 7;
        this.c = nj7Var;
        this.d = xVar;
        this.b = nj7Var.d || xVar.d(jf7.a) == csb.IGNORE;
    }

    public egh(gg8 gg8Var, w84 w84Var) {
        this.a = 6;
        this.c = gg8Var;
        this.d = w84Var;
    }

    public egh(sf9 sf9Var, una unaVar) {
        this.a = 8;
        this.b = false;
        this.c = sf9Var;
        this.d = unaVar;
    }

    public egh() {
        this.a = 9;
        this.c = new Object();
    }

    public egh(ImageReader imageReader) {
        this.a = 1;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public egh(fu0 fu0Var) {
        this.a = 3;
        fu0Var.getClass();
        this.c = fu0Var;
        this.d = new d82();
    }

    public egh(lh0 lh0Var, lh0 lh0Var2) {
        this.a = 2;
        this.c = lh0Var;
        this.d = lh0Var2;
        this.b = true;
    }
}

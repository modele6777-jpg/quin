package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.k;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class psd implements goe, h1b, x7e, cfg, xm9, ypb, h8h {
    public static psd e;
    public static psd f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public psd(ng1 ng1Var, Size size) {
        Rational rational;
        this.a = 2;
        this.b = ng1Var;
        ng1Var.b();
        ng1Var.m();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listT = ng1Var.t(256);
            if (listT.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listT, new qa2(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.c = rational;
        gg6 gg6Var = new gg6();
        gg6Var.a = ng1Var.b();
        gg6Var.b = ng1Var.m();
        gg6Var.d = rational;
        gg6Var.c = rational == null || rational.getNumerator() >= rational.getDenominator();
        this.d = gg6Var;
    }

    public static void B(List list, Size size) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        list.addAll(arrayList);
    }

    public static Object e(gfh gfhVar) throws IOException {
        try {
            return Tasks.await(gfhVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        }
    }

    public static ArrayList s(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ae0.a);
        arrayList2.add(ae0.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!ae0.a((Rational) it2.next(), size));
            }
        }
        return arrayList2;
    }

    public static Rational u(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? ae0.a : ae0.b;
        }
        if (i == 1) {
            return z ? ae0.c : ae0.d;
        }
        b21.v("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap v(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = s(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (ae0.a(rational, size)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static psd x(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new psd(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A(Object obj) {
        long jK = o8c.k();
        if (jK == mwe.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            iwe iweVar = (iwe) ((AtomicReference) this.b).get();
            int iA = iweVar.a(jK);
            if (iA < 0) {
                ((AtomicReference) this.b).set(iweVar.b(jK, obj));
            } else {
                iweVar.c[iA] = obj;
            }
        }
    }

    public void C() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        Object obj = this.c;
        if (obj != null) {
            try {
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                Iterator it = s72.j1(collectionValues).iterator();
                while (it.hasNext()) {
                    ((a26) it.next()).d(obj);
                }
            } catch (Throwable th) {
                linkedHashMap.clear();
                this.c = null;
                jhe.a.d(obj);
                throw th;
            }
        }
        linkedHashMap.clear();
        this.c = null;
        if (obj != null) {
            jhe.a.d(obj);
        }
    }

    public File D() {
        String str = (String) ((u8e) this.c).get();
        String str2 = (String) ((u8e) this.d).get();
        return new File(ks0.m(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    public void E(Throwable th) {
        boolean z = th instanceof TimeoutException;
        fwg fwgVar = (fwg) this.d;
        if (z) {
            fwgVar.G(z5h.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, swg.q);
            zsg.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            fwgVar.G(z5h.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, swg.q);
            zsg.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((qe) this.c).run();
    }

    public synchronized void F(long j, int i, int i2, long j2) {
        ((w3h) this.b).y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        gfh gfhVarC = ((a97) this.c).c(new ole(0, Arrays.asList(new mv8(36301, i, 0, j, j2, null, null, 0, i2))));
        zy1 zy1Var = new zy1(this, jElapsedRealtime);
        gfhVarC.getClass();
        gfhVarC.d(hle.a, zy1Var);
    }

    public void G(Object obj, String str) {
        psd psdVar = new psd(22, (char) 0);
        ((psd) this.d).d = psdVar;
        this.d = psdVar;
        psdVar.c = obj;
        psdVar.b = str;
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-805916189);
        int i2 = i | (l46Var2.g(this) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            use useVar = (use) this.b;
            String str = (String) this.c;
            mue mueVar = (mue) this.d;
            xn8 xn8VarC = s21.c(ndb.b, true);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, g09.a);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            if (useVar.d().c.length() == 0) {
                l46Var2.f0(979801124);
                nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVar, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), l46Var, 0, 0, 131070);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(979944313);
                l46Var2.r(false);
            }
            tec.q(6, dd2Var, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(this, dd2Var, i, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r10
  0x0033: PHI (r10v8 int) = (r10v1 int), (r10v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // defpackage.h8h, defpackage.b1h
    public void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        q8h q8hVar;
        c8h c8hVar = (c8h) this.c;
        c8hVar.A0();
        qbh qbhVar = (qbh) this.d;
        if (i == 200 || i == 204) {
            if (th == null) {
                w0h w0hVar = ((w3h) c8hVar.b).f;
                w3h.h(w0hVar);
                w0hVar.Z.b(Long.valueOf(qbhVar.a), "[sgtm] Upload succeeded for row_id");
                q8hVar = q8h.SUCCESS;
            } else {
                w0h w0hVar2 = ((w3h) c8hVar.b).f;
                w3h.h(w0hVar2);
                w0hVar2.x.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(qbhVar.a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) bzg.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    q8hVar = q8h.BACKOFF;
                } else {
                    q8hVar = q8h.FAILURE;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                w0h w0hVar3 = ((w3h) c8hVar.b).f;
                w3h.h(w0hVar3);
                w0hVar3.Z.b(Long.valueOf(qbhVar.a), "[sgtm] Upload succeeded for row_id");
                q8hVar = q8h.SUCCESS;
            } else {
                w0h w0hVar4 = ((w3h) c8hVar.b).f;
                w3h.h(w0hVar4);
                w0hVar4.x.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(qbhVar.a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) bzg.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    q8hVar = q8h.BACKOFF;
                } else {
                    q8hVar = q8h.FAILURE;
                }
            }
        } else {
            w0h w0hVar5 = ((w3h) c8hVar.b).f;
            w3h.h(w0hVar5);
            w0hVar5.x.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(qbhVar.a), Integer.valueOf(i), th);
            if (Arrays.asList(((String) bzg.u.a(null)).split(",")).contains(String.valueOf(i))) {
                q8hVar = q8h.BACKOFF;
            } else {
                q8hVar = q8h.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.b;
        lah lahVarJ = ((w3h) c8hVar.b).j();
        long j = qbhVar.a;
        mng mngVar = new mng(j, q8hVar.a(), qbhVar.f);
        lahVarJ.A0();
        lahVarJ.B0();
        lahVarJ.O0(new qe(lahVarJ, lahVarJ.Q0(true), mngVar, false, 16));
        w0h w0hVar6 = ((w3h) c8hVar.b).f;
        w3h.h(w0hVar6);
        w0hVar6.Z.c(Long.valueOf(j), q8hVar, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(q8hVar);
            atomicReference.notifyAll();
        }
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        d7h d7hVar = (d7h) ((g7h) obj).l();
        i6h i6hVar = new i6h((w6h) this.b, (gn2) this.d);
        String str = (String) this.c;
        Parcel parcelJ = d7hVar.J();
        parcelJ.writeString(str);
        lsg.c(parcelJ, i6hVar);
        d7hVar.K(parcelJ, 28);
    }

    public ArrayList b(String str) {
        int i = 0;
        switch (this.a) {
            case 15:
                ArrayList<String> stringArrayList = ((Bundle) this.c).getStringArrayList(str);
                if (stringArrayList == null) {
                    return new ArrayList();
                }
                String[] strArr = new String[stringArrayList.size()];
                while (i < stringArrayList.size()) {
                    String str2 = stringArrayList.get(i);
                    if (str2 == null) {
                        str2 = "";
                    }
                    strArr[i] = str2;
                    i++;
                }
                kb6 kb6Var = (kb6) this.d;
                ((LinkedHashMap) kb6Var.b).put(((String) this.b).concat(str), strArr);
                return stringArrayList;
            default:
                String[] strArrE = ((bb3) this.c).e(((String) this.b).concat(str));
                if (strArrE == null) {
                    return new ArrayList();
                }
                ArrayList<String> arrayList = new ArrayList<>(strArrE.length);
                while (i < strArrE.length) {
                    String str3 = strArrE[i];
                    if (true == str3.isEmpty()) {
                        str3 = null;
                    }
                    arrayList.add(str3);
                    i++;
                }
                ((Bundle) this.d).putStringArrayList(str, arrayList);
                return arrayList;
        }
    }

    @Override // defpackage.x7e
    public int c(long j) {
        long[] jArr = (long[]) this.d;
        int iA = pqf.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.a) {
            case 18:
                psd psdVar = new psd(((zjg) this.b).clone());
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) psdVar.d).add(((zjg) it.next()).clone());
                }
                return psdVar;
            default:
                return super.clone();
        }
    }

    public Object d(Object obj, vx7 vx7Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        linkedHashMap.put(obj, vx7Var);
        Object objInvoke = this.c;
        if (objInvoke == null) {
            try {
                objInvoke = ((ond) this.b).invoke();
                this.c = objInvoke;
            } catch (Throwable th) {
                linkedHashMap.remove(obj);
                throw th;
            }
        }
        while (linkedHashMap.size() > 2) {
            Set setEntrySet = linkedHashMap.entrySet();
            setEntrySet.getClass();
            Object objU0 = s72.u0(setEntrySet);
            objU0.getClass();
            Map.Entry entry = (Map.Entry) objU0;
            linkedHashMap.remove(entry.getKey());
            ((a26) entry.getValue()).d(objInvoke);
        }
        return objInvoke;
    }

    @Override // defpackage.x7e
    public long f(int i) {
        long[] jArr = (long[]) this.d;
        pa7.A(i >= 0);
        pa7.A(i < jArr.length);
        return jArr[i];
    }

    public void g(String str) {
        switch (this.a) {
            case 15:
                Bundle bundle = (Bundle) this.c;
                String str2 = (String) this.b;
                kb6 kb6Var = (kb6) this.d;
                ((LinkedHashMap) kb6Var.b).put(str2.concat(str), Integer.valueOf(bundle.getInt(str)));
                break;
            default:
                ((Bundle) this.d).putInt(str, ((bb3) this.c).b(0, ((String) this.b).concat(str)));
                break;
        }
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 0:
                long jK = o8c.k();
                if (jK == mwe.a) {
                    return this.d;
                }
                iwe iweVar = (iwe) ((AtomicReference) this.b).get();
                int iA = iweVar.a(jK);
                if (iA >= 0) {
                    return iweVar.c[iA];
                }
                return null;
            default:
                return new f4f(new w1e(10), new g3e(7), (ks3) ((a82) this.b).get(), (lp0) ((hc2) this.c).get(), (kxa) ((kxa) this.d).get());
        }
    }

    public void h(iae iaeVar, Map.Entry entry) {
        iae iaeVar2 = (iae) entry.getValue();
        b21.q("SurfaceProcessorNode", "     -> outputEdge = " + iaeVar2);
        iq0 iq0Var = null;
        iq0 iq0Var2 = new iq0(iaeVar.g.a, ((qp0) entry.getKey()).d, iaeVar.c ? (pg1) this.c : null, ((qp0) entry.getKey()).f, ((qp0) entry.getKey()).g);
        int i = ((qp0) entry.getKey()).c;
        iaeVar2.getClass();
        p8c.m();
        iaeVar2.a();
        ok8.o("Consumer can only be linked once.", !iaeVar2.j);
        iaeVar2.j = true;
        hae haeVar = iaeVar2.l;
        tv1 tv1VarD0 = bm8.d0(haeVar.c(), new fae(iaeVar2, haeVar, i, iq0Var2, iq0Var), ok8.w());
        tv1VarD0.b(new w36(0 == true ? 1 : 0, tv1VarD0, new vea(this, iaeVar2, false, 13)), ok8.w());
    }

    public void i(String str) {
        switch (this.a) {
            case 15:
                m(0L, str);
                break;
            default:
                m(0L, str);
                break;
        }
    }

    @Override // defpackage.x7e
    public List j(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                o1g o1gVar = (o1g) list.get(i);
                t03 t03Var = o1gVar.a;
                if (t03Var.e == -3.4028235E38f) {
                    arrayList2.add(o1gVar);
                } else {
                    arrayList.add(t03Var);
                }
            }
        }
        Collections.sort(arrayList2, new v1g(0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            s03 s03VarA = ((o1g) arrayList2.get(i3)).a.a();
            s03VarA.e = (-1) - i3;
            s03VarA.f = 1;
            arrayList.add(s03VarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.xm9
    public /* synthetic */ void k(Task task) {
        w7c w7cVar = (w7c) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        wid widVar = w7cVar.a;
        synchronized (widVar) {
            widVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.x7e
    public int l() {
        return ((long[]) this.d).length;
    }

    public void m(long j, String str) {
        switch (this.a) {
            case 15:
                Bundle bundle = (Bundle) this.c;
                String str2 = (String) this.b;
                kb6 kb6Var = (kb6) this.d;
                ((LinkedHashMap) kb6Var.b).put(str2.concat(str), Long.valueOf(bundle.getLong(str, j)));
                break;
            default:
                String str3 = (String) this.b;
                bb3 bb3Var = (bb3) this.c;
                String strConcat = str3.concat(str);
                bb3Var.getClass();
                Object objValueOf = Long.valueOf(j);
                Object obj = bb3Var.a.get(strConcat);
                if (obj instanceof Long) {
                    objValueOf = obj;
                }
                ((Bundle) this.d).putLong(str, ((Number) objValueOf).longValue());
                break;
        }
    }

    public void n(String str) {
        switch (this.a) {
            case 15:
                String string = ((Bundle) this.c).getString(str);
                if (string != null) {
                    kb6 kb6Var = (kb6) this.d;
                    ((LinkedHashMap) kb6Var.b).put(((String) this.b).concat(str), string);
                    break;
                }
                break;
            default:
                ((Bundle) this.d).putString(str, ((bb3) this.c).d(((String) this.b).concat(str)));
                break;
        }
    }

    public ColorStateList o(int i) {
        int resourceId;
        ColorStateList colorStateListS;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListS = bp.s((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListS;
    }

    public Drawable p(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : x57.T((Context) this.b, resourceId);
    }

    public Drawable q(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        s80 s80VarA = s80.a();
        Context context = (Context) this.b;
        synchronized (s80VarA) {
            drawableE = s80VarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface r(int i, int i2, p90 p90Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.d;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.d = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.b;
        ThreadLocal threadLocal = hyb.a;
        if (context.isRestricted()) {
            return null;
        }
        return hyb.b(context, resourceId, typedValue2, i2, p90Var, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    public ArrayList t(xjf xjfVar) {
        Size[] sizeArr;
        Rational rational;
        ng1 ng1Var = (ng1) this.b;
        ew6 ew6Var = (ew6) xjfVar;
        List list = (List) ew6Var.a(ew6.O, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null) {
            return arrayList;
        }
        nxb nxbVar = (nxb) ew6Var.a(ew6.N, null);
        List list2 = (List) ew6Var.a(ew6.M, null);
        int iL = xjfVar.l();
        if (list2 == null) {
            sizeArr = null;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == iL) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = ng1Var.t(iL);
        }
        ArrayList arrayList2 = new ArrayList(listAsList);
        boolean z = true;
        Collections.sort(arrayList2, new qa2(true));
        if (arrayList2.isEmpty()) {
            b21.W("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iL + ".");
        }
        if (nxbVar != null) {
            Size size = (Size) ((ew6) xjfVar).a(ew6.L, null);
            ew6Var.A(0);
            if (!((Boolean) xjfVar.a(xjf.o0, Boolean.FALSE)).booleanValue()) {
                int iL2 = xjfVar.l();
                if (nxbVar.c == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(ng1Var.o(iL2));
                    Collections.sort(arrayList3, new qa2(true));
                    arrayList2 = arrayList3;
                }
            }
            b21.q("SupportedOutputSizesCollector", "useCaseConfig = " + xjfVar + ", candidateSizes = " + arrayList2);
            nxb nxbVar2 = (nxb) ew6Var.c(ew6.N);
            Rational rational2 = (Rational) this.c;
            af8 af8Var = nxbVar2.a;
            HashMap mapV = v(arrayList2);
            if (rational2 != null && rational2.getNumerator() < rational2.getDenominator()) {
                z = false;
            }
            af8Var.getClass();
            Rational rationalU = u(0, z);
            ArrayList<Rational> arrayList4 = new ArrayList(mapV.keySet());
            Collections.sort(arrayList4, new zd0(rationalU, rational2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Rational rational3 : arrayList4) {
                linkedHashMap.put(rational3, (List) mapV.get(rational3));
            }
            if (size != null) {
                Size size2 = jld.a;
                int height = size.getHeight() * size.getWidth();
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (it2.hasNext()) {
                    List<Size> list3 = (List) linkedHashMap.get((Rational) it2.next());
                    ArrayList arrayList5 = new ArrayList();
                    for (Size size3 : list3) {
                        if (jld.a(size3) <= height) {
                            arrayList5.add(size3);
                        }
                    }
                    list3.clear();
                    list3.addAll(arrayList5);
                }
            }
            ndb ndbVar = nxbVar2.b;
            if (ndbVar != null) {
                Iterator it3 = linkedHashMap.keySet().iterator();
                while (it3.hasNext()) {
                    List list4 = (List) linkedHashMap.get((Rational) it3.next());
                    if (!list4.isEmpty() && ndbVar != ndb.j1) {
                        boolean zContains = list4.contains(null);
                        list4.clear();
                        if (zContains) {
                            list4.add(null);
                        }
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = linkedHashMap.values().iterator();
            while (it4.hasNext()) {
                for (Size size4 : (List) it4.next()) {
                    if (!arrayList6.contains(size4)) {
                        arrayList6.add(size4);
                    }
                }
            }
            return arrayList6;
        }
        gg6 gg6Var = (gg6) this.d;
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList<Size> arrayList7 = new ArrayList(arrayList2);
        Collections.sort(arrayList7, new qa2(true));
        ArrayList arrayList8 = new ArrayList();
        ew6 ew6Var2 = (ew6) xjfVar;
        Size size5 = (Size) ew6Var2.a(ew6.L, null);
        Size size6 = (Size) arrayList7.get(0);
        if (size5 == null) {
            size5 = size6;
        } else if (jld.a(size6) < size5.getHeight() * size5.getWidth()) {
            size5 = size6;
        }
        Size sizeA = gg6Var.a(ew6Var2);
        Size size7 = jld.b;
        int iA = jld.a(size7);
        if (jld.a(size5) < iA) {
            size7 = jld.a;
        } else if (sizeA != null) {
            if (sizeA.getHeight() * sizeA.getWidth() < iA) {
                size7 = sizeA;
            }
        }
        for (Size size8 : arrayList7) {
            if (jld.a(size8) <= size5.getHeight() * size5.getWidth()) {
                if (size8.getHeight() * size8.getWidth() >= jld.a(size7) && !arrayList8.contains(size8)) {
                    arrayList8.add(size8);
                }
            }
        }
        if (arrayList8.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size7 + "\nmaxSize = " + size5 + "\ninitial size list: " + arrayList7);
        }
        no0 no0Var = ew6.F;
        if (ew6Var2.h(no0Var)) {
            rational = u(((Integer) ew6Var2.c(no0Var)).intValue(), gg6Var.c);
        } else {
            Size sizeA2 = gg6Var.a(ew6Var2);
            if (sizeA2 != null) {
                Iterator it5 = s(arrayList8).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        rational = new Rational(sizeA2.getWidth(), sizeA2.getHeight());
                        break;
                    }
                    Rational rational4 = (Rational) it5.next();
                    if (ae0.a(rational4, sizeA2)) {
                        rational = rational4;
                        break;
                    }
                }
            } else {
                rational = null;
            }
        }
        if (sizeA == null) {
            sizeA = (Size) ew6Var2.a(ew6.K, null);
        }
        ArrayList arrayList9 = new ArrayList();
        new HashMap();
        if (rational == null) {
            arrayList9.addAll(arrayList8);
            if (sizeA != null) {
                B(arrayList9, sizeA);
                return arrayList9;
            }
        } else {
            HashMap mapV2 = v(arrayList8);
            if (sizeA != null) {
                Iterator it6 = mapV2.keySet().iterator();
                while (it6.hasNext()) {
                    B((List) mapV2.get((Rational) it6.next()), sizeA);
                }
            }
            ArrayList arrayList10 = new ArrayList(mapV2.keySet());
            Collections.sort(arrayList10, new zd0(rational, (Rational) gg6Var.d));
            Iterator it7 = arrayList10.iterator();
            while (it7.hasNext()) {
                for (Size size9 : (List) mapV2.get((Rational) it7.next())) {
                    if (!arrayList9.contains(size9)) {
                        arrayList9.add(size9);
                    }
                }
            }
        }
        return arrayList9;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 23:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                gsg gsgVar = (gsg) ((gsg) this.c).b;
                while (gsgVar != null) {
                    Object obj = gsgVar.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    gsgVar = (gsg) gsgVar.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 24:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                psd psdVar = (psd) ((psd) this.c).d;
                while (psdVar != null) {
                    Object obj2 = psdVar.c;
                    sb2.append(str);
                    String str2 = (String) psdVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    psdVar = (psd) psdVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public boolean w() {
        if (((h0e) this.b).getValue() != this.c) {
            return true;
        }
        psd psdVar = (psd) this.d;
        return psdVar != null && psdVar.w();
    }

    public void y(String str, String str2, String str3, String str4) throws IOException {
        ff5 ff5Var = (ff5) this.c;
        if (str2 == null || str3 == null) {
            yg5.m("FIS auth token or FIS ID is empty");
            return;
        }
        ff5Var.a();
        wf5 wf5Var = ff5Var.c;
        String str5 = wf5Var.h;
        ff5Var.a();
        String str6 = wf5Var.a;
        if (str5 == null) {
            yg5.m("Project ID or API Key is missing");
            return;
        }
        URL url = new URL(ib8.m(ib8.o("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, ":", str4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sbO = ib8.o("Topic ", str4, " for: ", str, " with url: ");
            sbO.append(url);
            Log.d("FirebaseMessaging", sbO.toString());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", tec.m("Topic ", str4, " for: ", str, " succeeded."));
                        return;
                    }
                    return;
                }
                if (responseCode == 404 || responseCode == 403) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        StringBuilder sbP = tec.p("Topic ", str4, " failed: ");
                        sbP.append(httpURLConnection.getResponseMessage());
                        Log.d("FirebaseMessaging", sbP.toString());
                    }
                    StringBuilder sbP2 = tec.p("Topic ", str4, " failed: ");
                    sbP2.append(httpURLConnection.getResponseMessage());
                    throw new IOException(sbP2.toString());
                }
                if (responseCode >= 500) {
                    yg5.m("INTERNAL_SERVER_ERROR");
                    return;
                }
                throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
            } catch (IOException e2) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e2);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void z() {
        ((TypedArray) this.c).recycle();
    }

    public psd(bfg bfgVar, yea yeaVar, bfg bfgVar2, bfg bfgVar3) {
        this.a = 17;
        this.b = bfgVar;
        this.c = yeaVar;
        this.d = bfgVar2;
    }

    public /* synthetic */ psd(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public psd(log logVar, log logVar2, Object obj) {
        this.a = 20;
        this.b = logVar;
        this.d = logVar2;
        this.c = obj;
    }

    public /* synthetic */ psd(c8h c8hVar, AtomicReference atomicReference, qbh qbhVar) {
        this.a = 28;
        this.c = c8hVar;
        this.b = atomicReference;
        this.d = qbhVar;
    }

    public psd(Context context, w3h w3hVar) {
        this.a = 26;
        this.d = new AtomicLong(-1L);
        this.c = new a97(context, a97.n, new ple("measurement:api"), yb6.c);
        this.b = w3hVar;
    }

    public /* synthetic */ psd(String str, bb3 bb3Var) {
        this.a = 16;
        this.d = new Bundle();
        this.b = str;
        this.c = bb3Var;
    }

    public psd(final xlg xlgVar, final String str) {
        this.a = 29;
        this.b = ut0.d;
        final int i = 1;
        this.c = vtb.r(new u8e(this) { // from class: x9h
            public final /* synthetic */ psd b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.u8e
            public final Object get() {
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i2 = i;
                Serializable serializable = xlgVar;
                psd psdVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = rh6.a;
                        qp8 qp8VarC = g69.z.c0().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = (ByteBuffer) qp8VarC.d;
                        byteBuffer.put((byte) 0);
                        char c = '\b';
                        if (byteBuffer.remaining() < 8) {
                            qp8VarC.a();
                        }
                        qp8 qp8VarC2 = qp8VarC.c("".getBytes());
                        qp8VarC2.a();
                        ByteBuffer byteBuffer2 = (ByteBuffer) qp8VarC2.d;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            qp8VarC2.c = byteBuffer2.remaining() + qp8VarC2.c;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    j5 = 0;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    qc0.i("Should never get here.");
                                    return null;
                            }
                        }
                        long j9 = qp8VarC2.a;
                        long j10 = qp8VarC2.c;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ qp8VarC2.b;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        qp8VarC2.a = j20;
                        qp8VarC2.b = j19 + j20;
                        byte[] bArr = (byte[]) new nh6(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(qp8VarC2.a).putLong(qp8VarC2.b).array()).bytes.clone();
                        tt0 tt0Var = (tt0) psdVar.b;
                        tt0Var.getClass();
                        return tt0Var.a(bArr, bArr.length);
                    default:
                        tt0 tt0Var2 = (tt0) psdVar.b;
                        byte[] bArrN = ((xlg) serializable).n();
                        tt0Var2.getClass();
                        return tt0Var2.a(bArrN, bArrN.length);
                }
            }
        });
        final int i2 = 0;
        this.d = vtb.r(new u8e(this) { // from class: x9h
            public final /* synthetic */ psd b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.u8e
            public final Object get() {
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i3 = i2;
                Serializable serializable = str;
                psd psdVar = this.b;
                switch (i3) {
                    case 0:
                        int i4 = rh6.a;
                        qp8 qp8VarC = g69.z.c0().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = (ByteBuffer) qp8VarC.d;
                        byteBuffer.put((byte) 0);
                        char c = '\b';
                        if (byteBuffer.remaining() < 8) {
                            qp8VarC.a();
                        }
                        qp8 qp8VarC2 = qp8VarC.c("".getBytes());
                        qp8VarC2.a();
                        ByteBuffer byteBuffer2 = (ByteBuffer) qp8VarC2.d;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            qp8VarC2.c = byteBuffer2.remaining() + qp8VarC2.c;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    j5 = 0;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                                    j7 = byteBuffer2.getLong();
                                    qp8VarC2.a = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ qp8VarC2.a;
                                    qp8VarC2.b ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    qc0.i("Should never get here.");
                                    return null;
                            }
                        }
                        long j9 = qp8VarC2.a;
                        long j10 = qp8VarC2.c;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ qp8VarC2.b;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        qp8VarC2.a = j20;
                        qp8VarC2.b = j19 + j20;
                        byte[] bArr = (byte[]) new nh6(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(qp8VarC2.a).putLong(qp8VarC2.b).array()).bytes.clone();
                        tt0 tt0Var = (tt0) psdVar.b;
                        tt0Var.getClass();
                        return tt0Var.a(bArr, bArr.length);
                    default:
                        tt0 tt0Var2 = (tt0) psdVar.b;
                        byte[] bArrN = ((xlg) serializable).n();
                        tt0Var2.getClass();
                        return tt0Var2.a(bArrN, bArrN.length);
                }
            }
        });
    }

    public psd(fwg fwgVar, is4 is4Var, qe qeVar) {
        this.a = 25;
        this.b = is4Var;
        this.c = qeVar;
        this.d = fwgVar;
    }

    public psd(String str, int i) {
        this.a = i;
        switch (i) {
            case 24:
                psd psdVar = new psd(22, (char) 0);
                this.c = psdVar;
                this.d = psdVar;
                this.b = str;
                break;
            default:
                gsg gsgVar = new gsg();
                this.c = gsgVar;
                this.d = gsgVar;
                this.b = str;
                break;
        }
    }

    public psd(zjg zjgVar) {
        this.a = 18;
        this.b = zjgVar;
        this.c = zjgVar.clone();
        this.d = new ArrayList();
    }

    public psd(int i, byte b) {
        this.a = i;
        switch (i) {
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
            case 18:
                this.b = new zjg("", 0L, null);
                this.c = new zjg("", 0L, null);
                this.d = new ArrayList();
                break;
            default:
                this.b = new AtomicReference(t72.p);
                this.c = new Object();
                break;
        }
    }

    public psd(ArrayList arrayList) {
        this.a = 14;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            o1g o1gVar = (o1g) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = o1gVar.b;
            jArr[i2 + 1] = o1gVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public psd(z67 z67Var, Method[] methodArr, Method method) {
        this.a = 13;
        z67Var.getClass();
        this.b = z67Var;
        this.c = methodArr;
        this.d = method;
    }

    public psd(ff5 ff5Var, FirebaseMessaging firebaseMessaging, of5 of5Var) {
        this.a = 8;
        this.b = of5Var;
        this.c = ff5Var;
        this.d = firebaseMessaging;
    }

    public psd(Context context, TypedArray typedArray) {
        this.a = 7;
        this.b = context;
        this.c = typedArray;
    }

    public psd(Context context, LocationManager locationManager) {
        this.a = 10;
        this.d = new e8e();
        this.b = context;
        this.c = locationManager;
    }

    public /* synthetic */ psd(int i, char c) {
        this.a = i;
    }

    public psd(pg1 pg1Var, ft3 ft3Var) {
        this.a = 3;
        this.c = pg1Var;
        this.b = ft3Var;
    }

    public psd(l9f l9fVar, psd psdVar) {
        this.a = 11;
        this.b = l9fVar;
        this.d = psdVar;
        this.c = l9fVar.getValue();
    }

    public psd(int i) {
        this.a = 5;
        this.b = i != 1 ? new ej8(i) : null;
    }

    public psd(ond ondVar) {
        this.a = 4;
        jhe jheVar = jhe.a;
        this.b = ondVar;
        this.d = new LinkedHashMap(4, 0.75f, true);
    }

    @Override // defpackage.cfg
    public Object a() {
        return new k((b) ((bfg) this.b).a(), new bfg(new fnb((yea) this.c)), (egg) ((bfg) this.d).a());
    }
}

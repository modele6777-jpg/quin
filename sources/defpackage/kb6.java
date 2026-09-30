package defpackage;

import ai.askquin.App;
import ai.askquin.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.gson.JsonArray;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class kb6 implements v90, xt0, uk9, ur8, yb3, g1b, h1b, f1b, goe, ia1 {
    public static volatile kb6 c;
    public static final i56 d = new i56(1);
    public static final zfh e = new zfh();
    public final /* synthetic */ int a;
    public Object b;

    public kb6(int i) {
        rt8 rt8Var;
        this.a = i;
        switch (i) {
            case 1:
                try {
                    rt8Var = (rt8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    rt8Var = d;
                }
                rt8[] rt8VarArr = {i56.b, rt8Var};
                al8 al8Var = new al8();
                al8Var.a = rt8VarArr;
                Charset charset = p87.a;
                this.b = al8Var;
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = new LinkedHashMap();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                this.b = new w84(12);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                this.b = new ConcurrentHashMap(16);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                this.b = null;
                break;
            case 26:
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public static Object r(Object obj) {
        return obj instanceof Number ? Double.valueOf(((Number) obj).doubleValue()) : obj;
    }

    public static void v(String str, yfh yfhVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(yfhVar.b / 1000000)));
        sb.append(": logging error [");
        jgh jghVar = yfhVar.d;
        if (jghVar == null) {
            qc0.p("cannot request log site information prior to postProcess()");
            return;
        }
        vtb.y(1, jghVar, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(448262461);
        int i2 = i | (l46Var2.g(this) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarU = b.u(g09.a, 3);
            lx0 lx0Var = ndb.f;
            use useVar = (use) this.b;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarU);
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
                l46Var2.f0(-1353266250);
                String strQ = afc.q(R.string.nickname_hint, l46Var2);
                mue mueVar = pue.a;
                nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 131066);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1353076437);
                l46Var2.r(false);
            }
            tec.q(6, dd2Var, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(this, dd2Var, i, 13);
        }
    }

    @Override // defpackage.xt0
    public void a(ConnectionResult connectionResult) {
        boolean z = connectionResult.b == 0;
        yt0 yt0Var = (yt0) this.b;
        if (z) {
            yt0Var.j(null, yt0Var.k());
            return;
        }
        wt0 wt0Var = yt0Var.p;
        if (wt0Var != null) {
            wt0Var.f(connectionResult);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [wo0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [pu4] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.uk9
    public void b(Object obj) {
        uh1 uh1Var;
        ?? r1;
        vi1 vi1Var;
        pk1 pk1Var;
        ?? arrayList;
        List list = (List) obj;
        if (!((uh1) this.b).l.get() || (r1 = (uh1Var = (uh1) this.b).f) == 0 || (vi1Var = uh1Var.g) == null || (pk1Var = uh1Var.i) == null) {
            return;
        }
        if (list != null) {
            arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((jg1) it.next()).a());
            }
        } else {
            arrayList = pu4.a;
        }
        try {
            List list2 = ((uh1) this.b).k;
            Iterable<String> iterableJ1 = ((AtomicBoolean) r1.y).get() ? pu4.a : s72.j1(r1.d(arrayList));
            ArrayList arrayList2 = new ArrayList(t72.u(iterableJ1, 10));
            for (String str : iterableJ1) {
                str.getClass();
                arrayList2.add(m93.v(str, null, null));
            }
            Set setL = n3d.l(s72.o1(list2), s72.o1(arrayList2));
            if (!setL.isEmpty() && pk1Var.e(vi1Var.c(), setL)) {
                b21.W("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                return;
            }
        } catch (Exception e2) {
            b21.X("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e2);
        }
        try {
            r1.j(arrayList);
            Set<String> setG = r1.g();
            ArrayList arrayList3 = new ArrayList(t72.u(setG, 10));
            for (String str2 : setG) {
                str2.getClass();
                arrayList3.add(m93.v(str2, null, null));
            }
            if (arrayList3.equals(((uh1) this.b).k)) {
                return;
            }
            uh1 uh1Var2 = (uh1) this.b;
            List listJ1 = s72.j1(uh1Var2.k);
            if (arrayList3.equals(listJ1)) {
                return;
            }
            synchronized (uh1Var2.d) {
                if (uh1Var2.e != null) {
                    b21.q("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                    ScheduledFuture scheduledFuture = uh1Var2.e;
                    scheduledFuture.getClass();
                    scheduledFuture.cancel(false);
                    uh1Var2.e = null;
                }
            }
            Set setO1 = s72.o1(listJ1);
            Set setO2 = s72.o1(arrayList3);
            Set setL2 = n3d.l(setO2, setO1);
            Set setL3 = n3d.l(setO1, setO2);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(t72.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((jg1) it2.next()).a());
            }
            try {
                Iterator it3 = setL3.iterator();
                while (it3.hasNext()) {
                    uh1Var2.c(((jg1) it3.next()).a());
                }
                vi1 vi1Var2 = uh1Var2.g;
                if (vi1Var2 != null) {
                    b21.q("CameraPresencePrvdr", "Updating CameraRepository...");
                    vi1Var2.a(arrayList5);
                    arrayList4.add(vi1Var2);
                    b21.q("CameraPresencePrvdr", "CameraRepository updated successfully.");
                }
                if (!uh1Var2.m.isEmpty()) {
                    b21.q("CameraPresencePrvdr", "Updating " + uh1Var2.m.size() + " dependent listeners...");
                    for (w87 w87Var : uh1Var2.m) {
                        w87Var.a(arrayList5);
                        arrayList4.add(w87Var);
                    }
                }
                uh1Var2.k = arrayList3;
                Iterator it4 = setL2.iterator();
                while (it4.hasNext()) {
                    uh1Var2.a(((jg1) it4.next()).a());
                }
                uh1Var2.b(setL2, setL3);
            } catch (Exception e3) {
                b21.w("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e3);
                ArrayList arrayList6 = new ArrayList(t72.u(listJ1, 10));
                Iterator it5 = listJ1.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((jg1) it5.next()).a());
                }
                Iterator it6 = new n0c(arrayList4).iterator();
                while (true) {
                    m0c m0cVar = (m0c) it6;
                    if (!((ListIterator) m0cVar.b).hasPrevious()) {
                        break;
                    }
                    w87 w87Var2 = (w87) ((ListIterator) m0cVar.b).previous();
                    try {
                        w87Var2.a(arrayList6);
                    } catch (Exception e4) {
                        b21.w("CameraPresencePrvdr", "Failed to rollback listener: " + w87Var2, e4);
                    }
                }
                Iterator it7 = setL3.iterator();
                while (it7.hasNext()) {
                    uh1Var2.a(((jg1) it7.next()).a());
                }
                Iterator it8 = setL2.iterator();
                while (it8.hasNext()) {
                    uh1Var2.c(((jg1) it8.next()).a());
                }
            }
        } catch (Exception e5) {
            b21.X("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e5);
        }
    }

    @Override // defpackage.ur8
    public void c(qr8 qr8Var, MenuItem menuItem) {
        ((su1) this.b).f.removeCallbacksAndMessages(qr8Var);
    }

    @Override // defpackage.ia1
    public void d(v91 v91Var, ryb rybVar) {
        ((o3d) this.b).m(rybVar);
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 15:
                i1b i1bVar = (i1b) ((szc) this.b).e;
                nk8.o(i1bVar);
                return i1bVar;
            case 18:
                return this.b;
            default:
                return new fb8((Context) ((ze) this.b).a);
        }
    }

    @Override // defpackage.ia1
    public void h(v91 v91Var, IOException iOException) {
        ((o3d) this.b).n(iOException);
    }

    public bb3 i() {
        bb3 bb3Var = new bb3((LinkedHashMap) this.b);
        bm8.S(bb3Var);
        return bb3Var;
    }

    public boolean j(String str) {
        str.getClass();
        t6a t6aVarQ = q();
        if (pa7.t(t6aVarQ != null ? t6aVarQ.a : null, str)) {
            return ((SharedPreferences) this.b).edit().remove("pending").commit();
        }
        return false;
    }

    @Override // defpackage.ur8
    public void k(qr8 qr8Var, vr8 vr8Var) {
        su1 su1Var = (su1) this.b;
        Handler handler = su1Var.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = su1Var.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (qr8Var == ((ru1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new qu1(this, i2 < arrayList.size() ? (ru1) arrayList.get(i2) : null, vr8Var, qr8Var, 0), qr8Var, SystemClock.uptimeMillis() + 200);
    }

    public void l() {
        ((lg2) this.b).getClass();
    }

    @Override // defpackage.yb3
    public ac3 l0() {
        return new cr3((w84) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.util.List] */
    public Object m(fi7 fi7Var, Object obj, String str) throws ci7 {
        ArrayList arrayList;
        List list;
        ?? arrayList2;
        int iB = kv2.B(fi7Var.getType());
        if (iB == 0) {
            li7 li7Var = (li7) fi7Var;
            return kv2.B(li7Var.a()) != 1 ? li7Var.getValue() : Double.valueOf(((hi7) li7Var).a.doubleValue());
        }
        if (iB != 1) {
            if (iB == 2) {
                return n((ai7) fi7Var, obj, str);
            }
            ii7 ii7Var = (ii7) fi7Var;
            Map map = (Map) this.b;
            String str2 = ii7Var.a;
            ei7 ei7Var = (ei7) map.get(str2);
            if (ei7Var != null) {
                return ei7Var.a(this, ii7Var.b, obj, ib8.j(str, ".", str2));
            }
            throw new ci7(ib8.j("Undefined operation '", str2, "'"), str);
        }
        ni7 ni7Var = (ni7) fi7Var;
        fi7 fi7Var2 = ni7Var.b;
        String strConcat = str.concat(".var");
        Object objM = m(fi7Var2, null, strConcat.concat("[1]"));
        if (obj != null) {
            Object objM2 = m(ni7Var.a, obj, strConcat.concat("[0]"));
            if (objM2 == null) {
                return Optional.of(obj).map(new fj0(5)).orElse(m(fi7Var2, null, strConcat.concat("[1]")));
            }
            if (!(objM2 instanceof Number)) {
                if (!(objM2 instanceof String)) {
                    throw new ci7("var first argument must be null, number, or string", strConcat.concat("[0]"));
                }
                String str3 = (String) objM2;
                if (str3.isEmpty()) {
                    return obj;
                }
                for (String str4 : str3.split("\\.")) {
                    String strConcat2 = strConcat.concat("[0]");
                    if (cd0.a(obj)) {
                        if (obj instanceof List) {
                            list = (List) ((List) obj).stream().map(new fj0(5)).collect(Collectors.toList());
                        } else {
                            if (obj.getClass().isArray()) {
                                arrayList = new ArrayList();
                                for (int i = 0; i < Array.getLength(obj); i++) {
                                    arrayList.add(i, r(Array.get(obj, i)));
                                }
                            } else if (obj instanceof JsonArray) {
                                list = (List) g21.L((JsonArray) obj);
                            } else {
                                if (!(obj instanceof Iterable)) {
                                    qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                                    return null;
                                }
                                arrayList = new ArrayList();
                                Iterator it = ((Iterable) obj).iterator();
                                while (it.hasNext()) {
                                    arrayList.add(r(it.next()));
                                }
                            }
                            list = arrayList;
                        }
                        try {
                            int i2 = Integer.parseInt(str4);
                            if (i2 < 0 || i2 >= list.size()) {
                                obj = null;
                            } else {
                                obj = r(list.get(i2));
                            }
                        } catch (NumberFormatException e2) {
                            throw new ci7(e2, strConcat2);
                        }
                    } else if (obj instanceof Map) {
                        obj = r(((Map) obj).get(str4));
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                    }
                }
                return obj;
            }
            int iIntValue = ((Number) objM2).intValue();
            if (cd0.a(obj)) {
                if (obj instanceof List) {
                    arrayList2 = (List) ((List) obj).stream().map(new fj0(5)).collect(Collectors.toList());
                } else if (obj.getClass().isArray()) {
                    arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < Array.getLength(obj); i3++) {
                        arrayList2.add(i3, r(Array.get(obj, i3)));
                    }
                } else if (obj instanceof JsonArray) {
                    arrayList2 = (List) g21.L((JsonArray) obj);
                } else {
                    if (!(obj instanceof Iterable)) {
                        qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                        return null;
                    }
                    arrayList2 = new ArrayList();
                    Iterator it2 = ((Iterable) obj).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(r(it2.next()));
                    }
                }
                if (iIntValue >= 0 && iIntValue < arrayList2.size()) {
                    return r(arrayList2.get(iIntValue));
                }
            }
        }
        return objM;
    }

    public ArrayList n(ai7 ai7Var, Object obj, String str) {
        List list = ai7Var.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(m((fi7) it.next(), obj, String.format("%s[%d]", str, Integer.valueOf(i))));
            i++;
        }
        return arrayList;
    }

    public void o(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            kob kobVar = job.a;
            em7 em7VarB = kobVar.b(cls);
            if (!em7VarB.equals(kobVar.b(Boolean.TYPE)) && !em7VarB.equals(kobVar.b(Byte.TYPE)) && !em7VarB.equals(kobVar.b(Integer.TYPE)) && !em7VarB.equals(kobVar.b(Long.TYPE)) && !em7VarB.equals(kobVar.b(Float.TYPE)) && !em7VarB.equals(kobVar.b(Double.TYPE)) && !em7VarB.equals(kobVar.b(String.class)) && !em7VarB.equals(kobVar.b(Boolean[].class)) && !em7VarB.equals(kobVar.b(Byte[].class)) && !em7VarB.equals(kobVar.b(Integer[].class)) && !em7VarB.equals(kobVar.b(Long[].class)) && !em7VarB.equals(kobVar.b(Float[].class)) && !em7VarB.equals(kobVar.b(Double[].class)) && !em7VarB.equals(kobVar.b(String[].class))) {
                int i = 0;
                if (em7VarB.equals(kobVar.b(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = rd3.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (em7VarB.equals(kobVar.b(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = rd3.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (em7VarB.equals(kobVar.b(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = rd3.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (em7VarB.equals(kobVar.b(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = rd3.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (em7VarB.equals(kobVar.b(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = rd3.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!em7VarB.equals(kobVar.b(double[].class))) {
                        s8f.k("Key ", str, " has invalid type ", em7VarB);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = rd3.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(str, obj);
    }

    @Override // defpackage.uk9
    public void onError(Throwable th) {
        th.getClass();
        uh1 uh1Var = (uh1) this.b;
        if (uh1Var.l.get()) {
            b21.w("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
            zda zdaVar = uh1Var.h;
            if (zdaVar != null) {
                zdaVar.a();
            }
        }
    }

    public void p(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            o(entry.getValue(), (String) entry.getKey());
        }
    }

    public t6a q() {
        Object dzbVar;
        String string = ((SharedPreferences) this.b).getString("pending", null);
        if (string == null) {
            return null;
        }
        List listC0 = v4e.c0(string, new String[]{"\u001f"}, 6);
        if (listC0.size() != 5) {
            return null;
        }
        try {
            dzbVar = r8a.valueOf((String) listC0.get(1));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        r8a r8aVar = (r8a) dzbVar;
        if (r8aVar == null || v4e.Q((CharSequence) listC0.get(0)) || v4e.Q((CharSequence) listC0.get(2)) || v4e.Q((CharSequence) listC0.get(3))) {
            return null;
        }
        Object obj = listC0.get(4);
        if (v4e.Q((String) obj)) {
            obj = null;
        }
        String str = (String) obj;
        Integer numD = str != null ? c5e.D(str) : null;
        if (v4e.Q((CharSequence) listC0.get(4)) || numD != null) {
            return new t6a((String) listC0.get(0), r8aVar, new ei9((String) listC0.get(2), (String) listC0.get(3), numD));
        }
        return null;
    }

    public void s() {
        hv6 hv6Var = (hv6) this.b;
        synchronized (hv6Var.s) {
            try {
                Integer num = (Integer) hv6Var.s.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != hv6Var.G()) {
                    hv6Var.J();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(int i, Object obj, ffc ffcVar) {
        j72 j72Var = (j72) this.b;
        j72Var.m(i, 3);
        ffcVar.g((tt8) obj, j72Var.a);
        j72Var.m(i, 4);
    }

    public void u(int i, Object obj, ffc ffcVar) {
        j72 j72Var = (j72) this.b;
        tt8 tt8Var = (tt8) obj;
        j72Var.m(i, 2);
        j72Var.n(((h3) tt8Var).g(ffcVar));
        ffcVar.g(tt8Var, j72Var.a);
    }

    @Override // defpackage.v90
    public void e(int i) {
    }

    @Override // defpackage.v90
    public void f(int i) {
    }

    @Override // defpackage.v90
    public void g(int i, float f) {
    }

    public kb6(yt0 yt0Var) {
        this.a = 6;
        Objects.requireNonNull(yt0Var);
        this.b = yt0Var;
    }

    public kb6(ConcurrentHashMap concurrentHashMap) {
        this.a = 19;
        this.b = Collections.unmodifiableMap(concurrentHashMap);
    }

    public kb6(j72 j72Var) {
        this.a = 9;
        Charset charset = p87.a;
        this.b = j72Var;
        j72Var.a = this;
    }

    public /* synthetic */ kb6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public kb6(TextView textView) {
        this.a = 14;
        this.b = new zt4(textView);
    }

    public kb6(App app) {
        this.a = 29;
        this.b = app.getSharedPreferences("notification_permission_result", 0);
    }
}

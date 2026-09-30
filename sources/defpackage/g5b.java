package defpackage;

import ai.askquin.R;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.sig.r3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.d;
import com.google.android.play.core.assetpacks.s;
import com.google.firebase.perf.metrics.Trace;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g5b implements goe, v25, pj5, h47, j9e, c00, cfg, ypb, ye, h8h, b1h, yn2 {
    public final /* synthetic */ int a;
    public Object b;

    public g5b(long[] jArr) {
        x69 x69Var;
        this.a = 6;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            x69Var = new x69(jArrCopyOf.length);
            int i = x69Var.b;
            if (i < 0) {
                r3.i("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                x69Var.c(jArrCopyOf.length + i);
                long[] jArr2 = x69Var.a;
                int i2 = x69Var.b;
                if (i != i2) {
                    qd0.b0(jArr2, jArr2, jArrCopyOf.length + i, i, i2);
                }
                qd0.b0(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                x69Var.b += jArrCopyOf.length;
            }
        } else {
            x69Var = new x69();
        }
        this.b = x69Var;
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1478044001);
        int i2 = i | (l46Var2.g(this) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            use useVar = (use) this.b;
            xn8 xn8VarC = s21.c(ndb.b, false);
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
                l46Var2.f0(-239820999);
                nte.b(afc.q(R.string.question_input_hint, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var2.k(nte.a), y72.b(((e8b) l46Var2.k(l8b.a)).q, 0.4f), w6c.l(17), null, null, 0L, null, 0, 0L, null, null, 16777212), l46Var, 0, 0, 131070);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-239530777);
                l46Var2.r(false);
            }
            tec.q(6, dd2Var, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(this, dd2Var, i, 24);
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        switch (this.a) {
            case 14:
                return new d(new bfg(new fnb((yea) this.b)));
            default:
                return new s((b) ((bfg) this.b).a());
        }
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        gle gleVar = (gle) obj2;
        pig pigVar = (pig) ((uig) obj).l();
        ole oleVar = (ole) this.b;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(pigVar.f);
        int i = xhg.a;
        if (oleVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            oleVar.writeToParcel(parcelObtain, 0);
        }
        try {
            pigVar.e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            gleVar.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.h47
    public boolean b(ssg ssgVar, int i, Bundle bundle) {
        j1e j1eVar = (j1e) this.b;
        int i2 = 0;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((mjg) ssgVar.b).a).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((mjg) ssgVar.b).a;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        bw bwVar = j1eVar.a;
        mjg mjgVar = (mjg) ssgVar.b;
        mjg mjgVar2 = (mjg) ssgVar.b;
        a52 a52Var = new a52(new ClipData(((InputContentInfo) mjgVar.a).getDescription(), new ClipData.Item(((InputContentInfo) mjgVar2.a).getContentUri())));
        ((InputContentInfo) mjgVar2.a).getDescription();
        ((InputContentInfo) mjgVar2.a).getLinkUri();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        sug sugVar = new sug(a52Var, i2, 19);
        yib yibVar = (yib) bwVar.g;
        if (yibVar != null) {
            return !pa7.t(((wr4) yibVar).b.d(sugVar), sugVar);
        }
        return false;
    }

    @Override // defpackage.v25
    public dib c() throws Throwable {
        IOException iOException = null;
        while (!((sib) this.b).k.F0) {
            try {
                j7c j7cVarB = ((sib) this.b).b();
                if (!j7cVarB.a()) {
                    i7c i7cVarD = j7cVarB.d();
                    if (i7cVarD.b == null && i7cVarD.c == null) {
                        i7cVarD = j7cVarB.g();
                    }
                    j7c j7cVar = i7cVarD.b;
                    Throwable th = i7cVarD.c;
                    if (th != null) {
                        throw th;
                    }
                    if (j7cVar != null) {
                        ((sib) this.b).p.addFirst(j7cVar);
                    }
                }
                return j7cVarB.c();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    bzd.m(iOException, e);
                }
                if (!((sib) this.b).a(null)) {
                    throw iOException;
                }
            }
        }
        yg5.m("Canceled");
        return null;
    }

    @Override // defpackage.v25
    public sib d() {
        return (sib) this.b;
    }

    @Override // defpackage.pj5
    public float e() {
        return 0.0f;
    }

    @Override // defpackage.j9e
    public String f() {
        return ((m9e) this.b).b;
    }

    @Override // defpackage.j9e
    public void g(i9e i9eVar) {
        m9e m9eVar = (m9e) this.b;
        int length = m9eVar.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = m9eVar.d[i];
            if (i2 == 1) {
                i9eVar.m(i, m9eVar.e[i]);
            } else if (i2 == 2) {
                i9eVar.w0(m9eVar.f[i], i);
            } else if (i2 == 3) {
                String str = m9eVar.g[i];
                str.getClass();
                i9eVar.A(i, str);
            } else if (i2 == 4) {
                byte[] bArr = m9eVar.v[i];
                bArr.getClass();
                i9eVar.n(bArr, i);
            } else if (i2 == 5) {
                i9eVar.o(i);
            }
        }
    }

    @Override // defpackage.c00
    public mj5 get(int i) {
        return (tj5) this.b;
    }

    @Override // defpackage.yn2
    public /* bridge */ /* synthetic */ Object h(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.b);
        return Tasks.d(arrayList);
    }

    @Override // defpackage.pj5
    public float i(float f, float f2, long j) {
        long j2 = j / 1000000;
        hj5 hj5VarA = ((ij5) this.b).a(f2);
        long j3 = hj5VarA.c;
        return (Math.signum(hj5VarA.a) * hj5VarA.b * as.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        xe xeVar = (xe) obj;
        Intent intent = xeVar.b;
        int i = zsg.e(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.R0;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = xeVar.a;
        if (i2 != -1 || i != 0) {
            zsg.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    public b1f k() {
        List listUnmodifiableList;
        y0f y0fVarH = b1f.H();
        y0fVarH.n(((Trace) this.b).d);
        y0fVarH.l(((Trace) this.b).y.a);
        Trace trace = (Trace) this.b;
        y0fVarH.m(trace.y.c(trace.z));
        for (vw2 vw2Var : ((Trace) this.b).e.values()) {
            y0fVarH.k(vw2Var.b.get(), vw2Var.a);
        }
        ArrayList arrayList = ((Trace) this.b).v;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y0fVarH.j(new g5b(11, (Trace) it.next()).k());
            }
        }
        Map<String, String> attributes = ((Trace) this.b).getAttributes();
        y0fVarH.i();
        ((b1f) y0fVarH.b).G().putAll(attributes);
        Trace trace2 = (Trace) this.b;
        synchronized (trace2.g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (n8a n8aVar : trace2.g) {
                    if (n8aVar != null) {
                        arrayList2.add(n8aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        m8a[] m8aVarArrB = n8a.b(listUnmodifiableList);
        if (m8aVarArrB != null) {
            List listAsList = Arrays.asList(m8aVarArrB);
            y0fVarH.i();
            ((b1f) y0fVarH.b).r(listAsList);
        }
        return (b1f) y0fVarH.h();
    }

    @Override // defpackage.pj5
    public long l(float f) {
        return ((long) (Math.exp(((ij5) this.b).b(f) / (((double) jj5.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    public void m(z61 z61Var) {
        if (!z61Var.g()) {
            if (!(z61Var instanceof p6c)) {
                String strValueOf = String.valueOf(z61Var.getClass());
                qc0.j(ks0.l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                p6c p6cVar = (p6c) z61Var;
                m(p6cVar.c);
                m(p6cVar.d);
                return;
            }
        }
        int size = z61Var.size();
        int[] iArr = p6c.v;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.b;
        if (stack.isEmpty() || ((z61) stack.peek()).size() >= i) {
            stack.push(z61Var);
            return;
        }
        int i2 = iArr[iBinarySearch];
        z61 p6cVar2 = (z61) stack.pop();
        while (!stack.isEmpty() && ((z61) stack.peek()).size() < i2) {
            p6cVar2 = new p6c((z61) stack.pop(), p6cVar2);
        }
        p6c p6cVar3 = new p6c(p6cVar2, z61Var);
        while (!stack.isEmpty()) {
            int[] iArr2 = p6c.v;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, p6cVar3.b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((z61) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                p6cVar3 = new p6c((z61) stack.pop(), p6cVar3);
            }
        }
        stack.push(p6cVar3);
    }

    @Override // defpackage.pj5
    public float n(float f, float f2) {
        ij5 ij5Var = (ij5) this.b;
        double dB = ij5Var.b(f2);
        double d = jj5.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (ij5Var.a * ij5Var.b))))) + f;
    }

    @Override // defpackage.pj5
    public float o(long j, float f) {
        long j2 = j / 1000000;
        hj5 hj5VarA = ((ij5) this.b).a(f);
        long j3 = hj5VarA.c;
        return (((Math.signum(hj5VarA.a) * as.a(j3 > 0 ? j2 / j3 : 1.0f).b) * hj5VarA.b) / j3) * 1000.0f;
    }

    public ssg p(String str) {
        Class<?> cls;
        cob cobVarG0;
        ClassLoader classLoader = (ClassLoader) this.b;
        str.getClass();
        try {
            cls = Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (cobVarG0 = hkg.g0(cls)) == null) {
            return null;
        }
        return new ssg(23, cobVarG0);
    }

    public void q(int i, int i2) {
        lge lgeVar = (lge) this.b;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        lgeVar.o = i;
        lgeVar.p = i2;
        lgeVar.e.h(new h71(i, i2, 9));
        lgeVar.f.d(((double) i) / ((double) i2));
    }

    public void r(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.F(childAt);
            nkb nkbVar = recyclerView.z;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void s(int i, Object obj, yng yngVar) {
        gmg gmgVar = (gmg) this.b;
        qlg qlgVar = (qlg) obj;
        gmgVar.d(i, 2);
        gmgVar.r(qlgVar.b(yngVar));
        yngVar.j(qlgVar, this);
    }

    public void t(int i, Object obj, s3h s3hVar) throws yyg {
        p90 p90Var = (p90) this.b;
        dyg dygVar = (dyg) obj;
        p90Var.B0(i, 2);
        p90Var.D0(dygVar.c(s3hVar));
        s3hVar.d(dygVar, this);
    }

    @Override // defpackage.h8h, defpackage.b1h
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        switch (this.a) {
            case 21:
                ((w3h) this.b).d(i, th, bArr);
                break;
            default:
                ((ich) this.b).y(str, i, th, bArr, map);
                break;
        }
    }

    public g5b(p90 p90Var) {
        this.a = 20;
        this.b = p90Var;
        p90Var.d = this;
    }

    public g5b(gmg gmgVar) {
        this.a = 18;
        this.b = gmgVar;
        gmgVar.a = this;
    }

    public g5b(sw3 sw3Var) {
        this.a = 7;
        this.b = new ij5(yud.a, sw3Var);
    }

    public g5b(qcc qccVar) {
        this.a = 13;
        this.b = new WeakReference(qccVar);
    }

    public /* synthetic */ g5b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public g5b(int i) {
        this.a = i;
        switch (i) {
            case 5:
                break;
            default:
                this.b = new Stack();
                break;
        }
    }

    public g5b(float f, float f2) {
        this.a = 12;
        this.b = new tj5(f, f2);
    }
}

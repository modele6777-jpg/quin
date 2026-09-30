package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ojf extends gbe implements a26 {
    final /* synthetic */ boolean $isPrimary;
    final /* synthetic */ Collection<oif> $runningUseCases;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojf(Collection collection, boolean z, pjf pjfVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$runningUseCases = collection;
        this.$isPrimary = z;
        this.this$0 = pjfVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new ojf(this.$runningUseCases, this.$isPrimary, this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
        }
        c0d c0dVar = new c0d(this.$runningUseCases, this.$isPrimary);
        zzc zzcVar = ((yzc) c0dVar.e.getValue()).c() ? (zzc) c0dVar.f.getValue() : null;
        if (zzcVar == null) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Using default SessionConfig");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            k79 k79VarJ = k79.j();
            ArrayList arrayList = new ArrayList();
            m89 m89VarA = m89.a();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            bs9 bs9VarD = bs9.d(k79VarJ);
            ArrayList arrayList10 = new ArrayList(arrayList);
            wde wdeVar = wde.b;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = m89VarA.a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            i2 = 1;
            zzcVar = new zzc(arrayList5, arrayList6, arrayList7, arrayList8, new im1(arrayList9, bs9VarD, 1, arrayList10, new wde(arrayMap)), null, null, 0, null);
        }
        im1 im1Var = zzcVar.g;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
        }
        pjf pjfVar = this.this$0;
        LinkedHashMap linkedHashMap = pjfVar.k;
        za2 za2Var = pjf.l;
        vp vpVar = pjfVar.e.e;
        vd9 vd9Var = new vd9(8);
        if (!im1Var.a().equals(hq0.h)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            key.getClass();
            ((k79) vd9Var.b).p(af1.D(key), im1Var.a());
        }
        vd9Var.y(im1Var.b);
        wde wdeVar2 = im1Var.e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayMap arrayMap3 = wdeVar2.a;
        Set<String> setKeySet = arrayMap3.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            Object obj2 = arrayMap3.get(str2);
            obj2.getClass();
            linkedHashMap2.put(str2, obj2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        vpVar.getClass();
        List list = im1Var.d;
        list.getClass();
        ge1 ge1Var = new ge1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ge1Var.a((he1) it.next(), vpVar);
        }
        atb[] atbVarArr = {ge1Var};
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(bm8.F(1));
        qd0.B0(atbVarArr, linkedHashSet2);
        linkedHashMap.put(zif.a, new cjf(vd9Var, linkedHashMap3, linkedHashSet2, new ttb(im1Var.c)));
        ckf ckfVar = this.this$0.c;
        List listUnmodifiableList = Collections.unmodifiableList(im1Var.a);
        listUnmodifiableList.getClass();
        LinkedHashSet linkedHashSetB = ckfVar.b(listUnmodifiableList);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
        }
        pjf pjfVar2 = this.this$0;
        cjf cjfVarM = pjf.m(pjfVar2.k);
        this.label = i2;
        Object objP = pjfVar2.p(cjfVarM, linkedHashSetB, this);
        bw2 bw2Var = bw2.a;
        return objP == bw2Var ? bw2Var : objP;
    }
}

package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yzc extends uzc {
    public final f17 j = new f17(4);
    public boolean k = true;
    public final StringBuilder l = new StringBuilder();
    public boolean m = false;
    public final ArrayList n = new ArrayList();

    public final void a(zzc zzcVar) {
        r1f r1fVar = this.b;
        HashSet hashSet = (HashSet) r1fVar.b;
        im1 im1Var = zzcVar.g;
        bs9 bs9Var = im1Var.b;
        int i = im1Var.c;
        if (i != -1) {
            this.m = true;
            int i2 = r1fVar.a;
            List list = zzc.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            r1fVar.a = i;
        }
        Range rangeA = im1Var.a();
        Range range = hq0.h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb = this.l;
        if (!zEquals) {
            k79 k79Var = (k79) r1fVar.c;
            no0 no0Var = im1.h;
            boolean zEquals2 = ((Range) k79Var.a(no0Var, range)).equals(range);
            k79 k79Var2 = (k79) r1fVar.c;
            if (zEquals2) {
                k79Var2.p(no0Var, rangeA);
            } else if (!((Range) k79Var2.a(no0Var, range)).equals(rangeA)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((k79) r1fVar.c).a(no0Var, range)) + ", new = " + rangeA;
                b21.v("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        no0 no0Var2 = xjf.q0;
        Integer num = (Integer) bs9Var.a(no0Var2, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0 && iIntValue != 0) {
            ((k79) r1fVar.c).p(no0Var2, num);
        }
        no0 no0Var3 = xjf.r0;
        Integer num2 = (Integer) bs9Var.a(no0Var3, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0 && iIntValue2 != 0) {
            ((k79) r1fVar.c).p(no0Var3, num2);
        }
        ((m89) r1fVar.e).a.putAll((Map) im1Var.e.a);
        this.c.addAll(zzcVar.c);
        this.d.addAll(zzcVar.d);
        r1fVar.a(im1Var.d);
        this.e.addAll(zzcVar.e);
        xzc xzcVar = zzcVar.f;
        if (xzcVar != null) {
            this.n.add(xzcVar);
        }
        InputConfiguration inputConfiguration = zzcVar.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = zzcVar.a;
        LinkedHashSet<eq0> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(im1Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (eq0 eq0Var : linkedHashSet) {
            arrayList2.add(eq0Var.a);
            Iterator it = eq0Var.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((lu3) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            b21.q("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = zzcVar.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            b21.q("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        eq0 eq0Var2 = zzcVar.b;
        if (eq0Var2 != null) {
            eq0 eq0Var3 = this.i;
            if (eq0Var3 == eq0Var2 || eq0Var3 == null) {
                this.i = eq0Var2;
            } else {
                b21.q("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        r1fVar.e(bs9Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[EDGE_INSN: B:38:0x00a7->B:39:0x00d8 BREAK  A[LOOP:0: B:16:0x0035->B:48:?]] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00a7, please report this as an issue */
    public final zzc b() {
        no0 no0Var;
        Range range;
        if (!this.k) {
            qc0.j("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.a);
        f17 f17Var = this.j;
        if (f17Var.b) {
            Collections.sort(arrayList, new qu(f17Var));
        }
        int i = this.h;
        int i2 = 2;
        r1f r1fVar = this.b;
        if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lu3 lu3Var = ((eq0) it.next()).a;
                lu3Var.getClass();
                if (pa7.t(lu3Var.j, MediaCodec.class)) {
                    HashSet hashSet = (HashSet) r1fVar.b;
                    if (!hashSet.isEmpty()) {
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                k79 k79Var = (k79) r1fVar.c;
                                no0Var = im1.h;
                                range = (Range) k79Var.a(no0Var, hq0.h);
                                if (range != null) {
                                    break;
                                }
                                if (((Number) range.getUpper()).intValue() >= 120) {
                                    range = null;
                                } else {
                                    range = null;
                                }
                                if (range != null) {
                                    break;
                                }
                                Range range2 = new Range(30, range.getUpper());
                                b21.q("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                ((k79) r1fVar.c).p(no0Var, range2);
                                break;
                            }
                            lu3 lu3Var2 = (lu3) it2.next();
                            lu3Var2.getClass();
                            if (pa7.t(lu3Var2.j, MediaCodec.class)) {
                                break;
                            }
                        }
                    } else {
                        k79 k79Var2 = (k79) r1fVar.c;
                        no0Var = im1.h;
                        range = (Range) k79Var2.a(no0Var, hq0.h);
                        if (range != null) {
                            break;
                        }
                        if (((Number) range.getUpper()).intValue() >= 120 || !pa7.t(range.getLower(), range.getUpper())) {
                            range = null;
                        }
                        if (range != null) {
                            break;
                        }
                        Range range3 = new Range(30, range.getUpper());
                        b21.q("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range3);
                        ((k79) r1fVar.c).p(no0Var, range3);
                        break;
                    }
                }
            }
        }
        return new zzc(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), r1fVar.j(), this.n.isEmpty() ? null : new ev6(i2, this), this.g, this.h, this.i);
    }

    public final boolean c() {
        return this.m && this.k;
    }
}

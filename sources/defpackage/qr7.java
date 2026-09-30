package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qr7 extends gu7 implements a26 {
    final /* synthetic */ e89 $drawArea$inlined;
    final /* synthetic */ e89 $frameTime$inlined;
    final /* synthetic */ e89 $particles$inlined;
    final /* synthetic */ mmb $partySystems$inlined;
    final /* synthetic */ fn9 $updateListener$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr7(e89 e89Var, e89 e89Var2, mmb mmbVar, e89 e89Var3) {
        super(1);
        this.$frameTime$inlined = e89Var;
        this.$particles$inlined = e89Var2;
        this.$partySystems$inlined = mmbVar;
        this.$drawArea$inlined = e89Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [pu4] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        long j2;
        ju2 ju2Var;
        ?? r11;
        char c;
        float f;
        int i;
        double dNextDouble;
        qr7 qr7Var = this;
        long jLongValue = ((Number) obj).longValue() / 1000000;
        long j3 = 0;
        long jLongValue2 = ((Number) qr7Var.$frameTime$inlined.getValue()).longValue() > 0 ? jLongValue - ((Number) qr7Var.$frameTime$inlined.getValue()).longValue() : 0L;
        qr7Var.$frameTime$inlined.setValue(Long.valueOf(jLongValue));
        e89 e89Var = qr7Var.$particles$inlined;
        Object obj2 = qr7Var.$partySystems$inlined.element;
        if (obj2 == null) {
            pa7.g0("partySystems");
            throw null;
        }
        List list = (List) obj2;
        char c2 = '\n';
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u0a u0aVar = (u0a) it.next();
            long j4 = u0aVar.b;
            t0a t0aVar = u0aVar.c;
            ArrayList<oh2> arrayList2 = u0aVar.d;
            s0a s0aVar = u0aVar.a;
            long jCurrentTimeMillis = System.currentTimeMillis() - j4;
            long j5 = s0aVar.l;
            ?? arrayList3 = pu4.a;
            if (jCurrentTimeMillis < j5) {
                j2 = jLongValue2;
                j = j3;
                c = c2;
            } else {
                long j6 = t0aVar.a.a;
                if (j6 > j3 && t0aVar.d >= j6) {
                    arrayList2.size();
                }
                float f2 = jLongValue2 / 1000.0f;
                ju2 ju2Var2 = (ju2) qr7Var.$drawArea$inlined.getValue();
                ju2Var2.getClass();
                j = j3;
                float f3 = t0aVar.e + f2;
                t0aVar.e = f3;
                et4 et4Var = t0aVar.a;
                ju2 ju2Var3 = ju2Var2;
                long j7 = et4Var.a;
                float f4 = j7;
                float f5 = f4 / 1000.0f;
                float f6 = t0aVar.d;
                if (f6 == 0.0f && f2 > f5) {
                    t0aVar.e = f5;
                    f3 = f5;
                }
                float f7 = et4Var.b;
                float f8 = 0.0f;
                if (f3 < f7 || (j7 != j && f6 >= f4)) {
                    j2 = jLongValue2;
                    ju2Var = ju2Var3;
                    r11 = arrayList3;
                } else {
                    z67 z67Var = new z67(1, (int) (f3 / f7), 1);
                    ArrayList arrayList4 = new ArrayList(t72.u(z67Var, 10));
                    Iterator it2 = z67Var.iterator();
                    while (((y67) it2).c) {
                        ((q67) it2).nextInt();
                        List list2 = s0aVar.f;
                        r6c r6cVar = s0aVar.m;
                        Random random = t0aVar.c;
                        zkd zkdVar = (zkd) list2.get(random.nextInt(list2.size()));
                        ju2 ju2Var4 = ju2Var3;
                        rna rnaVarA = t0aVar.a(s0aVar.k, ju2Var4);
                        Iterator it3 = it2;
                        long j8 = jLongValue2;
                        hsf hsfVar = new hsf(rnaVarA.j, rnaVarA.k);
                        float f9 = zkdVar.a * t0aVar.b;
                        float f10 = zkdVar.b;
                        float fNextFloat = (random.nextFloat() * 0.2f * f10) + f10;
                        List list3 = s0aVar.h;
                        w4d w4dVar = (w4d) list3.get(random.nextInt(list3.size()));
                        List list4 = s0aVar.g;
                        int iIntValue = ((Number) list4.get(random.nextInt(list4.size()))).intValue();
                        long j9 = s0aVar.i;
                        boolean z = s0aVar.j;
                        float f11 = s0aVar.d;
                        float fNextFloat2 = s0aVar.c;
                        if (f11 != -1.0f) {
                            fNextFloat2 = (random.nextFloat() * (f11 - fNextFloat2)) + fNextFloat2;
                        }
                        int i2 = s0aVar.b;
                        float f12 = fNextFloat2;
                        int i3 = s0aVar.a;
                        if (i2 == 0) {
                            dNextDouble = i3;
                        } else {
                            int i4 = i2 / 2;
                            int i5 = i3 - i4;
                            dNextDouble = (random.nextDouble() * ((double) ((i4 + i3) - i5))) + ((double) i5);
                        }
                        double radians = Math.toRadians(dNextDouble);
                        arrayList4.add(new oh2(hsfVar, iIntValue, f9, fNextFloat, w4dVar, j9, z, new hsf(((float) Math.cos(radians)) * f12, ((float) Math.sin(radians)) * f12), s0aVar.e, t0aVar.b(r6cVar) * r6cVar.b, t0aVar.b(r6cVar) * r6cVar.a, t0aVar.b));
                        it2 = it3;
                        jLongValue2 = j8;
                        ju2Var3 = ju2Var4;
                    }
                    j2 = jLongValue2;
                    ju2Var = ju2Var3;
                    t0aVar.e %= et4Var.b;
                    r11 = arrayList4;
                }
                t0aVar.d = (f2 * 1000.0f) + t0aVar.d;
                arrayList2.addAll(r11);
                for (oh2 oh2Var : arrayList2) {
                    oh2Var.getClass();
                    float f13 = ju2Var.b;
                    hsf hsfVar2 = oh2Var.q;
                    hsf hsfVar3 = oh2Var.h;
                    float f14 = 1.0f / oh2Var.d;
                    float f15 = (hsfVar2.a * f14) + hsfVar3.a;
                    hsfVar3.a = f15;
                    float f16 = (hsfVar2.b * f14) + hsfVar3.b;
                    hsfVar3.b = f16;
                    float f17 = oh2Var.c;
                    hsf hsfVar4 = oh2Var.i;
                    hsf hsfVar5 = oh2Var.a;
                    float f18 = f2 > f8 ? 1.0f / f2 : 60.0f;
                    oh2Var.p = f18;
                    boolean z2 = false;
                    if (hsfVar5.b > f13) {
                        oh2Var.r = 0;
                    } else {
                        float f19 = hsfVar4.a + f15;
                        float f20 = hsfVar4.b + f16;
                        float f21 = oh2Var.j;
                        float f22 = f19 * f21;
                        hsfVar4.a = f22;
                        float f23 = f20 * f21;
                        hsfVar4.b = f23;
                        float f24 = f2 * f18 * oh2Var.m;
                        hsfVar5.a = (f22 * f24) + hsfVar5.a;
                        hsfVar5.b = (f23 * f24) + hsfVar5.b;
                        long j10 = oh2Var.f - ((long) (f2 * 1000.0f));
                        oh2Var.f = j10;
                        if (j10 <= j) {
                            if (!oh2Var.g || (i = oh2Var.r - ((int) ((5.0f * f2) * f18))) < 0) {
                                i = 0;
                            }
                            oh2Var.r = i;
                        }
                        float f25 = (oh2Var.l * f2 * f18) + oh2Var.n;
                        oh2Var.n = f25;
                        if (f25 >= 360.0f) {
                            f = f8;
                            oh2Var.n = f;
                        } else {
                            f = f8;
                        }
                        float fAbs = oh2Var.o - ((Math.abs(oh2Var.k) * f2) * oh2Var.p);
                        oh2Var.o = fAbs;
                        if (fAbs < f) {
                            oh2Var.o = f17;
                            fAbs = f17;
                        }
                        oh2Var.s = Math.abs((fAbs / f17) - 0.5f) * 2.0f;
                        oh2Var.t = (oh2Var.r << 24) | (oh2Var.b & 16777215);
                        int i6 = (int) hsfVar5.a;
                        int i7 = (int) hsfVar5.b;
                        float f26 = i6;
                        f8 = 0.0f;
                        if (f26 >= 0.0f && f26 <= 0.0f + ju2Var.a) {
                            float f27 = i7;
                            if (f27 >= 0.0f && f27 <= 0.0f + f13) {
                                z2 = true;
                            }
                        }
                        oh2Var.u = z2;
                    }
                }
                x72.i0(wdd.c, arrayList2);
                ArrayList<oh2> arrayList5 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((oh2) obj3).u) {
                        arrayList5.add(obj3);
                    }
                }
                c = '\n';
                arrayList3 = new ArrayList(t72.u(arrayList5, 10));
                for (oh2 oh2Var2 : arrayList5) {
                    oh2Var2.getClass();
                    hsf hsfVar6 = oh2Var2.a;
                    float f28 = hsfVar6.a;
                    float f29 = hsfVar6.b;
                    float f30 = oh2Var2.c;
                    arrayList3.add(new r0a(f28, f29, f30, f30, oh2Var2.t, oh2Var2.n, oh2Var2.s, oh2Var2.e, oh2Var2.r));
                }
            }
            arrayList.add(arrayList3);
            qr7Var = this;
            c2 = c;
            j3 = j;
            it = it;
            jLongValue2 = j2;
        }
        e89Var.setValue(t72.y(arrayList));
        return wef.a;
    }
}

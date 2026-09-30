package defpackage;

import android.text.TextUtils;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class weh implements Closeable {
    public final weh a = null;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    public weh(String str, UUID uuid, String str2, qfh qfhVar) {
        this.d = str;
        this.b = uuid;
        this.c = str2;
        qfhVar.getClass();
        this.e = Thread.currentThread();
    }

    public static String b(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qfh qfhVarC = dfh.c();
        weh wehVar = qfhVarC.b;
        String str = this.d;
        if (wehVar == null) {
            throw new bfh(ib8.m(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == wehVar) {
            dfh.b(qfhVarC, wehVar.a);
            this.e = null;
            return;
        }
        String str2 = wehVar.d;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        ub3.v(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new cfh(sb.toString());
    }

    public abstract nfh h();

    public abstract nfh l();

    /* JADX WARN: Code duplicated, block: B:134:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f5  */
    public final String toString() {
        int i;
        int i2;
        e6 e6Var;
        Iterator it;
        ofh ofhVar;
        int i3;
        pfh pfhVar;
        AtomicReference atomicReference = dfh.a;
        int i4 = 0;
        int length = 0;
        weh wehVar = this;
        while (wehVar != null) {
            i4++;
            length += wehVar.d.length();
            wehVar = wehVar.a;
            if (wehVar != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            weh wehVar2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = wehVar2.d;
                wehVar2 = wehVar2.a;
            }
            os osVarB = ny6.b();
            gff it2 = ry6.o(strArr).iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                osVarB.q(it2.next(), Integer.valueOf(i6));
                i6++;
            }
            int i7 = 1;
            dpb dpbVarE = osVarB.e(true);
            int i8 = dpbVarE.f;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                e6Var = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) dpbVarE.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                wt4 wt4Var = new wt4(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    wt4Var.d += i7;
                    int i14 = iArr[i12];
                    while (true) {
                        pfh pfhVar2 = null;
                        while (true) {
                            if (wt4Var.d <= 0) {
                                i3 = i7;
                                break;
                            }
                            int i15 = wt4Var.c;
                            pfhVar = (pfh) wt4Var.g;
                            i3 = i7;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((pfh) pfhVar.d.get(Integer.valueOf(iArr[wt4Var.b]))).a;
                            int i17 = wt4Var.c;
                            if (iArr[i16 + i17] == i14) {
                                if (pfhVar2 != null) {
                                    pfhVar2.c = (pfh) wt4Var.g;
                                }
                                wt4Var.c = i17 + 1;
                                wt4Var.c();
                                break;
                            }
                            pfh pfhVar3 = (pfh) ((pfh) wt4Var.g).d.get(Integer.valueOf(iArr[wt4Var.b]));
                            int i18 = pfhVar3.a;
                            int i19 = i13;
                            pfh pfhVar4 = new pfh(i18, (wt4Var.c + i18) - 1);
                            ((pfh) wt4Var.g).d.put(Integer.valueOf(iArr[wt4Var.b]), pfhVar4);
                            int i20 = pfhVar4.b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = pfhVar4.d;
                            map.put(numValueOf, pfhVar3);
                            pfhVar3.a = i20;
                            if (pfhVar2 != null) {
                                pfhVar2.c = pfhVar4;
                            }
                            map.put(Integer.valueOf(i14), new pfh(i12, 1073741824));
                            wt4Var.d--;
                            wt4Var.d();
                            pfhVar2 = pfhVar4;
                            i7 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = pfhVar.d;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (pfhVar2 != null) {
                                pfhVar2.c = (pfh) wt4Var.g;
                            }
                            wt4Var.b = i12;
                            wt4Var.c++;
                            wt4Var.c();
                            break;
                        }
                        ((pfh) wt4Var.g).d.put(numValueOf2, new pfh(i12, 1073741824));
                        if (pfhVar2 != null) {
                            pfhVar2.c = (pfh) wt4Var.g;
                        }
                        wt4Var.d += i13;
                        wt4Var.d();
                        i7 = i3;
                    }
                    i12++;
                    i7 = i3;
                }
                int i21 = i7;
                ArrayDeque arrayDeque = new ArrayDeque();
                pfh pfhVar5 = (pfh) wt4Var.f;
                ofh ofhVar2 = new ofh(pfhVar5, 0, -1, -1);
                arrayDeque.push(ofhVar2);
                while (!arrayDeque.isEmpty()) {
                    ofh ofhVar3 = (ofh) arrayDeque.pop();
                    Iterator it3 = ofhVar3.d.d.values().iterator();
                    while (it3.hasNext()) {
                        pfh pfhVar6 = (pfh) it3.next();
                        int i22 = ofhVar3.b;
                        int i23 = ofhVar3.c;
                        int i24 = pfhVar6.a;
                        pfh pfhVar7 = pfhVar5;
                        int i25 = pfhVar6.b;
                        if (wt4Var.g(i22, i23, i24, i25)) {
                            it = it3;
                        } else {
                            if (pfhVar6.d.isEmpty()) {
                                int i26 = pfhVar6.a;
                                it = it3;
                                if (wt4Var.g(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (ofhVar2.a < ofhVar.a) {
                                    ofhVar2 = ofhVar;
                                }
                                arrayDeque.push(ofhVar);
                                pfhVar5 = pfhVar7;
                                it3 = it;
                                i21 = 1;
                            } else {
                                it = it3;
                            }
                            ofhVar = new ofh(pfhVar6, i21, pfhVar6.a, i25);
                            if (ofhVar2.a < ofhVar.a) {
                                ofhVar2 = ofhVar;
                            }
                            arrayDeque.push(ofhVar);
                            pfhVar5 = pfhVar7;
                            it3 = it;
                            i21 = 1;
                        }
                        ofhVar = new ofh(pfhVar6, ofhVar3.a + i21, i22, i23);
                        if (ofhVar2.a < ofhVar.a) {
                            ofhVar2 = ofhVar;
                        }
                        arrayDeque.push(ofhVar);
                        pfhVar5 = pfhVar7;
                        it3 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, ofhVar2.c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = ofhVar2.b;
                    i2 = iMin - i;
                    pfhVar5 = (pfh) pfhVar5.d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (pfhVar5 == null) {
                        break;
                    }
                    for (int i28 = pfhVar5.a; i28 < pfhVar5.b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                e6 e6Var2 = new e6(i, iMin, i29);
                if (i2 * i29 < i9) {
                    e6Var = null;
                } else {
                    e6Var = e6Var2;
                }
            }
            String strConcat = "";
            if (e6Var != null) {
                int i30 = e6Var.a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = e6Var.b;
                int i32 = e6Var.c;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        weh wehVar3 = this;
        while (wehVar3 != null) {
            String str = wehVar3.d;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            wehVar3 = wehVar3.a;
            if (wehVar3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }
}

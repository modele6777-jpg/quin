package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class smg implements Iterable, vqg, oqg {
    public final TreeMap a;
    public final TreeMap b;

    public smg(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                r(i, (vqg) list.get(i));
            }
        }
    }

    @Override // defpackage.vqg
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return new plg(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    @Override // defpackage.vqg
    public final String d() {
        return v(",");
    }

    @Override // defpackage.oqg
    public final vqg e(String str) {
        vqg vqgVar;
        if ("length".equals(str)) {
            return new vog(Double.valueOf(p()));
        }
        return (!k(str) || (vqgVar = (vqg) this.b.get(str)) == null) ? vqg.v0 : vqgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof smg)) {
            return false;
        }
        smg smgVar = (smg) obj;
        if (p() != smgVar.p()) {
            return false;
        }
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return smgVar.a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!q(iIntValue).equals(smgVar.q(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[LOOP:2: B:115:0x0277->B:117:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0301  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0338 A[LOOP:3: B:151:0x0332->B:153:0x0338, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0346  */
    /* JADX WARN: Code duplicated, block: B:157:0x034c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0363  */
    /* JADX WARN: Code duplicated, block: B:162:0x036a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0376  */
    /* JADX WARN: Code duplicated, block: B:173:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d6 A[LOOP:5: B:179:0x03d0->B:181:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:186:0x0403  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0410  */
    /* JADX WARN: Code duplicated, block: B:192:0x0416  */
    /* JADX WARN: Code duplicated, block: B:198:0x0433  */
    /* JADX WARN: Code duplicated, block: B:199:0x0436  */
    /* JADX WARN: Code duplicated, block: B:202:0x0442  */
    /* JADX WARN: Code duplicated, block: B:204:0x044a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0456  */
    /* JADX WARN: Code duplicated, block: B:209:0x0460  */
    /* JADX WARN: Code duplicated, block: B:211:0x0468  */
    /* JADX WARN: Code duplicated, block: B:213:0x047f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0485  */
    /* JADX WARN: Code duplicated, block: B:217:0x048b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0493  */
    /* JADX WARN: Code duplicated, block: B:221:0x0498  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:228:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:230:0x04c7 A[LOOP:6: B:226:0x04af->B:230:0x04c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x04e4 A[LOOP:7: B:233:0x04de->B:235:0x04e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0508 A[LOOP:8: B:237:0x0502->B:239:0x0508, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x052d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0535  */
    /* JADX WARN: Code duplicated, block: B:246:0x053f  */
    /* JADX WARN: Code duplicated, block: B:249:0x055d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0579  */
    /* JADX WARN: Code duplicated, block: B:252:0x0581  */
    /* JADX WARN: Code duplicated, block: B:255:0x0591  */
    /* JADX WARN: Code duplicated, block: B:256:0x0598  */
    /* JADX WARN: Code duplicated, block: B:259:0x059d  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:263:0x05af  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:274:0x05db  */
    /* JADX WARN: Code duplicated, block: B:276:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:281:0x0600  */
    /* JADX WARN: Code duplicated, block: B:283:0x0605  */
    /* JADX WARN: Code duplicated, block: B:285:0x060d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0613  */
    /* JADX WARN: Code duplicated, block: B:289:0x0619  */
    /* JADX WARN: Code duplicated, block: B:291:0x063b  */
    /* JADX WARN: Code duplicated, block: B:292:0x0646  */
    /* JADX WARN: Code duplicated, block: B:294:0x064c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0660  */
    /* JADX WARN: Code duplicated, block: B:299:0x067e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0687 A[LOOP:10: B:300:0x067f->B:302:0x0687, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x069f A[LOOP:11: B:305:0x069f->B:321:0x06f1, LOOP_START, PHI: r9 r35
  0x069f: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:304:0x069d, B:321:0x06f1] A[DONT_GENERATE, DONT_INLINE]
  0x069f: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:304:0x069d, B:321:0x06f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:309:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:311:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:313:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:318:0x06df  */
    /* JADX WARN: Code duplicated, block: B:326:0x0717 A[LOOP:13: B:326:0x0717->B:328:0x071a, LOOP_START, PHI: r0
  0x0717: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:296:0x065e, B:328:0x071a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:328:0x071a A[LOOP:13: B:326:0x0717->B:328:0x071a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:330:0x072c  */
    /* JADX WARN: Code duplicated, block: B:332:0x0734  */
    /* JADX WARN: Code duplicated, block: B:334:0x073a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0745  */
    /* JADX WARN: Code duplicated, block: B:338:0x075b  */
    /* JADX WARN: Code duplicated, block: B:340:0x0761  */
    /* JADX WARN: Code duplicated, block: B:342:0x0767  */
    /* JADX WARN: Code duplicated, block: B:345:0x0785 A[LOOP:14: B:343:0x077f->B:345:0x0785, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:347:0x079c  */
    /* JADX WARN: Code duplicated, block: B:348:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:350:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:352:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:355:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:357:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:362:0x07e5 A[LOOP:16: B:360:0x07df->B:362:0x07e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x0808  */
    /* JADX WARN: Code duplicated, block: B:368:0x0810  */
    /* JADX WARN: Code duplicated, block: B:370:0x0820  */
    /* JADX WARN: Code duplicated, block: B:379:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0710 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x06f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0800 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x07d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (defpackage.xxb.x(r7, r2, (defpackage.uqg) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() != r7.p()) goto L171;
     */
    @Override // defpackage.vqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vqg g(java.lang.String r37, defpackage.kxa r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 2170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smg.g(java.lang.String, kxa, java.util.ArrayList):vqg");
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.oqg
    public final void i(String str, vqg vqgVar) {
        TreeMap treeMap = this.b;
        if (vqgVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, vqgVar);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zqg(2, this);
    }

    @Override // defpackage.vqg
    public final Double j() {
        TreeMap treeMap = this.a;
        if (treeMap.size() == 1) {
            return q(0).j();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.oqg
    public final boolean k(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    @Override // defpackage.vqg
    public final vqg m() {
        smg smgVar = new smg();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof oqg;
            TreeMap treeMap = smgVar.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (vqg) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((vqg) entry.getValue()).m());
            }
        }
        return smgVar;
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i = 0; i < p(); i++) {
            arrayList.add(q(i));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.a.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final vqg q(int i) {
        vqg vqgVar;
        if (i < p()) {
            return (!s(i) || (vqgVar = (vqg) this.a.get(Integer.valueOf(i))) == null) ? vqg.v0 : vqgVar;
        }
        r3.i("Attempting to get element outside of current array");
        return null;
    }

    public final void r(int i, vqg vqgVar) {
        if (i > 32468) {
            qc0.p("Array too large");
            return;
        }
        if (i < 0) {
            r3.i(ub3.h(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.a;
        if (vqgVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), vqgVar);
        }
    }

    public final boolean s(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        r3.i(ub3.h(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void t(int i) {
        TreeMap treeMap = this.a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, vqg.v0);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            vqg vqgVar = (vqg) treeMap.get(numValueOf2);
            if (vqgVar != null) {
                treeMap.put(Integer.valueOf(i - 1), vqgVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String toString() {
        return v(",");
    }

    public final String v(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= p()) {
                    break;
                }
                vqg vqgVarQ = q(i);
                sb.append(str2);
                if (!(vqgVarQ instanceof grg) && !(vqgVarQ instanceof tqg)) {
                    sb.append(vqgVarQ.d());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public smg() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
}

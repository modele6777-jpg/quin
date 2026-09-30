package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fmg extends wbh {
    public String e;
    public HashSet f;
    public kd0 g;
    public Long v;
    public Long w;

    /* JADX WARN: Code duplicated, block: B:102:0x023a A[LOOP:20: B:85:0x01ec->B:102:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b8 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, LOOP:11: B:131:0x02b8->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0329  */
    /* JADX WARN: Code duplicated, block: B:162:0x0337  */
    /* JADX WARN: Code duplicated, block: B:164:0x034e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0449  */
    /* JADX WARN: Code duplicated, block: B:194:0x045a  */
    /* JADX WARN: Code duplicated, block: B:196:0x047a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0491  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:217:0x04db  */
    /* JADX WARN: Code duplicated, block: B:223:0x0511  */
    /* JADX WARN: Code duplicated, block: B:226:0x051a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0526  */
    /* JADX WARN: Code duplicated, block: B:230:0x0546  */
    /* JADX WARN: Code duplicated, block: B:231:0x054a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0582  */
    /* JADX WARN: Code duplicated, block: B:249:0x059e  */
    /* JADX WARN: Code duplicated, block: B:252:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:255:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:262:0x0605  */
    /* JADX WARN: Code duplicated, block: B:265:0x0619  */
    /* JADX WARN: Code duplicated, block: B:271:0x064c  */
    /* JADX WARN: Code duplicated, block: B:275:0x068d  */
    /* JADX WARN: Code duplicated, block: B:282:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:288:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:299:0x06ef A[LOOP:3: B:276:0x068f->B:299:0x06ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:315:0x0720  */
    /* JADX WARN: Code duplicated, block: B:320:0x072b  */
    /* JADX WARN: Code duplicated, block: B:322:0x072f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0741  */
    /* JADX WARN: Code duplicated, block: B:332:0x076e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0799  */
    /* JADX WARN: Code duplicated, block: B:336:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:339:0x07b1 A[LOOP:5: B:330:0x0768->B:339:0x07b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:349:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:354:0x0802  */
    /* JADX WARN: Code duplicated, block: B:358:0x083d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0865  */
    /* JADX WARN: Code duplicated, block: B:371:0x0876  */
    /* JADX WARN: Code duplicated, block: B:382:0x08a3 A[LOOP:7: B:359:0x083f->B:382:0x08a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:400:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:404:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:406:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:410:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:414:0x091d  */
    /* JADX WARN: Code duplicated, block: B:417:0x092e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0943  */
    /* JADX WARN: Code duplicated, block: B:421:0x094f  */
    /* JADX WARN: Code duplicated, block: B:423:0x095a  */
    /* JADX WARN: Code duplicated, block: B:425:0x0981  */
    /* JADX WARN: Code duplicated, block: B:428:0x098b  */
    /* JADX WARN: Code duplicated, block: B:441:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:442:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a0c A[PHI: r21 r22
  0x0a0c: PHI (r21v20 java.util.Map) = (r21v21 java.util.Map), (r0v78 java.util.Map) binds: [B:445:0x0a0a, B:443:0x09fc] A[DONT_GENERATE, DONT_INLINE]
  0x0a0c: PHI (r22v6 wid) = (r22v7 wid), (r2v41 wid) binds: [B:445:0x0a0a, B:443:0x09fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:467:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:536:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06ea A[EDGE_INSN: B:542:0x06ea->B:298:0x06ea BREAK  A[LOOP:3: B:276:0x068f->B:299:0x06ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x089e A[EDGE_INSN: B:553:0x089e->B:381:0x089e BREAK  A[LOOP:7: B:359:0x083f->B:382:0x08a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x090e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a11 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0a8f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a2d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0354 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0236 A[EDGE_INSN: B:604:0x0236->B:101:0x0236 BREAK  A[LOOP:20: B:85:0x01ec->B:102:0x023a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:472:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5 A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:472:0x01c5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v31, types: [wid] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v19, types: [wid] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [w3h] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [w3h] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v15 */
    /* JADX WARN: Type inference failed for: r38v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v18 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v21 */
    /* JADX WARN: Type inference failed for: r38v22 */
    /* JADX WARN: Type inference failed for: r38v23 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v25 */
    /* JADX WARN: Type inference failed for: r38v26 */
    /* JADX WARN: Type inference failed for: r38v27 */
    /* JADX WARN: Type inference failed for: r38v28 */
    /* JADX WARN: Type inference failed for: r38v29 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v30 */
    /* JADX WARN: Type inference failed for: r38v31 */
    /* JADX WARN: Type inference failed for: r38v32 */
    /* JADX WARN: Type inference failed for: r38v33 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r3v56, types: [tz0] */
    /* JADX WARN: Type inference failed for: r3v70, types: [tz0] */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v70, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v71, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
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
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList E0(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        boolean z4;
        Map map3;
        Map map4;
        Map map5;
        ?? r10;
        ich ichVar;
        String str5;
        e4h e4hVar;
        BitSet bitSet;
        BitSet bitSet2;
        kd0 kd0Var;
        e4h e4hVar2;
        kd0 kd0Var2;
        boolean z5;
        List<lyg> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z6;
        Iterator it;
        h4h h4hVar;
        Long lValueOf;
        krg krgVarH0;
        String str6;
        ?? kd0Var3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        kd0 kd0Var4;
        Iterator it2;
        Integer num;
        e4h e4hVar3;
        List list4;
        ?? r18;
        Iterator it3;
        boolean z7;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        krg krgVarH1;
        w3h w3hVar;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        wid widVar;
        String strT;
        Map map6;
        Iterator it5;
        wid widVar2;
        int iIntValue;
        Iterator it6;
        boolean zJ;
        wid widVar3;
        uyg uygVar;
        Integer numValueOf3;
        akg akgVar;
        int i2;
        Integer numValueOf4;
        w3h w3hVar2;
        String str9;
        kd0 kd0Var5;
        Cursor cursor;
        w3h w3hVar3;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        ws4 ws4Var;
        ?? kd0Var6;
        v2h v2hVarF;
        bsg bsgVarK1;
        long j;
        String strW;
        Map map7;
        int iIntValue2;
        Iterator it7;
        boolean zI;
        Map map8;
        ws4 ws4Var2;
        Integer num2;
        akg akgVar2;
        int iS;
        ggh gghVar;
        boolean z8;
        String str10;
        kd0 kd0Var7;
        ?? r8;
        String str11;
        ?? r2;
        ?? r38;
        ?? r39;
        ?? Query;
        ?? r310;
        ?? r311;
        ?? r312;
        ?? r313;
        Integer numValueOf6;
        List list6;
        ?? r314;
        List arrayList4;
        kd0 kd0Var8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        w3h w3hVar4 = (w3h) this.b;
        oa7.x(str);
        oa7.A(list);
        oa7.A(list2);
        this.e = str;
        this.f = new HashSet();
        this.g = new kd0();
        this.v = l;
        this.w = l2;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((v2h) it8.next()).w())) {
                z2 = true;
                break;
            }
        }
        hpg.a();
        boolean zL0 = w3hVar4.d.L0(this.e, bzg.F0);
        hpg.a();
        boolean zL1 = w3hVar4.d.L0(this.e, bzg.E0);
        ich ichVar2 = this.c;
        if (z2) {
            krg krgVarH2 = ichVar2.h0();
            String str12 = this.e;
            krgVarH2.B0();
            krgVarH2.A0();
            oa7.x(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                krgVarH2.r1().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e) {
                ((w3h) krgVarH2.b).v().g.c(w0h.E0(str12), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "Failed to merge filter. appId";
        Object objE0 = "Database error querying filters. appId";
        String str14 = "audience_id";
        try {
            try {
                try {
                    if (zL1 && zL0) {
                        krg krgVarH3 = ichVar2.h0();
                        w3h w3hVar5 = (w3h) krgVarH3.b;
                        String str15 = this.e;
                        oa7.x(str15);
                        z3 = z2;
                        kd0 kd0Var9 = new kd0();
                        try {
                            ?? Query2 = krgVarH3.r1().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str15}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    lyg lygVar = (lyg) ((kyg) lch.l1(lyg.D(), Query2.getBlob(1))).e();
                                                    if (lygVar.x()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) kd0Var9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            kd0Var9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(lygVar);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    w3hVar5.v().g.c(w0h.E0(str15), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        w3hVar5.v().g.c(w0h.E0(str15), e, "Database error querying filters. appId");
                                                        map9 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map9;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                w3hVar5.v().g.c(w0h.E0(str15), e, "Database error querying filters. appId");
                                                map9 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map9;
                                                krg krgVarH4 = ichVar2.h0();
                                                obj = (w3h) krgVarH4.b;
                                                r5 = this.e;
                                                krgVarH4.B0();
                                                krgVarH4.A0();
                                                oa7.x(r5);
                                                cursorQuery = krgVarH4.r1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    kd0Var8 = new kd0();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                e4h e4hVar4 = (e4h) ((d4h) lch.l1(e4h.z(), cursorQuery.getBlob(1))).e();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                kd0Var8.put(objValueOf, e4hVar4);
                                                                str3 = str13;
                                                                obj2 = objE0;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                tz0 tz0Var = r17.v().g;
                                                                str3 = str13;
                                                                str13 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objE0;
                                                                try {
                                                                    objE0 = w0h.E0(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    tz0Var.d("Failed to merge filter results. appId, audienceId, error", objE0, numValueOf8, e5);
                                                                    obj3 = tz0Var;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.v().g.c(w0h.E0(r21), e, "Database error querying filter results. appId");
                                                                    Map map10 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map10;
                                                                    if (map2.isEmpty()) {
                                                                        r10 = obj2;
                                                                        ichVar = ichVar2;
                                                                        str5 = "audience_id";
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str16 = this.e;
                                                                            krgVarH0 = ichVar2.h0();
                                                                            str6 = this.e;
                                                                            krgVarH0.B0();
                                                                            krgVarH0.A0();
                                                                            oa7.x(str6);
                                                                            kd0Var3 = new kd0();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = krgVarH0.r1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) kd0Var3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    kd0Var3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            kd0Var3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((w3h) krgVarH0.b).v().g.c(w0h.E0(str6), e, "Database error querying scoped filters. appId");
                                                                                        kd0Var3 = Collections.EMPTY_MAP;
                                                                                        r0 = kd0Var3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        oa7.x(str16);
                                                                                        kd0Var4 = new kd0();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                e4hVar3 = (e4h) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                z7 = zL0;
                                                                                                kd0Var4.put(num, e4hVar3);
                                                                                                r0 = r18;
                                                                                                str14 = str14;
                                                                                                it2 = it3;
                                                                                                zL0 = z7;
                                                                                            }
                                                                                        }
                                                                                        str4 = str14;
                                                                                        z4 = zL0;
                                                                                        map3 = kd0Var4;
                                                                                        map5 = map2;
                                                                                        map4 = map3;
                                                                                        for (Integer num3 : hashSet) {
                                                                                            num3.getClass();
                                                                                            e4hVar = (e4h) map4.get(num3);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            kd0Var = new kd0();
                                                                                            if (e4hVar != null) {
                                                                                                for (s2h s2hVar : e4hVar.v()) {
                                                                                                    if (s2hVar.r()) {
                                                                                                        e4h e4hVar5 = e4hVar;
                                                                                                        Integer numValueOf9 = Integer.valueOf(s2hVar.s());
                                                                                                        if (s2hVar.t()) {
                                                                                                            lValueOf = Long.valueOf(s2hVar.u());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        kd0Var.put(numValueOf9, lValueOf);
                                                                                                        e4hVar = e4hVar5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            e4hVar2 = e4hVar;
                                                                                            kd0Var2 = new kd0();
                                                                                            if (e4hVar2 != null) {
                                                                                                it = e4hVar2.x().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    h4hVar = (h4h) it.next();
                                                                                                    if (!h4hVar.r()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map11 = map4;
                                                                                            if (e4hVar2 != null) {
                                                                                                i = 0;
                                                                                                while (i < e4hVar2.s() * 64) {
                                                                                                    if (lch.f1((ymg) e4hVar2.r(), i)) {
                                                                                                        z6 = zL1;
                                                                                                        w3hVar4.v().Z.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (lch.f1((ymg) e4hVar2.t(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zL1 = z6;
                                                                                                    } else {
                                                                                                        z6 = zL1;
                                                                                                    }
                                                                                                    kd0Var.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zL1 = z6;
                                                                                                }
                                                                                            }
                                                                                            z5 = zL1;
                                                                                            e4h e4hVar6 = (e4h) map5.get(num3);
                                                                                            if (z5) {
                                                                                                for (lyg lygVar2 : list3) {
                                                                                                    int iS2 = lygVar2.s();
                                                                                                    Integer num4 = num3;
                                                                                                    jLongValue = this.w.longValue() / 1000;
                                                                                                    if (lygVar2.A()) {
                                                                                                        jLongValue = this.v.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iS2);
                                                                                                    if (kd0Var.containsKey(numValueOf)) {
                                                                                                        kd0Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (kd0Var2.containsKey(numValueOf)) {
                                                                                                        kd0Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num3 = num4;
                                                                                                }
                                                                                            }
                                                                                            this.g.put(num3, new ggh(this, this.e, e4hVar6, bitSet, bitSet2, kd0Var, kd0Var2));
                                                                                            ichVar2 = ichVar2;
                                                                                            zL1 = z5;
                                                                                            map5 = map5;
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str3 = str3;
                                                                                            map4 = map11;
                                                                                        }
                                                                                        r10 = obj2;
                                                                                        ichVar = ichVar2;
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str17 = str3;
                                                                                        if (!list.isEmpty()) {
                                                                                            ws4Var = new ws4(this);
                                                                                            kd0Var6 = new kd0();
                                                                                            for (v2h v2hVar : list) {
                                                                                                v2hVarF = ws4Var.f(this.e, v2hVar);
                                                                                                if (v2hVarF != null) {
                                                                                                    bsgVarK1 = ichVar.h0().k1(this.e, v2hVar, v2hVarF.w());
                                                                                                    ichVar.h0().b1("events", bsgVarK1);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = bsgVarK1.c;
                                                                                                        strW = v2hVarF.w();
                                                                                                        map7 = (Map) kd0Var6.get(strW);
                                                                                                        if (map7 == null) {
                                                                                                            krg krgVarH5 = ichVar.h0();
                                                                                                            w3h w3hVar6 = (w3h) krgVarH5.b;
                                                                                                            str10 = this.e;
                                                                                                            krgVarH5.B0();
                                                                                                            krgVarH5.A0();
                                                                                                            oa7.x(str10);
                                                                                                            oa7.x(strW);
                                                                                                            kd0Var7 = new kd0();
                                                                                                            try {
                                                                                                                Query = krgVarH5.r1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str11 = str10;
                                                                                                                            Query = Query;
                                                                                                                            r312 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        lyg lygVar3 = (lyg) ((kyg) lch.l1(lyg.D(), Query.getBlob(1))).e();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) kd0Var7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r312 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                kd0Var7.put(numValueOf6, arrayList4);
                                                                                                                                                r314 = r312;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r311 = r312;
                                                                                                                                                r2 = r311;
                                                                                                                                                r38 = r311;
                                                                                                                                                try {
                                                                                                                                                    w3hVar6.v().g.c(w0h.E0(str11), e, r10);
                                                                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                                                                    r39 = r38;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r39 = r38;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r310 = r312;
                                                                                                                                                r8 = r310;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r314 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(lygVar3);
                                                                                                                                        r313 = r314;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r313 = Query;
                                                                                                                                        w3hVar6.v().g.c(w0h.E0(str11), e9, str17);
                                                                                                                                    }
                                                                                                                                    if (!r313.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r313;
                                                                                                                                    r312 = r313;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r311 = Query;
                                                                                                                                    r2 = r311;
                                                                                                                                    r38 = r311;
                                                                                                                                    w3hVar6.v().g.c(w0h.E0(str11), e, r10);
                                                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                                                    r39 = r38;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r39 = r38;
                                                                                                                                    }
                                                                                                                                    kd0Var6.put(strW, map7);
                                                                                                                                    list = r39;
                                                                                                                                    for (Integer num5 : map7.keySet()) {
                                                                                                                                        iIntValue2 = num5.intValue();
                                                                                                                                        if (this.f.contains(num5)) {
                                                                                                                                            w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it7 = ((List) map7.get(num5)).iterator();
                                                                                                                                            zI = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it7.hasNext()) {
                                                                                                                                                    map8 = map7;
                                                                                                                                                    ws4Var2 = ws4Var;
                                                                                                                                                    num2 = num5;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                lyg lygVar4 = (lyg) it7.next();
                                                                                                                                                map8 = map7;
                                                                                                                                                ws4Var2 = ws4Var;
                                                                                                                                                num2 = num5;
                                                                                                                                                akgVar2 = new akg(this, this.e, iIntValue2, lygVar4, 0);
                                                                                                                                                Long l3 = this.v;
                                                                                                                                                Long l4 = this.w;
                                                                                                                                                iS = lygVar4.s();
                                                                                                                                                gghVar = (ggh) this.g.get(num2);
                                                                                                                                                if (gghVar == null) {
                                                                                                                                                    z8 = false;
                                                                                                                                                } else {
                                                                                                                                                    z8 = gghVar.d.get(iS);
                                                                                                                                                }
                                                                                                                                                zI = akgVar2.i(l3, l4, v2hVarF, j, bsgVarK1, z8);
                                                                                                                                                if (!zI) {
                                                                                                                                                    this.f.add(num2);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                F0(num2).a(akgVar2);
                                                                                                                                                num5 = num2;
                                                                                                                                                map7 = map8;
                                                                                                                                                ws4Var = ws4Var2;
                                                                                                                                            }
                                                                                                                                            if (!zI) {
                                                                                                                                                this.f.add(num2);
                                                                                                                                            }
                                                                                                                                            ws4Var = ws4Var2;
                                                                                                                                            map7 = map8;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r313.close();
                                                                                                                            map7 = kd0Var7;
                                                                                                                            r39 = r313;
                                                                                                                        } else {
                                                                                                                            ?? r315 = Query;
                                                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                                                            r315.close();
                                                                                                                            r39 = r315;
                                                                                                                        }
                                                                                                                    } catch (Throwable th5) {
                                                                                                                        th = th5;
                                                                                                                        r310 = Query;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e11) {
                                                                                                                    e = e11;
                                                                                                                    str11 = str10;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str11 = str10;
                                                                                                                r2 = 0;
                                                                                                                r38 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            kd0Var6.put(strW, map7);
                                                                                                            list = r39;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num5.intValue();
                                                                                                            if (this.f.contains(num5)) {
                                                                                                                w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it7 = ((List) map7.get(num5)).iterator();
                                                                                                                zI = true;
                                                                                                                while (true) {
                                                                                                                    if (!it7.hasNext()) {
                                                                                                                        map8 = map7;
                                                                                                                        ws4Var2 = ws4Var;
                                                                                                                        num2 = num5;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    lyg lygVar5 = (lyg) it7.next();
                                                                                                                    map8 = map7;
                                                                                                                    ws4Var2 = ws4Var;
                                                                                                                    num2 = num5;
                                                                                                                    akgVar2 = new akg(this, this.e, iIntValue2, lygVar5, 0);
                                                                                                                    Long l5 = this.v;
                                                                                                                    Long l6 = this.w;
                                                                                                                    iS = lygVar5.s();
                                                                                                                    gghVar = (ggh) this.g.get(num2);
                                                                                                                    if (gghVar == null) {
                                                                                                                        z8 = false;
                                                                                                                    } else {
                                                                                                                        z8 = gghVar.d.get(iS);
                                                                                                                    }
                                                                                                                    zI = akgVar2.i(l5, l6, v2hVarF, j, bsgVarK1, z8);
                                                                                                                    if (!zI) {
                                                                                                                        this.f.add(num2);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    F0(num2).a(akgVar2);
                                                                                                                    num5 = num2;
                                                                                                                    map7 = map8;
                                                                                                                    ws4Var = ws4Var2;
                                                                                                                }
                                                                                                                if (!zI) {
                                                                                                                    this.f.add(num2);
                                                                                                                }
                                                                                                                ws4Var = ws4Var2;
                                                                                                                map7 = map8;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            kd0 kd0Var10 = new kd0();
                                                                                            it4 = list2.iterator();
                                                                                            widVar = kd0Var10;
                                                                                            while (it4.hasNext()) {
                                                                                                p4h p4hVar = (p4h) it4.next();
                                                                                                strT = p4hVar.t();
                                                                                                map6 = (Map) widVar.get(strT);
                                                                                                if (map6 == null) {
                                                                                                    krg krgVarH6 = ichVar.h0();
                                                                                                    w3hVar2 = (w3h) krgVarH6.b;
                                                                                                    str9 = this.e;
                                                                                                    krgVarH6.B0();
                                                                                                    krgVarH6.A0();
                                                                                                    oa7.x(str9);
                                                                                                    oa7.x(strT);
                                                                                                    kd0Var5 = new kd0();
                                                                                                    try {
                                                                                                        cursorQuery2 = krgVarH6.r1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                uyg uygVar2 = (uyg) ((syg) lch.l1(uyg.z(), cursorQuery2.getBlob(1))).e();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) kd0Var5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    w3hVar3 = w3hVar2;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        kd0Var5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str7 = str7;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            w3hVar3.v().g.c(w0h.E0(str9), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            widVar.put(strT, map6);
                                                                                                                                            widVar2 = widVar;
                                                                                                                                            for (Integer num6 : map6.keySet()) {
                                                                                                                                                iIntValue = num6.intValue();
                                                                                                                                                if (this.f.contains(num6)) {
                                                                                                                                                    w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                                                                                zJ = true;
                                                                                                                                                widVar3 = widVar2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it6.hasNext()) {
                                                                                                                                                        uygVar = (uyg) it6.next();
                                                                                                                                                        if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                                                                                                                            tz0 tz0Var2 = w3hVar4.v().Z;
                                                                                                                                                            if (uygVar.r()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(uygVar.s());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            tz0Var2.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                                                                                                                            w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (uygVar.r()) {
                                                                                                                                                        }
                                                                                                                                                        tz0 tz0Var3 = w3hVar4.v().x;
                                                                                                                                                        t0h t0hVarE0 = w0h.E0(this.e);
                                                                                                                                                        if (uygVar.r()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(uygVar.s());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        tz0Var3.c(t0hVarE0, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.f.add(num6);
                                                                                                                                                        map6 = map6;
                                                                                                                                                        widVar2 = widVar3;
                                                                                                                                                    } else {
                                                                                                                                                        map6 = map6;
                                                                                                                                                        widVar3 = widVar3;
                                                                                                                                                    }
                                                                                                                                                    if (!zJ) {
                                                                                                                                                        this.f.add(num6);
                                                                                                                                                    }
                                                                                                                                                    map6 = map6;
                                                                                                                                                    widVar2 = widVar3;
                                                                                                                                                    F0(num6).a(akgVar);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map6;
                                                                                                                                                    widVar3 = widVar3;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            str7 = str7;
                                                                                                                                            it4 = it5;
                                                                                                                                            widVar = widVar2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    w3hVar3 = w3hVar2;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(uygVar2);
                                                                                                                            } catch (IOException e14) {
                                                                                                                                w3hVar3 = w3hVar2;
                                                                                                                                w3hVar3.v().g.c(w0h.E0(str9), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                w3hVar2 = w3hVar3;
                                                                                                                                str7 = str7;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                w3hVar3.v().g.c(w0h.E0(str9), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            w3hVar3 = w3hVar2;
                                                                                                                            str7 = str7;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            w3hVar3.v().g.c(w0h.E0(str9), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            widVar.put(strT, map6);
                                                                                                                            widVar2 = widVar;
                                                                                                                            while (r3.hasNext()) {
                                                                                                                                iIntValue = num6.intValue();
                                                                                                                                if (this.f.contains(num6)) {
                                                                                                                                    w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                                                                zJ = true;
                                                                                                                                widVar3 = widVar2;
                                                                                                                                while (true) {
                                                                                                                                    if (it6.hasNext()) {
                                                                                                                                        uygVar = (uyg) it6.next();
                                                                                                                                        if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                                                                                                            tz0 tz0Var4 = w3hVar4.v().Z;
                                                                                                                                            if (uygVar.r()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(uygVar.s());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            tz0Var4.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                                                                                                            w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (uygVar.r()) {
                                                                                                                                        }
                                                                                                                                        tz0 tz0Var5 = w3hVar4.v().x;
                                                                                                                                        t0h t0hVarE1 = w0h.E0(this.e);
                                                                                                                                        if (uygVar.r()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(uygVar.s());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        tz0Var5.c(t0hVarE1, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.f.add(num6);
                                                                                                                                        map6 = map6;
                                                                                                                                        widVar2 = widVar3;
                                                                                                                                    } else {
                                                                                                                                        map6 = map6;
                                                                                                                                        widVar3 = widVar3;
                                                                                                                                    }
                                                                                                                                    if (!zJ) {
                                                                                                                                        this.f.add(num6);
                                                                                                                                    }
                                                                                                                                    map6 = map6;
                                                                                                                                    widVar2 = widVar3;
                                                                                                                                    F0(num6).a(akgVar);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map6;
                                                                                                                                    widVar3 = widVar3;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            str7 = str7;
                                                                                                                            it4 = it5;
                                                                                                                            widVar = widVar2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = kd0Var5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    str7 = str7;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it5 = it4;
                                                                                                            }
                                                                                                            widVar.put(strT, map6);
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        w3hVar3 = w3hVar2;
                                                                                                        str7 = str7;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                    str7 = str7;
                                                                                                }
                                                                                                widVar2 = widVar;
                                                                                                while (r3.hasNext()) {
                                                                                                    iIntValue = num6.intValue();
                                                                                                    if (this.f.contains(num6)) {
                                                                                                        w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it6 = ((List) map6.get(num6)).iterator();
                                                                                                    zJ = true;
                                                                                                    widVar3 = widVar2;
                                                                                                    while (true) {
                                                                                                        if (it6.hasNext()) {
                                                                                                            uygVar = (uyg) it6.next();
                                                                                                            if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                                                                                tz0 tz0Var6 = w3hVar4.v().Z;
                                                                                                                if (uygVar.r()) {
                                                                                                                    numValueOf4 = Integer.valueOf(uygVar.s());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                tz0Var6.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                                                                                w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                                                                                            }
                                                                                                            if (uygVar.r()) {
                                                                                                            }
                                                                                                            tz0 tz0Var7 = w3hVar4.v().x;
                                                                                                            t0h t0hVarE2 = w0h.E0(this.e);
                                                                                                            if (uygVar.r()) {
                                                                                                                numValueOf3 = Integer.valueOf(uygVar.s());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            tz0Var7.c(t0hVarE2, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.f.add(num6);
                                                                                                            map6 = map6;
                                                                                                            widVar2 = widVar3;
                                                                                                        } else {
                                                                                                            map6 = map6;
                                                                                                            widVar3 = widVar3;
                                                                                                        }
                                                                                                        if (!zJ) {
                                                                                                            this.f.add(num6);
                                                                                                        }
                                                                                                        map6 = map6;
                                                                                                        widVar2 = widVar3;
                                                                                                        F0(num6).a(akgVar);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map6;
                                                                                                        widVar3 = widVar3;
                                                                                                    }
                                                                                                }
                                                                                                str7 = str7;
                                                                                                it4 = it5;
                                                                                                widVar = widVar2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        gd0<Integer> gd0Var = (gd0) this.g.keySet();
                                                                                        gd0Var.removeAll(this.f);
                                                                                        for (Integer num7 : gd0Var) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            ggh gghVar2 = (ggh) this.g.get(num7);
                                                                                            oa7.A(gghVar2);
                                                                                            z1h z1hVarB = gghVar2.b(iIntValue3);
                                                                                            arrayList2.add(z1hVarB);
                                                                                            krgVarH1 = ichVar.h0();
                                                                                            w3hVar = (w3h) krgVarH1.b;
                                                                                            str8 = this.e;
                                                                                            e4h e4hVarT = z1hVarB.t();
                                                                                            krgVarH1.B0();
                                                                                            krgVarH1.A0();
                                                                                            oa7.x(str8);
                                                                                            oa7.A(e4hVarT);
                                                                                            byte[] bArrA = e4hVarT.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (krgVarH1.r1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        w3hVar.v().g.b(w0h.E0(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    w3hVar.v().g.c(w0h.E0(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = kd0Var3;
                                                                                oa7.x(str16);
                                                                                kd0Var4 = new kd0();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        e4hVar3 = (e4h) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        z7 = zL0;
                                                                                        kd0Var4.put(num, e4hVar3);
                                                                                        r0 = r18;
                                                                                        str14 = str14;
                                                                                        it2 = it3;
                                                                                        zL0 = z7;
                                                                                    }
                                                                                }
                                                                                str4 = str14;
                                                                                z4 = zL0;
                                                                                map3 = kd0Var4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            z4 = zL0;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map2;
                                                                        map4 = map3;
                                                                        while (r17.hasNext()) {
                                                                            num3.getClass();
                                                                            e4hVar = (e4h) map4.get(num3);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            kd0Var = new kd0();
                                                                            if (e4hVar != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (s2hVar.r()) {
                                                                                        e4h e4hVar7 = e4hVar;
                                                                                        Integer numValueOf10 = Integer.valueOf(s2hVar.s());
                                                                                        if (s2hVar.t()) {
                                                                                            lValueOf = Long.valueOf(s2hVar.u());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        kd0Var.put(numValueOf10, lValueOf);
                                                                                        e4hVar = e4hVar7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e4hVar2 = e4hVar;
                                                                            kd0Var2 = new kd0();
                                                                            if (e4hVar2 != null) {
                                                                                it = e4hVar2.x().iterator();
                                                                                while (it.hasNext()) {
                                                                                    h4hVar = (h4h) it.next();
                                                                                    if (!h4hVar.r()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map12 = map4;
                                                                            if (e4hVar2 != null) {
                                                                                i = 0;
                                                                                while (i < e4hVar2.s() * 64) {
                                                                                    if (lch.f1((ymg) e4hVar2.r(), i)) {
                                                                                        z6 = zL1;
                                                                                        w3hVar4.v().Z.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (lch.f1((ymg) e4hVar2.t(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zL1 = z6;
                                                                                    } else {
                                                                                        z6 = zL1;
                                                                                    }
                                                                                    kd0Var.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zL1 = z6;
                                                                                }
                                                                            }
                                                                            z5 = zL1;
                                                                            e4h e4hVar8 = (e4h) map5.get(num3);
                                                                            if (z5) {
                                                                                while (r2.hasNext()) {
                                                                                    int iS3 = lygVar2.s();
                                                                                    Integer num8 = num3;
                                                                                    jLongValue = this.w.longValue() / 1000;
                                                                                    if (lygVar2.A()) {
                                                                                        jLongValue = this.v.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iS3);
                                                                                    if (kd0Var.containsKey(numValueOf)) {
                                                                                        kd0Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (kd0Var2.containsKey(numValueOf)) {
                                                                                        kd0Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num3 = num8;
                                                                                }
                                                                            }
                                                                            this.g.put(num3, new ggh(this, this.e, e4hVar8, bitSet, bitSet2, kd0Var, kd0Var2));
                                                                            ichVar2 = ichVar2;
                                                                            zL1 = z5;
                                                                            map5 = map5;
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str3 = str3;
                                                                            map4 = map12;
                                                                        }
                                                                        r10 = obj2;
                                                                        ichVar = ichVar2;
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str18 = str3;
                                                                    if (!list.isEmpty()) {
                                                                        ws4Var = new ws4(this);
                                                                        kd0Var6 = new kd0();
                                                                        while (r17.hasNext()) {
                                                                            v2hVarF = ws4Var.f(this.e, v2hVar);
                                                                            if (v2hVarF != null) {
                                                                                bsgVarK1 = ichVar.h0().k1(this.e, v2hVar, v2hVarF.w());
                                                                                ichVar.h0().b1("events", bsgVarK1);
                                                                                if (z) {
                                                                                    j = bsgVarK1.c;
                                                                                    strW = v2hVarF.w();
                                                                                    map7 = (Map) kd0Var6.get(strW);
                                                                                    if (map7 == null) {
                                                                                        krg krgVarH7 = ichVar.h0();
                                                                                        w3h w3hVar7 = (w3h) krgVarH7.b;
                                                                                        str10 = this.e;
                                                                                        krgVarH7.B0();
                                                                                        krgVarH7.A0();
                                                                                        oa7.x(str10);
                                                                                        oa7.x(strW);
                                                                                        kd0Var7 = new kd0();
                                                                                        Query = krgVarH7.r1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str11 = str10;
                                                                                            Query = Query;
                                                                                            r312 = list;
                                                                                            while (true) {
                                                                                                lyg lygVar6 = (lyg) ((kyg) lch.l1(lyg.D(), Query.getBlob(1))).e();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) kd0Var7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r312 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    kd0Var7.put(numValueOf6, arrayList4);
                                                                                                    r314 = r312;
                                                                                                } else {
                                                                                                    r314 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(lygVar6);
                                                                                                r313 = r314;
                                                                                                if (!r313.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r313;
                                                                                                r312 = r313;
                                                                                            }
                                                                                            r313.close();
                                                                                            map7 = kd0Var7;
                                                                                            r39 = r313;
                                                                                        } else {
                                                                                            ?? r316 = Query;
                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                            r316.close();
                                                                                            r39 = r316;
                                                                                        }
                                                                                        kd0Var6.put(strW, map7);
                                                                                        list = r39;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num5.intValue();
                                                                                        if (this.f.contains(num5)) {
                                                                                            w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it7 = ((List) map7.get(num5)).iterator();
                                                                                            zI = true;
                                                                                            while (true) {
                                                                                                if (!it7.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    ws4Var2 = ws4Var;
                                                                                                    num2 = num5;
                                                                                                    break;
                                                                                                }
                                                                                                lyg lygVar7 = (lyg) it7.next();
                                                                                                map8 = map7;
                                                                                                ws4Var2 = ws4Var;
                                                                                                num2 = num5;
                                                                                                akgVar2 = new akg(this, this.e, iIntValue2, lygVar7, 0);
                                                                                                Long l7 = this.v;
                                                                                                Long l8 = this.w;
                                                                                                iS = lygVar7.s();
                                                                                                gghVar = (ggh) this.g.get(num2);
                                                                                                if (gghVar == null) {
                                                                                                    z8 = false;
                                                                                                } else {
                                                                                                    z8 = gghVar.d.get(iS);
                                                                                                }
                                                                                                zI = akgVar2.i(l7, l8, v2hVarF, j, bsgVarK1, z8);
                                                                                                if (!zI) {
                                                                                                    this.f.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                F0(num2).a(akgVar2);
                                                                                                num5 = num2;
                                                                                                map7 = map8;
                                                                                                ws4Var = ws4Var2;
                                                                                            }
                                                                                            if (!zI) {
                                                                                                this.f.add(num2);
                                                                                            }
                                                                                            ws4Var = ws4Var2;
                                                                                            map7 = map8;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        kd0 kd0Var11 = new kd0();
                                                                        it4 = list2.iterator();
                                                                        widVar = kd0Var11;
                                                                        while (it4.hasNext()) {
                                                                            p4h p4hVar2 = (p4h) it4.next();
                                                                            strT = p4hVar2.t();
                                                                            map6 = (Map) widVar.get(strT);
                                                                            if (map6 == null) {
                                                                                krg krgVarH8 = ichVar.h0();
                                                                                w3hVar2 = (w3h) krgVarH8.b;
                                                                                str9 = this.e;
                                                                                krgVarH8.B0();
                                                                                krgVarH8.A0();
                                                                                oa7.x(str9);
                                                                                oa7.x(strT);
                                                                                kd0Var5 = new kd0();
                                                                                cursorQuery2 = krgVarH8.r1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        uyg uygVar3 = (uyg) ((syg) lch.l1(uyg.z(), cursorQuery2.getBlob(1))).e();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) kd0Var5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            w3hVar3 = w3hVar2;
                                                                                            arrayList3 = new ArrayList();
                                                                                            kd0Var5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            w3hVar3 = w3hVar2;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(uygVar3);
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        w3hVar2 = w3hVar3;
                                                                                        str7 = str7;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = kd0Var5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    str7 = str7;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                widVar.put(strT, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                                str7 = str7;
                                                                            }
                                                                            widVar2 = widVar;
                                                                            while (r3.hasNext()) {
                                                                                iIntValue = num6.intValue();
                                                                                if (this.f.contains(num6)) {
                                                                                    w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                zJ = true;
                                                                                widVar3 = widVar2;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        uygVar = (uyg) it6.next();
                                                                                        if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                                                            tz0 tz0Var8 = w3hVar4.v().Z;
                                                                                            if (uygVar.r()) {
                                                                                                numValueOf4 = Integer.valueOf(uygVar.s());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            tz0Var8.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                                                            w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                                                                        }
                                                                                        if (uygVar.r()) {
                                                                                        }
                                                                                        tz0 tz0Var9 = w3hVar4.v().x;
                                                                                        t0h t0hVarE3 = w0h.E0(this.e);
                                                                                        if (uygVar.r()) {
                                                                                            numValueOf3 = Integer.valueOf(uygVar.s());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        tz0Var9.c(t0hVarE3, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.f.add(num6);
                                                                                        map6 = map6;
                                                                                        widVar2 = widVar3;
                                                                                    } else {
                                                                                        map6 = map6;
                                                                                        widVar3 = widVar3;
                                                                                    }
                                                                                    if (!zJ) {
                                                                                        this.f.add(num6);
                                                                                    }
                                                                                    map6 = map6;
                                                                                    widVar2 = widVar3;
                                                                                    F0(num6).a(akgVar);
                                                                                    iIntValue = i2;
                                                                                    map6 = map6;
                                                                                    widVar3 = widVar3;
                                                                                }
                                                                            }
                                                                            str7 = str7;
                                                                            it4 = it5;
                                                                            widVar = widVar2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    gd0<Integer> gd0Var2 = (gd0) this.g.keySet();
                                                                    gd0Var2.removeAll(this.f);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        ggh gghVar3 = (ggh) this.g.get(num7);
                                                                        oa7.A(gghVar3);
                                                                        z1h z1hVarB2 = gghVar3.b(iIntValue4);
                                                                        arrayList2.add(z1hVarB2);
                                                                        krgVarH1 = ichVar.h0();
                                                                        w3hVar = (w3h) krgVarH1.b;
                                                                        str8 = this.e;
                                                                        e4h e4hVarT2 = z1hVarB2.t();
                                                                        krgVarH1.B0();
                                                                        krgVarH1.A0();
                                                                        oa7.x(str8);
                                                                        oa7.A(e4hVarT2);
                                                                        byte[] bArrA2 = e4hVarT2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (krgVarH1.r1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            w3hVar.v().g.b(w0h.E0(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str13 = str3;
                                                                objE0 = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.v().g.c(w0h.E0(r21), e, "Database error querying filter results. appId");
                                                                Map map13 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map13;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str13;
                                                            obj2 = objE0;
                                                            r21 = r21;
                                                            r17.v().g.c(w0h.E0(r21), e, "Database error querying filter results. appId");
                                                            Map map14 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map14;
                                                            if (map2.isEmpty()) {
                                                                r10 = obj2;
                                                                ichVar = ichVar2;
                                                                str5 = "audience_id";
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str19 = this.e;
                                                                    krgVarH0 = ichVar2.h0();
                                                                    str6 = this.e;
                                                                    krgVarH0.B0();
                                                                    krgVarH0.A0();
                                                                    oa7.x(str6);
                                                                    kd0Var3 = new kd0();
                                                                    cursorRawQuery = krgVarH0.r1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) kd0Var3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                kd0Var3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        kd0Var3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = kd0Var3;
                                                                    oa7.x(str19);
                                                                    kd0Var4 = new kd0();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            e4hVar3 = (e4h) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            z7 = zL0;
                                                                            kd0Var4.put(num, e4hVar3);
                                                                            r0 = r18;
                                                                            str14 = str14;
                                                                            it2 = it3;
                                                                            zL0 = z7;
                                                                        }
                                                                    }
                                                                    str4 = str14;
                                                                    z4 = zL0;
                                                                    map3 = kd0Var4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    z4 = zL0;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map2;
                                                                map4 = map3;
                                                                while (r17.hasNext()) {
                                                                    num3.getClass();
                                                                    e4hVar = (e4h) map4.get(num3);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    kd0Var = new kd0();
                                                                    if (e4hVar != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (s2hVar.r()) {
                                                                                e4h e4hVar9 = e4hVar;
                                                                                Integer numValueOf11 = Integer.valueOf(s2hVar.s());
                                                                                if (s2hVar.t()) {
                                                                                    lValueOf = Long.valueOf(s2hVar.u());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                kd0Var.put(numValueOf11, lValueOf);
                                                                                e4hVar = e4hVar9;
                                                                            }
                                                                        }
                                                                    }
                                                                    e4hVar2 = e4hVar;
                                                                    kd0Var2 = new kd0();
                                                                    if (e4hVar2 != null) {
                                                                        it = e4hVar2.x().iterator();
                                                                        while (it.hasNext()) {
                                                                            h4hVar = (h4h) it.next();
                                                                            if (!h4hVar.r()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map15 = map4;
                                                                    if (e4hVar2 != null) {
                                                                        i = 0;
                                                                        while (i < e4hVar2.s() * 64) {
                                                                            if (lch.f1((ymg) e4hVar2.r(), i)) {
                                                                                z6 = zL1;
                                                                                w3hVar4.v().Z.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (lch.f1((ymg) e4hVar2.t(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zL1 = z6;
                                                                            } else {
                                                                                z6 = zL1;
                                                                            }
                                                                            kd0Var.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zL1 = z6;
                                                                        }
                                                                    }
                                                                    z5 = zL1;
                                                                    e4h e4hVar10 = (e4h) map5.get(num3);
                                                                    if (z5) {
                                                                        while (r2.hasNext()) {
                                                                            int iS4 = lygVar2.s();
                                                                            Integer num9 = num3;
                                                                            jLongValue = this.w.longValue() / 1000;
                                                                            if (lygVar2.A()) {
                                                                                jLongValue = this.v.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iS4);
                                                                            if (kd0Var.containsKey(numValueOf)) {
                                                                                kd0Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (kd0Var2.containsKey(numValueOf)) {
                                                                                kd0Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num3 = num9;
                                                                        }
                                                                    }
                                                                    this.g.put(num3, new ggh(this, this.e, e4hVar10, bitSet, bitSet2, kd0Var, kd0Var2));
                                                                    ichVar2 = ichVar2;
                                                                    zL1 = z5;
                                                                    map5 = map5;
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str3 = str3;
                                                                    map4 = map15;
                                                                }
                                                                r10 = obj2;
                                                                ichVar = ichVar2;
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str110 = str3;
                                                            if (!list.isEmpty()) {
                                                                ws4Var = new ws4(this);
                                                                kd0Var6 = new kd0();
                                                                while (r17.hasNext()) {
                                                                    v2hVarF = ws4Var.f(this.e, v2hVar);
                                                                    if (v2hVarF != null) {
                                                                        bsgVarK1 = ichVar.h0().k1(this.e, v2hVar, v2hVarF.w());
                                                                        ichVar.h0().b1("events", bsgVarK1);
                                                                        if (z) {
                                                                            j = bsgVarK1.c;
                                                                            strW = v2hVarF.w();
                                                                            map7 = (Map) kd0Var6.get(strW);
                                                                            if (map7 == null) {
                                                                                krg krgVarH9 = ichVar.h0();
                                                                                w3h w3hVar8 = (w3h) krgVarH9.b;
                                                                                str10 = this.e;
                                                                                krgVarH9.B0();
                                                                                krgVarH9.A0();
                                                                                oa7.x(str10);
                                                                                oa7.x(strW);
                                                                                kd0Var7 = new kd0();
                                                                                Query = krgVarH9.r1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str11 = str10;
                                                                                    Query = Query;
                                                                                    r312 = list;
                                                                                    while (true) {
                                                                                        lyg lygVar8 = (lyg) ((kyg) lch.l1(lyg.D(), Query.getBlob(1))).e();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) kd0Var7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r312 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            kd0Var7.put(numValueOf6, arrayList4);
                                                                                            r314 = r312;
                                                                                        } else {
                                                                                            r314 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(lygVar8);
                                                                                        r313 = r314;
                                                                                        if (!r313.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r313;
                                                                                        r312 = r313;
                                                                                    }
                                                                                    r313.close();
                                                                                    map7 = kd0Var7;
                                                                                    r39 = r313;
                                                                                } else {
                                                                                    ?? r317 = Query;
                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                    r317.close();
                                                                                    r39 = r317;
                                                                                }
                                                                                kd0Var6.put(strW, map7);
                                                                                list = r39;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num5.intValue();
                                                                                if (this.f.contains(num5)) {
                                                                                    w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it7 = ((List) map7.get(num5)).iterator();
                                                                                    zI = true;
                                                                                    while (true) {
                                                                                        if (!it7.hasNext()) {
                                                                                            map8 = map7;
                                                                                            ws4Var2 = ws4Var;
                                                                                            num2 = num5;
                                                                                            break;
                                                                                        }
                                                                                        lyg lygVar9 = (lyg) it7.next();
                                                                                        map8 = map7;
                                                                                        ws4Var2 = ws4Var;
                                                                                        num2 = num5;
                                                                                        akgVar2 = new akg(this, this.e, iIntValue2, lygVar9, 0);
                                                                                        Long l9 = this.v;
                                                                                        Long l10 = this.w;
                                                                                        iS = lygVar9.s();
                                                                                        gghVar = (ggh) this.g.get(num2);
                                                                                        if (gghVar == null) {
                                                                                            z8 = false;
                                                                                        } else {
                                                                                            z8 = gghVar.d.get(iS);
                                                                                        }
                                                                                        zI = akgVar2.i(l9, l10, v2hVarF, j, bsgVarK1, z8);
                                                                                        if (!zI) {
                                                                                            this.f.add(num2);
                                                                                            break;
                                                                                        }
                                                                                        F0(num2).a(akgVar2);
                                                                                        num5 = num2;
                                                                                        map7 = map8;
                                                                                        ws4Var = ws4Var2;
                                                                                    }
                                                                                    if (!zI) {
                                                                                        this.f.add(num2);
                                                                                    }
                                                                                    ws4Var = ws4Var2;
                                                                                    map7 = map8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                kd0 kd0Var12 = new kd0();
                                                                it4 = list2.iterator();
                                                                widVar = kd0Var12;
                                                                while (it4.hasNext()) {
                                                                    p4h p4hVar3 = (p4h) it4.next();
                                                                    strT = p4hVar3.t();
                                                                    map6 = (Map) widVar.get(strT);
                                                                    if (map6 == null) {
                                                                        krg krgVarH10 = ichVar.h0();
                                                                        w3hVar2 = (w3h) krgVarH10.b;
                                                                        str9 = this.e;
                                                                        krgVarH10.B0();
                                                                        krgVarH10.A0();
                                                                        oa7.x(str9);
                                                                        oa7.x(strT);
                                                                        kd0Var5 = new kd0();
                                                                        cursorQuery2 = krgVarH10.r1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                uyg uygVar4 = (uyg) ((syg) lch.l1(uyg.z(), cursorQuery2.getBlob(1))).e();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) kd0Var5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    w3hVar3 = w3hVar2;
                                                                                    arrayList3 = new ArrayList();
                                                                                    kd0Var5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    w3hVar3 = w3hVar2;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(uygVar4);
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                w3hVar2 = w3hVar3;
                                                                                str7 = str7;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = kd0Var5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            str7 = str7;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        widVar.put(strT, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                        str7 = str7;
                                                                    }
                                                                    widVar2 = widVar;
                                                                    while (r3.hasNext()) {
                                                                        iIntValue = num6.intValue();
                                                                        if (this.f.contains(num6)) {
                                                                            w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it6 = ((List) map6.get(num6)).iterator();
                                                                        zJ = true;
                                                                        widVar3 = widVar2;
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                uygVar = (uyg) it6.next();
                                                                                if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                                                    tz0 tz0Var10 = w3hVar4.v().Z;
                                                                                    if (uygVar.r()) {
                                                                                        numValueOf4 = Integer.valueOf(uygVar.s());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    tz0Var10.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                                                    w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                                                                }
                                                                                if (uygVar.r()) {
                                                                                }
                                                                                tz0 tz0Var11 = w3hVar4.v().x;
                                                                                t0h t0hVarE4 = w0h.E0(this.e);
                                                                                if (uygVar.r()) {
                                                                                    numValueOf3 = Integer.valueOf(uygVar.s());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                tz0Var11.c(t0hVarE4, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.f.add(num6);
                                                                                map6 = map6;
                                                                                widVar2 = widVar3;
                                                                            } else {
                                                                                map6 = map6;
                                                                                widVar3 = widVar3;
                                                                            }
                                                                            if (!zJ) {
                                                                                this.f.add(num6);
                                                                            }
                                                                            map6 = map6;
                                                                            widVar2 = widVar3;
                                                                            F0(num6).a(akgVar);
                                                                            iIntValue = i2;
                                                                            map6 = map6;
                                                                            widVar3 = widVar3;
                                                                        }
                                                                    }
                                                                    str7 = str7;
                                                                    it4 = it5;
                                                                    widVar = widVar2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            gd0<Integer> gd0Var3 = (gd0) this.g.keySet();
                                                            gd0Var3.removeAll(this.f);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                ggh gghVar4 = (ggh) this.g.get(num7);
                                                                oa7.A(gghVar4);
                                                                z1h z1hVarB3 = gghVar4.b(iIntValue5);
                                                                arrayList2.add(z1hVarB3);
                                                                krgVarH1 = ichVar.h0();
                                                                w3hVar = (w3h) krgVarH1.b;
                                                                str8 = this.e;
                                                                e4h e4hVarT3 = z1hVarB3.t();
                                                                krgVarH1.B0();
                                                                krgVarH1.A0();
                                                                oa7.x(str8);
                                                                oa7.A(e4hVarT3);
                                                                byte[] bArrA3 = e4hVarT3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (krgVarH1.r1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    w3hVar.v().g.b(w0h.E0(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = kd0Var8;
                                                } else {
                                                    Map map16 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map16;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    r10 = obj2;
                                                    ichVar = ichVar2;
                                                    str5 = "audience_id";
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str111 = this.e;
                                                        krgVarH0 = ichVar2.h0();
                                                        str6 = this.e;
                                                        krgVarH0.B0();
                                                        krgVarH0.A0();
                                                        oa7.x(str6);
                                                        kd0Var3 = new kd0();
                                                        cursorRawQuery = krgVarH0.r1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) kd0Var3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    kd0Var3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            kd0Var3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = kd0Var3;
                                                        oa7.x(str111);
                                                        kd0Var4 = new kd0();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                e4hVar3 = (e4h) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                z7 = zL0;
                                                                kd0Var4.put(num, e4hVar3);
                                                                r0 = r18;
                                                                str14 = str14;
                                                                it2 = it3;
                                                                zL0 = z7;
                                                            }
                                                        }
                                                        str4 = str14;
                                                        z4 = zL0;
                                                        map3 = kd0Var4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        z4 = zL0;
                                                        map3 = map2;
                                                    }
                                                    map5 = map2;
                                                    map4 = map3;
                                                    while (r17.hasNext()) {
                                                        num3.getClass();
                                                        e4hVar = (e4h) map4.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        kd0Var = new kd0();
                                                        if (e4hVar != null) {
                                                            while (r3.hasNext()) {
                                                                if (s2hVar.r()) {
                                                                    e4h e4hVar11 = e4hVar;
                                                                    Integer numValueOf12 = Integer.valueOf(s2hVar.s());
                                                                    if (s2hVar.t()) {
                                                                        lValueOf = Long.valueOf(s2hVar.u());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    kd0Var.put(numValueOf12, lValueOf);
                                                                    e4hVar = e4hVar11;
                                                                }
                                                            }
                                                        }
                                                        e4hVar2 = e4hVar;
                                                        kd0Var2 = new kd0();
                                                        if (e4hVar2 != null) {
                                                            it = e4hVar2.x().iterator();
                                                            while (it.hasNext()) {
                                                                h4hVar = (h4h) it.next();
                                                                if (!h4hVar.r()) {
                                                                }
                                                            }
                                                        }
                                                        Map map17 = map4;
                                                        if (e4hVar2 != null) {
                                                            i = 0;
                                                            while (i < e4hVar2.s() * 64) {
                                                                if (lch.f1((ymg) e4hVar2.r(), i)) {
                                                                    z6 = zL1;
                                                                    w3hVar4.v().Z.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (lch.f1((ymg) e4hVar2.t(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zL1 = z6;
                                                                } else {
                                                                    z6 = zL1;
                                                                }
                                                                kd0Var.remove(Integer.valueOf(i));
                                                                i++;
                                                                zL1 = z6;
                                                            }
                                                        }
                                                        z5 = zL1;
                                                        e4h e4hVar12 = (e4h) map5.get(num3);
                                                        if (z5) {
                                                            while (r2.hasNext()) {
                                                                int iS5 = lygVar2.s();
                                                                Integer num10 = num3;
                                                                jLongValue = this.w.longValue() / 1000;
                                                                if (lygVar2.A()) {
                                                                    jLongValue = this.v.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iS5);
                                                                if (kd0Var.containsKey(numValueOf)) {
                                                                    kd0Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (kd0Var2.containsKey(numValueOf)) {
                                                                    kd0Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num3 = num10;
                                                            }
                                                        }
                                                        this.g.put(num3, new ggh(this, this.e, e4hVar12, bitSet, bitSet2, kd0Var, kd0Var2));
                                                        ichVar2 = ichVar2;
                                                        zL1 = z5;
                                                        map5 = map5;
                                                        obj2 = obj2;
                                                        map = map;
                                                        str3 = str3;
                                                        map4 = map17;
                                                    }
                                                    r10 = obj2;
                                                    ichVar = ichVar2;
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str112 = str3;
                                                if (!list.isEmpty()) {
                                                    ws4Var = new ws4(this);
                                                    kd0Var6 = new kd0();
                                                    while (r17.hasNext()) {
                                                        v2hVarF = ws4Var.f(this.e, v2hVar);
                                                        if (v2hVarF != null) {
                                                            bsgVarK1 = ichVar.h0().k1(this.e, v2hVar, v2hVarF.w());
                                                            ichVar.h0().b1("events", bsgVarK1);
                                                            if (z) {
                                                                j = bsgVarK1.c;
                                                                strW = v2hVarF.w();
                                                                map7 = (Map) kd0Var6.get(strW);
                                                                if (map7 == null) {
                                                                    krg krgVarH11 = ichVar.h0();
                                                                    w3h w3hVar9 = (w3h) krgVarH11.b;
                                                                    str10 = this.e;
                                                                    krgVarH11.B0();
                                                                    krgVarH11.A0();
                                                                    oa7.x(str10);
                                                                    oa7.x(strW);
                                                                    kd0Var7 = new kd0();
                                                                    Query = krgVarH11.r1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str11 = str10;
                                                                        Query = Query;
                                                                        r312 = list;
                                                                        while (true) {
                                                                            lyg lygVar10 = (lyg) ((kyg) lch.l1(lyg.D(), Query.getBlob(1))).e();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) kd0Var7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r312 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                kd0Var7.put(numValueOf6, arrayList4);
                                                                                r314 = r312;
                                                                            } else {
                                                                                r314 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(lygVar10);
                                                                            r313 = r314;
                                                                            if (!r313.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r313;
                                                                            r312 = r313;
                                                                        }
                                                                        r313.close();
                                                                        map7 = kd0Var7;
                                                                        r39 = r313;
                                                                    } else {
                                                                        ?? r318 = Query;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        r318.close();
                                                                        r39 = r318;
                                                                    }
                                                                    kd0Var6.put(strW, map7);
                                                                    list = r39;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num5.intValue();
                                                                    if (this.f.contains(num5)) {
                                                                        w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                                                                    } else {
                                                                        it7 = ((List) map7.get(num5)).iterator();
                                                                        zI = true;
                                                                        while (true) {
                                                                            if (!it7.hasNext()) {
                                                                                map8 = map7;
                                                                                ws4Var2 = ws4Var;
                                                                                num2 = num5;
                                                                                break;
                                                                            }
                                                                            lyg lygVar11 = (lyg) it7.next();
                                                                            map8 = map7;
                                                                            ws4Var2 = ws4Var;
                                                                            num2 = num5;
                                                                            akgVar2 = new akg(this, this.e, iIntValue2, lygVar11, 0);
                                                                            Long l11 = this.v;
                                                                            Long l12 = this.w;
                                                                            iS = lygVar11.s();
                                                                            gghVar = (ggh) this.g.get(num2);
                                                                            if (gghVar == null) {
                                                                                z8 = false;
                                                                            } else {
                                                                                z8 = gghVar.d.get(iS);
                                                                            }
                                                                            zI = akgVar2.i(l11, l12, v2hVarF, j, bsgVarK1, z8);
                                                                            if (!zI) {
                                                                                this.f.add(num2);
                                                                                break;
                                                                            }
                                                                            F0(num2).a(akgVar2);
                                                                            num5 = num2;
                                                                            map7 = map8;
                                                                            ws4Var = ws4Var2;
                                                                        }
                                                                        if (!zI) {
                                                                            this.f.add(num2);
                                                                        }
                                                                        ws4Var = ws4Var2;
                                                                        map7 = map8;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    kd0 kd0Var13 = new kd0();
                                                    it4 = list2.iterator();
                                                    widVar = kd0Var13;
                                                    while (it4.hasNext()) {
                                                        p4h p4hVar4 = (p4h) it4.next();
                                                        strT = p4hVar4.t();
                                                        map6 = (Map) widVar.get(strT);
                                                        if (map6 == null) {
                                                            krg krgVarH12 = ichVar.h0();
                                                            w3hVar2 = (w3h) krgVarH12.b;
                                                            str9 = this.e;
                                                            krgVarH12.B0();
                                                            krgVarH12.A0();
                                                            oa7.x(str9);
                                                            oa7.x(strT);
                                                            kd0Var5 = new kd0();
                                                            cursorQuery2 = krgVarH12.r1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    uyg uygVar5 = (uyg) ((syg) lch.l1(uyg.z(), cursorQuery2.getBlob(1))).e();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) kd0Var5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        w3hVar3 = w3hVar2;
                                                                        arrayList3 = new ArrayList();
                                                                        kd0Var5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        w3hVar3 = w3hVar2;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(uygVar5);
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    w3hVar2 = w3hVar3;
                                                                    str7 = str7;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = kd0Var5;
                                                            } else {
                                                                it5 = it4;
                                                                str7 = str7;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            widVar.put(strT, map6);
                                                        } else {
                                                            it5 = it4;
                                                            str7 = str7;
                                                        }
                                                        widVar2 = widVar;
                                                        while (r3.hasNext()) {
                                                            iIntValue = num6.intValue();
                                                            if (this.f.contains(num6)) {
                                                                w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map6.get(num6)).iterator();
                                                            zJ = true;
                                                            widVar3 = widVar2;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    uygVar = (uyg) it6.next();
                                                                    if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                                        tz0 tz0Var12 = w3hVar4.v().Z;
                                                                        if (uygVar.r()) {
                                                                            numValueOf4 = Integer.valueOf(uygVar.s());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        tz0Var12.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                                        w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                                                    }
                                                                    if (uygVar.r()) {
                                                                    }
                                                                    tz0 tz0Var13 = w3hVar4.v().x;
                                                                    t0h t0hVarE5 = w0h.E0(this.e);
                                                                    if (uygVar.r()) {
                                                                        numValueOf3 = Integer.valueOf(uygVar.s());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    tz0Var13.c(t0hVarE5, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.f.add(num6);
                                                                    map6 = map6;
                                                                    widVar2 = widVar3;
                                                                } else {
                                                                    map6 = map6;
                                                                    widVar3 = widVar3;
                                                                }
                                                                if (!zJ) {
                                                                    this.f.add(num6);
                                                                }
                                                                map6 = map6;
                                                                widVar2 = widVar3;
                                                                F0(num6).a(akgVar);
                                                                iIntValue = i2;
                                                                map6 = map6;
                                                                widVar3 = widVar3;
                                                            }
                                                        }
                                                        str7 = str7;
                                                        it4 = it5;
                                                        widVar = widVar2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                gd0<Integer> gd0Var4 = (gd0) this.g.keySet();
                                                gd0Var4.removeAll(this.f);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    ggh gghVar5 = (ggh) this.g.get(num7);
                                                    oa7.A(gghVar5);
                                                    z1h z1hVarB4 = gghVar5.b(iIntValue6);
                                                    arrayList2.add(z1hVarB4);
                                                    krgVarH1 = ichVar.h0();
                                                    w3hVar = (w3h) krgVarH1.b;
                                                    str8 = this.e;
                                                    e4h e4hVarT4 = z1hVarB4.t();
                                                    krgVarH1.B0();
                                                    krgVarH1.A0();
                                                    oa7.x(str8);
                                                    oa7.A(e4hVarT4);
                                                    byte[] bArrA4 = e4hVarT4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (krgVarH1.r1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        w3hVar.v().g.b(w0h.E0(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = kd0Var9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        krg krgVarH13 = ichVar2.h0();
                        obj = (w3h) krgVarH13.b;
                        r5 = this.e;
                        krgVarH13.B0();
                        krgVarH13.A0();
                        oa7.x(r5);
                        cursorQuery = krgVarH13.r1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map18 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map18;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            kd0Var8 = new kd0();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                e4h e4hVar13 = (e4h) ((d4h) lch.l1(e4h.z(), cursorQuery.getBlob(1))).e();
                                Object objValueOf2 = Integer.valueOf(i3);
                                kd0Var8.put(objValueOf2, e4hVar13);
                                str3 = str13;
                                obj2 = objE0;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str13 = str3;
                                objE0 = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = kd0Var8;
                        }
                        if (map2.isEmpty()) {
                            r10 = obj2;
                            ichVar = ichVar2;
                            str5 = "audience_id";
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str113 = this.e;
                                krgVarH0 = ichVar2.h0();
                                str6 = this.e;
                                krgVarH0.B0();
                                krgVarH0.A0();
                                oa7.x(str6);
                                kd0Var3 = new kd0();
                                cursorRawQuery = krgVarH0.r1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) kd0Var3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            kd0Var3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    kd0Var3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = kd0Var3;
                                oa7.x(str113);
                                kd0Var4 = new kd0();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        e4hVar3 = (e4h) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            z7 = zL0;
                                            kd0Var4.put(num, e4hVar3);
                                            r0 = r18;
                                            str14 = str14;
                                            it2 = it3;
                                            zL0 = z7;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listH1 = ichVar2.k0().h1((ymg) e4hVar3.t(), list4);
                                            if (listH1.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                d4h d4hVar = (d4h) e4hVar3.i();
                                                d4hVar.i();
                                                d4hVar.c();
                                                ((e4h) d4hVar.b).D(listH1);
                                                List listH2 = ichVar2.k0().h1((ymg) e4hVar3.r(), list4);
                                                d4hVar.h();
                                                d4hVar.c();
                                                ((e4h) d4hVar.b).B(listH2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it9 = e4hVar3.v().iterator();
                                                while (it9.hasNext()) {
                                                    Iterator it10 = it9;
                                                    s2h s2hVar2 = (s2h) it9.next();
                                                    boolean z9 = zL0;
                                                    if (!list4.contains(Integer.valueOf(s2hVar2.s()))) {
                                                        arrayList6.add(s2hVar2);
                                                    }
                                                    it9 = it10;
                                                    zL0 = z9;
                                                }
                                                z7 = zL0;
                                                d4hVar.j();
                                                d4hVar.c();
                                                ((e4h) d4hVar.b).F(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (h4h h4hVar2 : e4hVar3.x()) {
                                                    if (!list4.contains(Integer.valueOf(h4hVar2.s()))) {
                                                        arrayList7.add(h4hVar2);
                                                    }
                                                }
                                                d4hVar.k();
                                                d4hVar.c();
                                                ((e4h) d4hVar.b).H(arrayList7);
                                                kd0Var4.put(num, (e4h) d4hVar.e());
                                                r18 = r112;
                                                r0 = r18;
                                                str14 = str14;
                                                it2 = it3;
                                                zL0 = z7;
                                            }
                                        }
                                    }
                                }
                                str4 = str14;
                                z4 = zL0;
                                map3 = kd0Var4;
                            } else {
                                str4 = "audience_id";
                                z4 = zL0;
                                map3 = map2;
                            }
                            map5 = map2;
                            map4 = map3;
                            while (r17.hasNext()) {
                                num3.getClass();
                                e4hVar = (e4h) map4.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                kd0Var = new kd0();
                                if (e4hVar != null && e4hVar.w() != 0) {
                                    while (r3.hasNext()) {
                                        if (s2hVar.r()) {
                                            e4h e4hVar14 = e4hVar;
                                            Integer numValueOf13 = Integer.valueOf(s2hVar.s());
                                            if (s2hVar.t()) {
                                                lValueOf = Long.valueOf(s2hVar.u());
                                            } else {
                                                lValueOf = null;
                                            }
                                            kd0Var.put(numValueOf13, lValueOf);
                                            e4hVar = e4hVar14;
                                        }
                                    }
                                }
                                e4hVar2 = e4hVar;
                                kd0Var2 = new kd0();
                                if (e4hVar2 != null && e4hVar2.y() != 0) {
                                    it = e4hVar2.x().iterator();
                                    while (it.hasNext()) {
                                        h4hVar = (h4h) it.next();
                                        if (!h4hVar.r() && h4hVar.u() > 0) {
                                            kd0Var2.put(Integer.valueOf(h4hVar.s()), Long.valueOf(h4hVar.v(h4hVar.u() - 1)));
                                            it = it;
                                            map4 = map4;
                                        }
                                    }
                                }
                                Map map19 = map4;
                                if (e4hVar2 != null) {
                                    i = 0;
                                    while (i < e4hVar2.s() * 64) {
                                        if (lch.f1((ymg) e4hVar2.r(), i)) {
                                            z6 = zL1;
                                            w3hVar4.v().Z.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i);
                                            if (lch.f1((ymg) e4hVar2.t(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zL1 = z6;
                                        } else {
                                            z6 = zL1;
                                        }
                                        kd0Var.remove(Integer.valueOf(i));
                                        i++;
                                        zL1 = z6;
                                    }
                                }
                                z5 = zL1;
                                e4h e4hVar15 = (e4h) map5.get(num3);
                                if (z5 && z4 && (list3 = (List) map.get(num3)) != null && this.w != null && this.v != null) {
                                    while (r2.hasNext()) {
                                        int iS6 = lygVar2.s();
                                        Integer num11 = num3;
                                        jLongValue = this.w.longValue() / 1000;
                                        if (lygVar2.A()) {
                                            jLongValue = this.v.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iS6);
                                        if (kd0Var.containsKey(numValueOf)) {
                                            kd0Var.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (kd0Var2.containsKey(numValueOf)) {
                                            kd0Var2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num3 = num11;
                                    }
                                }
                                this.g.put(num3, new ggh(this, this.e, e4hVar15, bitSet, bitSet2, kd0Var, kd0Var2));
                                ichVar2 = ichVar2;
                                zL1 = z5;
                                map5 = map5;
                                obj2 = obj2;
                                map = map;
                                str3 = str3;
                                map4 = map19;
                            }
                            r10 = obj2;
                            ichVar = ichVar2;
                            str5 = str4;
                        }
                        str7 = str2;
                        String str114 = str3;
                        if (!list.isEmpty()) {
                            ws4Var = new ws4(this);
                            kd0Var6 = new kd0();
                            while (r17.hasNext()) {
                                v2hVarF = ws4Var.f(this.e, v2hVar);
                                if (v2hVarF != null) {
                                    bsgVarK1 = ichVar.h0().k1(this.e, v2hVar, v2hVarF.w());
                                    ichVar.h0().b1("events", bsgVarK1);
                                    if (z) {
                                        j = bsgVarK1.c;
                                        strW = v2hVarF.w();
                                        map7 = (Map) kd0Var6.get(strW);
                                        if (map7 == null) {
                                            krg krgVarH14 = ichVar.h0();
                                            w3h w3hVar10 = (w3h) krgVarH14.b;
                                            str10 = this.e;
                                            krgVarH14.B0();
                                            krgVarH14.A0();
                                            oa7.x(str10);
                                            oa7.x(strW);
                                            kd0Var7 = new kd0();
                                            Query = krgVarH14.r1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str11 = str10;
                                                Query = Query;
                                                r312 = list;
                                                while (true) {
                                                    lyg lygVar12 = (lyg) ((kyg) lch.l1(lyg.D(), Query.getBlob(1))).e();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) kd0Var7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r312 = Query;
                                                        arrayList4 = new ArrayList();
                                                        kd0Var7.put(numValueOf6, arrayList4);
                                                        r314 = r312;
                                                    } else {
                                                        r314 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(lygVar12);
                                                    r313 = r314;
                                                    if (!r313.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r313;
                                                    r312 = r313;
                                                }
                                                r313.close();
                                                map7 = kd0Var7;
                                                r39 = r313;
                                            } else {
                                                ?? r319 = Query;
                                                map7 = Collections.EMPTY_MAP;
                                                r319.close();
                                                r39 = r319;
                                            }
                                            kd0Var6.put(strW, map7);
                                            list = r39;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num5.intValue();
                                            if (this.f.contains(num5)) {
                                                w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                                            } else {
                                                it7 = ((List) map7.get(num5)).iterator();
                                                zI = true;
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        map8 = map7;
                                                        ws4Var2 = ws4Var;
                                                        num2 = num5;
                                                        break;
                                                    }
                                                    lyg lygVar13 = (lyg) it7.next();
                                                    map8 = map7;
                                                    ws4Var2 = ws4Var;
                                                    num2 = num5;
                                                    akgVar2 = new akg(this, this.e, iIntValue2, lygVar13, 0);
                                                    Long l13 = this.v;
                                                    Long l14 = this.w;
                                                    iS = lygVar13.s();
                                                    gghVar = (ggh) this.g.get(num2);
                                                    if (gghVar == null) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = gghVar.d.get(iS);
                                                    }
                                                    zI = akgVar2.i(l13, l14, v2hVarF, j, bsgVarK1, z8);
                                                    if (!zI) {
                                                        this.f.add(num2);
                                                        break;
                                                    }
                                                    F0(num2).a(akgVar2);
                                                    num5 = num2;
                                                    map7 = map8;
                                                    ws4Var = ws4Var2;
                                                }
                                                if (!zI) {
                                                    this.f.add(num2);
                                                }
                                                ws4Var = ws4Var2;
                                                map7 = map8;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            kd0 kd0Var14 = new kd0();
                            it4 = list2.iterator();
                            widVar = kd0Var14;
                            while (it4.hasNext()) {
                                p4h p4hVar5 = (p4h) it4.next();
                                strT = p4hVar5.t();
                                map6 = (Map) widVar.get(strT);
                                if (map6 == null) {
                                    krg krgVarH15 = ichVar.h0();
                                    w3hVar2 = (w3h) krgVarH15.b;
                                    str9 = this.e;
                                    krgVarH15.B0();
                                    krgVarH15.A0();
                                    oa7.x(str9);
                                    oa7.x(strT);
                                    kd0Var5 = new kd0();
                                    cursorQuery2 = krgVarH15.r1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            uyg uygVar6 = (uyg) ((syg) lch.l1(uyg.z(), cursorQuery2.getBlob(1))).e();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) kd0Var5.get(numValueOf5);
                                            if (list5 == null) {
                                                w3hVar3 = w3hVar2;
                                                arrayList3 = new ArrayList();
                                                kd0Var5.put(numValueOf5, arrayList3);
                                            } else {
                                                w3hVar3 = w3hVar2;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(uygVar6);
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            w3hVar2 = w3hVar3;
                                            str7 = str7;
                                        }
                                        cursorQuery2.close();
                                        map6 = kd0Var5;
                                    } else {
                                        it5 = it4;
                                        str7 = str7;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    widVar.put(strT, map6);
                                } else {
                                    it5 = it4;
                                    str7 = str7;
                                }
                                widVar2 = widVar;
                                while (r3.hasNext()) {
                                    iIntValue = num6.intValue();
                                    if (this.f.contains(num6)) {
                                        w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map6.get(num6)).iterator();
                                    zJ = true;
                                    widVar3 = widVar2;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            uygVar = (uyg) it6.next();
                                            if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                                tz0 tz0Var14 = w3hVar4.v().Z;
                                                if (uygVar.r()) {
                                                    numValueOf4 = Integer.valueOf(uygVar.s());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                tz0Var14.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                                w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                                            }
                                            if (uygVar.r() || uygVar.s() > 256) {
                                                tz0 tz0Var15 = w3hVar4.v().x;
                                                t0h t0hVarE6 = w0h.E0(this.e);
                                                if (uygVar.r()) {
                                                    numValueOf3 = Integer.valueOf(uygVar.s());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                tz0Var15.c(t0hVarE6, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                this.f.add(num6);
                                                map6 = map6;
                                                widVar2 = widVar3;
                                            } else {
                                                i2 = iIntValue;
                                                akgVar = new akg(this, this.e, i2, uygVar, 1);
                                                Long l15 = this.v;
                                                Long l16 = this.w;
                                                int iS7 = uygVar.s();
                                                ggh gghVar6 = (ggh) this.g.get(num6);
                                                zJ = akgVar.j(l15, l16, p4hVar5, gghVar6 == null ? false : gghVar6.d.get(iS7));
                                                if (zJ) {
                                                    F0(num6).a(akgVar);
                                                    iIntValue = i2;
                                                    map6 = map6;
                                                    widVar3 = widVar3;
                                                } else {
                                                    this.f.add(num6);
                                                    widVar3 = widVar3;
                                                }
                                            }
                                        } else {
                                            map6 = map6;
                                            widVar3 = widVar3;
                                        }
                                        if (!zJ) {
                                            this.f.add(num6);
                                        }
                                        map6 = map6;
                                        widVar2 = widVar3;
                                    }
                                }
                                str7 = str7;
                                it4 = it5;
                                widVar = widVar2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        gd0<Integer> gd0Var5 = (gd0) this.g.keySet();
                        gd0Var5.removeAll(this.f);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            ggh gghVar7 = (ggh) this.g.get(num7);
                            oa7.A(gghVar7);
                            z1h z1hVarB5 = gghVar7.b(iIntValue7);
                            arrayList2.add(z1hVarB5);
                            krgVarH1 = ichVar.h0();
                            w3hVar = (w3h) krgVarH1.b;
                            str8 = this.e;
                            e4h e4hVarT5 = z1hVarB5.t();
                            krgVarH1.B0();
                            krgVarH1.A0();
                            oa7.x(str8);
                            oa7.A(e4hVarT5);
                            byte[] bArrA5 = e4hVarT5.a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrA5);
                            if (krgVarH1.r1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                w3hVar.v().g.b(w0h.E0(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map110 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map110;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        kd0Var8 = new kd0();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            e4h e4hVar16 = (e4h) ((d4h) lch.l1(e4h.z(), cursorQuery.getBlob(1))).e();
                            Object objValueOf3 = Integer.valueOf(i3);
                            kd0Var8.put(objValueOf3, e4hVar16);
                            str3 = str13;
                            obj2 = objE0;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str13 = str3;
                            objE0 = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = kd0Var8;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e26) {
                e = e26;
                r17 = obj;
                r21 = r5;
            }
            cursorQuery = krgVarH13.r1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map9;
        krg krgVarH16 = ichVar2.h0();
        obj = (w3h) krgVarH16.b;
        r5 = this.e;
        krgVarH16.B0();
        krgVarH16.A0();
        oa7.x(r5);
        if (map2.isEmpty()) {
            r10 = obj2;
            ichVar = ichVar2;
            str5 = "audience_id";
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str115 = this.e;
                krgVarH0 = ichVar2.h0();
                str6 = this.e;
                krgVarH0.B0();
                krgVarH0.A0();
                oa7.x(str6);
                kd0Var3 = new kd0();
                cursorRawQuery = krgVarH0.r1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) kd0Var3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            kd0Var3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    kd0Var3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = kd0Var3;
                oa7.x(str115);
                kd0Var4 = new kd0();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        e4hVar3 = (e4h) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        z7 = zL0;
                        kd0Var4.put(num, e4hVar3);
                        r0 = r18;
                        str14 = str14;
                        it2 = it3;
                        zL0 = z7;
                    }
                }
                str4 = str14;
                z4 = zL0;
                map3 = kd0Var4;
            } else {
                str4 = "audience_id";
                z4 = zL0;
                map3 = map2;
            }
            map5 = map2;
            map4 = map3;
            while (r17.hasNext()) {
                num3.getClass();
                e4hVar = (e4h) map4.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                kd0Var = new kd0();
                if (e4hVar != null) {
                    while (r3.hasNext()) {
                        if (s2hVar.r()) {
                            e4h e4hVar17 = e4hVar;
                            Integer numValueOf14 = Integer.valueOf(s2hVar.s());
                            if (s2hVar.t()) {
                                lValueOf = Long.valueOf(s2hVar.u());
                            } else {
                                lValueOf = null;
                            }
                            kd0Var.put(numValueOf14, lValueOf);
                            e4hVar = e4hVar17;
                        }
                    }
                }
                e4hVar2 = e4hVar;
                kd0Var2 = new kd0();
                if (e4hVar2 != null) {
                    it = e4hVar2.x().iterator();
                    while (it.hasNext()) {
                        h4hVar = (h4h) it.next();
                        if (!h4hVar.r()) {
                        }
                    }
                }
                Map map111 = map4;
                if (e4hVar2 != null) {
                    i = 0;
                    while (i < e4hVar2.s() * 64) {
                        if (lch.f1((ymg) e4hVar2.r(), i)) {
                            z6 = zL1;
                            w3hVar4.v().Z.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (lch.f1((ymg) e4hVar2.t(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zL1 = z6;
                        } else {
                            z6 = zL1;
                        }
                        kd0Var.remove(Integer.valueOf(i));
                        i++;
                        zL1 = z6;
                    }
                }
                z5 = zL1;
                e4h e4hVar18 = (e4h) map5.get(num3);
                if (z5) {
                    while (r2.hasNext()) {
                        int iS8 = lygVar2.s();
                        Integer num12 = num3;
                        jLongValue = this.w.longValue() / 1000;
                        if (lygVar2.A()) {
                            jLongValue = this.v.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iS8);
                        if (kd0Var.containsKey(numValueOf)) {
                            kd0Var.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (kd0Var2.containsKey(numValueOf)) {
                            kd0Var2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num3 = num12;
                    }
                }
                this.g.put(num3, new ggh(this, this.e, e4hVar18, bitSet, bitSet2, kd0Var, kd0Var2));
                ichVar2 = ichVar2;
                zL1 = z5;
                map5 = map5;
                obj2 = obj2;
                map = map;
                str3 = str3;
                map4 = map111;
            }
            r10 = obj2;
            ichVar = ichVar2;
            str5 = str4;
        }
        str7 = str2;
        String str116 = str3;
        if (!list.isEmpty()) {
            ws4Var = new ws4(this);
            kd0Var6 = new kd0();
            while (r17.hasNext()) {
                v2hVarF = ws4Var.f(this.e, v2hVar);
                if (v2hVarF != null) {
                    bsgVarK1 = ichVar.h0().k1(this.e, v2hVar, v2hVarF.w());
                    ichVar.h0().b1("events", bsgVarK1);
                    if (z) {
                        j = bsgVarK1.c;
                        strW = v2hVarF.w();
                        map7 = (Map) kd0Var6.get(strW);
                        if (map7 == null) {
                            krg krgVarH17 = ichVar.h0();
                            w3h w3hVar11 = (w3h) krgVarH17.b;
                            str10 = this.e;
                            krgVarH17.B0();
                            krgVarH17.A0();
                            oa7.x(str10);
                            oa7.x(strW);
                            kd0Var7 = new kd0();
                            Query = krgVarH17.r1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                            if (Query.moveToFirst()) {
                                str11 = str10;
                                Query = Query;
                                r312 = list;
                                while (true) {
                                    lyg lygVar14 = (lyg) ((kyg) lch.l1(lyg.D(), Query.getBlob(1))).e();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) kd0Var7.get(numValueOf6);
                                    if (list6 == null) {
                                        r312 = Query;
                                        arrayList4 = new ArrayList();
                                        kd0Var7.put(numValueOf6, arrayList4);
                                        r314 = r312;
                                    } else {
                                        r314 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(lygVar14);
                                    r313 = r314;
                                    if (!r313.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r313;
                                    r312 = r313;
                                }
                                r313.close();
                                map7 = kd0Var7;
                                r39 = r313;
                            } else {
                                ?? r3110 = Query;
                                map7 = Collections.EMPTY_MAP;
                                r3110.close();
                                r39 = r3110;
                            }
                            kd0Var6.put(strW, map7);
                            list = r39;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num5.intValue();
                            if (this.f.contains(num5)) {
                                w3hVar4.v().Z.b(num5, "Skipping failed audience ID");
                            } else {
                                it7 = ((List) map7.get(num5)).iterator();
                                zI = true;
                                while (true) {
                                    if (!it7.hasNext()) {
                                        map8 = map7;
                                        ws4Var2 = ws4Var;
                                        num2 = num5;
                                        break;
                                    }
                                    lyg lygVar15 = (lyg) it7.next();
                                    map8 = map7;
                                    ws4Var2 = ws4Var;
                                    num2 = num5;
                                    akgVar2 = new akg(this, this.e, iIntValue2, lygVar15, 0);
                                    Long l17 = this.v;
                                    Long l18 = this.w;
                                    iS = lygVar15.s();
                                    gghVar = (ggh) this.g.get(num2);
                                    if (gghVar == null) {
                                        z8 = false;
                                    } else {
                                        z8 = gghVar.d.get(iS);
                                    }
                                    zI = akgVar2.i(l17, l18, v2hVarF, j, bsgVarK1, z8);
                                    if (!zI) {
                                        this.f.add(num2);
                                        break;
                                    }
                                    F0(num2).a(akgVar2);
                                    num5 = num2;
                                    map7 = map8;
                                    ws4Var = ws4Var2;
                                }
                                if (!zI) {
                                    this.f.add(num2);
                                }
                                ws4Var = ws4Var2;
                                map7 = map8;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            kd0 kd0Var15 = new kd0();
            it4 = list2.iterator();
            widVar = kd0Var15;
            while (it4.hasNext()) {
                p4h p4hVar6 = (p4h) it4.next();
                strT = p4hVar6.t();
                map6 = (Map) widVar.get(strT);
                if (map6 == null) {
                    krg krgVarH18 = ichVar.h0();
                    w3hVar2 = (w3h) krgVarH18.b;
                    str9 = this.e;
                    krgVarH18.B0();
                    krgVarH18.A0();
                    oa7.x(str9);
                    oa7.x(strT);
                    kd0Var5 = new kd0();
                    cursorQuery2 = krgVarH18.r1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            uyg uygVar7 = (uyg) ((syg) lch.l1(uyg.z(), cursorQuery2.getBlob(1))).e();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) kd0Var5.get(numValueOf5);
                            if (list5 == null) {
                                w3hVar3 = w3hVar2;
                                arrayList3 = new ArrayList();
                                kd0Var5.put(numValueOf5, arrayList3);
                            } else {
                                w3hVar3 = w3hVar2;
                                arrayList3 = list5;
                            }
                            arrayList3.add(uygVar7);
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            w3hVar2 = w3hVar3;
                            str7 = str7;
                        }
                        cursorQuery2.close();
                        map6 = kd0Var5;
                    } else {
                        it5 = it4;
                        str7 = str7;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    widVar.put(strT, map6);
                } else {
                    it5 = it4;
                    str7 = str7;
                }
                widVar2 = widVar;
                while (r3.hasNext()) {
                    iIntValue = num6.intValue();
                    if (this.f.contains(num6)) {
                        w3hVar4.v().Z.b(num6, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it6 = ((List) map6.get(num6)).iterator();
                    zJ = true;
                    widVar3 = widVar2;
                    while (true) {
                        if (it6.hasNext()) {
                            uygVar = (uyg) it6.next();
                            if (Log.isLoggable(w3hVar4.v().G0(), 2)) {
                                tz0 tz0Var16 = w3hVar4.v().Z;
                                if (uygVar.r()) {
                                    numValueOf4 = Integer.valueOf(uygVar.s());
                                } else {
                                    numValueOf4 = null;
                                }
                                tz0Var16.d("Evaluating filter. audience, filter, property", num6, numValueOf4, w3hVar4.x.c(uygVar.t()));
                                w3hVar4.v().Z.b(ichVar.k0().c1(uygVar), "Filter definition");
                            }
                            if (uygVar.r()) {
                            }
                            tz0 tz0Var17 = w3hVar4.v().x;
                            t0h t0hVarE7 = w0h.E0(this.e);
                            if (uygVar.r()) {
                                numValueOf3 = Integer.valueOf(uygVar.s());
                            } else {
                                numValueOf3 = null;
                            }
                            tz0Var17.c(t0hVarE7, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.f.add(num6);
                            map6 = map6;
                            widVar2 = widVar3;
                        } else {
                            map6 = map6;
                            widVar3 = widVar3;
                        }
                        if (!zJ) {
                            this.f.add(num6);
                        }
                        map6 = map6;
                        widVar2 = widVar3;
                        F0(num6).a(akgVar);
                        iIntValue = i2;
                        map6 = map6;
                        widVar3 = widVar3;
                    }
                }
                str7 = str7;
                it4 = it5;
                widVar = widVar2;
            }
        }
        arrayList2 = new ArrayList();
        gd0<Integer> gd0Var6 = (gd0) this.g.keySet();
        gd0Var6.removeAll(this.f);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            ggh gghVar8 = (ggh) this.g.get(num7);
            oa7.A(gghVar8);
            z1h z1hVarB6 = gghVar8.b(iIntValue8);
            arrayList2.add(z1hVarB6);
            krgVarH1 = ichVar.h0();
            w3hVar = (w3h) krgVarH1.b;
            str8 = this.e;
            e4h e4hVarT6 = z1hVarB6.t();
            krgVarH1.B0();
            krgVarH1.A0();
            oa7.x(str8);
            oa7.A(e4hVarT6);
            byte[] bArrA6 = e4hVarT6.a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (krgVarH1.r1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                w3hVar.v().g.b(w0h.E0(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final ggh F0(Integer num) {
        if (this.g.containsKey(num)) {
            return (ggh) this.g.get(num);
        }
        ggh gghVar = new ggh(this, this.e);
        this.g.put(num, gghVar);
        return gghVar;
    }

    @Override // defpackage.wbh
    public final void D0() {
    }
}

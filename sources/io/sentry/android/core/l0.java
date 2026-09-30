package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import defpackage.c6c;
import defpackage.ip3;
import defpackage.pk1;
import defpackage.ub3;
import io.sentry.e7;
import io.sentry.i5;
import io.sentry.j5;
import io.sentry.protocol.DebugImage;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r3;
import io.sentry.s3;
import io.sentry.v4;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements io.sentry.f0 {
    public final Context a;
    public final SentryAndroidOptions b;
    public final o0 c;
    public final j5 d;
    public final io.sentry.cache.g e;
    public final List f = Collections.singletonList(new j0(this));

    public l0(Context context, o0 o0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = o0Var;
        this.e = sentryAndroidOptions.findPersistingScopeObserver();
        this.d = new j5(new io.sentry.d(2, sentryAndroidOptions));
    }

    public final Object a(String str, Class cls, Object obj, k0 k0Var) {
        if (k0Var == k0.CURRENT || k0Var == k0.PERSISTED_WITH_CURRENT_FALLBACK) {
            return obj;
        }
        if (k0Var == k0.NONE) {
            return null;
        }
        return io.sentry.cache.a.c(this.b, ".options-cache", str, cls);
    }

    public final Object c(String str, Class cls, Object obj, k0 k0Var) {
        if (k0Var != k0.CURRENT) {
            if (k0Var == k0.NONE) {
                return null;
            }
            Object objC = io.sentry.cache.a.c(this.b, ".options-cache", str, cls);
            if (objC != null || k0Var == k0.PERSISTED) {
                return objC;
            }
        }
        return obj;
    }

    public final Object d(q6 q6Var, String str, Class cls) {
        io.sentry.cache.g gVar = this.e;
        if (gVar == null) {
            return null;
        }
        return gVar.d(q6Var, str, cls);
    }

    public final void e(v4 v4Var) {
        String str = v4Var.f;
        io.sentry.protocol.e eVar = v4Var.b;
        if (str != null) {
            try {
                io.sentry.protocol.a aVarE = eVar.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                }
                String strSubstring = str.substring(str.indexOf(64) + 1, str.indexOf(43));
                String strSubstring2 = str.substring(str.indexOf(43) + 1);
                aVarE.f = strSubstring;
                aVarE.g = strSubstring2;
                eVar.n(aVarE);
            } catch (Throwable unused) {
                this.b.getLogger().i(q5.WARNING, "Failed to parse release from scope cache: %s", str);
            }
        }
    }

    public final void f(v4 v4Var, k0 k0Var) {
        String str;
        String str2 = v4Var.z;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (str2 == null) {
            str2 = (String) c("dist.json", String.class, sentryAndroidOptions.getDist(), k0Var);
            v4Var.z = str2;
        }
        if (str2 != null || (str = v4Var.f) == null) {
            return;
        }
        try {
            v4Var.z = str.substring(str.indexOf(43) + 1);
        } catch (Throwable unused) {
            sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024a  */
    /* JADX WARN: Code duplicated, block: B:102:0x024f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0255  */
    /* JADX WARN: Code duplicated, block: B:114:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0274  */
    /* JADX WARN: Code duplicated, block: B:116:0x0277  */
    /* JADX WARN: Code duplicated, block: B:117:0x0279  */
    /* JADX WARN: Code duplicated, block: B:122:0x0290  */
    /* JADX WARN: Code duplicated, block: B:125:0x029d  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x0300  */
    /* JADX WARN: Code duplicated, block: B:142:0x0303  */
    /* JADX WARN: Code duplicated, block: B:144:0x0309  */
    /* JADX WARN: Code duplicated, block: B:145:0x0312  */
    /* JADX WARN: Code duplicated, block: B:148:0x0320  */
    /* JADX WARN: Code duplicated, block: B:150:0x0336  */
    /* JADX WARN: Code duplicated, block: B:154:0x0354  */
    /* JADX WARN: Code duplicated, block: B:155:0x0357  */
    /* JADX WARN: Code duplicated, block: B:157:0x035d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0365  */
    /* JADX WARN: Code duplicated, block: B:162:0x0373  */
    /* JADX WARN: Code duplicated, block: B:164:0x0377  */
    /* JADX WARN: Code duplicated, block: B:166:0x0386  */
    /* JADX WARN: Code duplicated, block: B:169:0x0394  */
    /* JADX WARN: Code duplicated, block: B:171:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:172:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:185:0x0406  */
    /* JADX WARN: Code duplicated, block: B:190:0x0426  */
    /* JADX WARN: Code duplicated, block: B:193:0x0434 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x0436  */
    /* JADX WARN: Code duplicated, block: B:195:0x043c  */
    /* JADX WARN: Code duplicated, block: B:199:0x044d  */
    /* JADX WARN: Code duplicated, block: B:202:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0472  */
    /* JADX WARN: Code duplicated, block: B:207:0x0478  */
    /* JADX WARN: Code duplicated, block: B:209:0x048d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0495  */
    /* JADX WARN: Code duplicated, block: B:212:0x0497  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b7 A[Catch: all -> 0x04ca, TRY_LEAVE, TryCatch #5 {all -> 0x04ca, blocks: (B:216:0x04a7, B:218:0x04b7), top: B:538:0x04a7 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:226:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:235:0x0518  */
    /* JADX WARN: Code duplicated, block: B:238:0x0521  */
    /* JADX WARN: Code duplicated, block: B:240:0x052f A[DONT_INVERT, PHI: r6
  0x052f: PHI (r6v14 java.lang.String) = (r6v13 java.lang.String), (r6v26 java.lang.String), (r6v28 java.lang.String) binds: [B:208:0x048b, B:238:0x0521, B:237:0x051f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x0532  */
    /* JADX WARN: Code duplicated, block: B:245:0x0542  */
    /* JADX WARN: Code duplicated, block: B:248:0x0552  */
    /* JADX WARN: Code duplicated, block: B:251:0x0565  */
    /* JADX WARN: Code duplicated, block: B:254:0x056e  */
    /* JADX WARN: Code duplicated, block: B:257:0x057e  */
    /* JADX WARN: Code duplicated, block: B:259:0x058a  */
    /* JADX WARN: Code duplicated, block: B:263:0x059e  */
    /* JADX WARN: Code duplicated, block: B:266:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:269:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d6 A[Catch: all -> 0x05eb, TryCatch #7 {all -> 0x05eb, blocks: (B:270:0x05ce, B:272:0x05d6, B:274:0x05e4), top: B:542:0x05ce }] */
    /* JADX WARN: Code duplicated, block: B:274:0x05e4 A[Catch: all -> 0x05eb, TRY_LEAVE, TryCatch #7 {all -> 0x05eb, blocks: (B:270:0x05ce, B:272:0x05d6, B:274:0x05e4), top: B:542:0x05ce }] */
    /* JADX WARN: Code duplicated, block: B:281:0x060e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0612  */
    /* JADX WARN: Code duplicated, block: B:284:0x061b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0629  */
    /* JADX WARN: Code duplicated, block: B:292:0x064f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0673  */
    /* JADX WARN: Code duplicated, block: B:307:0x0685 A[Catch: all -> 0x06c2, TryCatch #2 {all -> 0x06c2, blocks: (B:305:0x067d, B:307:0x0685, B:309:0x0699, B:310:0x069e, B:311:0x06a6, B:313:0x06ac), top: B:533:0x067d }] */
    /* JADX WARN: Code duplicated, block: B:309:0x0699 A[Catch: all -> 0x06c2, TryCatch #2 {all -> 0x06c2, blocks: (B:305:0x067d, B:307:0x0685, B:309:0x0699, B:310:0x069e, B:311:0x06a6, B:313:0x06ac), top: B:533:0x067d }] */
    /* JADX WARN: Code duplicated, block: B:313:0x06ac A[Catch: all -> 0x06c2, LOOP:5: B:311:0x06a6->B:313:0x06ac, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x06c2, blocks: (B:305:0x067d, B:307:0x0685, B:309:0x0699, B:310:0x069e, B:311:0x06a6, B:313:0x06ac), top: B:533:0x067d }] */
    /* JADX WARN: Code duplicated, block: B:318:0x06d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:321:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:324:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:376:0x07af  */
    /* JADX WARN: Code duplicated, block: B:378:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:380:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:382:0x07da  */
    /* JADX WARN: Code duplicated, block: B:384:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:416:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:417:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:420:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:422:0x0910  */
    /* JADX WARN: Code duplicated, block: B:424:0x0950  */
    /* JADX WARN: Code duplicated, block: B:426:0x0977  */
    /* JADX WARN: Code duplicated, block: B:427:0x0980  */
    /* JADX WARN: Code duplicated, block: B:430:0x0989  */
    /* JADX WARN: Code duplicated, block: B:432:0x0994  */
    /* JADX WARN: Code duplicated, block: B:437:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:439:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:443:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:451:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:454:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:456:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:459:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:461:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:462:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:463:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:470:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:475:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:477:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:514:0x0c14 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:515:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:518:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:519:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:523:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:526:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:527:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:529:0x065b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x04a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0a13 A[EDGE_INSN: B:594:0x0a13->B:445:0x0a13 BREAK  A[LOOP:9: B:418:0x08ea->B:444:0x09ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x09ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x09c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x051a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0211  */
    /* JADX WARN: Instruction removed from duplicated block: B:459:0x0ae3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:475:0x0b8c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2, types: [io.sentry.hints.b] */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r35v0, types: [io.sentry.android.core.l0] */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v47, types: [io.sentry.hints.b] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [io.sentry.protocol.e] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v7, types: [io.sentry.protocol.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.io.File] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, io.sentry.l0 l0Var) {
        j0 j0Var;
        Context context;
        Long l;
        Long lValueOf;
        String str;
        Long lValueOf2;
        ?? r19;
        ?? r20;
        PackageInfo packageInfoE;
        long j;
        long j2;
        k0 k0Var;
        k0 k0Var2;
        Map map;
        j0 j0Var2;
        Iterator it;
        Map.Entry entry;
        List list;
        String str2;
        List list2;
        Map map2;
        io.sentry.protocol.e eVar;
        String str3;
        List list3;
        q5 q5Var;
        e7 e7Var;
        String str4;
        String cacheDirPath;
        Class cls;
        String str5;
        Double d;
        String string;
        String str6;
        File[] fileArrListFiles;
        int length;
        int i;
        File file;
        File[] fileArr;
        io.sentry.protocol.f fVar;
        List list4;
        io.sentry.protocol.a aVarE;
        io.sentry.protocol.a aVar;
        PackageInfo packageInfoE2;
        Map map3;
        io.sentry.protocol.i0 i0Var;
        io.sentry.protocol.i0 i0Var2;
        String strA;
        boolean zEquals;
        SentryAndroidOptions sentryAndroidOptions;
        i5 i5Var2;
        SentryAndroidOptions sentryAndroidOptions2;
        ?? r4;
        ?? r110;
        ?? r111;
        ?? r5;
        ArrayList arrayList;
        List listAsList;
        ArrayList arrayList2;
        ArrayList arrayListD;
        List list5;
        ?? r0;
        io.sentry.protocol.a aVarE2;
        String cacheDirPath2;
        long time;
        ip3 ip3Var;
        q5 q5Var2;
        ?? r21;
        ?? r112;
        ArrayList arrayList3;
        io.sentry.android.core.anr.a aVar2;
        SentryAndroidOptions sentryAndroidOptions3;
        int i2;
        StackTraceElement[] stackTraceElementArr;
        io.sentry.protocol.profiling.a aVar3;
        ArrayList arrayList4;
        HashMap map4;
        ArrayList arrayList5;
        HashMap map5;
        Iterator it2;
        Iterator it3;
        String str7;
        r3 r3Var;
        String str8;
        io.sentry.protocol.f fVar2;
        io.sentry.protocol.w wVar;
        StackTraceElement[] stackTraceElementArr2;
        StackTraceElement[] stackTraceElementArr3;
        ArrayList<Integer> arrayList6;
        int length2;
        int i3;
        StringBuilder sb;
        String string2;
        Integer numValueOf;
        StackTraceElement stackTraceElement;
        String string3;
        Integer numValueOf2;
        io.sentry.protocol.a0 a0Var;
        Integer numValueOf3;
        File file2;
        ?? r35;
        ?? r22;
        ?? r113;
        int i4;
        c6c c6cVar;
        HashMap map6;
        String str9;
        pk1 pk1Var;
        String[] strArr;
        String str10;
        ArrayList arrayList7;
        Iterator it4;
        Map.Entry entry2;
        Object value;
        Iterator it5;
        Map.Entry entry3;
        DisplayMetrics displayMetrics;
        String strA2;
        io.sentry.protocol.e0 e0Var;
        ArrayList arrayList8;
        Object objB = l0Var.b("sentry:typeCheckHint");
        boolean z = objB instanceof io.sentry.hints.b;
        SentryAndroidOptions sentryAndroidOptions4 = this.b;
        if (!z) {
            sentryAndroidOptions4.getLogger().i(q5.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return i5Var;
        }
        io.sentry.hints.b bVar = (io.sentry.hints.b) objB;
        Iterator it6 = this.f.iterator();
        do {
            if (!it6.hasNext()) {
                j0Var = null;
                break;
            }
            j0Var = (j0) it6.next();
            j0Var.getClass();
        } while (!(objB instanceof io.sentry.hints.a));
        String str11 = "ANR";
        if (j0Var != null) {
            boolean zEquals2 = bVar instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) bVar).e()) : false;
            l0 l0Var2 = j0Var.a;
            if (i5Var.v == null) {
                i5Var.v = "java";
            }
            if (i5Var.d() == null) {
                io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                if (bVar.a()) {
                    oVar.a = "AppExitInfo";
                } else {
                    oVar.a = "HistoricalAppExitInfo";
                }
                ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(zEquals2 ? "Background ANR" : "ANR", Thread.currentThread());
                ArrayList arrayListE = i5Var.e();
                if (arrayListE == null) {
                    e0Var = null;
                    break;
                }
                Iterator it7 = arrayListE.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        e0Var = null;
                        break;
                    }
                    e0Var = (io.sentry.protocol.e0) it7.next();
                    String str12 = e0Var.c;
                    if (str12 != null && str12.equals("main")) {
                        break;
                    }
                }
                if (e0Var == null) {
                    e0Var = new io.sentry.protocol.e0();
                    e0Var.w = new io.sentry.protocol.c0();
                }
                l0Var2.d.getClass();
                io.sentry.protocol.c0 c0Var = e0Var.w;
                if (c0Var == null) {
                    arrayList8 = new ArrayList(0);
                } else {
                    ArrayList arrayList9 = new ArrayList(1);
                    arrayList9.add(j5.c(applicationNotResponding, oVar, e0Var.a, c0Var.a, true));
                    arrayList8 = arrayList9;
                }
                i5Var.I0 = new io.sentry.h2(arrayList8);
            }
        }
        io.sentry.protocol.e eVar2 = i5Var.b;
        io.sentry.protocol.q qVarH = eVar2.h();
        Context context2 = this.a;
        eVar2.s(u0.c(context2, sentryAndroidOptions4).g);
        if (qVarH != null) {
            String str13 = qVarH.a;
            eVar2.l(qVarH, (str13 == null || str13.isEmpty()) ? "os_1" : "os_" + str13.trim().toLowerCase(Locale.ROOT));
        }
        io.sentry.protocol.h hVarF = eVar2.f();
        String str14 = "Error getting installationId.";
        o0 o0Var = this.c;
        if (hVarF == null) {
            io.sentry.protocol.h hVar = new io.sentry.protocol.h();
            hVar.b = Build.MANUFACTURER;
            hVar.c = Build.BRAND;
            hVar.d = p0.b(sentryAndroidOptions4.getLogger());
            hVar.e = Build.MODEL;
            hVar.f = Build.ID;
            hVar.g = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoC = p0.c(context2, sentryAndroidOptions4.getLogger());
            context = context2;
            if (memoryInfoC != null) {
                hVar.X = Long.valueOf(memoryInfoC.totalMem);
            }
            hVar.z = o0Var.a();
            io.sentry.z0 logger = sentryAndroidOptions4.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th) {
                logger.d(q5.ERROR, "Error getting DisplayMetrics.", th);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                hVar.J0 = Integer.valueOf(displayMetrics.widthPixels);
                hVar.K0 = Integer.valueOf(displayMetrics.heightPixels);
                hVar.L0 = Float.valueOf(displayMetrics.density);
                hVar.M0 = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (hVar.P0 == null) {
                try {
                    strA2 = z0.a(context);
                } catch (Throwable th2) {
                    sentryAndroidOptions4.getLogger().d(q5.ERROR, "Error getting installationId.", th2);
                    strA2 = null;
                }
                hVar.P0 = strA2;
            }
            ArrayList arrayListA = io.sentry.android.core.internal.util.f.c.a();
            if (!arrayListA.isEmpty()) {
                hVar.U0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                hVar.T0 = Integer.valueOf(arrayListA.size());
            }
            eVar2.p(hVar);
        } else {
            context = context2;
        }
        boolean z2 = bVar instanceof io.sentry.hints.a;
        if (!z2) {
            if (bVar instanceof io.sentry.hints.g) {
                lValueOf = Long.valueOf(((i2) ((io.sentry.hints.g) bVar)).d);
            } else {
                l = null;
            }
            str = (String) io.sentry.cache.a.c(sentryAndroidOptions4, ".options-cache", "app-last-update-time.json", String.class);
            if (str == null) {
                try {
                    lValueOf2 = Long.valueOf(str);
                    r19 = bVar;
                    r20 = z2 ? 1 : 0;
                    str11 = "ANR";
                    l = l;
                } catch (NumberFormatException e) {
                    sentryAndroidOptions4.getLogger().c(q5.ERROR, e, "Failed to read options cache generation.", new Object[0]);
                    lValueOf2 = null;
                    r19 = bVar;
                    r20 = z2;
                }
                packageInfoE = p0.e(context, o0Var);
                if (packageInfoE == null) {
                    j2 = 0;
                    j = 0;
                } else {
                    j = 0;
                    j2 = packageInfoE.lastUpdateTime;
                }
                if (l == null && j2 > j && j2 <= l.longValue()) {
                    k0Var = (lValueOf2 == null || lValueOf2.longValue() != j2) ? k0.CURRENT : k0.PERSISTED_WITH_CURRENT_FALLBACK;
                } else if (lValueOf2 == null) {
                    k0Var = k0.PERSISTED;
                } else if (l != null || lValueOf2.longValue() <= j || lValueOf2.longValue() > l.longValue()) {
                    k0Var = k0.NONE;
                } else {
                    k0Var = k0.PERSISTED;
                }
                k0Var2 = k0Var;
                if (!r19.a()) {
                    if (i5Var.f == null) {
                        i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
                    }
                    if (i5Var.g == null) {
                        i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
                    }
                    f(i5Var, k0Var2);
                    e(i5Var);
                    sentryAndroidOptions4.getLogger().i(q5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
                    return i5Var;
                }
                if (i5Var.d == null) {
                    i5Var.d = (io.sentry.protocol.r) d(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
                }
                if (i5Var.w == null) {
                    i5Var.w = (io.sentry.protocol.i0) d(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
                }
                map = (Map) d(sentryAndroidOptions4, "tags.json", Map.class);
                if (map == null) {
                    j0Var2 = j0Var;
                } else {
                    j0Var2 = j0Var;
                    if (i5Var.e == null) {
                        i5Var.c(new HashMap(map));
                    } else {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                            Iterator it8 = it;
                            if (!i5Var.e.containsKey(entry.getKey())) {
                                i5Var.b((String) entry.getKey(), (String) entry.getValue());
                            }
                            it = it8;
                        }
                    }
                }
                list = (List) d(sentryAndroidOptions4, "breadcrumbs.json", List.class);
                if (list == null) {
                    str2 = "anr_background";
                } else {
                    str2 = "anr_background";
                    list2 = i5Var.X;
                    if (list2 == null) {
                        i5Var.X = new ArrayList(list);
                    } else {
                        list2.addAll(list);
                    }
                }
                map2 = (Map) d(sentryAndroidOptions4, "extras.json", Map.class);
                if (map2 != null) {
                    if (i5Var.Z == null) {
                        i5Var.Z = new HashMap(new HashMap(map2));
                    } else {
                        it5 = map2.entrySet().iterator();
                        while (it5.hasNext()) {
                            entry3 = (Map.Entry) it5.next();
                            Iterator it9 = it5;
                            if (!i5Var.Z.containsKey(entry3.getKey())) {
                                i5Var.Z.put((String) entry3.getKey(), entry3.getValue());
                            }
                            it5 = it9;
                            str14 = str14;
                        }
                    }
                }
                String str15 = str14;
                eVar = (io.sentry.protocol.e) d(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
                if (eVar != null) {
                    it4 = new io.sentry.protocol.e(eVar).a.entrySet().iterator();
                    while (it4.hasNext()) {
                        entry2 = (Map.Entry) it4.next();
                        value = entry2.getValue();
                        Iterator it10 = it4;
                        if (("trace".equals(entry2.getKey()) || !(value instanceof e7)) && !eVar2.b(entry2.getKey())) {
                            eVar2.l(value, (String) entry2.getKey());
                        }
                        it4 = it10;
                    }
                }
                str3 = (String) d(sentryAndroidOptions4, "transaction.json", String.class);
                if (i5Var.K0 == null) {
                    i5Var.K0 = str3;
                }
                list3 = (List) d(sentryAndroidOptions4, "fingerprint.json", List.class);
                if (i5Var.L0 == null) {
                    if (list3 != null) {
                        arrayList7 = new ArrayList(list3);
                    } else {
                        arrayList7 = null;
                    }
                    i5Var.L0 = arrayList7;
                }
                q5Var = (q5) d(sentryAndroidOptions4, "level.json", q5.class);
                if (i5Var.J0 == null) {
                    i5Var.J0 = q5Var;
                }
                e7Var = (e7) d(sentryAndroidOptions4, "trace.json", e7.class);
                if (eVar2.j() == null && e7Var != null) {
                    eVar2.w(e7Var);
                }
                str4 = (String) d(sentryAndroidOptions4, "replay.json", String.class);
                cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
                if (cacheDirPath == null) {
                    cls = Map.class;
                    str5 = "tags.json";
                } else {
                    cls = Map.class;
                    str5 = "tags.json";
                    if (new File(cacheDirPath, ub3.i("replay_", str4)).exists()) {
                        d = sentryAndroidOptions4.getSessionReplay().e;
                        if (d == null) {
                            string = null;
                        } else {
                            string = d.toString();
                        }
                        str6 = (String) c("replay-error-sample-rate.json", String.class, string, k0Var2);
                        if (str6 != null) {
                            try {
                                if (Double.parseDouble(str6) < io.sentry.util.n.a().c()) {
                                    sentryAndroidOptions4.getLogger().i(q5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", i5Var.a);
                                } else {
                                    fileArrListFiles = new File(cacheDirPath).listFiles();
                                    if (fileArrListFiles != null) {
                                        length = fileArrListFiles.length;
                                        long jLastModified = Long.MIN_VALUE;
                                        String strSubstring = null;
                                        i = 0;
                                        while (i < length) {
                                            file = fileArrListFiles[i];
                                            if (file.isDirectory()) {
                                                fileArr = fileArrListFiles;
                                                if (!file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= i5Var.E0.getTime()) {
                                                    jLastModified = file.lastModified();
                                                    strSubstring = file.getName().substring(7);
                                                }
                                            } else {
                                                fileArr = fileArrListFiles;
                                            }
                                            i++;
                                            fileArrListFiles = fileArr;
                                        }
                                        str4 = strSubstring;
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        Charset charset = io.sentry.cache.g.f;
                                        io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                                        eVar2.l(str4, "replay_id");
                                    }
                                }
                            } catch (Throwable th3) {
                                sentryAndroidOptions4.getLogger().d(q5.ERROR, "Error parsing replay sample rate.", th3);
                            }
                        }
                    } else if (str4 != null) {
                        Charset charset2 = io.sentry.cache.g.f;
                        io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                        eVar2.l(str4, "replay_id");
                    }
                }
                if (i5Var.f == null) {
                    i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
                }
                if (i5Var.g == null) {
                    i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
                }
                f(i5Var, k0Var2);
                fVar = i5Var.Y;
                if (fVar == null) {
                    fVar = new io.sentry.protocol.f();
                }
                if (fVar.b == null) {
                    fVar.b(new ArrayList());
                }
                list4 = fVar.b;
                String str16 = DebugImage.PROGUARD;
                String str17 = "proguard-uuid.json";
                if (list4 != null) {
                    str10 = (String) a("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), k0Var2);
                    if (str10 != null) {
                        DebugImage debugImage = new DebugImage();
                        debugImage.setType(DebugImage.PROGUARD);
                        debugImage.setUuid(str10);
                        list4.add(debugImage);
                    }
                    i5Var.Y = fVar;
                }
                if (i5Var.c == null) {
                    i5Var.c = (io.sentry.protocol.u) a("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), k0Var2);
                }
                aVarE = eVar2.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                }
                aVar = aVarE;
                aVar.e = (String) p0.c.a(context);
                packageInfoE2 = p0.e(context, o0Var);
                if (packageInfoE2 != null) {
                    aVar.a = packageInfoE2.packageName;
                }
                try {
                    pk1Var = u0.c(context, sentryAndroidOptions4).f;
                    if (pk1Var != null) {
                        aVar.z = Boolean.valueOf(pk1Var.b);
                        strArr = (String[]) pk1Var.c;
                        if (strArr != null) {
                            aVar.X = Arrays.asList(strArr);
                        }
                    }
                } catch (Throwable th4) {
                    sentryAndroidOptions4.getLogger().d(q5.ERROR, "Error getting split apks info.", th4);
                }
                eVar2.n(aVar);
                e(i5Var);
                map3 = (Map) c(str5, cls, sentryAndroidOptions4.getTags(), k0Var2);
                if (map3 != null) {
                    if (i5Var.e == null) {
                        i5Var.c(new HashMap(map3));
                    } else {
                        for (Map.Entry entry4 : map3.entrySet()) {
                            if (!i5Var.e.containsKey(entry4.getKey())) {
                                i5Var.b((String) entry4.getKey(), (String) entry4.getValue());
                            }
                        }
                    }
                }
                i0Var = i5Var.w;
                if (i0Var == null) {
                    i0Var = new io.sentry.protocol.i0();
                    i5Var.w = i0Var;
                }
                i0Var2 = i0Var;
                if (i0Var2.b == null) {
                    try {
                        strA = z0.a(context);
                    } catch (Throwable th5) {
                        sentryAndroidOptions4.getLogger().d(q5.ERROR, str15, th5);
                        strA = null;
                    }
                    i0Var2.b = strA;
                }
                if (i0Var2.d == null && sentryAndroidOptions4.isSendDefaultPii()) {
                    i0Var2.d = "{{auto}}";
                }
                try {
                    c6cVar = u0.c(context, sentryAndroidOptions4).e;
                    if (c6cVar != null) {
                        map6 = new HashMap();
                        map6.put("isSideLoaded", String.valueOf(c6cVar.a));
                        str9 = c6cVar.b;
                        if (str9 != null) {
                            map6.put("installerStore", str9);
                        }
                        for (Map.Entry entry5 : map6.entrySet()) {
                            i5Var.b((String) entry5.getKey(), (String) entry5.getValue());
                        }
                    }
                } catch (Throwable th6) {
                    sentryAndroidOptions4.getLogger().d(q5.ERROR, "Error getting side loaded info.", th6);
                }
                if (j0Var2 != null) {
                    return i5Var;
                }
                if (r20 != 0) {
                    zEquals = str2.equals(((io.sentry.hints.a) r19).e());
                } else {
                    zEquals = false;
                }
                l0 l0Var3 = j0Var2.a;
                sentryAndroidOptions = l0Var3.b;
                if (sentryAndroidOptions.isAnrProfilingEnabled() || zEquals || (cacheDirPath2 = sentryAndroidOptions.getCacheDirPath()) == null) {
                    i5Var2 = i5Var;
                    sentryAndroidOptions2 = sentryAndroidOptions;
                    r4 = eVar2;
                    r110 = zEquals;
                    arrayList = null;
                    r5 = r4;
                    r111 = r110;
                } else {
                    this = new File(cacheDirPath2);
                    if (r20 != 0) {
                        Long lB = ((io.sentry.hints.a) r19).b();
                        try {
                            try {
                                try {
                                    if (lB != null) {
                                        time = lB.longValue();
                                    } else {
                                        Date date = i5Var.E0;
                                        if (date != null) {
                                            time = date.getTime();
                                        } else {
                                            i5Var2 = i5Var;
                                            sentryAndroidOptions2 = sentryAndroidOptions;
                                            r4 = eVar2;
                                            r110 = zEquals;
                                        }
                                        arrayList = null;
                                        r5 = r4;
                                        r111 = r110;
                                    }
                                    if (file2.exists()) {
                                        this = this;
                                        r20 = eVar2;
                                        r19 = zEquals;
                                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Reading ANR profile", new Object[0]);
                                        io.sentry.android.core.anr.d dVar = new io.sentry.android.core.anr.d(sentryAndroidOptions, file2);
                                        try {
                                            ip3Var = new ip3(dVar.a.U());
                                            try {
                                                dVar.close();
                                                i4 = 0;
                                                r113 = r19;
                                                r22 = r20;
                                                r35 = this;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                try {
                                                    io.sentry.z0 logger2 = sentryAndroidOptions.getLogger();
                                                    q5Var2 = q5.INFO;
                                                    logger2.d(q5Var2, "Could not retrieve ANR profile", th);
                                                    r112 = r19;
                                                    r21 = r20;
                                                    if (!io.sentry.android.core.anr.e.a(this)) {
                                                        sentryAndroidOptions.getLogger().i(q5Var2, "Could not delete ANR profile file", new Object[0]);
                                                    }
                                                } catch (Throwable th8) {
                                                    if (!io.sentry.android.core.anr.e.a(this)) {
                                                        sentryAndroidOptions.getLogger().i(q5.INFO, "Could not delete ANR profile file", new Object[0]);
                                                    }
                                                    throw th8;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            try {
                                                dVar.close();
                                                throw th9;
                                            } catch (Throwable th10) {
                                                th9.addSuppressed(th10);
                                                throw th9;
                                            }
                                        }
                                    } else {
                                        r35 = this;
                                        r22 = eVar2;
                                        r113 = zEquals;
                                        i4 = 0;
                                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "No ANR profile file found", new Object[0]);
                                        ip3Var = null;
                                    }
                                    r112 = r113;
                                    r21 = r22;
                                    if (!io.sentry.android.core.anr.e.a(r35)) {
                                        sentryAndroidOptions.getLogger().i(q5.INFO, "Could not delete ANR profile file", new Object[i4]);
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    ip3Var = null;
                                    io.sentry.z0 logger3 = sentryAndroidOptions.getLogger();
                                    q5Var2 = q5.INFO;
                                    logger3.d(q5Var2, "Could not retrieve ANR profile", th);
                                    r112 = r19;
                                    r21 = r20;
                                    if (!io.sentry.android.core.anr.e.a(this)) {
                                        sentryAndroidOptions.getLogger().i(q5Var2, "Could not delete ANR profile file", new Object[0]);
                                    }
                                    if (ip3Var == null) {
                                        r112 = r19;
                                        r21 = r20;
                                        ArrayList arrayList10 = (ArrayList) ip3Var.c;
                                        sentryAndroidOptions.getLogger().i(q5.INFO, "ANR profile found", new Object[0]);
                                        if (time >= ip3Var.a) {
                                            r112 = r113;
                                            r21 = r22;
                                            r112 = r113;
                                            r21 = r22;
                                            i5Var2 = i5Var;
                                            sentryAndroidOptions2 = sentryAndroidOptions;
                                            r5 = r21;
                                            arrayList = null;
                                            sentryAndroidOptions2.getLogger().i(q5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                            r111 = r112;
                                        } else {
                                            r112 = r113;
                                            r21 = r22;
                                            r112 = r113;
                                            r21 = r22;
                                            i5Var2 = i5Var;
                                            sentryAndroidOptions2 = sentryAndroidOptions;
                                            r5 = r21;
                                            arrayList = null;
                                            sentryAndroidOptions2.getLogger().i(q5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                            r111 = r112;
                                        }
                                        if (i5Var2.L0 == null) {
                                            if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                                listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                                if (listAsList != null) {
                                                    arrayList2 = new ArrayList(listAsList);
                                                } else {
                                                    arrayList2 = arrayList;
                                                }
                                                i5Var2.L0 = arrayList2;
                                            } else {
                                                listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                                if (listAsList != null) {
                                                    arrayList2 = new ArrayList(listAsList);
                                                } else {
                                                    arrayList2 = arrayList;
                                                }
                                                i5Var2.L0 = arrayList2;
                                            }
                                        }
                                        r0 = r111 ^ 1;
                                        aVarE2 = r5.e();
                                        if (aVarE2 == null) {
                                            aVarE2 = new io.sentry.protocol.a();
                                            r5.n(aVarE2);
                                        }
                                        if (aVarE2.y == null) {
                                            return i5Var2;
                                        }
                                        aVarE2.y = Boolean.valueOf((boolean) r0);
                                        return i5Var2;
                                    }
                                    r112 = r19;
                                    r21 = r20;
                                    r112 = r113;
                                    r21 = r22;
                                    i5Var2 = i5Var;
                                    sentryAndroidOptions2 = sentryAndroidOptions;
                                    r4 = r21;
                                    r110 = r112;
                                    arrayList = null;
                                    r5 = r4;
                                    r111 = r110;
                                    if (i5Var2.L0 == null) {
                                        if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                            listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                            if (listAsList != null) {
                                                arrayList2 = new ArrayList(listAsList);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            i5Var2.L0 = arrayList2;
                                        } else {
                                            listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                            if (listAsList != null) {
                                                arrayList2 = new ArrayList(listAsList);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            i5Var2.L0 = arrayList2;
                                        }
                                    }
                                    r0 = r111 ^ 1;
                                    aVarE2 = r5.e();
                                    if (aVarE2 == null) {
                                        aVarE2 = new io.sentry.protocol.a();
                                        r5.n(aVarE2);
                                    }
                                    if (aVarE2.y == null) {
                                        return i5Var2;
                                    }
                                    aVarE2.y = Boolean.valueOf((boolean) r0);
                                    return i5Var2;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                r20 = eVar2;
                                r19 = zEquals;
                                ip3Var = null;
                                io.sentry.z0 logger4 = sentryAndroidOptions.getLogger();
                                q5Var2 = q5.INFO;
                                logger4.d(q5Var2, "Could not retrieve ANR profile", th);
                                r112 = r19;
                                r21 = r20;
                                if (!io.sentry.android.core.anr.e.a(this)) {
                                    sentryAndroidOptions.getLogger().i(q5Var2, "Could not delete ANR profile file", new Object[0]);
                                }
                                if (ip3Var == null) {
                                    r112 = r19;
                                    r21 = r20;
                                    ArrayList arrayList11 = (ArrayList) ip3Var.c;
                                    sentryAndroidOptions.getLogger().i(q5.INFO, "ANR profile found", new Object[0]);
                                    if (time >= ip3Var.a) {
                                        r112 = r113;
                                        r21 = r22;
                                        r112 = r113;
                                        r21 = r22;
                                        i5Var2 = i5Var;
                                        sentryAndroidOptions2 = sentryAndroidOptions;
                                        r5 = r21;
                                        arrayList = null;
                                        sentryAndroidOptions2.getLogger().i(q5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                        r111 = r112;
                                    } else {
                                        r112 = r113;
                                        r21 = r22;
                                        r112 = r113;
                                        r21 = r22;
                                        i5Var2 = i5Var;
                                        sentryAndroidOptions2 = sentryAndroidOptions;
                                        r5 = r21;
                                        arrayList = null;
                                        sentryAndroidOptions2.getLogger().i(q5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                        r111 = r112;
                                    }
                                    if (i5Var2.L0 == null) {
                                        if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                            listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                            if (listAsList != null) {
                                                arrayList2 = new ArrayList(listAsList);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            i5Var2.L0 = arrayList2;
                                        } else {
                                            listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                            if (listAsList != null) {
                                                arrayList2 = new ArrayList(listAsList);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            i5Var2.L0 = arrayList2;
                                        }
                                    }
                                    r0 = r111 ^ 1;
                                    aVarE2 = r5.e();
                                    if (aVarE2 == null) {
                                        aVarE2 = new io.sentry.protocol.a();
                                        r5.n(aVarE2);
                                    }
                                    if (aVarE2.y == null) {
                                        return i5Var2;
                                    }
                                    aVarE2.y = Boolean.valueOf((boolean) r0);
                                    return i5Var2;
                                }
                                r112 = r19;
                                r21 = r20;
                                r112 = r113;
                                r21 = r22;
                                i5Var2 = i5Var;
                                sentryAndroidOptions2 = sentryAndroidOptions;
                                r4 = r21;
                                r110 = r112;
                                arrayList = null;
                                r5 = r4;
                                r111 = r110;
                                if (i5Var2.L0 == null) {
                                    if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                        listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                        if (listAsList != null) {
                                            arrayList2 = new ArrayList(listAsList);
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                        i5Var2.L0 = arrayList2;
                                    } else {
                                        listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                        if (listAsList != null) {
                                            arrayList2 = new ArrayList(listAsList);
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                        i5Var2.L0 = arrayList2;
                                    }
                                }
                                r0 = r111 ^ 1;
                                aVarE2 = r5.e();
                                if (aVarE2 == null) {
                                    aVarE2 = new io.sentry.protocol.a();
                                    r5.n(aVarE2);
                                }
                                if (aVarE2.y == null) {
                                    return i5Var2;
                                }
                                aVarE2.y = Boolean.valueOf((boolean) r0);
                                return i5Var2;
                            }
                            io.sentry.android.core.anr.e.b(this);
                            file2 = new File((File) this, "anr_profile_old");
                        } catch (Throwable th13) {
                            th = th13;
                        }
                        if (ip3Var == null) {
                            r112 = r19;
                            r21 = r20;
                            r112 = r113;
                            r21 = r22;
                            i5Var2 = i5Var;
                            sentryAndroidOptions2 = sentryAndroidOptions;
                        } else {
                            r112 = r19;
                            r21 = r20;
                            ArrayList arrayList12 = (ArrayList) ip3Var.c;
                            sentryAndroidOptions.getLogger().i(q5.INFO, "ANR profile found", new Object[0]);
                            if (time >= ip3Var.a || time > ip3Var.b) {
                                r112 = r113;
                                r21 = r22;
                                r112 = r113;
                                r21 = r22;
                                i5Var2 = i5Var;
                                sentryAndroidOptions2 = sentryAndroidOptions;
                                r5 = r21;
                                arrayList = null;
                                sentryAndroidOptions2.getLogger().i(q5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                r111 = r112;
                            } else {
                                ArrayList arrayList13 = io.sentry.android.core.anr.c.a;
                                if (arrayList12.isEmpty()) {
                                    r112 = r113;
                                    r21 = r22;
                                    arrayList3 = arrayList12;
                                    sentryAndroidOptions2 = sentryAndroidOptions;
                                } else {
                                    r112 = r113;
                                    r21 = r22;
                                    HashMap map7 = new HashMap();
                                    Iterator it11 = arrayList12.iterator();
                                    while (it11.hasNext()) {
                                        io.sentry.android.core.anr.f fVar3 = (io.sentry.android.core.anr.f) it11.next();
                                        StackTraceElement[] stackTraceElementArr4 = fVar3.a;
                                        if (stackTraceElementArr4.length >= 2) {
                                            int length3 = stackTraceElementArr4.length - 1;
                                            int i5 = 0;
                                            while (length3 >= 0) {
                                                ArrayList arrayList14 = arrayList12;
                                                String className = stackTraceElementArr4[length3].getClassName();
                                                Iterator it12 = io.sentry.android.core.anr.c.a.iterator();
                                                while (true) {
                                                    if (!it12.hasNext()) {
                                                        sentryAndroidOptions3 = sentryAndroidOptions;
                                                        i5++;
                                                        break;
                                                    }
                                                    sentryAndroidOptions3 = sentryAndroidOptions;
                                                    if (className.startsWith((String) it12.next())) {
                                                        break;
                                                    }
                                                    sentryAndroidOptions = sentryAndroidOptions3;
                                                }
                                                float length4 = i5 / (stackTraceElementArr4.length - length3);
                                                io.sentry.android.core.anr.b bVar2 = new io.sentry.android.core.anr.b(stackTraceElementArr4, length3, stackTraceElementArr4.length - 1);
                                                io.sentry.android.core.anr.a aVar4 = (io.sentry.android.core.anr.a) map7.get(bVar2);
                                                if (aVar4 == null) {
                                                    StackTraceElement[] stackTraceElementArr5 = fVar3.a;
                                                    i2 = length3;
                                                    map7.put(bVar2, new io.sentry.android.core.anr.a(stackTraceElementArr5, i2, stackTraceElementArr5.length - 1, fVar3.b, length4));
                                                    stackTraceElementArr = stackTraceElementArr4;
                                                } else {
                                                    StackTraceElement[] stackTraceElementArr6 = stackTraceElementArr4;
                                                    i2 = length3;
                                                    long j3 = fVar3.b;
                                                    stackTraceElementArr = stackTraceElementArr6;
                                                    aVar4.g = Math.min(aVar4.g, j3);
                                                    aVar4.h = Math.max(aVar4.h, j3);
                                                    aVar4.f++;
                                                }
                                                length3 = i2 - 1;
                                                map7 = map7;
                                                it11 = it11;
                                                stackTraceElementArr4 = stackTraceElementArr;
                                                sentryAndroidOptions = sentryAndroidOptions3;
                                                arrayList12 = arrayList14;
                                            }
                                        }
                                    }
                                    arrayList3 = arrayList12;
                                    sentryAndroidOptions2 = sentryAndroidOptions;
                                    HashMap map8 = map7;
                                    if (!map8.isEmpty()) {
                                        aVar2 = (io.sentry.android.core.anr.a) Collections.max(map8.values(), new d2(1));
                                    }
                                    if (aVar2 == null) {
                                        i5Var2 = i5Var;
                                    } else {
                                        aVar3 = new io.sentry.protocol.profiling.a();
                                        arrayList4 = new ArrayList();
                                        map4 = new HashMap();
                                        arrayList5 = new ArrayList();
                                        map5 = new HashMap();
                                        it2 = arrayList3.iterator();
                                        while (true) {
                                            it3 = it2;
                                            if (it2.hasNext()) {
                                                break;
                                            }
                                            io.sentry.android.core.anr.f fVar4 = (io.sentry.android.core.anr.f) it3.next();
                                            stackTraceElementArr3 = fVar4.a;
                                            io.sentry.android.core.anr.a aVar5 = aVar2;
                                            arrayList6 = new ArrayList();
                                            String str18 = str16;
                                            length2 = stackTraceElementArr3.length;
                                            i3 = 0;
                                            while (i3 < length2) {
                                                stackTraceElement = stackTraceElementArr3[i3];
                                                int i6 = i3;
                                                StringBuilder sb2 = new StringBuilder();
                                                int i7 = length2;
                                                sb2.append(stackTraceElement.getClassName());
                                                sb2.append("#");
                                                k0 k0Var3 = k0Var2;
                                                sb2.append(stackTraceElement.getMethodName());
                                                sb2.append("#");
                                                sb2.append(stackTraceElement.getFileName());
                                                sb2.append("#");
                                                sb2.append(stackTraceElement.getLineNumber());
                                                string3 = sb2.toString();
                                                numValueOf2 = (Integer) map4.get(string3);
                                                if (numValueOf2 == null) {
                                                    numValueOf2 = Integer.valueOf(arrayList4.size());
                                                    a0Var = new io.sentry.protocol.a0();
                                                    a0Var.d = stackTraceElement.getFileName();
                                                    a0Var.e = stackTraceElement.getMethodName();
                                                    a0Var.f = stackTraceElement.getClassName();
                                                    if (stackTraceElement.getLineNumber() > 0) {
                                                        numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                    } else {
                                                        numValueOf3 = null;
                                                    }
                                                    a0Var.g = numValueOf3;
                                                    if (stackTraceElement.isNativeMethod()) {
                                                        a0Var.X = Boolean.TRUE;
                                                    }
                                                    arrayList4.add(a0Var);
                                                    map4.put(string3, numValueOf2);
                                                }
                                                arrayList6.add(numValueOf2);
                                                i3 = i6 + 1;
                                                length2 = i7;
                                                k0Var2 = k0Var3;
                                                str17 = str17;
                                            }
                                            k0 k0Var4 = k0Var2;
                                            String str19 = str17;
                                            sb = new StringBuilder();
                                            for (Integer num : arrayList6) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(num);
                                            }
                                            string2 = sb.toString();
                                            numValueOf = (Integer) map5.get(string2);
                                            if (numValueOf == null) {
                                                numValueOf = Integer.valueOf(arrayList5.size());
                                                arrayList5.add(new ArrayList(arrayList6));
                                                map5.put(string2, numValueOf);
                                            }
                                            io.sentry.protocol.profiling.b bVar3 = new io.sentry.protocol.profiling.b();
                                            bVar3.a = fVar4.b / 1000.0d;
                                            bVar3.b = numValueOf.intValue();
                                            bVar3.c = "0";
                                            aVar3.a.add(bVar3);
                                            it2 = it3;
                                            map4 = map4;
                                            aVar2 = aVar5;
                                            str16 = str18;
                                            k0Var2 = k0Var4;
                                            str17 = str19;
                                        }
                                        io.sentry.android.core.anr.a aVar6 = aVar2;
                                        k0 k0Var5 = k0Var2;
                                        str7 = str16;
                                        String str20 = str17;
                                        if (aVar3.a.size() == 1) {
                                            io.sentry.protocol.profiling.b bVar4 = (io.sentry.protocol.profiling.b) aVar3.a.get(0);
                                            io.sentry.protocol.profiling.b bVar5 = new io.sentry.protocol.profiling.b();
                                            bVar5.a = bVar4.a;
                                            bVar5.b = bVar4.b;
                                            bVar5.c = bVar4.c;
                                            bVar5.d = io.sentry.util.b.o(bVar4.d);
                                            bVar5.a = bVar4.a + 0.033d;
                                            aVar3.a.add(bVar5);
                                        }
                                        aVar3.c = arrayList4;
                                        aVar3.b = arrayList5;
                                        io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                                        cVar.a = "main";
                                        cVar.b = 5;
                                        aVar3.d = Collections.singletonMap("0", cVar);
                                        r3Var = new r3(new io.sentry.protocol.w(), new io.sentry.protocol.w(), null, new HashMap(0), Double.valueOf(time / 1000.0d), l0Var3.b);
                                        r3Var.Y = aVar3;
                                        str8 = (String) l0Var3.a(str20, String.class, sentryAndroidOptions2.getProguardUuid(), k0Var5);
                                        if (str8 == null) {
                                            fVar2 = null;
                                        } else {
                                            fVar2 = new io.sentry.protocol.f();
                                            DebugImage debugImage2 = new DebugImage();
                                            debugImage2.setType(str7);
                                            debugImage2.setUuid(str8);
                                            fVar2.b(Collections.singletonList(debugImage2));
                                        }
                                        r3Var.a = fVar2;
                                        if (io.sentry.protocol.w.b.equals(q4.b().k(r3Var))) {
                                            wVar = null;
                                        } else {
                                            wVar = r3Var.b;
                                        }
                                        stackTraceElementArr2 = (StackTraceElement[]) Arrays.copyOfRange(aVar6.c, aVar6.d, aVar6.e + 1);
                                        if (stackTraceElementArr2.length > 0) {
                                            StackTraceElement stackTraceElement2 = stackTraceElementArr2[0];
                                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(stackTraceElement2.getClassName() + "." + stackTraceElement2.getMethodName());
                                            applicationNotResponding2.setStackTrace(stackTraceElementArr2);
                                            io.sentry.protocol.o oVar2 = new io.sentry.protocol.o();
                                            oVar2.a = str11;
                                            arrayList = null;
                                            io.sentry.exception.a aVar7 = new io.sentry.exception.a(oVar2, applicationNotResponding2, null, false);
                                            j5 j5Var = l0Var3.d;
                                            j5Var.getClass();
                                            AtomicInteger atomicInteger = new AtomicInteger(-1);
                                            HashSet hashSet = new HashSet();
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            j5Var.a(aVar7, atomicInteger, hashSet, arrayDeque, null);
                                            i5Var2 = i5Var;
                                            i5Var2.I0 = new io.sentry.h2(new ArrayList(arrayDeque));
                                            if (wVar != null) {
                                                ?? r6 = r21;
                                                r6.l(new s3(wVar), "profile");
                                                r5 = r6;
                                                r111 = r112;
                                            } else {
                                                r5 = r21;
                                                r111 = r112;
                                            }
                                        } else {
                                            i5Var2 = i5Var;
                                        }
                                    }
                                }
                                aVar2 = null;
                                if (aVar2 == null) {
                                    i5Var2 = i5Var;
                                } else {
                                    aVar3 = new io.sentry.protocol.profiling.a();
                                    arrayList4 = new ArrayList();
                                    map4 = new HashMap();
                                    arrayList5 = new ArrayList();
                                    map5 = new HashMap();
                                    it2 = arrayList3.iterator();
                                    while (true) {
                                        it3 = it2;
                                        if (it2.hasNext()) {
                                            break;
                                            break;
                                        }
                                        io.sentry.android.core.anr.f fVar5 = (io.sentry.android.core.anr.f) it3.next();
                                        stackTraceElementArr3 = fVar5.a;
                                        io.sentry.android.core.anr.a aVar8 = aVar2;
                                        arrayList6 = new ArrayList();
                                        String str110 = str16;
                                        length2 = stackTraceElementArr3.length;
                                        i3 = 0;
                                        while (i3 < length2) {
                                            stackTraceElement = stackTraceElementArr3[i3];
                                            int i8 = i3;
                                            StringBuilder sb3 = new StringBuilder();
                                            int i9 = length2;
                                            sb3.append(stackTraceElement.getClassName());
                                            sb3.append("#");
                                            k0 k0Var6 = k0Var2;
                                            sb3.append(stackTraceElement.getMethodName());
                                            sb3.append("#");
                                            sb3.append(stackTraceElement.getFileName());
                                            sb3.append("#");
                                            sb3.append(stackTraceElement.getLineNumber());
                                            string3 = sb3.toString();
                                            numValueOf2 = (Integer) map4.get(string3);
                                            if (numValueOf2 == null) {
                                                numValueOf2 = Integer.valueOf(arrayList4.size());
                                                a0Var = new io.sentry.protocol.a0();
                                                a0Var.d = stackTraceElement.getFileName();
                                                a0Var.e = stackTraceElement.getMethodName();
                                                a0Var.f = stackTraceElement.getClassName();
                                                if (stackTraceElement.getLineNumber() > 0) {
                                                    numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                a0Var.g = numValueOf3;
                                                if (stackTraceElement.isNativeMethod()) {
                                                    a0Var.X = Boolean.TRUE;
                                                }
                                                arrayList4.add(a0Var);
                                                map4.put(string3, numValueOf2);
                                            }
                                            arrayList6.add(numValueOf2);
                                            i3 = i8 + 1;
                                            length2 = i9;
                                            k0Var2 = k0Var6;
                                            str17 = str17;
                                        }
                                        k0 k0Var7 = k0Var2;
                                        String str111 = str17;
                                        sb = new StringBuilder();
                                        while (r4.hasNext()) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(num);
                                        }
                                        string2 = sb.toString();
                                        numValueOf = (Integer) map5.get(string2);
                                        if (numValueOf == null) {
                                            numValueOf = Integer.valueOf(arrayList5.size());
                                            arrayList5.add(new ArrayList(arrayList6));
                                            map5.put(string2, numValueOf);
                                        }
                                        io.sentry.protocol.profiling.b bVar6 = new io.sentry.protocol.profiling.b();
                                        bVar6.a = fVar5.b / 1000.0d;
                                        bVar6.b = numValueOf.intValue();
                                        bVar6.c = "0";
                                        aVar3.a.add(bVar6);
                                        it2 = it3;
                                        map4 = map4;
                                        aVar2 = aVar8;
                                        str16 = str110;
                                        k0Var2 = k0Var7;
                                        str17 = str111;
                                    }
                                    io.sentry.android.core.anr.a aVar9 = aVar2;
                                    k0 k0Var8 = k0Var2;
                                    str7 = str16;
                                    String str21 = str17;
                                    if (aVar3.a.size() == 1) {
                                        io.sentry.protocol.profiling.b bVar7 = (io.sentry.protocol.profiling.b) aVar3.a.get(0);
                                        io.sentry.protocol.profiling.b bVar8 = new io.sentry.protocol.profiling.b();
                                        bVar8.a = bVar7.a;
                                        bVar8.b = bVar7.b;
                                        bVar8.c = bVar7.c;
                                        bVar8.d = io.sentry.util.b.o(bVar7.d);
                                        bVar8.a = bVar7.a + 0.033d;
                                        aVar3.a.add(bVar8);
                                    }
                                    aVar3.c = arrayList4;
                                    aVar3.b = arrayList5;
                                    io.sentry.protocol.profiling.c cVar2 = new io.sentry.protocol.profiling.c();
                                    cVar2.a = "main";
                                    cVar2.b = 5;
                                    aVar3.d = Collections.singletonMap("0", cVar2);
                                    r3Var = new r3(new io.sentry.protocol.w(), new io.sentry.protocol.w(), null, new HashMap(0), Double.valueOf(time / 1000.0d), l0Var3.b);
                                    r3Var.Y = aVar3;
                                    str8 = (String) l0Var3.a(str21, String.class, sentryAndroidOptions2.getProguardUuid(), k0Var8);
                                    if (str8 == null) {
                                        fVar2 = null;
                                    } else {
                                        fVar2 = new io.sentry.protocol.f();
                                        DebugImage debugImage3 = new DebugImage();
                                        debugImage3.setType(str7);
                                        debugImage3.setUuid(str8);
                                        fVar2.b(Collections.singletonList(debugImage3));
                                    }
                                    r3Var.a = fVar2;
                                    if (io.sentry.protocol.w.b.equals(q4.b().k(r3Var))) {
                                        wVar = null;
                                    } else {
                                        wVar = r3Var.b;
                                    }
                                    stackTraceElementArr2 = (StackTraceElement[]) Arrays.copyOfRange(aVar9.c, aVar9.d, aVar9.e + 1);
                                    if (stackTraceElementArr2.length > 0) {
                                        StackTraceElement stackTraceElement3 = stackTraceElementArr2[0];
                                        ApplicationNotResponding applicationNotResponding3 = new ApplicationNotResponding(stackTraceElement3.getClassName() + "." + stackTraceElement3.getMethodName());
                                        applicationNotResponding3.setStackTrace(stackTraceElementArr2);
                                        io.sentry.protocol.o oVar3 = new io.sentry.protocol.o();
                                        oVar3.a = str11;
                                        arrayList = null;
                                        io.sentry.exception.a aVar10 = new io.sentry.exception.a(oVar3, applicationNotResponding3, null, false);
                                        j5 j5Var2 = l0Var3.d;
                                        j5Var2.getClass();
                                        AtomicInteger atomicInteger2 = new AtomicInteger(-1);
                                        HashSet hashSet2 = new HashSet();
                                        ArrayDeque arrayDeque2 = new ArrayDeque();
                                        j5Var2.a(aVar10, atomicInteger2, hashSet2, arrayDeque2, null);
                                        i5Var2 = i5Var;
                                        i5Var2.I0 = new io.sentry.h2(new ArrayList(arrayDeque2));
                                        if (wVar != null) {
                                            ?? r7 = r21;
                                            r7.l(new s3(wVar), "profile");
                                            r5 = r7;
                                            r111 = r112;
                                        } else {
                                            r5 = r21;
                                            r111 = r112;
                                        }
                                    } else {
                                        i5Var2 = i5Var;
                                    }
                                }
                            }
                        }
                        r4 = r21;
                        r110 = r112;
                        arrayList = null;
                        r5 = r4;
                        r111 = r110;
                    } else {
                        i5Var2 = i5Var;
                        sentryAndroidOptions2 = sentryAndroidOptions;
                        r4 = eVar2;
                        r110 = zEquals;
                        arrayList = null;
                        r5 = r4;
                        r111 = r110;
                    }
                }
                if (i5Var2.L0 == null) {
                    if (sentryAndroidOptions2.isEnableAnrFingerprinting() || (arrayListD = i5Var2.d()) == null || arrayListD.isEmpty()) {
                        listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                        if (listAsList != null) {
                            arrayList2 = new ArrayList(listAsList);
                        } else {
                            arrayList2 = arrayList;
                        }
                        i5Var2.L0 = arrayList2;
                    } else {
                        Iterator it13 = arrayListD.iterator();
                        while (true) {
                            if (it13.hasNext()) {
                                io.sentry.protocol.c0 c0Var2 = ((io.sentry.protocol.v) it13.next()).e;
                                if (c0Var2 != null && (list5 = c0Var2.a) != null && !list5.isEmpty()) {
                                    Iterator it14 = list5.iterator();
                                    while (true) {
                                        if (it14.hasNext()) {
                                            io.sentry.protocol.a0 a0Var2 = (io.sentry.protocol.a0) it14.next();
                                            Boolean bool = a0Var2.y;
                                            if (bool == null || !bool.booleanValue()) {
                                                String str22 = a0Var2.f;
                                                if (str22 != null) {
                                                    Iterator it15 = io.sentry.android.core.anr.c.a.iterator();
                                                    while (true) {
                                                        if (it15.hasNext()) {
                                                            if (str22.startsWith((String) it15.next())) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                                            if (listAsList != null) {
                                                arrayList2 = new ArrayList(listAsList);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            i5Var2.L0 = arrayList2;
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                List listAsList2 = Arrays.asList("system-frames-only-anr", r111 != 0 ? "background-anr" : "foreground-anr");
                                i5Var2.L0 = listAsList2 != null ? new ArrayList(listAsList2) : arrayList;
                            }
                        }
                    }
                }
                r0 = r111 ^ 1;
                aVarE2 = r5.e();
                if (aVarE2 == null) {
                    aVarE2 = new io.sentry.protocol.a();
                    r5.n(aVarE2);
                }
                if (aVarE2.y == null) {
                    return i5Var2;
                }
                aVarE2.y = Boolean.valueOf((boolean) r0);
                return i5Var2;
            }
            lValueOf2 = null;
            r19 = bVar;
            r20 = z2;
            packageInfoE = p0.e(context, o0Var);
            if (packageInfoE == null) {
                j2 = 0;
                j = 0;
            } else {
                j = 0;
                j2 = packageInfoE.lastUpdateTime;
            }
            if (l == null) {
                if (lValueOf2 == null) {
                    k0Var = k0.PERSISTED;
                } else if (l != null) {
                    k0Var = k0.NONE;
                } else {
                    k0Var = k0.NONE;
                }
            } else if (lValueOf2 == null) {
                k0Var = k0.PERSISTED;
            } else if (l != null) {
                k0Var = k0.NONE;
            } else {
                k0Var = k0.NONE;
            }
            k0Var2 = k0Var;
            if (!r19.a()) {
                if (i5Var.f == null) {
                    i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
                }
                if (i5Var.g == null) {
                    i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
                }
                f(i5Var, k0Var2);
                e(i5Var);
                sentryAndroidOptions4.getLogger().i(q5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
                return i5Var;
            }
            if (i5Var.d == null) {
                i5Var.d = (io.sentry.protocol.r) d(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
            }
            if (i5Var.w == null) {
                i5Var.w = (io.sentry.protocol.i0) d(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
            }
            map = (Map) d(sentryAndroidOptions4, "tags.json", Map.class);
            if (map == null) {
                j0Var2 = j0Var;
            } else {
                j0Var2 = j0Var;
                if (i5Var.e == null) {
                    i5Var.c(new HashMap(map));
                } else {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                        Iterator it16 = it;
                        if (!i5Var.e.containsKey(entry.getKey())) {
                            i5Var.b((String) entry.getKey(), (String) entry.getValue());
                        }
                        it = it16;
                    }
                }
            }
            list = (List) d(sentryAndroidOptions4, "breadcrumbs.json", List.class);
            if (list == null) {
                str2 = "anr_background";
            } else {
                str2 = "anr_background";
                list2 = i5Var.X;
                if (list2 == null) {
                    i5Var.X = new ArrayList(list);
                } else {
                    list2.addAll(list);
                }
            }
            map2 = (Map) d(sentryAndroidOptions4, "extras.json", Map.class);
            if (map2 != null) {
                if (i5Var.Z == null) {
                    i5Var.Z = new HashMap(new HashMap(map2));
                } else {
                    it5 = map2.entrySet().iterator();
                    while (it5.hasNext()) {
                        entry3 = (Map.Entry) it5.next();
                        Iterator it17 = it5;
                        if (!i5Var.Z.containsKey(entry3.getKey())) {
                            i5Var.Z.put((String) entry3.getKey(), entry3.getValue());
                        }
                        it5 = it17;
                        str14 = str14;
                    }
                }
            }
            String str112 = str14;
            eVar = (io.sentry.protocol.e) d(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
            if (eVar != null) {
                it4 = new io.sentry.protocol.e(eVar).a.entrySet().iterator();
                while (it4.hasNext()) {
                    entry2 = (Map.Entry) it4.next();
                    value = entry2.getValue();
                    Iterator it18 = it4;
                    if ("trace".equals(entry2.getKey())) {
                        eVar2.l(value, (String) entry2.getKey());
                    } else {
                        eVar2.l(value, (String) entry2.getKey());
                    }
                    it4 = it18;
                }
            }
            str3 = (String) d(sentryAndroidOptions4, "transaction.json", String.class);
            if (i5Var.K0 == null) {
                i5Var.K0 = str3;
            }
            list3 = (List) d(sentryAndroidOptions4, "fingerprint.json", List.class);
            if (i5Var.L0 == null) {
                if (list3 != null) {
                    arrayList7 = new ArrayList(list3);
                } else {
                    arrayList7 = null;
                }
                i5Var.L0 = arrayList7;
            }
            q5Var = (q5) d(sentryAndroidOptions4, "level.json", q5.class);
            if (i5Var.J0 == null) {
                i5Var.J0 = q5Var;
            }
            e7Var = (e7) d(sentryAndroidOptions4, "trace.json", e7.class);
            if (eVar2.j() == null) {
                eVar2.w(e7Var);
            }
            str4 = (String) d(sentryAndroidOptions4, "replay.json", String.class);
            cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
            if (cacheDirPath == null) {
                cls = Map.class;
                str5 = "tags.json";
            } else {
                cls = Map.class;
                str5 = "tags.json";
                if (new File(cacheDirPath, ub3.i("replay_", str4)).exists()) {
                    d = sentryAndroidOptions4.getSessionReplay().e;
                    if (d == null) {
                        string = null;
                    } else {
                        string = d.toString();
                    }
                    str6 = (String) c("replay-error-sample-rate.json", String.class, string, k0Var2);
                    if (str6 != null) {
                        if (Double.parseDouble(str6) < io.sentry.util.n.a().c()) {
                            sentryAndroidOptions4.getLogger().i(q5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", i5Var.a);
                        } else {
                            fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                length = fileArrListFiles.length;
                                long jLastModified2 = Long.MIN_VALUE;
                                String strSubstring2 = null;
                                i = 0;
                                while (i < length) {
                                    file = fileArrListFiles[i];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (!file.getName().startsWith("replay_")) {
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i++;
                                    fileArrListFiles = fileArr;
                                }
                                str4 = strSubstring2;
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                Charset charset3 = io.sentry.cache.g.f;
                                io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                                eVar2.l(str4, "replay_id");
                            }
                        }
                    }
                } else if (str4 != null) {
                    Charset charset4 = io.sentry.cache.g.f;
                    io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                    eVar2.l(str4, "replay_id");
                }
            }
            if (i5Var.f == null) {
                i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
            }
            if (i5Var.g == null) {
                i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
            }
            f(i5Var, k0Var2);
            fVar = i5Var.Y;
            if (fVar == null) {
                fVar = new io.sentry.protocol.f();
            }
            if (fVar.b == null) {
                fVar.b(new ArrayList());
            }
            list4 = fVar.b;
            String str113 = DebugImage.PROGUARD;
            String str114 = "proguard-uuid.json";
            if (list4 != null) {
                str10 = (String) a("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), k0Var2);
                if (str10 != null) {
                    DebugImage debugImage4 = new DebugImage();
                    debugImage4.setType(DebugImage.PROGUARD);
                    debugImage4.setUuid(str10);
                    list4.add(debugImage4);
                }
                i5Var.Y = fVar;
            }
            if (i5Var.c == null) {
                i5Var.c = (io.sentry.protocol.u) a("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), k0Var2);
            }
            aVarE = eVar2.e();
            if (aVarE == null) {
                aVarE = new io.sentry.protocol.a();
            }
            aVar = aVarE;
            aVar.e = (String) p0.c.a(context);
            packageInfoE2 = p0.e(context, o0Var);
            if (packageInfoE2 != null) {
                aVar.a = packageInfoE2.packageName;
            }
            pk1Var = u0.c(context, sentryAndroidOptions4).f;
            if (pk1Var != null) {
                aVar.z = Boolean.valueOf(pk1Var.b);
                strArr = (String[]) pk1Var.c;
                if (strArr != null) {
                    aVar.X = Arrays.asList(strArr);
                }
            }
            eVar2.n(aVar);
            e(i5Var);
            map3 = (Map) c(str5, cls, sentryAndroidOptions4.getTags(), k0Var2);
            if (map3 != null) {
                if (i5Var.e == null) {
                    i5Var.c(new HashMap(map3));
                } else {
                    while (r0.hasNext()) {
                        if (!i5Var.e.containsKey(entry4.getKey())) {
                            i5Var.b((String) entry4.getKey(), (String) entry4.getValue());
                        }
                    }
                }
            }
            i0Var = i5Var.w;
            if (i0Var == null) {
                i0Var = new io.sentry.protocol.i0();
                i5Var.w = i0Var;
            }
            i0Var2 = i0Var;
            if (i0Var2.b == null) {
                strA = z0.a(context);
                i0Var2.b = strA;
            }
            if (i0Var2.d == null) {
                i0Var2.d = "{{auto}}";
            }
            c6cVar = u0.c(context, sentryAndroidOptions4).e;
            if (c6cVar != null) {
                map6 = new HashMap();
                map6.put("isSideLoaded", String.valueOf(c6cVar.a));
                str9 = c6cVar.b;
                if (str9 != null) {
                    map6.put("installerStore", str9);
                }
                while (r0.hasNext()) {
                    i5Var.b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
            if (j0Var2 != null) {
                return i5Var;
            }
            if (r20 != 0) {
                zEquals = str2.equals(((io.sentry.hints.a) r19).e());
            } else {
                zEquals = false;
            }
            l0 l0Var4 = j0Var2.a;
            sentryAndroidOptions = l0Var4.b;
            if (sentryAndroidOptions.isAnrProfilingEnabled()) {
                i5Var2 = i5Var;
                sentryAndroidOptions2 = sentryAndroidOptions;
                r4 = eVar2;
                r110 = zEquals;
                arrayList = null;
                r5 = r4;
                r111 = r110;
            } else {
                i5Var2 = i5Var;
                sentryAndroidOptions2 = sentryAndroidOptions;
                r4 = eVar2;
                r110 = zEquals;
                arrayList = null;
                r5 = r4;
                r111 = r110;
            }
            if (i5Var2.L0 == null) {
                if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                    listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                    if (listAsList != null) {
                        arrayList2 = new ArrayList(listAsList);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i5Var2.L0 = arrayList2;
                } else {
                    listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                    if (listAsList != null) {
                        arrayList2 = new ArrayList(listAsList);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i5Var2.L0 = arrayList2;
                }
            }
            r0 = r111 ^ 1;
            aVarE2 = r5.e();
            if (aVarE2 == null) {
                aVarE2 = new io.sentry.protocol.a();
                r5.n(aVarE2);
            }
            if (aVarE2.y == null) {
                return i5Var2;
            }
            aVarE2.y = Boolean.valueOf((boolean) r0);
            return i5Var2;
        }
        lValueOf = ((io.sentry.hints.a) bVar).b();
        l = lValueOf;
        str = (String) io.sentry.cache.a.c(sentryAndroidOptions4, ".options-cache", "app-last-update-time.json", String.class);
        if (str == null) {
            lValueOf2 = Long.valueOf(str);
            r19 = bVar;
            r20 = z2 ? 1 : 0;
            str11 = "ANR";
            l = l;
            packageInfoE = p0.e(context, o0Var);
            if (packageInfoE == null) {
                j2 = 0;
                j = 0;
            } else {
                j = 0;
                j2 = packageInfoE.lastUpdateTime;
            }
            if (l == null) {
                if (lValueOf2 == null) {
                    k0Var = k0.PERSISTED;
                } else if (l != null) {
                    k0Var = k0.NONE;
                } else {
                    k0Var = k0.NONE;
                }
            } else if (lValueOf2 == null) {
                k0Var = k0.PERSISTED;
            } else if (l != null) {
                k0Var = k0.NONE;
            } else {
                k0Var = k0.NONE;
            }
            k0Var2 = k0Var;
            if (!r19.a()) {
                if (i5Var.f == null) {
                    i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
                }
                if (i5Var.g == null) {
                    i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
                }
                f(i5Var, k0Var2);
                e(i5Var);
                sentryAndroidOptions4.getLogger().i(q5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
                return i5Var;
            }
            if (i5Var.d == null) {
                i5Var.d = (io.sentry.protocol.r) d(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
            }
            if (i5Var.w == null) {
                i5Var.w = (io.sentry.protocol.i0) d(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
            }
            map = (Map) d(sentryAndroidOptions4, "tags.json", Map.class);
            if (map == null) {
                j0Var2 = j0Var;
            } else {
                j0Var2 = j0Var;
                if (i5Var.e == null) {
                    i5Var.c(new HashMap(map));
                } else {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                        Iterator it19 = it;
                        if (!i5Var.e.containsKey(entry.getKey())) {
                            i5Var.b((String) entry.getKey(), (String) entry.getValue());
                        }
                        it = it19;
                    }
                }
            }
            list = (List) d(sentryAndroidOptions4, "breadcrumbs.json", List.class);
            if (list == null) {
                str2 = "anr_background";
            } else {
                str2 = "anr_background";
                list2 = i5Var.X;
                if (list2 == null) {
                    i5Var.X = new ArrayList(list);
                } else {
                    list2.addAll(list);
                }
            }
            map2 = (Map) d(sentryAndroidOptions4, "extras.json", Map.class);
            if (map2 != null) {
                if (i5Var.Z == null) {
                    i5Var.Z = new HashMap(new HashMap(map2));
                } else {
                    it5 = map2.entrySet().iterator();
                    while (it5.hasNext()) {
                        entry3 = (Map.Entry) it5.next();
                        Iterator it110 = it5;
                        if (!i5Var.Z.containsKey(entry3.getKey())) {
                            i5Var.Z.put((String) entry3.getKey(), entry3.getValue());
                        }
                        it5 = it110;
                        str14 = str14;
                    }
                }
            }
            String str115 = str14;
            eVar = (io.sentry.protocol.e) d(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
            if (eVar != null) {
                it4 = new io.sentry.protocol.e(eVar).a.entrySet().iterator();
                while (it4.hasNext()) {
                    entry2 = (Map.Entry) it4.next();
                    value = entry2.getValue();
                    Iterator it111 = it4;
                    if ("trace".equals(entry2.getKey())) {
                        eVar2.l(value, (String) entry2.getKey());
                    } else {
                        eVar2.l(value, (String) entry2.getKey());
                    }
                    it4 = it111;
                }
            }
            str3 = (String) d(sentryAndroidOptions4, "transaction.json", String.class);
            if (i5Var.K0 == null) {
                i5Var.K0 = str3;
            }
            list3 = (List) d(sentryAndroidOptions4, "fingerprint.json", List.class);
            if (i5Var.L0 == null) {
                if (list3 != null) {
                    arrayList7 = new ArrayList(list3);
                } else {
                    arrayList7 = null;
                }
                i5Var.L0 = arrayList7;
            }
            q5Var = (q5) d(sentryAndroidOptions4, "level.json", q5.class);
            if (i5Var.J0 == null) {
                i5Var.J0 = q5Var;
            }
            e7Var = (e7) d(sentryAndroidOptions4, "trace.json", e7.class);
            if (eVar2.j() == null) {
                eVar2.w(e7Var);
            }
            str4 = (String) d(sentryAndroidOptions4, "replay.json", String.class);
            cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
            if (cacheDirPath == null) {
                cls = Map.class;
                str5 = "tags.json";
            } else {
                cls = Map.class;
                str5 = "tags.json";
                if (new File(cacheDirPath, ub3.i("replay_", str4)).exists()) {
                    d = sentryAndroidOptions4.getSessionReplay().e;
                    if (d == null) {
                        string = null;
                    } else {
                        string = d.toString();
                    }
                    str6 = (String) c("replay-error-sample-rate.json", String.class, string, k0Var2);
                    if (str6 != null) {
                        if (Double.parseDouble(str6) < io.sentry.util.n.a().c()) {
                            sentryAndroidOptions4.getLogger().i(q5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", i5Var.a);
                        } else {
                            fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                length = fileArrListFiles.length;
                                long jLastModified3 = Long.MIN_VALUE;
                                String strSubstring3 = null;
                                i = 0;
                                while (i < length) {
                                    file = fileArrListFiles[i];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (!file.getName().startsWith("replay_")) {
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i++;
                                    fileArrListFiles = fileArr;
                                }
                                str4 = strSubstring3;
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                Charset charset5 = io.sentry.cache.g.f;
                                io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                                eVar2.l(str4, "replay_id");
                            }
                        }
                    }
                } else if (str4 != null) {
                    Charset charset6 = io.sentry.cache.g.f;
                    io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                    eVar2.l(str4, "replay_id");
                }
            }
            if (i5Var.f == null) {
                i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
            }
            if (i5Var.g == null) {
                i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
            }
            f(i5Var, k0Var2);
            fVar = i5Var.Y;
            if (fVar == null) {
                fVar = new io.sentry.protocol.f();
            }
            if (fVar.b == null) {
                fVar.b(new ArrayList());
            }
            list4 = fVar.b;
            String str116 = DebugImage.PROGUARD;
            String str117 = "proguard-uuid.json";
            if (list4 != null) {
                str10 = (String) a("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), k0Var2);
                if (str10 != null) {
                    DebugImage debugImage5 = new DebugImage();
                    debugImage5.setType(DebugImage.PROGUARD);
                    debugImage5.setUuid(str10);
                    list4.add(debugImage5);
                }
                i5Var.Y = fVar;
            }
            if (i5Var.c == null) {
                i5Var.c = (io.sentry.protocol.u) a("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), k0Var2);
            }
            aVarE = eVar2.e();
            if (aVarE == null) {
                aVarE = new io.sentry.protocol.a();
            }
            aVar = aVarE;
            aVar.e = (String) p0.c.a(context);
            packageInfoE2 = p0.e(context, o0Var);
            if (packageInfoE2 != null) {
                aVar.a = packageInfoE2.packageName;
            }
            pk1Var = u0.c(context, sentryAndroidOptions4).f;
            if (pk1Var != null) {
                aVar.z = Boolean.valueOf(pk1Var.b);
                strArr = (String[]) pk1Var.c;
                if (strArr != null) {
                    aVar.X = Arrays.asList(strArr);
                }
            }
            eVar2.n(aVar);
            e(i5Var);
            map3 = (Map) c(str5, cls, sentryAndroidOptions4.getTags(), k0Var2);
            if (map3 != null) {
                if (i5Var.e == null) {
                    i5Var.c(new HashMap(map3));
                } else {
                    while (r0.hasNext()) {
                        if (!i5Var.e.containsKey(entry4.getKey())) {
                            i5Var.b((String) entry4.getKey(), (String) entry4.getValue());
                        }
                    }
                }
            }
            i0Var = i5Var.w;
            if (i0Var == null) {
                i0Var = new io.sentry.protocol.i0();
                i5Var.w = i0Var;
            }
            i0Var2 = i0Var;
            if (i0Var2.b == null) {
                strA = z0.a(context);
                i0Var2.b = strA;
            }
            if (i0Var2.d == null) {
                i0Var2.d = "{{auto}}";
            }
            c6cVar = u0.c(context, sentryAndroidOptions4).e;
            if (c6cVar != null) {
                map6 = new HashMap();
                map6.put("isSideLoaded", String.valueOf(c6cVar.a));
                str9 = c6cVar.b;
                if (str9 != null) {
                    map6.put("installerStore", str9);
                }
                while (r0.hasNext()) {
                    i5Var.b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
            if (j0Var2 != null) {
                return i5Var;
            }
            if (r20 != 0) {
                zEquals = str2.equals(((io.sentry.hints.a) r19).e());
            } else {
                zEquals = false;
            }
            l0 l0Var5 = j0Var2.a;
            sentryAndroidOptions = l0Var5.b;
            if (sentryAndroidOptions.isAnrProfilingEnabled()) {
                i5Var2 = i5Var;
                sentryAndroidOptions2 = sentryAndroidOptions;
                r4 = eVar2;
                r110 = zEquals;
                arrayList = null;
                r5 = r4;
                r111 = r110;
            } else {
                i5Var2 = i5Var;
                sentryAndroidOptions2 = sentryAndroidOptions;
                r4 = eVar2;
                r110 = zEquals;
                arrayList = null;
                r5 = r4;
                r111 = r110;
            }
            if (i5Var2.L0 == null) {
                if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                    listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                    if (listAsList != null) {
                        arrayList2 = new ArrayList(listAsList);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i5Var2.L0 = arrayList2;
                } else {
                    listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                    if (listAsList != null) {
                        arrayList2 = new ArrayList(listAsList);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i5Var2.L0 = arrayList2;
                }
            }
            r0 = r111 ^ 1;
            aVarE2 = r5.e();
            if (aVarE2 == null) {
                aVarE2 = new io.sentry.protocol.a();
                r5.n(aVarE2);
            }
            if (aVarE2.y == null) {
                return i5Var2;
            }
            aVarE2.y = Boolean.valueOf((boolean) r0);
            return i5Var2;
        }
        lValueOf2 = null;
        r19 = bVar;
        r20 = z2;
        packageInfoE = p0.e(context, o0Var);
        if (packageInfoE == null) {
            j2 = 0;
            j = 0;
        } else {
            j = 0;
            j2 = packageInfoE.lastUpdateTime;
        }
        if (l == null) {
            if (lValueOf2 == null) {
                k0Var = k0.PERSISTED;
            } else if (l != null) {
                k0Var = k0.NONE;
            } else {
                k0Var = k0.NONE;
            }
        } else if (lValueOf2 == null) {
            k0Var = k0.PERSISTED;
        } else if (l != null) {
            k0Var = k0.NONE;
        } else {
            k0Var = k0.NONE;
        }
        k0Var2 = k0Var;
        if (!r19.a()) {
            if (i5Var.f == null) {
                i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
            }
            if (i5Var.g == null) {
                i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
            }
            f(i5Var, k0Var2);
            e(i5Var);
            sentryAndroidOptions4.getLogger().i(q5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return i5Var;
        }
        if (i5Var.d == null) {
            i5Var.d = (io.sentry.protocol.r) d(sentryAndroidOptions4, "request.json", io.sentry.protocol.r.class);
        }
        if (i5Var.w == null) {
            i5Var.w = (io.sentry.protocol.i0) d(sentryAndroidOptions4, "user.json", io.sentry.protocol.i0.class);
        }
        map = (Map) d(sentryAndroidOptions4, "tags.json", Map.class);
        if (map == null) {
            j0Var2 = j0Var;
        } else {
            j0Var2 = j0Var;
            if (i5Var.e == null) {
                i5Var.c(new HashMap(map));
            } else {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    entry = (Map.Entry) it.next();
                    Iterator it112 = it;
                    if (!i5Var.e.containsKey(entry.getKey())) {
                        i5Var.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    it = it112;
                }
            }
        }
        list = (List) d(sentryAndroidOptions4, "breadcrumbs.json", List.class);
        if (list == null) {
            str2 = "anr_background";
        } else {
            str2 = "anr_background";
            list2 = i5Var.X;
            if (list2 == null) {
                i5Var.X = new ArrayList(list);
            } else {
                list2.addAll(list);
            }
        }
        map2 = (Map) d(sentryAndroidOptions4, "extras.json", Map.class);
        if (map2 != null) {
            if (i5Var.Z == null) {
                i5Var.Z = new HashMap(new HashMap(map2));
            } else {
                it5 = map2.entrySet().iterator();
                while (it5.hasNext()) {
                    entry3 = (Map.Entry) it5.next();
                    Iterator it113 = it5;
                    if (!i5Var.Z.containsKey(entry3.getKey())) {
                        i5Var.Z.put((String) entry3.getKey(), entry3.getValue());
                    }
                    it5 = it113;
                    str14 = str14;
                }
            }
        }
        String str118 = str14;
        eVar = (io.sentry.protocol.e) d(sentryAndroidOptions4, "contexts.json", io.sentry.protocol.e.class);
        if (eVar != null) {
            it4 = new io.sentry.protocol.e(eVar).a.entrySet().iterator();
            while (it4.hasNext()) {
                entry2 = (Map.Entry) it4.next();
                value = entry2.getValue();
                Iterator it114 = it4;
                if ("trace".equals(entry2.getKey())) {
                    eVar2.l(value, (String) entry2.getKey());
                } else {
                    eVar2.l(value, (String) entry2.getKey());
                }
                it4 = it114;
            }
        }
        str3 = (String) d(sentryAndroidOptions4, "transaction.json", String.class);
        if (i5Var.K0 == null) {
            i5Var.K0 = str3;
        }
        list3 = (List) d(sentryAndroidOptions4, "fingerprint.json", List.class);
        if (i5Var.L0 == null) {
            if (list3 != null) {
                arrayList7 = new ArrayList(list3);
            } else {
                arrayList7 = null;
            }
            i5Var.L0 = arrayList7;
        }
        q5Var = (q5) d(sentryAndroidOptions4, "level.json", q5.class);
        if (i5Var.J0 == null) {
            i5Var.J0 = q5Var;
        }
        e7Var = (e7) d(sentryAndroidOptions4, "trace.json", e7.class);
        if (eVar2.j() == null) {
            eVar2.w(e7Var);
        }
        str4 = (String) d(sentryAndroidOptions4, "replay.json", String.class);
        cacheDirPath = sentryAndroidOptions4.getCacheDirPath();
        if (cacheDirPath == null) {
            cls = Map.class;
            str5 = "tags.json";
        } else {
            cls = Map.class;
            str5 = "tags.json";
            if (new File(cacheDirPath, ub3.i("replay_", str4)).exists()) {
                d = sentryAndroidOptions4.getSessionReplay().e;
                if (d == null) {
                    string = null;
                } else {
                    string = d.toString();
                }
                str6 = (String) c("replay-error-sample-rate.json", String.class, string, k0Var2);
                if (str6 != null) {
                    if (Double.parseDouble(str6) < io.sentry.util.n.a().c()) {
                        sentryAndroidOptions4.getLogger().i(q5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", i5Var.a);
                    } else {
                        fileArrListFiles = new File(cacheDirPath).listFiles();
                        if (fileArrListFiles != null) {
                            length = fileArrListFiles.length;
                            long jLastModified4 = Long.MIN_VALUE;
                            String strSubstring4 = null;
                            i = 0;
                            while (i < length) {
                                file = fileArrListFiles[i];
                                if (file.isDirectory()) {
                                    fileArr = fileArrListFiles;
                                    if (!file.getName().startsWith("replay_")) {
                                    }
                                } else {
                                    fileArr = fileArrListFiles;
                                }
                                i++;
                                fileArrListFiles = fileArr;
                            }
                            str4 = strSubstring4;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            Charset charset7 = io.sentry.cache.g.f;
                            io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                            eVar2.l(str4, "replay_id");
                        }
                    }
                }
            } else if (str4 != null) {
                Charset charset8 = io.sentry.cache.g.f;
                io.sentry.cache.a.d(sentryAndroidOptions4, str4, ".scope-cache", "replay.json");
                eVar2.l(str4, "replay_id");
            }
        }
        if (i5Var.f == null) {
            i5Var.f = (String) c("release.json", String.class, sentryAndroidOptions4.getRelease(), k0Var2);
        }
        if (i5Var.g == null) {
            i5Var.g = (String) c("environment.json", String.class, sentryAndroidOptions4.getEnvironment(), k0Var2);
        }
        f(i5Var, k0Var2);
        fVar = i5Var.Y;
        if (fVar == null) {
            fVar = new io.sentry.protocol.f();
        }
        if (fVar.b == null) {
            fVar.b(new ArrayList());
        }
        list4 = fVar.b;
        String str119 = DebugImage.PROGUARD;
        String str1110 = "proguard-uuid.json";
        if (list4 != null) {
            str10 = (String) a("proguard-uuid.json", String.class, sentryAndroidOptions4.getProguardUuid(), k0Var2);
            if (str10 != null) {
                DebugImage debugImage6 = new DebugImage();
                debugImage6.setType(DebugImage.PROGUARD);
                debugImage6.setUuid(str10);
                list4.add(debugImage6);
            }
            i5Var.Y = fVar;
        }
        if (i5Var.c == null) {
            i5Var.c = (io.sentry.protocol.u) a("sdk-version.json", io.sentry.protocol.u.class, sentryAndroidOptions4.getSdkVersion(), k0Var2);
        }
        aVarE = eVar2.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
        }
        aVar = aVarE;
        aVar.e = (String) p0.c.a(context);
        packageInfoE2 = p0.e(context, o0Var);
        if (packageInfoE2 != null) {
            aVar.a = packageInfoE2.packageName;
        }
        pk1Var = u0.c(context, sentryAndroidOptions4).f;
        if (pk1Var != null) {
            aVar.z = Boolean.valueOf(pk1Var.b);
            strArr = (String[]) pk1Var.c;
            if (strArr != null) {
                aVar.X = Arrays.asList(strArr);
            }
        }
        eVar2.n(aVar);
        e(i5Var);
        map3 = (Map) c(str5, cls, sentryAndroidOptions4.getTags(), k0Var2);
        if (map3 != null) {
            if (i5Var.e == null) {
                i5Var.c(new HashMap(map3));
            } else {
                while (r0.hasNext()) {
                    if (!i5Var.e.containsKey(entry4.getKey())) {
                        i5Var.b((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        i0Var = i5Var.w;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            i5Var.w = i0Var;
        }
        i0Var2 = i0Var;
        if (i0Var2.b == null) {
            strA = z0.a(context);
            i0Var2.b = strA;
        }
        if (i0Var2.d == null) {
            i0Var2.d = "{{auto}}";
        }
        c6cVar = u0.c(context, sentryAndroidOptions4).e;
        if (c6cVar != null) {
            map6 = new HashMap();
            map6.put("isSideLoaded", String.valueOf(c6cVar.a));
            str9 = c6cVar.b;
            if (str9 != null) {
                map6.put("installerStore", str9);
            }
            while (r0.hasNext()) {
                i5Var.b((String) entry5.getKey(), (String) entry5.getValue());
            }
        }
        if (j0Var2 != null) {
            return i5Var;
        }
        if (r20 != 0) {
            zEquals = str2.equals(((io.sentry.hints.a) r19).e());
        } else {
            zEquals = false;
        }
        l0 l0Var6 = j0Var2.a;
        sentryAndroidOptions = l0Var6.b;
        if (sentryAndroidOptions.isAnrProfilingEnabled()) {
            i5Var2 = i5Var;
            sentryAndroidOptions2 = sentryAndroidOptions;
            r4 = eVar2;
            r110 = zEquals;
            arrayList = null;
            r5 = r4;
            r111 = r110;
        } else {
            i5Var2 = i5Var;
            sentryAndroidOptions2 = sentryAndroidOptions;
            r4 = eVar2;
            r110 = zEquals;
            arrayList = null;
            r5 = r4;
            r111 = r110;
        }
        if (i5Var2.L0 == null) {
            if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                if (listAsList != null) {
                    arrayList2 = new ArrayList(listAsList);
                } else {
                    arrayList2 = arrayList;
                }
                i5Var2.L0 = arrayList2;
            } else {
                listAsList = Arrays.asList("{{ default }}", r111 != 0 ? "background-anr" : "foreground-anr");
                if (listAsList != null) {
                    arrayList2 = new ArrayList(listAsList);
                } else {
                    arrayList2 = arrayList;
                }
                i5Var2.L0 = arrayList2;
            }
        }
        r0 = r111 ^ 1;
        aVarE2 = r5.e();
        if (aVarE2 == null) {
            aVarE2 = new io.sentry.protocol.a();
            r5.n(aVarE2);
        }
        if (aVarE2.y == null) {
            return i5Var2;
        }
        aVarE2.y = Boolean.valueOf((boolean) r0);
        return i5Var2;
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, io.sentry.l0 l0Var) {
        return f0Var;
    }
}

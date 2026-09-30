package defpackage;

import android.app.BroadcastOptions;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.android.core.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ich implements i5h {
    public static volatile ich Z0;
    public ArrayList E0;
    public int G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public FileLock L0;
    public FileChannel M0;
    public ArrayList N0;
    public ArrayList O0;
    public final HashMap Q0;
    public final HashMap R0;
    public final HashMap S0;
    public t8h U0;
    public String V0;
    public xah W0;
    public long X0;
    public boolean Y;
    public long Z;
    public final y2h a;
    public final g1h b;
    public krg c;
    public q1h d;
    public mbh e;
    public fmg f;
    public final lch g;
    public g1h v;
    public oah w;
    public ysd y;
    public final w3h z;
    public final AtomicBoolean X = new AtomicBoolean(false);
    public final LinkedList F0 = new LinkedList();
    public final HashMap T0 = new HashMap();
    public final yea Y0 = new yea(this);
    public long P0 = -1;
    public final zbh x = new zbh(this);

    public ich(t23 t23Var) {
        this.z = w3h.m(t23Var.a, null, null, null);
        lch lchVar = new lch(this);
        lchVar.C0();
        this.g = lchVar;
        g1h g1hVar = new g1h(this, 0);
        g1hVar.C0();
        this.b = g1hVar;
        y2h y2hVar = new y2h(this);
        y2hVar.C0();
        this.a = y2hVar;
        this.Q0 = new HashMap();
        this.R0 = new HashMap();
        this.S0 = new HashMap();
        Z().J0(new jfg(15, this, t23Var));
    }

    public static final void A(t2h t2hVar, int i, String str) {
        List listH = t2hVar.h();
        for (int i2 = 0; i2 < listH.size(); i2++) {
            if ("_err".equals(((e3h) listH.get(i2)).s())) {
                return;
            }
        }
        d3h d3hVarD = e3h.D();
        d3hVarD.h("_err");
        d3hVarD.j(i);
        e3h e3hVar = (e3h) d3hVarD.e();
        d3h d3hVarD2 = e3h.D();
        d3hVarD2.h("_ev");
        d3hVarD2.i(str);
        e3h e3hVar2 = (e3h) d3hVarD2.e();
        t2hVar.k(e3hVar);
        t2hVar.k(e3hVar2);
    }

    public static final void B(t2h t2hVar, String str) {
        List listH = t2hVar.h();
        for (int i = 0; i < listH.size(); i++) {
            if (str.equals(((e3h) listH.get(i)).s())) {
                t2hVar.m(i);
                return;
            }
        }
    }

    public static void Q(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean R(ndh ndhVar) {
        return !TextUtils.isEmpty(ndhVar.b);
    }

    public static final void S(wbh wbhVar) {
        if (wbhVar == null) {
            qc0.p("Upload Component not created");
        } else {
            if (wbhVar.d) {
                return;
            }
            qc0.p("Component not initialized: ".concat(String.valueOf(wbhVar.getClass())));
        }
    }

    public static final Boolean T(ndh ndhVar) {
        Boolean bool = ndhVar.E0;
        String str = ndhVar.R0;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((k5h) yea.l(str).a).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static ich z(Service service) {
        oa7.A(service.getApplicationContext());
        if (Z0 == null) {
            synchronized (ich.class) {
                try {
                    if (Z0 == null) {
                        t23 t23Var = new t23();
                        Context applicationContext = service.getApplicationContext();
                        oa7.A(applicationContext);
                        t23Var.a = applicationContext;
                        Z0 = new ich(t23Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Z0;
    }

    public final int C(ysd ysdVar, String str) {
        k5h k5hVarE0;
        y2h y2hVar = this.a;
        szg szgVarW0 = y2hVar.W0(str);
        o5h o5hVar = o5h.AD_PERSONALIZATION;
        if (szgVarW0 == null) {
            ysdVar.o(o5hVar, sqg.FAILSAFE);
            return 1;
        }
        krg krgVar = this.c;
        S(krgVar);
        k1h k1hVarE1 = krgVar.E1(str);
        if (k1hVarE1 == null || ((k5h) yea.l(k1hVarE1.s()).a) != k5h.POLICY || (k5hVarE0 = y2hVar.E0(str, o5hVar)) == k5h.UNINITIALIZED) {
            ysdVar.o(o5hVar, sqg.REMOTE_DEFAULT);
            if (y2hVar.V0(str, o5hVar)) {
                return 0;
            }
        } else {
            ysdVar.o(o5hVar, sqg.REMOTE_ENFORCED_DEFAULT);
            if (k5hVarE0 == k5h.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap D(v2h v2hVar) {
        Serializable serializableS0;
        HashMap map = new HashMap();
        k0();
        HashMap map2 = new HashMap();
        for (e3h e3hVar : v2hVar.t()) {
            if (e3hVar.s().startsWith("gad_") && (serializableS0 = lch.S0(e3hVar)) != null) {
                map2.put(e3hVar.s(), serializableS0);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    @Override // defpackage.i5h
    public final hj6 E() {
        w3h w3hVar = this.z;
        oa7.A(w3hVar);
        return w3hVar.y;
    }

    public final void F() {
        Z().A0();
        if (this.F0.isEmpty()) {
            return;
        }
        xah xahVar = this.W0;
        int i = 2;
        if (xahVar == null) {
            xah xahVar2 = new xah(this, this.z, i);
            this.W0 = xahVar2;
            xahVar = xahVar2;
        }
        if (xahVar.c != 0) {
            return;
        }
        E().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) bzg.A0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.X0));
        v().Z.b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        xah xahVar3 = this.W0;
        if (xahVar3 == null) {
            xah xahVar4 = new xah(this, this.z, i);
            this.W0 = xahVar4;
            xahVar3 = xahVar4;
        }
        xahVar3.b(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0306 A[Catch: all -> 0x011f, TRY_ENTER, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0314 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0336 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0344 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0395  */
    /* JADX WARN: Code duplicated, block: B:113:0x039b A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03f6 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x045e A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x046c A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0474 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x047e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0487 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x048b  */
    /* JADX WARN: Code duplicated, block: B:137:0x048c A[DONT_INVERT, PHI: r4
  0x048c: PHI (r4v57 d3h) = (r4v56 d3h), (r4v62 d3h) binds: [B:133:0x0483, B:136:0x048b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x048e A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x04ad A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x04c6 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x04d5 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:151:0x0505 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x051e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0522 A[PHI: r11 r12
  0x0522: PHI (r11v11 u3h) = (r11v10 u3h), (r11v14 u3h) binds: [B:159:0x0545, B:154:0x051e] A[DONT_GENERATE, DONT_INLINE]
  0x0522: PHI (r12v30 int) = (r12v28 int), (r12v33 int) binds: [B:159:0x0545, B:154:0x051e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0526 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0536 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0547  */
    /* JADX WARN: Code duplicated, block: B:165:0x0567 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0574 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x05a7 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x05c2 A[Catch: all -> 0x011f, LOOP:8: B:177:0x05a1->B:182:0x05c2, LOOP_END, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x05ee A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0603 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0615 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x069e A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x06ae A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x06f4 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x071e A[Catch: all -> 0x011f, LOOP:7: B:222:0x0718->B:224:0x071e, LOOP_END, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0728  */
    /* JADX WARN: Code duplicated, block: B:235:0x0782 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x078b A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0791 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x079a  */
    /* JADX WARN: Code duplicated, block: B:486:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x019e  */
    /* JADX WARN: Code duplicated, block: B:491:0x06c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0707 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x06ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x05b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x07ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c0 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e4 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0284 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0298  */
    /* JADX WARN: Code duplicated, block: B:80:0x0299 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x02ab A[Catch: all -> 0x011f, TRY_ENTER, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02bc A[Catch: all -> 0x011f, LOOP:2: B:81:0x02a3->B:87:0x02bc, LOOP_END, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02d6 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0eda, B:448:0x0ee8, B:449:0x0ef2, B:450:0x0efd, B:452:0x0f0f, B:455:0x0f16, B:460:0x0f57, B:456:0x0f25, B:458:0x0f33, B:459:0x0f40, B:461:0x0f66, B:462:0x0f79, B:466:0x0f97, B:465:0x0f84, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa0), top: B:477:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02f2  */
    public final boolean G(long j, String str) {
        boolean z;
        int i;
        Long l;
        w3h w3hVar;
        u3h u3hVar;
        w3h w3hVar2;
        k1h k1hVarE1;
        Long l2;
        long j2;
        w3h w3hVar3;
        int iS0;
        long j3;
        oa5 oa5Var;
        long jQ;
        e3h e3hVarK0;
        Long lValueOf;
        String str2;
        int i2;
        String str3;
        qqg qqgVarF0;
        azg azgVar;
        boolean zQ0;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        d3h d3hVar;
        int i5;
        e3h e3hVarJ;
        u3h u3hVar2;
        int i6;
        int i7;
        int i8;
        e3h e3hVarJ2;
        t2h t2hVar;
        int i9;
        String str4;
        String str5;
        int i10;
        Bundle bundleJ0;
        int i11;
        lch lchVarK0;
        ArrayList arrayList;
        Iterator it;
        d3h d3hVarD;
        Object obj;
        e3h e3hVarJ3;
        String str6;
        int i12;
        int i13;
        String str7;
        long jH0;
        t2h t2hVar2;
        String strN;
        String strR;
        ArrayList arrayList2;
        int i14;
        int i15;
        String str8;
        ich ichVar = this;
        String str9 = "1";
        String str10 = "_ai";
        String str11 = "purchase";
        String str12 = "items";
        Long l3 = 1L;
        ichVar.h0().o1();
        try {
            oa5 oa5Var2 = new oa5(ichVar);
            ichVar.h0().m1(str, j, ichVar.P0, oa5Var2);
            oa5 oa5Var3 = oa5Var2;
            ArrayList arrayList3 = (ArrayList) oa5Var3.d;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                h0().p1();
                z = false;
            } else {
                u3h u3hVar3 = (u3h) ((z3h) oa5Var3.b).i();
                u3hVar3.c();
                ((z3h) u3hVar3.b).c0();
                int i16 = -1;
                int i17 = -1;
                int i18 = 0;
                int i19 = 0;
                boolean z5 = false;
                t2h t2hVar3 = null;
                t2h t2hVar4 = null;
                boolean z6 = false;
                while (true) {
                    int size = ((ArrayList) oa5Var3.d).size();
                    i = i19;
                    l = l3;
                    w3hVar = ichVar.z;
                    u3hVar = u3hVar3;
                    int i20 = i16;
                    if (i18 >= size) {
                        break;
                    }
                    t2h t2hVar5 = (t2h) ((v2h) ((ArrayList) oa5Var3.d).get(i18)).i();
                    int i21 = i18;
                    if (ichVar.g0().P0(((z3h) oa5Var3.b).r(), t2hVar5.n())) {
                        ichVar.v().x.c(w0h.E0(((z3h) oa5Var3.b).r()), w3hVar.x.a(t2hVar5.n()), "Dropping blocked raw event. appId");
                        if (!str9.equals(ichVar.g0().M(((z3h) oa5Var3.b).r(), "measurement.upload.blacklist_internal")) && !str9.equals(ichVar.g0().M(((z3h) oa5Var3.b).r(), "measurement.upload.blacklist_public")) && !"_err".equals(t2hVar5.n())) {
                            ichVar.l0();
                            qch.S0(ichVar.Y0, ((z3h) oa5Var3.b).r(), 11, "_ev", t2hVar5.n(), 0);
                        }
                        str4 = str10;
                        str11 = str11;
                        str5 = str12;
                        i19 = i;
                        u3hVar2 = u3hVar;
                        i10 = i21;
                        i9 = i17;
                        i6 = i20;
                    } else {
                        String strN2 = t2hVar5.n();
                        String str13 = str12;
                        if (strN2.equals(str11) || strN2.equals("_iap") || strN2.equals("ecommerce_purchase")) {
                            str2 = "_et";
                            i2 = i17;
                            str3 = "_fr";
                        } else {
                            i2 = i17;
                            str2 = "_et";
                            str3 = "_fr";
                            if (ichVar.f0().L0(null, bzg.f1) && strN2.equals("in_app_purchase")) {
                            }
                            if (t2hVar5.n().equals(rfc.u(str10, ok8.y, ok8.t))) {
                                t2hVar5.o(str10);
                                ichVar.v().Z.a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(ichVar.v().G0(), 5)) {
                                    for (i15 = 0; i15 < t2hVar5.i(); i15++) {
                                        if (!"ad_platform".equals(t2hVar5.j(i15).s()) && !t2hVar5.j(i15).u().isEmpty() && "admob".equalsIgnoreCase(t2hVar5.j(i15).u())) {
                                            ichVar.v().z.a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            qqgVarF0 = ichVar.f0();
                            azgVar = bzg.f1;
                            if (qqgVarF0.L0(null, azgVar) && t2hVar5.n().equals("in_app_purchase")) {
                                t2hVar5.o("_iap");
                                ichVar.v().Z.a("Renaming in_app_purchase to _iap");
                            }
                            zQ0 = ichVar.g0().Q0(((z3h) oa5Var3.b).r(), t2hVar5.n());
                            if (ichVar.f0().L0(null, azgVar) && "_iap".equals(t2hVar5.n())) {
                                zQ0 = ichVar.u(t2hVar5);
                                strR = ((z3h) oa5Var3.b).r();
                                if ("_iap".equals(t2hVar5.n())) {
                                    ichVar.J(t2hVar5, "value", strR);
                                    ichVar.J(t2hVar5, "price", strR);
                                }
                                if (!"_iap".equals(t2hVar5.n())) {
                                    arrayList2 = new ArrayList(t2hVar5.h());
                                    i14 = 0;
                                    while (true) {
                                        if (i14 < arrayList2.size()) {
                                            d3h d3hVarD2 = e3h.D();
                                            d3hVarD2.h("quantity");
                                            d3hVarD2.j(1L);
                                            t2hVar5.k((e3h) d3hVarD2.e());
                                            break;
                                        }
                                        if ("quantity".equals(((e3h) arrayList2.get(i14)).s())) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                            if (zQ0) {
                                z2 = false;
                                z3 = false;
                                for (i3 = 0; i3 < t2hVar5.i(); i3++) {
                                    if ("_c".equals(t2hVar5.j(i3).s())) {
                                        d3h d3hVar2 = (d3h) t2hVar5.j(i3).i();
                                        d3hVar2.j(1L);
                                        e3h e3hVar = (e3h) d3hVar2.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i3, e3hVar);
                                        z2 = true;
                                    } else if ("_r".equals(t2hVar5.j(i3).s())) {
                                        d3h d3hVar3 = (d3h) t2hVar5.j(i3).i();
                                        d3hVar3.j(1L);
                                        e3h e3hVar2 = (e3h) d3hVar3.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i3, e3hVar2);
                                        z3 = true;
                                    }
                                }
                                if (z2) {
                                }
                                if (!z3) {
                                    ichVar.v().Z.b(w3hVar.x.a(t2hVar5.n()), "Marking event as real-time");
                                    d3h d3hVarD3 = e3h.D();
                                    d3hVarD3.h("_r");
                                    d3hVarD3.j(1L);
                                    t2hVar5.l(d3hVarD3);
                                }
                                if (ichVar.h0().G1(ichVar.b(), ((z3h) oa5Var3.b).r(), false, true, false, false).e > ichVar.f0().J0(((z3h) oa5Var3.b).r(), bzg.p)) {
                                    B(t2hVar5, "_r");
                                } else {
                                    z6 = true;
                                }
                                if (qch.B1(t2hVar5.n())) {
                                    ichVar.v().x.b(w0h.E0(((z3h) oa5Var3.b).r()), "Too many conversions. Not logging as conversion. appId");
                                    z4 = false;
                                    d3hVar = null;
                                    i5 = -1;
                                    for (i4 = 0; i4 < t2hVar5.i(); i4++) {
                                        e3hVarJ = t2hVar5.j(i4);
                                        if ("_c".equals(e3hVarJ.s())) {
                                            d3hVar = (d3h) e3hVarJ.i();
                                            i5 = i4;
                                        } else if ("_err".equals(e3hVarJ.s())) {
                                            z4 = true;
                                        }
                                    }
                                    if (z4) {
                                        if (d3hVar != null) {
                                            t2hVar5.m(i5);
                                        } else {
                                            d3hVar = null;
                                            if (d3hVar != null) {
                                                d3h d3hVar4 = (d3h) d3hVar.clone();
                                                d3hVar4.h("_err");
                                                d3hVar4.j(10L);
                                                e3h e3hVar3 = (e3h) d3hVar4.e();
                                                t2hVar5.c();
                                                ((v2h) t2hVar5.b).I(i5, e3hVar3);
                                            } else {
                                                ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                            }
                                        }
                                    } else if (d3hVar != null) {
                                        d3h d3hVar5 = (d3h) d3hVar.clone();
                                        d3hVar5.h("_err");
                                        d3hVar5.j(10L);
                                        e3h e3hVar4 = (e3h) d3hVar5.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i5, e3hVar4);
                                    } else {
                                        ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                    }
                                }
                            } else {
                                ichVar.k0();
                                strN = t2hVar5.n();
                                oa7.x(strN);
                                if (strN.hashCode() == 95027 && strN.equals("_ui")) {
                                    z2 = false;
                                    z3 = false;
                                    while (i3 < t2hVar5.i()) {
                                        if ("_c".equals(t2hVar5.j(i3).s())) {
                                            d3h d3hVar6 = (d3h) t2hVar5.j(i3).i();
                                            d3hVar6.j(1L);
                                            e3h e3hVar5 = (e3h) d3hVar6.e();
                                            t2hVar5.c();
                                            ((v2h) t2hVar5.b).I(i3, e3hVar5);
                                            z2 = true;
                                        } else if ("_r".equals(t2hVar5.j(i3).s())) {
                                            d3h d3hVar7 = (d3h) t2hVar5.j(i3).i();
                                            d3hVar7.j(1L);
                                            e3h e3hVar6 = (e3h) d3hVar7.e();
                                            t2hVar5.c();
                                            ((v2h) t2hVar5.b).I(i3, e3hVar6);
                                            z3 = true;
                                        }
                                    }
                                    if (z2 && zQ0) {
                                        ichVar.v().Z.b(w3hVar.x.a(t2hVar5.n()), "Marking event as conversion");
                                        d3h d3hVarD4 = e3h.D();
                                        d3hVarD4.h("_c");
                                        d3hVarD4.j(1L);
                                        t2hVar5.l(d3hVarD4);
                                    }
                                    if (!z3) {
                                        ichVar.v().Z.b(w3hVar.x.a(t2hVar5.n()), "Marking event as real-time");
                                        d3h d3hVarD5 = e3h.D();
                                        d3hVarD5.h("_r");
                                        d3hVarD5.j(1L);
                                        t2hVar5.l(d3hVarD5);
                                    }
                                    if (ichVar.h0().G1(ichVar.b(), ((z3h) oa5Var3.b).r(), false, true, false, false).e > ichVar.f0().J0(((z3h) oa5Var3.b).r(), bzg.p)) {
                                        B(t2hVar5, "_r");
                                    } else {
                                        z6 = true;
                                    }
                                    if (qch.B1(t2hVar5.n()) && zQ0 != 0 && ichVar.h0().G1(ichVar.b(), ((z3h) oa5Var3.b).r(), true, false, false, false).c > ichVar.f0().J0(((z3h) oa5Var3.b).r(), bzg.o)) {
                                        ichVar.v().x.b(w0h.E0(((z3h) oa5Var3.b).r()), "Too many conversions. Not logging as conversion. appId");
                                        z4 = false;
                                        d3hVar = null;
                                        i5 = -1;
                                        while (i4 < t2hVar5.i()) {
                                            e3hVarJ = t2hVar5.j(i4);
                                            if ("_c".equals(e3hVarJ.s())) {
                                                d3hVar = (d3h) e3hVarJ.i();
                                                i5 = i4;
                                            } else if ("_err".equals(e3hVarJ.s())) {
                                                z4 = true;
                                            }
                                        }
                                        if (z4) {
                                            if (d3hVar != null) {
                                                d3h d3hVar8 = (d3h) d3hVar.clone();
                                                d3hVar8.h("_err");
                                                d3hVar8.j(10L);
                                                e3h e3hVar7 = (e3h) d3hVar8.e();
                                                t2hVar5.c();
                                                ((v2h) t2hVar5.b).I(i5, e3hVar7);
                                            } else {
                                                ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                            }
                                        } else if (d3hVar != null) {
                                            t2hVar5.m(i5);
                                        } else {
                                            d3hVar = null;
                                            if (d3hVar != null) {
                                                d3h d3hVar9 = (d3h) d3hVar.clone();
                                                d3hVar9.h("_err");
                                                d3hVar9.j(10L);
                                                e3h e3hVar8 = (e3h) d3hVar9.e();
                                                t2hVar5.c();
                                                ((v2h) t2hVar5.b).I(i5, e3hVar8);
                                            } else {
                                                ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                            }
                                        }
                                    }
                                } else {
                                    str10 = str10;
                                    str11 = str11;
                                    zQ0 = false;
                                }
                            }
                            if (zQ0) {
                                ichVar.u(t2hVar5);
                            }
                            if ("_e".equals(t2hVar5.n())) {
                                ichVar.k0();
                                if (lch.K0(str3, (v2h) t2hVar5.e()) == null) {
                                    if (t2hVar4 != null && Math.abs(t2hVar4.p() - t2hVar5.p()) <= 1000) {
                                        t2hVar2 = (t2h) t2hVar4.clone();
                                        if (ichVar.I(t2hVar5, t2hVar2)) {
                                            u3hVar2 = u3hVar;
                                            i6 = i20;
                                            u3hVar2.Y(i6, t2hVar2);
                                            i7 = i2;
                                            t2hVar3 = null;
                                            t2hVar4 = null;
                                        }
                                    }
                                    u3hVar2 = u3hVar;
                                    i6 = i20;
                                    t2hVar3 = t2hVar5;
                                    i7 = i;
                                } else {
                                    u3hVar2 = u3hVar;
                                    i6 = i20;
                                    i7 = i2;
                                }
                            } else {
                                u3hVar2 = u3hVar;
                                i6 = i20;
                                if ("_vs".equals(t2hVar5.n())) {
                                    ichVar.k0();
                                    if (lch.K0(str2, (v2h) t2hVar5.e()) == null) {
                                        if (t2hVar3 != null && Math.abs(t2hVar3.p() - t2hVar5.p()) <= 1000) {
                                            t2hVar = (t2h) t2hVar3.clone();
                                            if (ichVar.I(t2hVar, t2hVar5)) {
                                                i7 = i2;
                                                u3hVar2.Y(i7, t2hVar);
                                                t2hVar3 = null;
                                                t2hVar4 = null;
                                            }
                                        }
                                        i7 = i2;
                                        t2hVar4 = t2hVar5;
                                        i6 = i;
                                    } else {
                                        i7 = i2;
                                    }
                                } else {
                                    i7 = i2;
                                    if (("_f".equals(t2hVar5.n()) || "_v".equals(t2hVar5.n())) && ("_f".equals(t2hVar5.n()) || "_v".equals(t2hVar5.n()))) {
                                        for (i8 = 0; i8 < t2hVar5.i(); i8++) {
                                            e3hVarJ2 = t2hVar5.j(i8);
                                            if ("_elt".equals(e3hVarJ2.s())) {
                                                t2hVar5.r(e3hVarJ2.w());
                                                t2hVar5.m(i8);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (ichVar.f0().L0(null, bzg.e1) && t2hVar5.u() && !t2hVar5.s()) {
                                jH0 = ichVar.k0().H0(t2hVar5.v());
                                if (jH0 != 0) {
                                    t2hVar5.t(jH0);
                                }
                                t2hVar5.c();
                                ((v2h) t2hVar5.b).r(0L);
                            }
                            if (t2hVar5.i() != 0) {
                                ichVar.k0();
                                bundleJ0 = lch.J0(t2hVar5.h());
                                i11 = 0;
                                while (i11 < t2hVar5.i()) {
                                    e3hVarJ3 = t2hVar5.j(i11);
                                    str6 = str13;
                                    if (e3hVarJ3.s().equals(str6) || e3hVarJ3.B().isEmpty()) {
                                        i12 = i7;
                                        i13 = i11;
                                        str7 = str10;
                                        if (!e3hVarJ3.s().equals(str6)) {
                                            ichVar.t(t2hVar5.n(), (d3h) e3hVarJ3.i(), bundleJ0, ((z3h) oa5Var3.b).r());
                                        }
                                    } else {
                                        String strR2 = ((z3h) oa5Var3.b).r();
                                        zmg zmgVarB = e3hVarJ3.B();
                                        Bundle[] bundleArr = new Bundle[zmgVarB.size()];
                                        i12 = i7;
                                        int i22 = 0;
                                        while (i22 < zmgVarB.size()) {
                                            e3h e3hVar9 = (e3h) zmgVarB.get(i22);
                                            ichVar.k0();
                                            Bundle bundleJ1 = lch.J0(e3hVar9.B());
                                            Iterator it2 = e3hVar9.B().iterator();
                                            while (it2.hasNext()) {
                                                ichVar.t(t2hVar5.n(), (d3h) ((e3h) it2.next()).i(), bundleJ1, strR2);
                                                i11 = i11;
                                                str10 = str10;
                                            }
                                            bundleArr[i22] = bundleJ1;
                                            i22++;
                                            i11 = i11;
                                            str10 = str10;
                                        }
                                        i13 = i11;
                                        str7 = str10;
                                        bundleJ0.putParcelableArray(str6, bundleArr);
                                    }
                                    i11 = i13 + 1;
                                    str13 = str6;
                                    i7 = i12;
                                    str10 = str7;
                                }
                                i9 = i7;
                                str4 = str10;
                                str5 = str13;
                                t2hVar5.c();
                                ((v2h) t2hVar5.b).L();
                                lchVarK0 = ichVar.k0();
                                arrayList = new ArrayList();
                                for (String str14 : bundleJ0.keySet()) {
                                    d3hVarD = e3h.D();
                                    d3hVarD.h(str14);
                                    obj = bundleJ0.get(str14);
                                    if (obj != null) {
                                        lchVarK0.Y0(d3hVarD, obj);
                                        arrayList.add((e3h) d3hVarD.e());
                                    }
                                }
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    t2hVar5.k((e3h) it.next());
                                }
                            } else {
                                i9 = i7;
                                str4 = str10;
                                str5 = str13;
                            }
                            i10 = i21;
                            ((ArrayList) oa5Var3.d).set(i10, (v2h) t2hVar5.e());
                            u3hVar2.Z(t2hVar5);
                            i19 = i + 1;
                        }
                        d3h d3hVarD6 = e3h.D();
                        d3hVarD6.h("_ct");
                        if (z5) {
                            str8 = "returning";
                        } else {
                            String strR3 = ((z3h) oa5Var3.b).r();
                            if (ichVar.P(strR3, str11) && ichVar.P(strR3, "_iap") && ichVar.P(strR3, "ecommerce_purchase")) {
                                str8 = "new";
                            } else {
                                str8 = "returning";
                            }
                        }
                        d3hVarD6.i(str8);
                        t2hVar5.k((e3h) d3hVarD6.e());
                        z5 = true;
                        if (t2hVar5.n().equals(rfc.u(str10, ok8.y, ok8.t))) {
                            t2hVar5.o(str10);
                            ichVar.v().Z.a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(ichVar.v().G0(), 5)) {
                                while (i15 < t2hVar5.i()) {
                                    if (!"ad_platform".equals(t2hVar5.j(i15).s())) {
                                    }
                                }
                            }
                        }
                        qqgVarF0 = ichVar.f0();
                        azgVar = bzg.f1;
                        if (qqgVarF0.L0(null, azgVar)) {
                            t2hVar5.o("_iap");
                            ichVar.v().Z.a("Renaming in_app_purchase to _iap");
                        }
                        zQ0 = ichVar.g0().Q0(((z3h) oa5Var3.b).r(), t2hVar5.n());
                        if (ichVar.f0().L0(null, azgVar)) {
                            zQ0 = ichVar.u(t2hVar5);
                            strR = ((z3h) oa5Var3.b).r();
                            if ("_iap".equals(t2hVar5.n())) {
                                ichVar.J(t2hVar5, "value", strR);
                                ichVar.J(t2hVar5, "price", strR);
                            }
                            if (!"_iap".equals(t2hVar5.n())) {
                                arrayList2 = new ArrayList(t2hVar5.h());
                                i14 = 0;
                                while (true) {
                                    if (i14 < arrayList2.size()) {
                                        d3h d3hVarD7 = e3h.D();
                                        d3hVarD7.h("quantity");
                                        d3hVarD7.j(1L);
                                        t2hVar5.k((e3h) d3hVarD7.e());
                                        break;
                                    }
                                    if ("quantity".equals(((e3h) arrayList2.get(i14)).s())) {
                                        break;
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                        if (zQ0) {
                            ichVar.k0();
                            strN = t2hVar5.n();
                            oa7.x(strN);
                            if (strN.hashCode() == 95027) {
                                z2 = false;
                                z3 = false;
                                while (i3 < t2hVar5.i()) {
                                    if ("_c".equals(t2hVar5.j(i3).s())) {
                                        d3h d3hVar10 = (d3h) t2hVar5.j(i3).i();
                                        d3hVar10.j(1L);
                                        e3h e3hVar10 = (e3h) d3hVar10.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i3, e3hVar10);
                                        z2 = true;
                                    } else if ("_r".equals(t2hVar5.j(i3).s())) {
                                        d3h d3hVar11 = (d3h) t2hVar5.j(i3).i();
                                        d3hVar11.j(1L);
                                        e3h e3hVar11 = (e3h) d3hVar11.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i3, e3hVar11);
                                        z3 = true;
                                    }
                                }
                                if (z2) {
                                }
                                if (!z3) {
                                    ichVar.v().Z.b(w3hVar.x.a(t2hVar5.n()), "Marking event as real-time");
                                    d3h d3hVarD8 = e3h.D();
                                    d3hVarD8.h("_r");
                                    d3hVarD8.j(1L);
                                    t2hVar5.l(d3hVarD8);
                                }
                                if (ichVar.h0().G1(ichVar.b(), ((z3h) oa5Var3.b).r(), false, true, false, false).e > ichVar.f0().J0(((z3h) oa5Var3.b).r(), bzg.p)) {
                                    B(t2hVar5, "_r");
                                } else {
                                    z6 = true;
                                }
                                if (qch.B1(t2hVar5.n())) {
                                    ichVar.v().x.b(w0h.E0(((z3h) oa5Var3.b).r()), "Too many conversions. Not logging as conversion. appId");
                                    z4 = false;
                                    d3hVar = null;
                                    i5 = -1;
                                    while (i4 < t2hVar5.i()) {
                                        e3hVarJ = t2hVar5.j(i4);
                                        if ("_c".equals(e3hVarJ.s())) {
                                            d3hVar = (d3h) e3hVarJ.i();
                                            i5 = i4;
                                        } else if ("_err".equals(e3hVarJ.s())) {
                                            z4 = true;
                                        }
                                    }
                                    if (z4) {
                                        if (d3hVar != null) {
                                            d3h d3hVar12 = (d3h) d3hVar.clone();
                                            d3hVar12.h("_err");
                                            d3hVar12.j(10L);
                                            e3h e3hVar12 = (e3h) d3hVar12.e();
                                            t2hVar5.c();
                                            ((v2h) t2hVar5.b).I(i5, e3hVar12);
                                        } else {
                                            ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                        }
                                    } else if (d3hVar != null) {
                                        t2hVar5.m(i5);
                                    } else {
                                        d3hVar = null;
                                        if (d3hVar != null) {
                                            d3h d3hVar13 = (d3h) d3hVar.clone();
                                            d3hVar13.h("_err");
                                            d3hVar13.j(10L);
                                            e3h e3hVar13 = (e3h) d3hVar13.e();
                                            t2hVar5.c();
                                            ((v2h) t2hVar5.b).I(i5, e3hVar13);
                                        } else {
                                            ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                        }
                                    }
                                }
                            }
                            str10 = str10;
                            str11 = str11;
                            zQ0 = false;
                        } else {
                            z2 = false;
                            z3 = false;
                            while (i3 < t2hVar5.i()) {
                                if ("_c".equals(t2hVar5.j(i3).s())) {
                                    d3h d3hVar14 = (d3h) t2hVar5.j(i3).i();
                                    d3hVar14.j(1L);
                                    e3h e3hVar14 = (e3h) d3hVar14.e();
                                    t2hVar5.c();
                                    ((v2h) t2hVar5.b).I(i3, e3hVar14);
                                    z2 = true;
                                } else if ("_r".equals(t2hVar5.j(i3).s())) {
                                    d3h d3hVar15 = (d3h) t2hVar5.j(i3).i();
                                    d3hVar15.j(1L);
                                    e3h e3hVar15 = (e3h) d3hVar15.e();
                                    t2hVar5.c();
                                    ((v2h) t2hVar5.b).I(i3, e3hVar15);
                                    z3 = true;
                                }
                            }
                            if (z2) {
                            }
                            if (!z3) {
                                ichVar.v().Z.b(w3hVar.x.a(t2hVar5.n()), "Marking event as real-time");
                                d3h d3hVarD9 = e3h.D();
                                d3hVarD9.h("_r");
                                d3hVarD9.j(1L);
                                t2hVar5.l(d3hVarD9);
                            }
                            if (ichVar.h0().G1(ichVar.b(), ((z3h) oa5Var3.b).r(), false, true, false, false).e > ichVar.f0().J0(((z3h) oa5Var3.b).r(), bzg.p)) {
                                B(t2hVar5, "_r");
                            } else {
                                z6 = true;
                            }
                            if (qch.B1(t2hVar5.n())) {
                                ichVar.v().x.b(w0h.E0(((z3h) oa5Var3.b).r()), "Too many conversions. Not logging as conversion. appId");
                                z4 = false;
                                d3hVar = null;
                                i5 = -1;
                                while (i4 < t2hVar5.i()) {
                                    e3hVarJ = t2hVar5.j(i4);
                                    if ("_c".equals(e3hVarJ.s())) {
                                        d3hVar = (d3h) e3hVarJ.i();
                                        i5 = i4;
                                    } else if ("_err".equals(e3hVarJ.s())) {
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    if (d3hVar != null) {
                                        d3h d3hVar16 = (d3h) d3hVar.clone();
                                        d3hVar16.h("_err");
                                        d3hVar16.j(10L);
                                        e3h e3hVar16 = (e3h) d3hVar16.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i5, e3hVar16);
                                    } else {
                                        ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                    }
                                } else if (d3hVar != null) {
                                    t2hVar5.m(i5);
                                } else {
                                    d3hVar = null;
                                    if (d3hVar != null) {
                                        d3h d3hVar17 = (d3h) d3hVar.clone();
                                        d3hVar17.h("_err");
                                        d3hVar17.j(10L);
                                        e3h e3hVar17 = (e3h) d3hVar17.e();
                                        t2hVar5.c();
                                        ((v2h) t2hVar5.b).I(i5, e3hVar17);
                                    } else {
                                        ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find conversion parameter. appId");
                                    }
                                }
                            }
                        }
                        if (zQ0) {
                            ichVar.u(t2hVar5);
                        }
                        if ("_e".equals(t2hVar5.n())) {
                            ichVar.k0();
                            if (lch.K0(str3, (v2h) t2hVar5.e()) == null) {
                                if (t2hVar4 != null) {
                                    t2hVar2 = (t2h) t2hVar4.clone();
                                    if (ichVar.I(t2hVar5, t2hVar2)) {
                                        u3hVar2 = u3hVar;
                                        i6 = i20;
                                        u3hVar2.Y(i6, t2hVar2);
                                        i7 = i2;
                                        t2hVar3 = null;
                                        t2hVar4 = null;
                                    }
                                }
                                u3hVar2 = u3hVar;
                                i6 = i20;
                                t2hVar3 = t2hVar5;
                                i7 = i;
                            } else {
                                u3hVar2 = u3hVar;
                                i6 = i20;
                                i7 = i2;
                            }
                        } else {
                            u3hVar2 = u3hVar;
                            i6 = i20;
                            if ("_vs".equals(t2hVar5.n())) {
                                ichVar.k0();
                                if (lch.K0(str2, (v2h) t2hVar5.e()) == null) {
                                    if (t2hVar3 != null) {
                                        t2hVar = (t2h) t2hVar3.clone();
                                        if (ichVar.I(t2hVar, t2hVar5)) {
                                            i7 = i2;
                                            u3hVar2.Y(i7, t2hVar);
                                            t2hVar3 = null;
                                            t2hVar4 = null;
                                        }
                                    }
                                    i7 = i2;
                                    t2hVar4 = t2hVar5;
                                    i6 = i;
                                } else {
                                    i7 = i2;
                                }
                            } else {
                                i7 = i2;
                                if ("_f".equals(t2hVar5.n())) {
                                    while (i8 < t2hVar5.i()) {
                                        e3hVarJ2 = t2hVar5.j(i8);
                                        if ("_elt".equals(e3hVarJ2.s())) {
                                            t2hVar5.r(e3hVarJ2.w());
                                            t2hVar5.m(i8);
                                            break;
                                        }
                                    }
                                } else {
                                    while (i8 < t2hVar5.i()) {
                                        e3hVarJ2 = t2hVar5.j(i8);
                                        if ("_elt".equals(e3hVarJ2.s())) {
                                            t2hVar5.r(e3hVarJ2.w());
                                            t2hVar5.m(i8);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (ichVar.f0().L0(null, bzg.e1)) {
                            jH0 = ichVar.k0().H0(t2hVar5.v());
                            if (jH0 != 0) {
                                t2hVar5.t(jH0);
                            }
                            t2hVar5.c();
                            ((v2h) t2hVar5.b).r(0L);
                        }
                        if (t2hVar5.i() != 0) {
                            ichVar.k0();
                            bundleJ0 = lch.J0(t2hVar5.h());
                            i11 = 0;
                            while (i11 < t2hVar5.i()) {
                                e3hVarJ3 = t2hVar5.j(i11);
                                str6 = str13;
                                if (e3hVarJ3.s().equals(str6)) {
                                    i12 = i7;
                                    i13 = i11;
                                    str7 = str10;
                                    if (!e3hVarJ3.s().equals(str6)) {
                                        ichVar.t(t2hVar5.n(), (d3h) e3hVarJ3.i(), bundleJ0, ((z3h) oa5Var3.b).r());
                                    }
                                } else {
                                    i12 = i7;
                                    i13 = i11;
                                    str7 = str10;
                                    if (!e3hVarJ3.s().equals(str6)) {
                                        ichVar.t(t2hVar5.n(), (d3h) e3hVarJ3.i(), bundleJ0, ((z3h) oa5Var3.b).r());
                                    }
                                }
                                i11 = i13 + 1;
                                str13 = str6;
                                i7 = i12;
                                str10 = str7;
                            }
                            i9 = i7;
                            str4 = str10;
                            str5 = str13;
                            t2hVar5.c();
                            ((v2h) t2hVar5.b).L();
                            lchVarK0 = ichVar.k0();
                            arrayList = new ArrayList();
                            while (r5.hasNext()) {
                                d3hVarD = e3h.D();
                                d3hVarD.h(str14);
                                obj = bundleJ0.get(str14);
                                if (obj != null) {
                                    lchVarK0.Y0(d3hVarD, obj);
                                    arrayList.add((e3h) d3hVarD.e());
                                }
                            }
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                t2hVar5.k((e3h) it.next());
                            }
                        } else {
                            i9 = i7;
                            str4 = str10;
                            str5 = str13;
                        }
                        i10 = i21;
                        ((ArrayList) oa5Var3.d).set(i10, (v2h) t2hVar5.e());
                        u3hVar2.Z(t2hVar5);
                        i19 = i + 1;
                    }
                    i18 = i10 + 1;
                    str11 = str11;
                    u3hVar3 = u3hVar2;
                    i16 = i6;
                    str12 = str5;
                    l3 = l;
                    i17 = i9;
                    str9 = str9;
                    str10 = str4;
                }
                int i23 = i;
                int i24 = 0;
                long jLongValue = 0;
                while (i24 < i23) {
                    v2h v2hVarW1 = ((z3h) u3hVar.b).W1(i24);
                    if ("_e".equals(v2hVarW1.w())) {
                        ichVar.k0();
                        if (lch.K0("_fr", v2hVarW1) != null) {
                            u3hVar.a0(i24);
                            i23--;
                            i24--;
                        } else {
                            ichVar.k0();
                            e3hVarK0 = lch.K0("_et", v2hVarW1);
                            if (e3hVarK0 == null) {
                                if (e3hVarK0.v()) {
                                    lValueOf = Long.valueOf(e3hVarK0.w());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        ichVar.k0();
                        e3hVarK0 = lch.K0("_et", v2hVarW1);
                        if (e3hVarK0 == null) {
                            if (e3hVarK0.v()) {
                                lValueOf = Long.valueOf(e3hVarK0.w());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i24++;
                }
                ichVar.H(u3hVar, jLongValue, false);
                Iterator it3 = u3hVar.W().iterator();
                while (it3.hasNext()) {
                    if ("_s".equals(((v2h) it3.next()).w())) {
                        ichVar.h0().u1(u3hVar.o(), "_se");
                        break;
                    }
                }
                if (lch.m1("_sid", u3hVar) >= 0) {
                    ichVar.H(u3hVar, jLongValue, true);
                } else {
                    int iM1 = lch.m1("_se", u3hVar);
                    if (iM1 >= 0) {
                        u3hVar.c();
                        ((z3h) u3hVar.b).g0(iM1);
                        ichVar.v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String strR4 = ((z3h) oa5Var3.b).r();
                ichVar.Z().A0();
                ichVar.m0();
                k1h k1hVarE2 = ichVar.h0().E1(strR4);
                if (k1hVarE2 == null) {
                    ichVar.v().g.b(w0h.E0(strR4), "Cannot fix consent fields without appInfo. appId");
                } else {
                    ichVar.h(k1hVarE2, u3hVar);
                }
                String strR5 = ((z3h) oa5Var3.b).r();
                ichVar.Z().A0();
                ichVar.m0();
                k1h k1hVarE3 = ichVar.h0().E1(strR5);
                if (k1hVarE3 == null) {
                    ichVar.v().x.b(w0h.E0(strR5), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    ichVar.i(k1hVarE3, u3hVar);
                }
                u3hVar.c();
                ((z3h) u3hVar.b).j0(Long.MAX_VALUE);
                u3hVar.c();
                ((z3h) u3hVar.b).k0(Long.MIN_VALUE);
                for (int i25 = 0; i25 < u3hVar.X(); i25++) {
                    v2h v2hVarW2 = ((z3h) u3hVar.b).W1(i25);
                    if (v2hVarW2.y() < ((z3h) u3hVar.b).d2()) {
                        long jY = v2hVarW2.y();
                        u3hVar.c();
                        ((z3h) u3hVar.b).j0(jY);
                    }
                    if (v2hVarW2.y() > ((z3h) u3hVar.b).f2()) {
                        long jY2 = v2hVarW2.y();
                        u3hVar.c();
                        ((z3h) u3hVar.b).k0(jY2);
                    }
                }
                u3hVar.N();
                q5h q5hVar = q5h.c;
                q5h q5hVarJ = ichVar.a(((z3h) oa5Var3.b).r()).j(q5h.c(100, ((z3h) oa5Var3.b).w0()));
                q5h q5hVarJ1 = ichVar.h0().j1(((z3h) oa5Var3.b).r());
                ichVar.h0().i1(((z3h) oa5Var3.b).r(), q5hVarJ);
                o5h o5hVar = o5h.ANALYTICS_STORAGE;
                if (!q5hVarJ.i(o5hVar) && q5hVarJ1.i(o5hVar)) {
                    ichVar.h0().s1(((z3h) oa5Var3.b).r());
                } else if (q5hVarJ.i(o5hVar) && !q5hVarJ1.i(o5hVar)) {
                    ichVar.h0().t1(((z3h) oa5Var3.b).r());
                }
                o5h o5hVar2 = o5h.AD_STORAGE;
                if (!q5hVarJ.i(o5hVar2)) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).B1();
                    u3hVar.c();
                    ((z3h) u3hVar.b).D1();
                    u3hVar.c();
                    ((z3h) u3hVar.b).U0();
                }
                if (!q5hVarJ.i(o5hVar)) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).F1();
                    u3hVar.c();
                    ((z3h) u3hVar.b).b1();
                }
                upg.a();
                if (ichVar.f0().L0(((z3h) oa5Var3.b).r(), bzg.O0)) {
                    ichVar.l0();
                    if (qch.d1((String) bzg.q0.a(null), ((z3h) oa5Var3.b).r()) && ichVar.a(((z3h) oa5Var3.b).r()).i(o5hVar2) && ((z3h) oa5Var3.b).B0()) {
                        ichVar.s(u3hVar, oa5Var3);
                    }
                }
                u3hVar.c();
                ((z3h) u3hVar.b).N1();
                u3hVar.K(ichVar.j0().E0(u3hVar.o(), u3hVar.W(), Collections.unmodifiableList(((z3h) u3hVar.b).X1()), Long.valueOf(((z3h) u3hVar.b).d2()), Long.valueOf(((z3h) u3hVar.b).f2()), !q5hVarJ.i(o5hVar)));
                if (ichVar.f0().C0(((z3h) oa5Var3.b).r())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom secureRandomA1 = ichVar.l0().A1();
                    int i26 = 0;
                    while (i26 < u3hVar.X()) {
                        t2h t2hVar6 = (t2h) ((z3h) u3hVar.b).W1(i26).i();
                        if (t2hVar6.n().equals("_ep")) {
                            ichVar.k0();
                            String str15 = (String) lch.M0("_en", (v2h) t2hVar6.e());
                            bsg bsgVarA1 = (bsg) map.get(str15);
                            if (bsgVarA1 == null) {
                                krg krgVarH0 = ichVar.h0();
                                String strR6 = ((z3h) oa5Var3.b).r();
                                oa7.A(str15);
                                bsgVarA1 = krgVarH0.a1("events", strR6, str15);
                                if (bsgVarA1 != null) {
                                    map.put(str15, bsgVarA1);
                                }
                            }
                            if (bsgVarA1 == null || bsgVarA1.i != null) {
                                l2 = l;
                            } else {
                                Long l4 = bsgVarA1.j;
                                if (l4 != null && l4.longValue() > 1) {
                                    ichVar.k0();
                                    lch.I0(t2hVar6, "_sr", l4);
                                }
                                Boolean bool = bsgVarA1.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    ichVar.k0();
                                    l2 = l;
                                    lch.I0(t2hVar6, "_efs", l2);
                                }
                                arrayList4.add((v2h) t2hVar6.e());
                            }
                            u3hVar.Y(i26, t2hVar6);
                            w3hVar3 = w3hVar;
                        } else {
                            l2 = l;
                            y2h y2hVarG0 = ichVar.g0();
                            String strR7 = ((z3h) oa5Var3.b).r();
                            String strM = y2hVarG0.M(strR7, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strM)) {
                                j2 = 0;
                            } else {
                                try {
                                    j2 = Long.parseLong(strM);
                                } catch (NumberFormatException e) {
                                    ((w3h) y2hVarG0.b).v().x.c(w0h.E0(strR7), e, "Unable to parse timezone offset. appId");
                                    j2 = 0;
                                }
                            }
                            l0();
                            long j4 = j2 * 60000;
                            long jP = (t2hVar6.p() + j4) / 86400000;
                            v2h v2hVar = (v2h) t2hVar6.e();
                            if (TextUtils.isEmpty("_dbg")) {
                                w3hVar3 = w3hVar;
                            } else {
                                Iterator it4 = v2hVar.t().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        e3h e3hVar18 = (e3h) it4.next();
                                        w3hVar3 = w3hVar;
                                        if ("_dbg".equals(e3hVar18.s())) {
                                            iS0 = !l2.equals(Long.valueOf(e3hVar18.w())) ? g0().S0(((z3h) oa5Var3.b).r(), t2hVar6.n()) : 1;
                                        } else {
                                            w3hVar = w3hVar3;
                                        }
                                    } else {
                                        w3hVar3 = w3hVar;
                                    }
                                }
                            }
                            if (iS0 <= 0) {
                                v().x.c(t2hVar6.n(), Integer.valueOf(iS0), "Sample rate must be positive. event, rate");
                                arrayList4.add((v2h) t2hVar6.e());
                                u3hVar.Y(i26, t2hVar6);
                            } else {
                                bsg bsgVarB = (bsg) map.get(t2hVar6.n());
                                if (bsgVarB == null) {
                                    j3 = j4;
                                    bsgVarB = h0().a1("events", ((z3h) oa5Var3.b).r(), t2hVar6.n());
                                    if (bsgVarB == null) {
                                        v().x.c(((z3h) oa5Var3.b).r(), t2hVar6.n(), "Event being bundled has no eventAggregate. appId, eventName");
                                        bsgVarB = new bsg(((z3h) oa5Var3.b).r(), t2hVar6.n(), 1L, 1L, 1L, t2hVar6.p(), 0L, null, null, null, null);
                                    }
                                } else {
                                    j3 = j4;
                                }
                                k0();
                                Long l5 = (Long) lch.M0("_eid", (v2h) t2hVar6.e());
                                boolean z7 = l5 != null;
                                if (iS0 == 1) {
                                    arrayList4.add((v2h) t2hVar6.e());
                                    if (z7 && (bsgVarB.i != null || bsgVarB.j != null || bsgVarB.k != null)) {
                                        map.put(t2hVar6.n(), bsgVarB.b(null, null, null));
                                    }
                                    u3hVar.Y(i26, t2hVar6);
                                } else {
                                    if (secureRandomA1.nextInt(iS0) == 0) {
                                        k0();
                                        Long lValueOf2 = Long.valueOf(iS0);
                                        lch.I0(t2hVar6, "_sr", lValueOf2);
                                        arrayList4.add((v2h) t2hVar6.e());
                                        if (z7) {
                                            bsgVarB = bsgVarB.b(null, lValueOf2, null);
                                        }
                                        oa5Var = oa5Var3;
                                        map.put(t2hVar6.n(), new bsg(bsgVarB.a, bsgVarB.b, bsgVarB.c, bsgVarB.d, bsgVarB.e, bsgVarB.f, t2hVar6.p(), Long.valueOf(jP), bsgVarB.i, bsgVarB.j, bsgVarB.k));
                                    } else {
                                        oa5Var = oa5Var3;
                                        Long l6 = bsgVarB.h;
                                        if (l6 != null) {
                                            jQ = l6.longValue();
                                        } else {
                                            l0();
                                            jQ = (j3 + t2hVar6.q()) / 86400000;
                                        }
                                        if (jQ != jP) {
                                            k0();
                                            lch.I0(t2hVar6, "_efs", l2);
                                            k0();
                                            Long lValueOf3 = Long.valueOf(iS0);
                                            lch.I0(t2hVar6, "_sr", lValueOf3);
                                            arrayList4.add((v2h) t2hVar6.e());
                                            if (z7) {
                                                bsgVarB = bsgVarB.b(null, lValueOf3, Boolean.TRUE);
                                            }
                                            map.put(t2hVar6.n(), new bsg(bsgVarB.a, bsgVarB.b, bsgVarB.c, bsgVarB.d, bsgVarB.e, bsgVarB.f, t2hVar6.p(), Long.valueOf(jP), bsgVarB.i, bsgVarB.j, bsgVarB.k));
                                        } else {
                                            if (z7) {
                                                map.put(t2hVar6.n(), bsgVarB.b(l5, null, null));
                                            }
                                            u3hVar.Y(i26, t2hVar6);
                                        }
                                    }
                                    u3hVar.Y(i26, t2hVar6);
                                }
                                i26++;
                                ichVar = this;
                                l = l2;
                                oa5Var3 = oa5Var;
                                w3hVar = w3hVar3;
                            }
                        }
                        oa5Var = oa5Var3;
                        i26++;
                        ichVar = this;
                        l = l2;
                        oa5Var3 = oa5Var;
                        w3hVar = w3hVar3;
                    }
                    w3hVar2 = w3hVar;
                    oa5 oa5Var4 = oa5Var3;
                    if (arrayList4.size() < u3hVar.X()) {
                        u3hVar.c();
                        ((z3h) u3hVar.b).c0();
                        u3hVar.c();
                        ((z3h) u3hVar.b).b0(arrayList4);
                    }
                    Iterator it5 = map.entrySet().iterator();
                    while (it5.hasNext()) {
                        h0().b1("events", (bsg) ((Map.Entry) it5.next()).getValue());
                    }
                    oa5Var3 = oa5Var4;
                } else {
                    w3hVar2 = w3hVar;
                }
                String strR8 = ((z3h) oa5Var3.b).r();
                k1h k1hVarE4 = h0().E1(strR8);
                if (k1hVarE4 == null) {
                    v().g.b(w0h.E0(((z3h) oa5Var3.b).r()), "Bundling raw events w/o app info. appId");
                } else if (u3hVar.X() > 0) {
                    m3h m3hVar = k1hVarE4.a.g;
                    w3h.h(m3hVar);
                    m3hVar.A0();
                    long j5 = k1hVarE4.i;
                    if (j5 != 0) {
                        u3hVar.h(j5);
                    } else {
                        u3hVar.i();
                    }
                    m3h m3hVar2 = k1hVarE4.a.g;
                    w3h.h(m3hVar2);
                    m3hVar2.A0();
                    long j6 = k1hVarE4.h;
                    if (j6 != 0) {
                        j5 = j6;
                    }
                    if (j5 != 0) {
                        u3hVar.d0(j5);
                    } else {
                        u3hVar.e0();
                    }
                    k1hVarE4.h(u3hVar.X());
                    m3h m3hVar3 = k1hVarE4.a.g;
                    w3h.h(m3hVar3);
                    m3hVar3.A0();
                    int i27 = (int) k1hVarE4.F;
                    u3hVar.c();
                    ((z3h) u3hVar.b).l1(i27);
                    m3h m3hVar4 = k1hVarE4.a.g;
                    w3h.h(m3hVar4);
                    m3hVar4.A0();
                    u3hVar.y((int) k1hVarE4.g);
                    k1hVarE4.M(((z3h) u3hVar.b).d2());
                    k1hVarE4.N(((z3h) u3hVar.b).f2());
                    String strV = k1hVarE4.v();
                    if (strV != null) {
                        u3hVar.G(strV);
                    } else {
                        u3hVar.H();
                    }
                    h0().F1(k1hVarE4, false);
                }
                if (u3hVar.X() > 0) {
                    w3hVar2.getClass();
                    if (f0().L0(((z3h) oa5Var3.b).r(), bzg.j1)) {
                        String strO = u3hVar.o();
                        if (!TextUtils.isEmpty(strO) && (k1hVarE1 = h0().E1(strO)) != null) {
                            E().getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            m3h m3hVar5 = k1hVarE1.a.g;
                            w3h.h(m3hVar5);
                            m3hVar5.A0();
                            if (jCurrentTimeMillis - k1hVarE1.J >= f0().I0(strO, bzg.B0)) {
                                List listH1 = h0().h1("");
                                if (!listH1.isEmpty()) {
                                    u3hVar.c();
                                    ((z3h) u3hVar.b).U1(listH1);
                                }
                                List listH2 = h0().h1(strO);
                                if (!listH2.isEmpty()) {
                                    u3hVar.c();
                                    ((z3h) u3hVar.b).U1(listH2);
                                }
                                k1hVarE1.u(jCurrentTimeMillis);
                                h0().F1(k1hVarE1, false);
                            }
                        }
                    }
                    d0h d0hVarM0 = g0().M0(((z3h) oa5Var3.b).r());
                    if (d0hVarM0 != null && d0hVarM0.r()) {
                        long jS = d0hVarM0.s();
                        u3hVar.c();
                        ((z3h) u3hVar.b).S0(jS);
                    } else if (((z3h) oa5Var3.b).G().isEmpty()) {
                        u3hVar.c();
                        ((z3h) u3hVar.b).S0(-1L);
                    } else {
                        v().x.b(w0h.E0(((z3h) oa5Var3.b).r()), "Did not find measurement config or missing version info. appId");
                    }
                    h0().J1((z3h) u3hVar.e(), z6);
                }
                h0().Q0((ArrayList) oa5Var3.c);
                krg krgVarH1 = h0();
                try {
                    krgVarH1.r1().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strR8, strR8});
                } catch (SQLiteException e2) {
                    ((w3h) krgVarH1.b).v().g.c(w0h.E0(strR8), e2, "Failed to remove unused event metadata. appId");
                }
                h0().p1();
                z = true;
            }
            h0().q1();
            return z;
        } catch (Throwable th) {
            h0().q1();
            throw th;
        }
    }

    public final void H(u3h u3hVar, long j, boolean z) {
        och ochVar;
        String str = true != z ? "_lte" : "_se";
        krg krgVar = this.c;
        S(krgVar);
        och ochVarW1 = krgVar.w1(u3hVar.o(), str);
        if (ochVarW1 != null) {
            Object obj = ochVarW1.e;
            String strO = u3hVar.o();
            E().getClass();
            ochVar = new och(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        } else {
            String strO2 = u3hVar.o();
            E().getClass();
            ochVar = new och(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        }
        n4h n4hVarC = p4h.C();
        n4hVarC.c();
        ((p4h) n4hVarC.b).E(str);
        E().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        n4hVarC.c();
        ((p4h) n4hVarC.b).D(jCurrentTimeMillis);
        Object obj2 = ochVar.e;
        long jLongValue = ((Long) obj2).longValue();
        n4hVarC.c();
        ((p4h) n4hVarC.b).H(jLongValue);
        p4h p4hVar = (p4h) n4hVarC.e();
        int iM1 = lch.m1(str, u3hVar);
        if (iM1 >= 0) {
            u3hVar.c();
            ((z3h) u3hVar.b).e0(iM1, p4hVar);
        } else {
            u3hVar.c();
            ((z3h) u3hVar.b).f0(p4hVar);
        }
        if (j > 0) {
            krg krgVar2 = this.c;
            S(krgVar2);
            krgVar2.v1(ochVar);
            v().Z.c(true != z ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean I(t2h t2hVar, t2h t2hVar2) {
        oa7.v("_e".equals(t2hVar.n()));
        k0();
        e3h e3hVarK0 = lch.K0("_sc", (v2h) t2hVar.e());
        String strU = e3hVarK0 == null ? null : e3hVarK0.u();
        k0();
        e3h e3hVarK1 = lch.K0("_pc", (v2h) t2hVar2.e());
        String strU2 = e3hVarK1 != null ? e3hVarK1.u() : null;
        if (strU2 == null || !strU2.equals(strU)) {
            return false;
        }
        oa7.v("_e".equals(t2hVar.n()));
        k0();
        e3h e3hVarK2 = lch.K0("_et", (v2h) t2hVar.e());
        if (e3hVarK2 == null || !e3hVarK2.v() || e3hVarK2.w() <= 0) {
            return true;
        }
        long jW = e3hVarK2.w();
        k0();
        e3h e3hVarK3 = lch.K0("_et", (v2h) t2hVar2.e());
        if (e3hVarK3 != null && e3hVarK3.w() > 0) {
            jW += e3hVarK3.w();
        }
        k0();
        lch.I0(t2hVar2, "_et", Long.valueOf(jW));
        k0();
        lch.I0(t2hVar, "_fr", 1L);
        return true;
    }

    public final void J(t2h t2hVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(t2hVar.h());
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((e3h) arrayList.get(i)).s())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        double dA = t2hVar.j(i).A() * 1000000.0d;
        if (dA == 0.0d) {
            dA = t2hVar.j(i).w() * 1000000.0d;
        }
        if (dA > 9.223372036854776E18d || dA < -9.223372036854776E18d) {
            v().x.c(w0h.E0(str2), Double.valueOf(dA), ib8.j("Data lost. Purchase ", str, " is too big. appId"));
            return;
        }
        t2hVar.m(i);
        d3h d3hVarD = e3h.D();
        d3hVarD.h(str);
        d3hVarD.j(Math.round(dA));
        t2hVar.k((e3h) d3hVarD.e());
    }

    public final boolean K() {
        Z().A0();
        m0();
        krg krgVar = this.c;
        S(krgVar);
        if (krgVar.W0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        krg krgVar2 = this.c;
        S(krgVar2);
        return !TextUtils.isEmpty(krgVar2.I0());
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0377  */
    /* JADX WARN: Code duplicated, block: B:116:0x0399  */
    /* JADX WARN: Code duplicated, block: B:15:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0203  */
    /* JADX WARN: Code duplicated, block: B:66:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x026e  */
    /* JADX WARN: Code duplicated, block: B:72:0x027e  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0343  */
    public final void L() {
        boolean z;
        long jMax;
        long jMax2;
        int i;
        g1h g1hVar;
        q1h q1hVarI0;
        ich ichVar;
        long jA;
        long jMax3;
        long jCurrentTimeMillis;
        mbh mbhVar;
        w0h w0hVar;
        Context context;
        JobInfo jobInfoBuild;
        JobScheduler jobScheduler;
        Method method;
        int iIntValue;
        xah xahVar;
        xah xahVar2;
        lch lchVar = this.g;
        Z().A0();
        m0();
        if (this.Z > 0) {
            E().getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.Z);
            if (jAbs > 0) {
                v().Z.b(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
                i0().b();
                mbh mbhVar2 = this.e;
                S(mbhVar2);
                mbhVar2.E0();
                return;
            }
            this.Z = 0L;
        }
        if (!this.z.c() || !K()) {
            v().Z.a("Nothing to upload or uploading impossible");
            i0().b();
            mbh mbhVar3 = this.e;
            S(mbhVar3);
            mbhVar3.E0();
            return;
        }
        E().getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        f0();
        long jMax4 = Math.max(0L, ((Long) bzg.O.a(null)).longValue());
        krg krgVar = this.c;
        S(krgVar);
        if (krgVar.W0("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z = true;
        } else {
            krg krgVar2 = this.c;
            S(krgVar2);
            if (krgVar2.W0("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            String strE0 = f0().E0("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strE0) || ".none.".equals(strE0)) {
                f0();
                jMax = Math.max(0L, ((Long) bzg.I.a(null)).longValue());
            } else {
                f0();
                jMax = Math.max(0L, ((Long) bzg.J.a(null)).longValue());
            }
        } else {
            f0();
            jMax = Math.max(0L, ((Long) bzg.H.a(null)).longValue());
        }
        long jA2 = this.w.w.a();
        long jA3 = this.w.x.a();
        krg krgVar3 = this.c;
        S(krgVar3);
        long jX0 = krgVar3.X0("select max(bundle_end_timestamp) from queue", null, 0L);
        krg krgVar4 = this.c;
        S(krgVar4);
        long jMax5 = Math.max(jX0, krgVar4.X0("select max(timestamp) from raw_events", null, 0L));
        if (jMax5 != 0) {
            long jAbs2 = jCurrentTimeMillis2 - Math.abs(jMax5 - jCurrentTimeMillis2);
            long jAbs3 = jCurrentTimeMillis2 - Math.abs(jA2 - jCurrentTimeMillis2);
            long jAbs4 = jCurrentTimeMillis2 - Math.abs(jA3 - jCurrentTimeMillis2);
            long jMin = jMax4 + jAbs2;
            long jMax6 = Math.max(jAbs3, jAbs4);
            if (z && jMax6 > 0) {
                jMin = Math.min(jAbs2, jMax6) + jMax;
            }
            S(lchVar);
            jMax2 = !lchVar.i1(jMax6, jMax) ? jMax6 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    f0();
                    i = 0;
                    if (i2 >= Math.min(20, Math.max(0, ((Integer) bzg.Q.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    f0();
                    jMax2 += Math.max(0L, ((Long) bzg.P.a(null)).longValue()) * (1 << i2);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (jMax2 == 0) {
                v().Z.a("Next upload time is 0");
                i0().b();
                mbh mbhVar4 = this.e;
                S(mbhVar4);
                mbhVar4.E0();
                return;
            }
            g1hVar = this.b;
            S(g1hVar);
            if (g1hVar.E0()) {
                v().Z.a("No network");
                q1hVarI0 = i0();
                ichVar = (ich) q1hVarI0.d;
                ichVar.m0();
                ichVar.Z().A0();
                if (!q1hVarI0.b) {
                    ichVar.z.a.registerReceiver(q1hVarI0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    g1h g1hVar2 = ichVar.b;
                    S(g1hVar2);
                    q1hVarI0.c = g1hVar2.E0();
                    ichVar.v().Z.b(Boolean.valueOf(q1hVarI0.c), "Registering connectivity change receiver. Network connected");
                    q1hVarI0.b = true;
                }
                mbh mbhVar5 = this.e;
                S(mbhVar5);
                mbhVar5.E0();
                return;
            }
            jA = this.w.v.a();
            f0();
            jMax3 = Math.max(0L, ((Long) bzg.G.a(null)).longValue());
            S(lchVar);
            if (!lchVar.i1(jA, jMax3)) {
                jMax2 = Math.max(jMax2, jA + jMax3);
            }
            i0().b();
            E().getClass();
            jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                f0();
                jCurrentTimeMillis = Math.max(0L, ((Long) bzg.K.a(null)).longValue());
                v vVar = this.w.w;
                E().getClass();
                vVar.b(System.currentTimeMillis());
            }
            v().Z.b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
            mbhVar = this.e;
            S(mbhVar);
            mbhVar.B0();
            w3h w3hVar = (w3h) mbhVar.b;
            w3hVar.getClass();
            w0hVar = w3hVar.f;
            context = w3hVar.a;
            if (!qch.w1(context)) {
                w3h.h(w0hVar);
                w0hVar.Y.a("Receiver not registered/enabled");
            }
            if (!qch.V0(context)) {
                w3h.h(w0hVar);
                w0hVar.Y.a("Service not registered/enabled");
            }
            mbhVar.E0();
            w3h.h(w0hVar);
            w0hVar.Z.b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
            w3hVar.y.getClass();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis < Math.max(0L, ((Long) bzg.L.a(null)).longValue())) {
                xahVar = mbhVar.f;
                if (xahVar == null) {
                    xah xahVar3 = new xah(mbhVar, mbhVar.c.z, 1);
                    mbhVar.f = xahVar3;
                    xahVar = xahVar3;
                }
                if (xahVar.c == 0) {
                    xahVar2 = mbhVar.f;
                    if (xahVar2 == null) {
                        xah xahVar4 = new xah(mbhVar, mbhVar.c.z, 1);
                        mbhVar.f = xahVar4;
                        xahVar2 = xahVar4;
                    }
                    xahVar2.b(jCurrentTimeMillis);
                }
            }
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iG0 = mbhVar.G0();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            jobInfoBuild = new JobInfo.Builder(iG0, componentName).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle).build();
            Method method2 = ttg.a;
            jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            method = ttg.a;
            if (method != null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(jobInfoBuild);
            }
            Method method3 = ttg.b;
            if (method3 != null) {
                try {
                    Integer num = (Integer) method3.invoke(UserHandle.class, null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i;
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        b1.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                    }
                }
            } else {
                iIntValue = i;
            }
            try {
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                b1.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                jobScheduler.schedule(jobInfoBuild);
                return;
            }
        }
        jMax2 = 0;
        i = 0;
        if (jMax2 == 0) {
            v().Z.a("Next upload time is 0");
            i0().b();
            mbh mbhVar6 = this.e;
            S(mbhVar6);
            mbhVar6.E0();
            return;
        }
        g1hVar = this.b;
        S(g1hVar);
        if (g1hVar.E0()) {
            v().Z.a("No network");
            q1hVarI0 = i0();
            ichVar = (ich) q1hVarI0.d;
            ichVar.m0();
            ichVar.Z().A0();
            if (!q1hVarI0.b) {
                ichVar.z.a.registerReceiver(q1hVarI0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                g1h g1hVar3 = ichVar.b;
                S(g1hVar3);
                q1hVarI0.c = g1hVar3.E0();
                ichVar.v().Z.b(Boolean.valueOf(q1hVarI0.c), "Registering connectivity change receiver. Network connected");
                q1hVarI0.b = true;
            }
            mbh mbhVar7 = this.e;
            S(mbhVar7);
            mbhVar7.E0();
            return;
        }
        jA = this.w.v.a();
        f0();
        jMax3 = Math.max(0L, ((Long) bzg.G.a(null)).longValue());
        S(lchVar);
        if (!lchVar.i1(jA, jMax3)) {
            jMax2 = Math.max(jMax2, jA + jMax3);
        }
        i0().b();
        E().getClass();
        jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            f0();
            jCurrentTimeMillis = Math.max(0L, ((Long) bzg.K.a(null)).longValue());
            v vVar2 = this.w.w;
            E().getClass();
            vVar2.b(System.currentTimeMillis());
        }
        v().Z.b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
        mbhVar = this.e;
        S(mbhVar);
        mbhVar.B0();
        w3h w3hVar2 = (w3h) mbhVar.b;
        w3hVar2.getClass();
        w0hVar = w3hVar2.f;
        context = w3hVar2.a;
        if (!qch.w1(context)) {
            w3h.h(w0hVar);
            w0hVar.Y.a("Receiver not registered/enabled");
        }
        if (!qch.V0(context)) {
            w3h.h(w0hVar);
            w0hVar.Y.a("Service not registered/enabled");
        }
        mbhVar.E0();
        w3h.h(w0hVar);
        w0hVar.Z.b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
        w3hVar2.y.getClass();
        SystemClock.elapsedRealtime();
        if (jCurrentTimeMillis < Math.max(0L, ((Long) bzg.L.a(null)).longValue())) {
            xahVar = mbhVar.f;
            if (xahVar == null) {
                xah xahVar5 = new xah(mbhVar, mbhVar.c.z, 1);
                mbhVar.f = xahVar5;
                xahVar = xahVar5;
            }
            if (xahVar.c == 0) {
                xahVar2 = mbhVar.f;
                if (xahVar2 == null) {
                    xah xahVar6 = new xah(mbhVar, mbhVar.c.z, 1);
                    mbhVar.f = xahVar6;
                    xahVar2 = xahVar6;
                }
                xahVar2.b(jCurrentTimeMillis);
            }
        }
        ComponentName componentName2 = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iG1 = mbhVar.G0();
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("action", "com.google.android.gms.measurement.UPLOAD");
        jobInfoBuild = new JobInfo.Builder(iG1, componentName2).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle2).build();
        Method method4 = ttg.a;
        jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        method = ttg.a;
        if (method != null) {
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    public final void M() {
        Z().A0();
        if (this.I0 || this.J0 || this.K0) {
            v().Z.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.I0), Boolean.valueOf(this.J0), Boolean.valueOf(this.K0));
            return;
        }
        v().Z.a("Stopping uploading service(s)");
        ArrayList arrayList = this.E0;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.E0;
        oa7.A(arrayList2);
        arrayList2.clear();
    }

    public final Boolean N(k1h k1hVar) {
        try {
            long jQ = k1hVar.Q();
            w3h w3hVar = this.z;
            if (jQ != -2147483648L) {
                if (k1hVar.Q() == rcg.a(w3hVar.a).b(0, k1hVar.E()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = rcg.a(w3hVar.a).b(0, k1hVar.E()).versionName;
                String strO = k1hVar.O();
                if (strO != null && strO.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final ndh O(String str) {
        krg krgVar = this.c;
        S(krgVar);
        k1h k1hVarE1 = krgVar.E1(str);
        if (k1hVarE1 != null) {
            w3h w3hVar = k1hVarE1.a;
            if (!TextUtils.isEmpty(k1hVarE1.O())) {
                Boolean boolN = N(k1hVarE1);
                if (boolN != null && !boolN.booleanValue()) {
                    v().g.b(w0h.E0(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strH = k1hVarE1.H();
                String strO = k1hVarE1.O();
                long jQ = k1hVarE1.Q();
                m3h m3hVar = w3hVar.g;
                w3h.h(m3hVar);
                m3hVar.A0();
                String str2 = k1hVarE1.l;
                m3h m3hVar2 = w3hVar.g;
                w3h.h(m3hVar2);
                m3hVar2.A0();
                long j = k1hVarE1.m;
                m3h m3hVar3 = w3hVar.g;
                w3h.h(m3hVar3);
                m3hVar3.A0();
                long j2 = k1hVarE1.n;
                m3h m3hVar4 = w3hVar.g;
                w3h.h(m3hVar4);
                m3hVar4.A0();
                boolean z = k1hVarE1.o;
                String strK = k1hVarE1.K();
                m3h m3hVar5 = w3hVar.g;
                w3h.h(m3hVar5);
                m3hVar5.A0();
                boolean z2 = k1hVarE1.p;
                Boolean boolX = k1hVarE1.x();
                long jB = k1hVarE1.b();
                m3h m3hVar6 = w3hVar.g;
                w3h.h(m3hVar6);
                m3hVar6.A0();
                ArrayList arrayList = k1hVarE1.s;
                String strG = a(str).g();
                boolean z3 = k1hVarE1.z();
                m3h m3hVar7 = w3hVar.g;
                w3h.h(m3hVar7);
                m3hVar7.A0();
                long j3 = k1hVarE1.v;
                int i = a(str).b;
                String str3 = p0(str).b;
                m3h m3hVar8 = w3hVar.g;
                w3h.h(m3hVar8);
                m3hVar8.A0();
                int i2 = k1hVarE1.x;
                m3h m3hVar9 = w3hVar.g;
                w3h.h(m3hVar9);
                m3hVar9.A0();
                return new ndh(str, strH, strO, jQ, str2, j, j2, (String) null, z, false, strK, 0L, 0, z2, false, boolX, jB, (List) arrayList, strG, "", (String) null, z3, j3, i, str3, i2, k1hVarE1.B, k1hVarE1.D(), k1hVarE1.s(), 0L, k1hVarE1.t(), 0L);
            }
        }
        v().Y.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean P(String str, String str2) {
        krg krgVar = this.c;
        S(krgVar);
        bsg bsgVarA1 = krgVar.a1("events", str, str2);
        return bsgVarA1 == null || bsgVarA1.c < 1;
    }

    public final void U() {
        Z().A0();
        m0();
        if (this.Y) {
            return;
        }
        this.Y = true;
        Z().A0();
        FileLock fileLock = this.L0;
        w3h w3hVar = this.z;
        if (fileLock == null || !fileLock.isValid()) {
            qqg qqgVar = ((w3h) this.c.b).d;
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(w3hVar.a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.M0 = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.L0 = fileLockTryLock;
                if (fileLockTryLock == null) {
                    v().g.a("Storage concurrent data access panic");
                    return;
                }
                v().Z.a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                v().g.b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                v().g.b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                v().x.b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            v().Z.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.M0;
        Z().A0();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            v().g.a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i2 = fileChannel.read(byteBufferAllocate);
                if (i2 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i2 != -1) {
                    v().x.b(Integer.valueOf(i2), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                v().g.b(e4, "Failed to read from channel");
            }
        }
        xzg xzgVarL = w3hVar.l();
        xzgVarL.B0();
        int i3 = xzgVarL.f;
        Z().A0();
        if (i > i3) {
            v().g.c(Integer.valueOf(i), Integer.valueOf(i3), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i < i3) {
            FileChannel fileChannel2 = this.M0;
            Z().A0();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                v().g.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i3);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        v().g.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    v().Z.c(Integer.valueOf(i), Integer.valueOf(i3), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e5) {
                    v().g.b(e5, "Failed to write to channel");
                }
            }
            v().g.c(Integer.valueOf(i), Integer.valueOf(i3), "Storage version upgrade failed. Previous, current version");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    public final void V(mch mchVar, ndh ndhVar) {
        bsg bsgVarA1;
        long jLongValue;
        Z().A0();
        m0();
        boolean zR = R(ndhVar);
        String str = ndhVar.a;
        if (zR) {
            if (!ndhVar.v) {
                d0(ndhVar);
                return;
            }
            qch qchVarL0 = l0();
            String str2 = mchVar.b;
            int iK1 = qchVarL0.K1(str2);
            yea yeaVar = this.Y0;
            if (iK1 != 0) {
                l0();
                f0();
                String strH0 = qch.H0(24, str2, true);
                int length = str2 != null ? str2.length() : 0;
                l0();
                qch.S0(yeaVar, ndhVar.a, iK1, "_ev", strH0, length);
                return;
            }
            int iP0 = l0().P0(mchVar.c(), str2);
            if (iP0 != 0) {
                l0();
                f0();
                String strH1 = qch.H0(24, str2, true);
                Object objC = mchVar.c();
                int length2 = (objC == null || !((objC instanceof String) || (objC instanceof CharSequence))) ? 0 : objC.toString().length();
                l0();
                qch.S0(yeaVar, ndhVar.a, iP0, "_ev", strH1, length2);
                return;
            }
            Object objQ0 = l0().Q0(mchVar.c(), str2);
            if (objQ0 != null) {
                String str3 = "_sid";
                if ("_sid".equals(str2)) {
                    long j = mchVar.c;
                    String str4 = mchVar.f;
                    oa7.A(str);
                    krg krgVar = this.c;
                    S(krgVar);
                    och ochVarW1 = krgVar.w1(str, "_sno");
                    if (ochVarW1 != null) {
                        Object obj = ochVarW1.e;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (ochVarW1 != null) {
                                v().x.b(ochVarW1.e, "Retrieved last session number from database does not contain a valid (long) value");
                            }
                            krg krgVar2 = this.c;
                            S(krgVar2);
                            bsgVarA1 = krgVar2.a1("events", str, "_s");
                            if (bsgVarA1 != null) {
                                tz0 tz0Var = v().Z;
                                long j2 = bsgVarA1.c;
                                tz0Var.b(Long.valueOf(j2), "Backfill the session number. Last used session number");
                                jLongValue = j2;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (ochVarW1 != null) {
                            v().x.b(ochVarW1.e, "Retrieved last session number from database does not contain a valid (long) value");
                        }
                        krg krgVar3 = this.c;
                        S(krgVar3);
                        bsgVarA1 = krgVar3.a1("events", str, "_s");
                        if (bsgVarA1 != null) {
                            tz0 tz0Var2 = v().Z;
                            long j3 = bsgVarA1.c;
                            tz0Var2.b(Long.valueOf(j3), "Backfill the session number. Last used session number");
                            jLongValue = j3;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    V(new mch(j, Long.valueOf(jLongValue + 1), "_sno", str4), ndhVar);
                } else {
                    str3 = "_sid";
                }
                oa7.A(str);
                String str5 = mchVar.f;
                oa7.A(str5);
                och ochVar = new och(str, str5, str2, mchVar.c, objQ0);
                tz0 tz0Var3 = v().Z;
                w3h w3hVar = this.z;
                i0h i0hVar = w3hVar.x;
                String str6 = ochVar.c;
                tz0Var3.c(i0hVar.c(str6), objQ0, "Setting user property");
                krg krgVar4 = this.c;
                S(krgVar4);
                krgVar4.o1();
                try {
                    boolean zEquals = "_id".equals(str6);
                    Object obj2 = ochVar.e;
                    if (zEquals) {
                        krg krgVar5 = this.c;
                        S(krgVar5);
                        och ochVarW2 = krgVar5.w1(str, "_id");
                        if (ochVarW2 != null && !obj2.equals(ochVarW2.e)) {
                            krg krgVar6 = this.c;
                            S(krgVar6);
                            krgVar6.u1(str, "_lair");
                        }
                    }
                    d0(ndhVar);
                    krg krgVar7 = this.c;
                    S(krgVar7);
                    boolean zV1 = krgVar7.v1(ochVar);
                    if (str3.equals(str2)) {
                        lch lchVar = this.g;
                        S(lchVar);
                        String str7 = ndhVar.J0;
                        long jJ1 = TextUtils.isEmpty(str7) ? 0L : lchVar.j1(str7.getBytes(StandardCharsets.UTF_8));
                        krg krgVar8 = this.c;
                        S(krgVar8);
                        k1h k1hVarE1 = krgVar8.E1(str);
                        if (k1hVarE1 != null) {
                            k1hVarE1.B(jJ1);
                            if (k1hVarE1.o()) {
                                krg krgVar9 = this.c;
                                S(krgVar9);
                                krgVar9.F1(k1hVarE1, false);
                            }
                        }
                    }
                    krg krgVar10 = this.c;
                    S(krgVar10);
                    krgVar10.p1();
                    if (!zV1) {
                        v().g.c(w3hVar.x.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        l0();
                        qch.S0(yeaVar, str, 9, null, null, 0);
                    }
                } finally {
                    krg krgVar11 = this.c;
                    S(krgVar11);
                    krgVar11.q1();
                }
            }
        }
    }

    public final void W(String str, ndh ndhVar) {
        Z().A0();
        m0();
        boolean zR = R(ndhVar);
        String str2 = ndhVar.a;
        if (zR) {
            if (!ndhVar.v) {
                d0(ndhVar);
                return;
            }
            Boolean boolT = T(ndhVar);
            if ("_npa".equals(str) && boolT != null) {
                v().Y.a("Falling back to manifest metadata value for ad personalization");
                E().getClass();
                V(new mch(System.currentTimeMillis(), Long.valueOf(true != boolT.booleanValue() ? 0L : 1L), "_npa", "auto"), ndhVar);
                return;
            }
            tz0 tz0Var = v().Y;
            w3h w3hVar = this.z;
            tz0Var.b(w3hVar.x.c(str), "Removing user property");
            krg krgVar = this.c;
            S(krgVar);
            krgVar.o1();
            try {
                d0(ndhVar);
                if ("_id".equals(str)) {
                    krg krgVar2 = this.c;
                    S(krgVar2);
                    oa7.A(str2);
                    krgVar2.u1(str2, "_lair");
                }
                krg krgVar3 = this.c;
                S(krgVar3);
                oa7.A(str2);
                krgVar3.u1(str2, str);
                krg krgVar4 = this.c;
                S(krgVar4);
                krgVar4.p1();
                v().Y.b(w3hVar.x.c(str), "User property removed");
            } finally {
                krg krgVar5 = this.c;
                S(krgVar5);
                krgVar5.q1();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02c6 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ea A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0320 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0328 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x032e A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x033b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0341 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x034c A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0352  */
    /* JADX WARN: Code duplicated, block: B:132:0x035b  */
    /* JADX WARN: Code duplicated, block: B:133:0x035e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0371  */
    /* JADX WARN: Code duplicated, block: B:142:0x0393 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x039b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a9 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x03b2 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x03de A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0413 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x043c A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0443 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0144 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x014b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0158 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0163 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x016f A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0188 A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b4  */
    public final void X(ndh ndhVar) {
        long j;
        long j2;
        long j3;
        long j4;
        krg krgVar;
        bsg bsgVarA1;
        boolean z;
        long j5;
        long j6;
        Bundle bundle;
        long j7;
        w3h w3hVar;
        w3h w3hVar2;
        String str;
        String str2;
        String str3;
        Bundle bundle2;
        long j8;
        String str4;
        long jO0;
        w3h w3hVar3;
        PackageInfo packageInfoB;
        ndh ndhVar2;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfoA;
        long j9;
        long j10;
        boolean z2;
        long j11;
        long j12;
        long jElapsedRealtime;
        w3h w3hVar4 = this.z;
        Z().A0();
        m0();
        oa7.A(ndhVar);
        boolean z3 = ndhVar.Z;
        String str5 = ndhVar.a;
        oa7.x(str5);
        if (R(ndhVar)) {
            krg krgVar2 = this.c;
            S(krgVar2);
            k1h k1hVarE1 = krgVar2.E1(str5);
            if (k1hVarE1 != null && TextUtils.isEmpty(k1hVarE1.H()) && !TextUtils.isEmpty(ndhVar.b)) {
                k1hVarE1.f(0L);
                krg krgVar3 = this.c;
                S(krgVar3);
                krgVar3.F1(k1hVarE1, false);
                y2h y2hVar = this.a;
                S(y2hVar);
                y2hVar.A0();
                y2hVar.x.remove(str5);
            }
            if (!ndhVar.v) {
                d0(ndhVar);
                return;
            }
            long j13 = ndhVar.z;
            qqg qqgVarF0 = f0();
            azg azgVar = bzg.e1;
            long j14 = qqgVarF0.L0(null, azgVar) ? ndhVar.U0 : 0L;
            if (j13 == 0) {
                E().getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (f0().L0(null, azgVar)) {
                    E().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                j2 = jCurrentTimeMillis;
                j = jElapsedRealtime;
            } else {
                j = j14;
                j2 = j13;
            }
            int i = ndhVar.X;
            if (i != 0 && i != 1) {
                v().x.c(w0h.E0(str5), Integer.valueOf(i), "Incorrect app type, assuming installed app. appId, appType");
                i = 0;
            }
            krg krgVar4 = this.c;
            S(krgVar4);
            krgVar4.o1();
            try {
                krg krgVar5 = this.c;
                S(krgVar5);
                och ochVarW1 = krgVar5.w1(str5, "_npa");
                Boolean boolT = T(ndhVar);
                if (ochVarW1 != null) {
                    j3 = 1;
                    if (!"auto".equals(ochVarW1.b)) {
                        j4 = j2;
                    }
                    if (f0().L0(null, bzg.W0)) {
                        c0(ndhVar, ndhVar.S0);
                    } else {
                        c0(ndhVar, j4);
                    }
                    d0(ndhVar);
                    krgVar = this.c;
                    if (i == 0) {
                        S(krgVar);
                        bsgVarA1 = krgVar.a1("events", str5, "_f");
                        z = false;
                    } else {
                        S(krgVar);
                        bsgVarA1 = krgVar.a1("events", str5, "_v");
                        z = true;
                    }
                    if (bsgVarA1 == null) {
                        j6 = ((j4 / 3600000) + j3) * 3600000;
                        if (z) {
                            Long lValueOf = Long.valueOf(j6);
                            long j15 = j4;
                            V(new mch(j15, lValueOf, "_fvt", "auto"), ndhVar);
                            Z().A0();
                            m0();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z3) {
                                bundle.putLong("_dac", 1L);
                            }
                            E().getClass();
                            bundle.putLong("_elt", System.currentTimeMillis());
                            d(new hsg("_v", new esg(bundle), "auto", j15, j), ndhVar);
                        } else {
                            Long lValueOf2 = Long.valueOf(j6);
                            j7 = j4;
                            V(new mch(j7, lValueOf2, "_fot", "auto"), ndhVar);
                            Z().A0();
                            ysd ysdVar = this.y;
                            oa7.A(ysdVar);
                            w3hVar = (w3h) ysdVar.b;
                            if (str5 != null || str5.isEmpty()) {
                                w3hVar2 = w3hVar4;
                                str = "_elt";
                                str2 = str5;
                                str3 = "_et";
                                w0h w0hVar = w3hVar.f;
                                w3h.h(w0hVar);
                                w0hVar.y.a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                str3 = "_et";
                                m3h m3hVar = w3hVar.g;
                                w0h w0hVar2 = w3hVar.f;
                                str = "_elt";
                                Context context = w3hVar.a;
                                w3h.h(m3hVar);
                                m3hVar.A0();
                                if (ysdVar.m()) {
                                    f2h f2hVar = new f2h(ysdVar, str5);
                                    m3h m3hVar2 = w3hVar.g;
                                    w3h.h(m3hVar2);
                                    m3hVar2.A0();
                                    w3hVar2 = w3hVar4;
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    str2 = str5;
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = context.getPackageManager();
                                    if (packageManager == null) {
                                        w3h.h(w0hVar2);
                                        w0hVar2.y.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                            w3h.h(w0hVar2);
                                            w0hVar2.X.a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str6 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str6) && ysdVar.m()) {
                                                    try {
                                                        boolean zA = jk2.b().a(context, new Intent(intent), f2hVar, 1);
                                                        w3h.h(w0hVar2);
                                                        w0hVar2.Z.b(zA ? "available" : "not available", "Install Referrer Service is");
                                                    } catch (RuntimeException e) {
                                                        w0h w0hVar3 = w3hVar.f;
                                                        w3h.h(w0hVar3);
                                                        w0hVar3.g.b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                    }
                                                } else {
                                                    w3h.h(w0hVar2);
                                                    w0hVar2.x.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    w3h.h(w0hVar2);
                                    w0hVar2.X.a("Install Referrer Reporter is not available");
                                    w3hVar2 = w3hVar4;
                                    str2 = str5;
                                }
                            }
                            Z().A0();
                            m0();
                            bundle2 = new Bundle();
                            j8 = j3;
                            bundle2.putLong("_c", j8);
                            bundle2.putLong("_r", j8);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong(str3, j8);
                            if (z3) {
                                bundle2.putLong("_dac", j8);
                            }
                            oa7.A(str2);
                            krg krgVar6 = this.c;
                            S(krgVar6);
                            oa7.x(str2);
                            krgVar6.A0();
                            krgVar6.B0();
                            str4 = str2;
                            jO0 = krgVar6.O0(str4);
                            w3hVar3 = w3hVar2;
                            if (w3hVar3.a.getPackageManager() == null) {
                                v().g.b(w0h.E0(str4), "PackageManager is null, first open report might be inaccurate. appId");
                                ndhVar2 = ndhVar;
                            } else {
                                try {
                                    packageInfoB = rcg.a(w3hVar3.a).b(0, str4);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    v().g.c(w0h.E0(str4), e2, "Package info is null, first open report might be inaccurate. appId");
                                    packageInfoB = null;
                                }
                                if (packageInfoB != null) {
                                    j10 = packageInfoB.firstInstallTime;
                                    if (j10 != 0) {
                                        if (j10 != packageInfoB.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!f0().L0(null, bzg.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jO0 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jO0 = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j11 = 0;
                                        } else {
                                            j11 = 1;
                                        }
                                        mch mchVar = new mch(j7, Long.valueOf(j11), "_fi", "auto");
                                        ndhVar2 = ndhVar;
                                        V(mchVar, ndhVar2);
                                    } else {
                                        ndhVar2 = ndhVar;
                                        applicationInfo = null;
                                    }
                                } else {
                                    ndhVar2 = ndhVar;
                                    applicationInfo = null;
                                }
                                try {
                                    applicationInfoA = rcg.a(w3hVar3.a).a(0, str4);
                                } catch (PackageManager.NameNotFoundException e3) {
                                    v().g.c(w0h.E0(str4), e3, "Application info is null, first open report might be inaccurate. appId");
                                    applicationInfoA = applicationInfo;
                                }
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j9 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j9 = 1;
                                    }
                                    if ((applicationInfoA.flags & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        bundle2.putLong("_sysu", j9);
                                    }
                                }
                            }
                            j12 = jO0;
                            if (j12 >= 0) {
                                bundle2.putLong("_pfo", j12);
                            }
                            E().getClass();
                            bundle2.putLong(str, System.currentTimeMillis());
                            d(new hsg("_f", new esg(bundle2), "auto", j7, j), ndhVar2);
                        }
                    } else {
                        j5 = j4;
                        if (ndhVar.w) {
                            d(new hsg("_cd", new esg(new Bundle()), "auto", j5, 0L), ndhVar);
                        }
                    }
                    krg krgVar7 = this.c;
                    S(krgVar7);
                    krgVar7.p1();
                    krg krgVar8 = this.c;
                    S(krgVar8);
                    krgVar8.q1();
                }
                j3 = 1;
                if (boolT != null) {
                    mch mchVar2 = new mch(j2, Long.valueOf(true != boolT.booleanValue() ? 0L : j3), "_npa", "auto");
                    j4 = j2;
                    if (ochVarW1 == null || !ochVarW1.e.equals(mchVar2.d)) {
                        V(mchVar2, ndhVar);
                    }
                } else {
                    j4 = j2;
                    if (ochVarW1 != null) {
                        W("_npa", ndhVar);
                    }
                }
                if (f0().L0(null, bzg.W0)) {
                    c0(ndhVar, ndhVar.S0);
                } else {
                    c0(ndhVar, j4);
                }
                d0(ndhVar);
                krgVar = this.c;
                if (i == 0) {
                    S(krgVar);
                    bsgVarA1 = krgVar.a1("events", str5, "_f");
                    z = false;
                } else {
                    S(krgVar);
                    bsgVarA1 = krgVar.a1("events", str5, "_v");
                    z = true;
                }
                if (bsgVarA1 == null) {
                    j6 = ((j4 / 3600000) + j3) * 3600000;
                    if (z) {
                        Long lValueOf3 = Long.valueOf(j6);
                        j7 = j4;
                        V(new mch(j7, lValueOf3, "_fot", "auto"), ndhVar);
                        Z().A0();
                        ysd ysdVar2 = this.y;
                        oa7.A(ysdVar2);
                        w3hVar = (w3h) ysdVar2.b;
                        if (str5 != null) {
                            w3hVar2 = w3hVar4;
                            str = "_elt";
                            str2 = str5;
                            str3 = "_et";
                            w0h w0hVar4 = w3hVar.f;
                            w3h.h(w0hVar4);
                            w0hVar4.y.a("Install Referrer Reporter was called with invalid app package name");
                            Z().A0();
                            m0();
                            bundle2 = new Bundle();
                            j8 = j3;
                            bundle2.putLong("_c", j8);
                            bundle2.putLong("_r", j8);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong(str3, j8);
                            if (z3) {
                                bundle2.putLong("_dac", j8);
                            }
                            oa7.A(str2);
                            krg krgVar9 = this.c;
                            S(krgVar9);
                            oa7.x(str2);
                            krgVar9.A0();
                            krgVar9.B0();
                            str4 = str2;
                            jO0 = krgVar9.O0(str4);
                            w3hVar3 = w3hVar2;
                            if (w3hVar3.a.getPackageManager() == null) {
                                v().g.b(w0h.E0(str4), "PackageManager is null, first open report might be inaccurate. appId");
                                ndhVar2 = ndhVar;
                            } else {
                                packageInfoB = rcg.a(w3hVar3.a).b(0, str4);
                                if (packageInfoB != null) {
                                    j10 = packageInfoB.firstInstallTime;
                                    if (j10 != 0) {
                                        if (j10 != packageInfoB.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!f0().L0(null, bzg.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jO0 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jO0 = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j11 = 0;
                                        } else {
                                            j11 = 1;
                                        }
                                        mch mchVar3 = new mch(j7, Long.valueOf(j11), "_fi", "auto");
                                        ndhVar2 = ndhVar;
                                        V(mchVar3, ndhVar2);
                                    } else {
                                        ndhVar2 = ndhVar;
                                        applicationInfo = null;
                                    }
                                } else {
                                    ndhVar2 = ndhVar;
                                    applicationInfo = null;
                                }
                                applicationInfoA = rcg.a(w3hVar3.a).a(0, str4);
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j9 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j9 = 1;
                                    }
                                    if ((applicationInfoA.flags & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        bundle2.putLong("_sysu", j9);
                                    }
                                }
                            }
                            j12 = jO0;
                            if (j12 >= 0) {
                                bundle2.putLong("_pfo", j12);
                            }
                            E().getClass();
                            bundle2.putLong(str, System.currentTimeMillis());
                            d(new hsg("_f", new esg(bundle2), "auto", j7, j), ndhVar2);
                        } else {
                            w3hVar2 = w3hVar4;
                            str = "_elt";
                            str2 = str5;
                            str3 = "_et";
                            w0h w0hVar5 = w3hVar.f;
                            w3h.h(w0hVar5);
                            w0hVar5.y.a("Install Referrer Reporter was called with invalid app package name");
                            Z().A0();
                            m0();
                            bundle2 = new Bundle();
                            j8 = j3;
                            bundle2.putLong("_c", j8);
                            bundle2.putLong("_r", j8);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong(str3, j8);
                            if (z3) {
                                bundle2.putLong("_dac", j8);
                            }
                            oa7.A(str2);
                            krg krgVar10 = this.c;
                            S(krgVar10);
                            oa7.x(str2);
                            krgVar10.A0();
                            krgVar10.B0();
                            str4 = str2;
                            jO0 = krgVar10.O0(str4);
                            w3hVar3 = w3hVar2;
                            if (w3hVar3.a.getPackageManager() == null) {
                                v().g.b(w0h.E0(str4), "PackageManager is null, first open report might be inaccurate. appId");
                                ndhVar2 = ndhVar;
                            } else {
                                packageInfoB = rcg.a(w3hVar3.a).b(0, str4);
                                if (packageInfoB != null) {
                                    j10 = packageInfoB.firstInstallTime;
                                    if (j10 != 0) {
                                        if (j10 != packageInfoB.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!f0().L0(null, bzg.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jO0 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jO0 = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j11 = 0;
                                        } else {
                                            j11 = 1;
                                        }
                                        mch mchVar4 = new mch(j7, Long.valueOf(j11), "_fi", "auto");
                                        ndhVar2 = ndhVar;
                                        V(mchVar4, ndhVar2);
                                    } else {
                                        ndhVar2 = ndhVar;
                                        applicationInfo = null;
                                    }
                                } else {
                                    ndhVar2 = ndhVar;
                                    applicationInfo = null;
                                }
                                applicationInfoA = rcg.a(w3hVar3.a).a(0, str4);
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j9 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j9 = 1;
                                    }
                                    if ((applicationInfoA.flags & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                        bundle2.putLong("_sysu", j9);
                                    }
                                }
                            }
                            j12 = jO0;
                            if (j12 >= 0) {
                                bundle2.putLong("_pfo", j12);
                            }
                            E().getClass();
                            bundle2.putLong(str, System.currentTimeMillis());
                            d(new hsg("_f", new esg(bundle2), "auto", j7, j), ndhVar2);
                        }
                    } else {
                        Long lValueOf4 = Long.valueOf(j6);
                        long j16 = j4;
                        V(new mch(j16, lValueOf4, "_fvt", "auto"), ndhVar);
                        Z().A0();
                        m0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (z3) {
                            bundle.putLong("_dac", 1L);
                        }
                        E().getClass();
                        bundle.putLong("_elt", System.currentTimeMillis());
                        d(new hsg("_v", new esg(bundle), "auto", j16, j), ndhVar);
                    }
                } else {
                    j5 = j4;
                    if (ndhVar.w) {
                        d(new hsg("_cd", new esg(new Bundle()), "auto", j5, 0L), ndhVar);
                    }
                }
                krg krgVar11 = this.c;
                S(krgVar11);
                krgVar11.p1();
                krg krgVar12 = this.c;
                S(krgVar12);
                krgVar12.q1();
            } catch (Throwable th) {
                krg krgVar13 = this.c;
                S(krgVar13);
                krgVar13.q1();
                throw th;
            }
        }
    }

    public final void Y(wog wogVar, ndh ndhVar) {
        hsg hsgVar;
        oa7.x(wogVar.a);
        oa7.A(wogVar.b);
        oa7.A(wogVar.c);
        oa7.x(wogVar.c.b);
        Z().A0();
        m0();
        if (R(ndhVar)) {
            if (!ndhVar.v) {
                d0(ndhVar);
                return;
            }
            wog wogVar2 = new wog(wogVar);
            boolean z = false;
            wogVar2.e = false;
            krg krgVar = this.c;
            S(krgVar);
            krgVar.o1();
            try {
                krg krgVar2 = this.c;
                S(krgVar2);
                String str = wogVar2.a;
                oa7.A(str);
                wog wogVarA1 = krgVar2.A1(str, wogVar2.c.b);
                w3h w3hVar = this.z;
                if (wogVarA1 != null && !wogVarA1.b.equals(wogVar2.b)) {
                    v().x.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", w3hVar.x.c(wogVar2.c.b), wogVar2.b, wogVarA1.b);
                }
                if (wogVarA1 != null && wogVarA1.e) {
                    wogVar2.b = wogVarA1.b;
                    wogVar2.d = wogVarA1.d;
                    wogVar2.v = wogVarA1.v;
                    wogVar2.f = wogVarA1.f;
                    wogVar2.w = wogVarA1.w;
                    wogVar2.e = true;
                    mch mchVar = wogVar2.c;
                    wogVar2.c = new mch(wogVarA1.c.c, mchVar.c(), mchVar.b, wogVarA1.c.f);
                } else if (TextUtils.isEmpty(wogVar2.f)) {
                    mch mchVar2 = wogVar2.c;
                    wogVar2.c = new mch(wogVar2.d, mchVar2.c(), mchVar2.b, wogVar2.c.f);
                    wogVar2.e = true;
                    z = true;
                }
                if (wogVar2.e) {
                    mch mchVar3 = wogVar2.c;
                    String str2 = wogVar2.a;
                    oa7.A(str2);
                    String str3 = wogVar2.b;
                    String str4 = mchVar3.b;
                    long j = mchVar3.c;
                    Object objC = mchVar3.c();
                    oa7.A(objC);
                    och ochVar = new och(str2, str3, str4, j, objC);
                    Object obj = ochVar.e;
                    String str5 = ochVar.c;
                    krg krgVar3 = this.c;
                    S(krgVar3);
                    if (krgVar3.v1(ochVar)) {
                        v().Y.d("User property updated immediately", wogVar2.a, w3hVar.x.c(str5), obj);
                    } else {
                        v().g.d("(2)Too many active user properties, ignoring", w0h.E0(wogVar2.a), w3hVar.x.c(str5), obj);
                    }
                    if (z && (hsgVar = wogVar2.w) != null) {
                        g(new hsg(hsgVar, wogVar2.d, 0L), ndhVar);
                    }
                }
                krg krgVar4 = this.c;
                S(krgVar4);
                if (krgVar4.z1(wogVar2)) {
                    v().Y.d("Conditional property added", wogVar2.a, w3hVar.x.c(wogVar2.c.b), wogVar2.c.c());
                } else {
                    v().g.d("Too many conditional properties, ignoring", w0h.E0(wogVar2.a), w3hVar.x.c(wogVar2.c.b), wogVar2.c.c());
                }
                krg krgVar5 = this.c;
                S(krgVar5);
                krgVar5.p1();
            } finally {
                krg krgVar6 = this.c;
                S(krgVar6);
                krgVar6.q1();
            }
        }
    }

    @Override // defpackage.i5h
    public final m3h Z() {
        w3h w3hVar = this.z;
        oa7.A(w3hVar);
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        return m3hVar;
    }

    public final q5h a(String str) {
        q5h q5hVar = q5h.c;
        Z().A0();
        m0();
        HashMap map = this.Q0;
        q5h q5hVarU0 = (q5h) map.get(str);
        if (q5hVarU0 == null) {
            krg krgVar = this.c;
            S(krgVar);
            q5hVarU0 = krgVar.U0(str);
            if (q5hVarU0 == null) {
                q5hVarU0 = q5h.c;
            }
            Z().A0();
            m0();
            map.put(str, q5hVarU0);
            krg krgVar2 = this.c;
            S(krgVar2);
            krgVar2.g1(str, q5hVarU0);
        }
        return q5hVarU0;
    }

    @Override // defpackage.i5h
    public final Context a0() {
        return this.z.a;
    }

    public final long b() {
        E().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        oah oahVar = this.w;
        oahVar.B0();
        oahVar.A0();
        v vVar = oahVar.y;
        long jA = vVar.a();
        if (jA == 0) {
            qch qchVar = ((w3h) oahVar.b).w;
            w3h.f(qchVar);
            jA = ((long) qchVar.A1().nextInt(86400000)) + 1;
            vVar.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final void b0(wog wogVar, ndh ndhVar) {
        oa7.x(wogVar.a);
        oa7.A(wogVar.c);
        oa7.x(wogVar.c.b);
        Z().A0();
        m0();
        if (R(ndhVar)) {
            if (!ndhVar.v) {
                d0(ndhVar);
                return;
            }
            krg krgVar = this.c;
            S(krgVar);
            krgVar.o1();
            try {
                d0(ndhVar);
                String str = wogVar.a;
                oa7.A(str);
                krg krgVar2 = this.c;
                S(krgVar2);
                wog wogVarA1 = krgVar2.A1(str, wogVar.c.b);
                w3h w3hVar = this.z;
                if (wogVarA1 != null) {
                    v().Y.c(wogVar.a, w3hVar.x.c(wogVar.c.b), "Removing conditional user property");
                    krg krgVar3 = this.c;
                    S(krgVar3);
                    krgVar3.B1(str, wogVar.c.b);
                    if (wogVarA1.e) {
                        krg krgVar4 = this.c;
                        S(krgVar4);
                        krgVar4.u1(str, wogVar.c.b);
                    }
                    hsg hsgVar = wogVar.y;
                    if (hsgVar != null) {
                        esg esgVar = hsgVar.b;
                        hsg hsgVarI1 = l0().i1(hsgVar.a, esgVar != null ? esgVar.f() : null, wogVarA1.b, hsgVar.d, hsgVar.e, true);
                        oa7.A(hsgVarI1);
                        g(hsgVarI1, ndhVar);
                    }
                } else {
                    v().x.c(w0h.E0(wogVar.a), w3hVar.x.c(wogVar.c.b), "Conditional user property doesn't exist");
                }
                krg krgVar5 = this.c;
                S(krgVar5);
                krgVar5.p1();
            } finally {
                krg krgVar6 = this.c;
                S(krgVar6);
                krgVar6.q1();
            }
        }
    }

    public final void c(String str, hsg hsgVar) throws Throwable {
        krg krgVar = this.c;
        S(krgVar);
        k1h k1hVarE1 = krgVar.E1(str);
        if (k1hVarE1 != null) {
            w3h w3hVar = k1hVarE1.a;
            if (!TextUtils.isEmpty(k1hVarE1.O())) {
                Boolean boolN = N(k1hVarE1);
                if (boolN == null) {
                    if (!"_ui".equals(hsgVar.a)) {
                        v().x.b(w0h.E0(str), "Could not find package. appId");
                    }
                } else if (!boolN.booleanValue()) {
                    v().g.b(w0h.E0(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strH = k1hVarE1.H();
                String strO = k1hVarE1.O();
                long jQ = k1hVarE1.Q();
                m3h m3hVar = w3hVar.g;
                w3h.h(m3hVar);
                m3hVar.A0();
                String str2 = k1hVarE1.l;
                m3h m3hVar2 = w3hVar.g;
                w3h.h(m3hVar2);
                m3hVar2.A0();
                long j = k1hVarE1.m;
                m3h m3hVar3 = w3hVar.g;
                w3h.h(m3hVar3);
                m3hVar3.A0();
                long j2 = k1hVarE1.n;
                m3h m3hVar4 = w3hVar.g;
                w3h.h(m3hVar4);
                m3hVar4.A0();
                boolean z = k1hVarE1.o;
                String strK = k1hVarE1.K();
                m3h m3hVar5 = w3hVar.g;
                w3h.h(m3hVar5);
                m3hVar5.A0();
                boolean z2 = k1hVarE1.p;
                Boolean boolX = k1hVarE1.x();
                long jB = k1hVarE1.b();
                m3h m3hVar6 = w3hVar.g;
                w3h.h(m3hVar6);
                m3hVar6.A0();
                ArrayList arrayList = k1hVarE1.s;
                String strG = a(str).g();
                boolean z3 = k1hVarE1.z();
                m3h m3hVar7 = w3hVar.g;
                w3h.h(m3hVar7);
                m3hVar7.A0();
                long j3 = k1hVarE1.v;
                int i = a(str).b;
                String str3 = p0(str).b;
                m3h m3hVar8 = w3hVar.g;
                w3h.h(m3hVar8);
                m3hVar8.A0();
                int i2 = k1hVarE1.x;
                m3h m3hVar9 = w3hVar.g;
                w3h.h(m3hVar9);
                m3hVar9.A0();
                d(hsgVar, new ndh(str, strH, strO, jQ, str2, j, j2, (String) null, z, false, strK, 0L, 0, z2, false, boolX, jB, (List) arrayList, strG, "", (String) null, z3, j3, i, str3, i2, k1hVarE1.B, k1hVarE1.D(), k1hVarE1.s(), 0L, k1hVarE1.t(), 0L));
                return;
            }
        }
        v().Y.b(str, "No app data available; dropping event");
    }

    public final void c0(ndh ndhVar, long j) throws Throwable {
        krg krgVar = this.c;
        S(krgVar);
        String str = ndhVar.a;
        oa7.A(str);
        k1h k1hVarE1 = krgVar.E1(str);
        if (k1hVarE1 != null) {
            l0();
            String str2 = ndhVar.b;
            String strH = k1hVarE1.H();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strH);
            if (!zIsEmpty && !zIsEmpty2) {
                oa7.A(str2);
                if (!str2.equals(strH)) {
                    v().x.b(w0h.E0(k1hVarE1.E()), "New GMP App Id passed in. Removing cached database data. appId");
                    krg krgVar2 = this.c;
                    S(krgVar2);
                    w3h w3hVar = (w3h) krgVar2.b;
                    String strE = k1hVarE1.E();
                    krgVar2.B0();
                    krgVar2.A0();
                    oa7.x(strE);
                    try {
                        SQLiteDatabase sQLiteDatabaseR1 = krgVar2.r1();
                        String[] strArr = {strE};
                        int iDelete = sQLiteDatabaseR1.delete("events", "app_id=?", strArr) + sQLiteDatabaseR1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseR1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseR1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseR1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseR1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseR1.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseR1.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseR1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseR1.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseR1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseR1.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseR1.delete("diagnostic_signals", "app_id=?", strArr);
                        ((epg) dpg.b.a.get()).getClass();
                        if (w3hVar.d.L0(null, bzg.c1)) {
                            iDelete += sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.Z.c(strE, Integer.valueOf(iDelete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.c(w0h.E0(strE), e, "Error deleting application data. appId, error");
                    }
                    k1hVarE1 = null;
                }
            }
        }
        if (k1hVarE1 != null) {
            boolean z = (k1hVarE1.Q() == -2147483648L || k1hVarE1.Q() == ndhVar.x) ? false : true;
            String strO = k1hVarE1.O();
            if (z || ((k1hVarE1.Q() != -2147483648L || strO == null || strO.equals(ndhVar.c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strO);
                hsg hsgVar = new hsg("_au", new esg(bundle), "auto", j, 0L);
                if (f0().L0(null, bzg.X0)) {
                    d(hsgVar, ndhVar);
                } else {
                    e(hsgVar, ndhVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:126), block:B:18:0x007d */
    public final void d(hsg hsgVar, ndh ndhVar) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        Cursor cursor;
        Bundle bundleJ0;
        hsg hsgVarB;
        esg esgVar;
        String string;
        String str = ndhVar.a;
        oa7.x(str);
        z0h z0hVarA = z0h.a(hsgVar);
        Bundle bundle = z0hVarA.e;
        qch qchVarL0 = l0();
        krg krgVar = this.c;
        S(krgVar);
        w3h w3hVar = (w3h) krgVar.b;
        krgVar.A0();
        krgVar.B0();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = krgVar.r1().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            v2h v2hVar = (v2h) ((t2h) lch.l1(v2h.H(), cursorRawQuery.getBlob(0))).e();
                            krgVar.c.k0();
                            bundleJ0 = lch.J0(v2hVar.t());
                            cursorRawQuery.close();
                        } catch (IOException e) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.c(w0h.E0(str), e, "Failed to retrieve default event parameters. appId");
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            bundleJ0 = null;
                        }
                        qchVarL0.N0(bundle, bundleJ0);
                        qch qchVarL1 = l0();
                        qqg qqgVarF0 = f0();
                        qqgVarF0.getClass();
                        qchVarL1.L0(z0hVarA, Math.max(Math.min(qqgVarF0.J0(str, bzg.X), 100), 25));
                        hsgVarB = z0hVarA.b();
                        if (!f0().L0(null, bzg.Z0) && "_cmp".equals(hsgVarB.a)) {
                            esgVar = hsgVarB.b;
                            if ("referrer API v2".equals(esgVar.a.getString("_cis"))) {
                                string = esgVar.a.getString("gclid");
                                if (!TextUtils.isEmpty(string)) {
                                    V(new mch(hsgVarB.d, string, "_lgclid", "auto"), ndhVar);
                                }
                            }
                        }
                        e(hsgVarB, ndhVar);
                    }
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.Z.a("Default event parameters not found");
                } catch (SQLiteException e2) {
                    e = e2;
                    w0h w0hVar3 = w3hVar.f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.b(e, "Error selecting default event parameters");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            bundleJ0 = null;
            qchVarL0.N0(bundle, bundleJ0);
            qch qchVarL2 = l0();
            qqg qqgVarF1 = f0();
            qqgVarF1.getClass();
            qchVarL2.L0(z0hVarA, Math.max(Math.min(qqgVarF1.J0(str, bzg.X), 100), 25));
            hsgVarB = z0hVarA.b();
            if (!f0().L0(null, bzg.Z0)) {
                esgVar = hsgVarB.b;
                if ("referrer API v2".equals(esgVar.a.getString("_cis"))) {
                    string = esgVar.a.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        V(new mch(hsgVarB.d, string, "_lgclid", "auto"), ndhVar);
                    }
                }
            }
            e(hsgVarB, ndhVar);
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0171  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:61:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01df  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0209  */
    /* JADX WARN: Code duplicated, block: B:71:0x020b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0221  */
    /* JADX WARN: Code duplicated, block: B:75:0x0223  */
    /* JADX WARN: Code duplicated, block: B:78:0x0238  */
    /* JADX WARN: Code duplicated, block: B:80:0x0248  */
    /* JADX WARN: Code duplicated, block: B:81:0x024a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0265  */
    /* JADX WARN: Code duplicated, block: B:86:0x0267  */
    /* JADX WARN: Code duplicated, block: B:89:0x027d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0289 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x028c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x028d  */
    public final k1h d0(ndh ndhVar) {
        boolean z;
        w3h w3hVar;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        boolean z2;
        fpg fpgVar;
        boolean z3;
        boolean z4;
        String str5;
        boolean z5;
        String str6;
        boolean z6;
        int i;
        boolean z7;
        Z().A0();
        m0();
        oa7.A(ndhVar);
        boolean z8 = ndhVar.Y;
        String str7 = ndhVar.a;
        oa7.x(str7);
        String str8 = ndhVar.I0;
        if (!str8.isEmpty()) {
            this.S0.put(str7, new gch(this, str8));
        }
        krg krgVar = this.c;
        S(krgVar);
        k1h k1hVarE1 = krgVar.E1(str7);
        q5h q5hVarJ = a(str7).j(q5h.c(100, ndhVar.H0));
        String strG0 = this.w.G0(ndhVar, q5hVarJ);
        boolean z9 = true;
        o5h o5hVar = o5h.AD_STORAGE;
        o5h o5hVar2 = o5h.ANALYTICS_STORAGE;
        if (k1hVarE1 != null) {
            w3h w3hVar2 = k1hVarE1.a;
            if (q5hVarJ.i(o5hVar) && strG0 != null) {
                m3h m3hVar = w3hVar2.g;
                w3h.h(m3hVar);
                m3hVar.A0();
                if (!strG0.equals(k1hVarE1.e)) {
                    m3h m3hVar2 = w3hVar2.g;
                    w3h.h(m3hVar2);
                    m3hVar2.A0();
                    boolean zIsEmpty = TextUtils.isEmpty(k1hVarE1.e);
                    k1hVarE1.J(strG0);
                    if (z8 && !"00000000-0000-0000-0000-000000000000".equals(this.w.E0(ndhVar, q5hVarJ).first) && !zIsEmpty) {
                        if (q5hVarJ.i(o5hVar2)) {
                            k1hVarE1.G(j(q5hVarJ));
                            z = false;
                        } else {
                            z = true;
                        }
                        krg krgVar2 = this.c;
                        S(krgVar2);
                        if (krgVar2.w1(str7, "_id") != null) {
                            krg krgVar3 = this.c;
                            S(krgVar3);
                            if (krgVar3.w1(str7, "_lair") == null) {
                                E().getClass();
                                och ochVar = new och(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
                                krg krgVar4 = this.c;
                                S(krgVar4);
                                krgVar4.v1(ochVar);
                            }
                        }
                    } else if (TextUtils.isEmpty(k1hVarE1.F()) && q5hVarJ.i(o5hVar2)) {
                        k1hVarE1.G(j(q5hVarJ));
                    }
                } else if (TextUtils.isEmpty(k1hVarE1.F())) {
                    k1hVarE1.G(j(q5hVarJ));
                }
            } else if (TextUtils.isEmpty(k1hVarE1.F()) && q5hVarJ.i(o5hVar2)) {
                k1hVarE1.G(j(q5hVarJ));
            }
            w3hVar = k1hVarE1.a;
            k1hVarE1.I(ndhVar.b);
            str = ndhVar.y;
            if (!TextUtils.isEmpty(str)) {
                k1hVarE1.L(str);
            }
            j = ndhVar.e;
            if (j != 0) {
                k1hVarE1.T(j);
            }
            str2 = ndhVar.c;
            if (!TextUtils.isEmpty(str2)) {
                k1hVarE1.P(str2);
            }
            k1hVarE1.R(ndhVar.x);
            str3 = ndhVar.d;
            if (str3 != null) {
                k1hVarE1.S(str3);
            }
            k1hVarE1.a(ndhVar.f);
            k1hVarE1.d(ndhVar.v);
            str4 = ndhVar.g;
            if (!TextUtils.isEmpty(str4)) {
                k1hVarE1.w(str4);
            }
            m3h m3hVar3 = w3hVar.g;
            w3h.h(m3hVar3);
            m3hVar3.A0();
            boolean z10 = k1hVarE1.R;
            if (k1hVarE1.p != z8) {
                z2 = true;
            } else {
                z2 = false;
            }
            k1hVarE1.R = z10 | z2;
            k1hVarE1.p = z8;
            Boolean bool = ndhVar.E0;
            m3h m3hVar4 = w3hVar.g;
            w3h.h(m3hVar4);
            m3hVar4.A0();
            k1hVarE1.R |= !Objects.equals(k1hVarE1.q, bool);
            k1hVarE1.q = bool;
            k1hVarE1.c(ndhVar.F0);
            String str9 = ndhVar.J0;
            m3h m3hVar5 = w3hVar.g;
            w3h.h(m3hVar5);
            m3hVar5.A0();
            k1hVarE1.R |= !Objects.equals(k1hVarE1.t, str9);
            k1hVarE1.t = str9;
            fpgVar = fpg.b;
            ((gpg) fpgVar.a.get()).getClass();
            if (f0().L0(null, bzg.L0)) {
                k1hVarE1.y(ndhVar.G0);
            } else {
                ((gpg) fpgVar.a.get()).getClass();
                if (f0().L0(null, bzg.K0)) {
                    k1hVarE1.y(null);
                }
            }
            z3 = ndhVar.K0;
            m3h m3hVar6 = w3hVar.g;
            w3h.h(m3hVar6);
            m3hVar6.A0();
            boolean z11 = k1hVarE1.R;
            if (k1hVarE1.u != z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            k1hVarE1.R = z11 | z4;
            k1hVarE1.u = z3;
            str5 = ndhVar.Q0;
            m3h m3hVar7 = w3hVar.g;
            w3h.h(m3hVar7);
            m3hVar7.A0();
            boolean z12 = k1hVarE1.R;
            if (k1hVarE1.C != str5) {
                z5 = true;
            } else {
                z5 = false;
            }
            k1hVarE1.R = z12 | z5;
            k1hVarE1.C = str5;
            upg.a();
            if (f0().L0(null, bzg.O0)) {
                i = ndhVar.O0;
                m3h m3hVar8 = w3hVar.g;
                w3h.h(m3hVar8);
                m3hVar8.A0();
                boolean z13 = k1hVarE1.R;
                if (k1hVarE1.x != i) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                k1hVarE1.R = z13 | z7;
                k1hVarE1.x = i;
            }
            k1hVarE1.A(ndhVar.L0);
            str6 = ndhVar.R0;
            m3h m3hVar9 = w3hVar.g;
            w3h.h(m3hVar9);
            m3hVar9.A0();
            boolean z14 = k1hVarE1.R;
            if (k1hVarE1.G != str6) {
                z6 = true;
            } else {
                z6 = false;
            }
            k1hVarE1.R = z14 | z6;
            k1hVarE1.G = str6;
            int i2 = ndhVar.T0;
            m3h m3hVar10 = w3hVar.g;
            w3h.h(m3hVar10);
            m3hVar10.A0();
            k1hVarE1.R |= k1hVarE1.I != i2;
            k1hVarE1.I = i2;
            if (!k1hVarE1.o()) {
                z9 = z;
            } else if (!z) {
                return k1hVarE1;
            }
            krg krgVar5 = this.c;
            S(krgVar5);
            krgVar5.F1(k1hVarE1, z9);
            return k1hVarE1;
        }
        k1hVarE1 = new k1h(this.z, str7);
        if (q5hVarJ.i(o5hVar2)) {
            k1hVarE1.G(j(q5hVarJ));
        }
        if (q5hVarJ.i(o5hVar)) {
            k1hVarE1.J(strG0);
        }
        z = false;
        w3hVar = k1hVarE1.a;
        k1hVarE1.I(ndhVar.b);
        str = ndhVar.y;
        if (!TextUtils.isEmpty(str)) {
            k1hVarE1.L(str);
        }
        j = ndhVar.e;
        if (j != 0) {
            k1hVarE1.T(j);
        }
        str2 = ndhVar.c;
        if (!TextUtils.isEmpty(str2)) {
            k1hVarE1.P(str2);
        }
        k1hVarE1.R(ndhVar.x);
        str3 = ndhVar.d;
        if (str3 != null) {
            k1hVarE1.S(str3);
        }
        k1hVarE1.a(ndhVar.f);
        k1hVarE1.d(ndhVar.v);
        str4 = ndhVar.g;
        if (!TextUtils.isEmpty(str4)) {
            k1hVarE1.w(str4);
        }
        m3h m3hVar11 = w3hVar.g;
        w3h.h(m3hVar11);
        m3hVar11.A0();
        boolean z15 = k1hVarE1.R;
        if (k1hVarE1.p != z8) {
            z2 = true;
        } else {
            z2 = false;
        }
        k1hVarE1.R = z15 | z2;
        k1hVarE1.p = z8;
        Boolean bool2 = ndhVar.E0;
        m3h m3hVar12 = w3hVar.g;
        w3h.h(m3hVar12);
        m3hVar12.A0();
        k1hVarE1.R |= !Objects.equals(k1hVarE1.q, bool2);
        k1hVarE1.q = bool2;
        k1hVarE1.c(ndhVar.F0);
        String str10 = ndhVar.J0;
        m3h m3hVar13 = w3hVar.g;
        w3h.h(m3hVar13);
        m3hVar13.A0();
        k1hVarE1.R |= !Objects.equals(k1hVarE1.t, str10);
        k1hVarE1.t = str10;
        fpgVar = fpg.b;
        ((gpg) fpgVar.a.get()).getClass();
        if (f0().L0(null, bzg.L0)) {
            k1hVarE1.y(ndhVar.G0);
        } else {
            ((gpg) fpgVar.a.get()).getClass();
            if (f0().L0(null, bzg.K0)) {
                k1hVarE1.y(null);
            }
        }
        z3 = ndhVar.K0;
        m3h m3hVar14 = w3hVar.g;
        w3h.h(m3hVar14);
        m3hVar14.A0();
        boolean z16 = k1hVarE1.R;
        if (k1hVarE1.u != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        k1hVarE1.R = z16 | z4;
        k1hVarE1.u = z3;
        str5 = ndhVar.Q0;
        m3h m3hVar15 = w3hVar.g;
        w3h.h(m3hVar15);
        m3hVar15.A0();
        boolean z17 = k1hVarE1.R;
        if (k1hVarE1.C != str5) {
            z5 = true;
        } else {
            z5 = false;
        }
        k1hVarE1.R = z17 | z5;
        k1hVarE1.C = str5;
        upg.a();
        if (f0().L0(null, bzg.O0)) {
            i = ndhVar.O0;
            m3h m3hVar16 = w3hVar.g;
            w3h.h(m3hVar16);
            m3hVar16.A0();
            boolean z18 = k1hVarE1.R;
            if (k1hVarE1.x != i) {
                z7 = true;
            } else {
                z7 = false;
            }
            k1hVarE1.R = z18 | z7;
            k1hVarE1.x = i;
        }
        k1hVarE1.A(ndhVar.L0);
        str6 = ndhVar.R0;
        m3h m3hVar17 = w3hVar.g;
        w3h.h(m3hVar17);
        m3hVar17.A0();
        boolean z19 = k1hVarE1.R;
        if (k1hVarE1.G != str6) {
            z6 = true;
        } else {
            z6 = false;
        }
        k1hVarE1.R = z19 | z6;
        k1hVarE1.G = str6;
        int i3 = ndhVar.T0;
        m3h m3hVar18 = w3hVar.g;
        w3h.h(m3hVar18);
        m3hVar18.A0();
        k1hVarE1.R |= k1hVarE1.I != i3;
        k1hVarE1.I = i3;
        if (!k1hVarE1.o()) {
            z9 = z;
        } else if (!z) {
            return k1hVarE1;
        }
        krg krgVar6 = this.c;
        S(krgVar6);
        krgVar6.F1(k1hVarE1, z9);
        return k1hVarE1;
    }

    public final void e(hsg hsgVar, ndh ndhVar) {
        List listD1;
        w3h w3hVar;
        List listD2;
        List<wog> listD3;
        long j;
        String str;
        oa7.A(ndhVar);
        String str2 = ndhVar.a;
        oa7.x(str2);
        Z().A0();
        m0();
        long j2 = hsgVar.d;
        long j3 = hsgVar.e;
        z0h z0hVarA = z0h.a(hsgVar);
        Z().A0();
        t8h t8hVar = this.U0;
        if (t8hVar == null || (str = this.V0) == null || !str.equals(str2)) {
            t8hVar = null;
        }
        qch.x1(t8hVar, z0hVarA.e, false);
        hsg hsgVarB = z0hVarA.b();
        k0();
        if (TextUtils.isEmpty(ndhVar.b)) {
            return;
        }
        if (!ndhVar.v) {
            d0(ndhVar);
            return;
        }
        List list = ndhVar.G0;
        if (list != null) {
            String str3 = hsgVarB.a;
            if (!list.contains(str3)) {
                v().Y.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, hsgVarB.c);
                return;
            } else {
                Bundle bundleF = hsgVarB.b.f();
                bundleF.putLong("ga_safelisted", 1L);
                hsgVarB = new hsg(str3, new esg(bundleF), hsgVarB.c, hsgVarB.d, hsgVarB.e);
            }
        }
        krg krgVar = this.c;
        S(krgVar);
        krgVar.o1();
        try {
            String str4 = hsgVarB.a;
            if ("_s".equals(str4)) {
                krg krgVar2 = this.c;
                S(krgVar2);
                if (!krgVar2.P0(str2, "_s") && hsgVarB.b.a.getLong("_sid") != 0) {
                    krg krgVar3 = this.c;
                    S(krgVar3);
                    if (krgVar3.P0(str2, "_f")) {
                        krg krgVar4 = this.c;
                        S(krgVar4);
                        krgVar4.T0(str2, null, "_sid", f(str2, hsgVarB));
                    } else {
                        krg krgVar5 = this.c;
                        S(krgVar5);
                        if (krgVar5.P0(str2, "_v")) {
                            krg krgVar6 = this.c;
                            S(krgVar6);
                            krgVar6.T0(str2, null, "_sid", f(str2, hsgVarB));
                        } else {
                            krg krgVar7 = this.c;
                            S(krgVar7);
                            E().getClass();
                            krgVar7.T0(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", f(str2, hsgVarB));
                        }
                    }
                }
            }
            krg krgVar8 = this.c;
            S(krgVar8);
            oa7.x(str2);
            krgVar8.A0();
            krgVar8.B0();
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i < 0) {
                w0h w0hVar = ((w3h) krgVar8.b).f;
                w3h.h(w0hVar);
                w0hVar.x.c(w0h.E0(str2), Long.valueOf(j2), "Invalid time querying timed out conditional properties");
                listD1 = Collections.EMPTY_LIST;
            } else {
                listD1 = krgVar8.D1("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
            }
            Iterator it = listD1.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                w3hVar = this.z;
                if (!zHasNext) {
                    break;
                }
                wog wogVar = (wog) it.next();
                if (wogVar != null) {
                    v().Z.d("User property timed out", wogVar.a, w3hVar.x.c(wogVar.c.b), wogVar.c.c());
                    hsg hsgVar2 = wogVar.g;
                    if (hsgVar2 != null) {
                        j = j2;
                        g(new hsg(hsgVar2, j, j3), ndhVar);
                    } else {
                        j = j2;
                    }
                    krg krgVar9 = this.c;
                    S(krgVar9);
                    krgVar9.B1(str2, wogVar.c.b);
                    j2 = j;
                }
            }
            long j4 = j2;
            krg krgVar10 = this.c;
            S(krgVar10);
            oa7.x(str2);
            krgVar10.A0();
            krgVar10.B0();
            if (i < 0) {
                w0h w0hVar2 = ((w3h) krgVar10.b).f;
                w3h.h(w0hVar2);
                w0hVar2.x.c(w0h.E0(str2), Long.valueOf(j4), "Invalid time querying expired conditional properties");
                listD2 = Collections.EMPTY_LIST;
            } else {
                listD2 = krgVar10.D1("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j4)});
            }
            ArrayList arrayList = new ArrayList(listD2.size());
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                wog wogVar2 = (wog) it2.next();
                if (wogVar2 != null) {
                    Iterator it3 = it2;
                    int i2 = i;
                    long j5 = j4;
                    v().Z.d("User property expired", wogVar2.a, w3hVar.x.c(wogVar2.c.b), wogVar2.c.c());
                    krg krgVar11 = this.c;
                    S(krgVar11);
                    krgVar11.u1(str2, wogVar2.c.b);
                    hsg hsgVar3 = wogVar2.y;
                    if (hsgVar3 != null) {
                        arrayList.add(hsgVar3);
                    }
                    krg krgVar12 = this.c;
                    S(krgVar12);
                    krgVar12.B1(str2, wogVar2.c.b);
                    it2 = it3;
                    i = i2;
                    j4 = j5;
                }
            }
            int i3 = i;
            long j6 = j4;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                long j7 = j6;
                g(new hsg((hsg) it4.next(), j7, j3), ndhVar);
                j6 = j7;
                j3 = j3;
            }
            long j8 = j3;
            long j9 = j6;
            krg krgVar13 = this.c;
            S(krgVar13);
            oa7.x(str2);
            oa7.x(str4);
            krgVar13.A0();
            krgVar13.B0();
            if (i3 < 0) {
                w3h w3hVar2 = (w3h) krgVar13.b;
                w0h w0hVar3 = w3hVar2.f;
                w3h.h(w0hVar3);
                w0hVar3.x.d("Invalid time querying triggered conditional properties", w0h.E0(str2), w3hVar2.x.a(str4), Long.valueOf(j9));
                listD3 = Collections.EMPTY_LIST;
            } else {
                listD3 = krgVar13.D1("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j9)});
            }
            ArrayList arrayList2 = new ArrayList(listD3.size());
            for (wog wogVar3 : listD3) {
                if (wogVar3 != null) {
                    mch mchVar = wogVar3.c;
                    String str5 = wogVar3.a;
                    oa7.A(str5);
                    long j10 = j9;
                    String str6 = wogVar3.b;
                    String str7 = mchVar.b;
                    Object objC = mchVar.c();
                    oa7.A(objC);
                    och ochVar = new och(str5, str6, str7, j10, objC);
                    j9 = j10;
                    Object obj = ochVar.e;
                    String str8 = ochVar.c;
                    krg krgVar14 = this.c;
                    S(krgVar14);
                    if (krgVar14.v1(ochVar)) {
                        v().Z.d("User property triggered", wogVar3.a, w3hVar.x.c(str8), obj);
                    } else {
                        v().g.d("Too many active user properties, ignoring", w0h.E0(wogVar3.a), w3hVar.x.c(str8), obj);
                    }
                    hsg hsgVar4 = wogVar3.w;
                    if (hsgVar4 != null) {
                        arrayList2.add(hsgVar4);
                    }
                    wogVar3.c = new mch(ochVar);
                    wogVar3.e = true;
                    krg krgVar15 = this.c;
                    S(krgVar15);
                    krgVar15.z1(wogVar3);
                }
            }
            g(hsgVarB, ndhVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                long j11 = j8;
                g(new hsg((hsg) it5.next(), j9, j11), ndhVar);
                j8 = j11;
            }
            krg krgVar16 = this.c;
            S(krgVar16);
            krgVar16.p1();
        } finally {
            krg krgVar17 = this.c;
            S(krgVar17);
            krgVar17.q1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List e0(Bundle bundle, ndh ndhVar) {
        int[] iArr;
        Z().A0();
        upg.a();
        qqg qqgVarF0 = f0();
        String str = ndhVar.a;
        if (!qqgVarF0.L0(str, bzg.O0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    v().g.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        krg krgVar = this.c;
                        S(krgVar);
                        w3h w3hVar = (w3h) krgVar.b;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        oa7.x(str);
                        krgVar.A0();
                        krgVar.B0();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = krgVar.r1().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                w0h w0hVar = w3hVar.f;
                                w3h.h(w0hVar);
                                tz0 tz0Var = w0hVar.Z;
                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(iDelete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                tz0Var.d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                                w0h w0hVar2 = w3hVar.f;
                                w3h.h(w0hVar2);
                                w0hVar2.g.c(w0h.E0(str), e, "Error pruning trigger URIs. appId");
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        krg krgVar2 = this.c;
        S(krgVar2);
        String str2 = ndhVar.a;
        oa7.x(str2);
        krgVar2.A0();
        krgVar2.B0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = krgVar2.r1().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new kbh(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e3) {
                w0h w0hVar3 = ((w3h) krgVar2.b).f;
                w3h.h(w0hVar3);
                w0hVar3.g.c(w0h.E0(str2), e3, "Error querying trigger uris. appId");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final Bundle f(String str, hsg hsgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", hsgVar.b.a.getLong("_sid"));
        krg krgVar = this.c;
        S(krgVar);
        och ochVarW1 = krgVar.w1(str, "_sno");
        if (ochVarW1 != null) {
            Object obj = ochVarW1.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final qqg f0() {
        w3h w3hVar = this.z;
        oa7.A(w3hVar);
        return w3hVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03c6 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x03cb A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x03e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x03eb A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0405 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x040b A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x043c A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0457  */
    /* JADX WARN: Code duplicated, block: B:118:0x045b A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0496 A[Catch: all -> 0x01b9, TRY_ENTER, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x04b2 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x04c2 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0519 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x055e A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0586 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x05f3 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0630 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x063b A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0646 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0651 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x065d A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x066c A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0674  */
    /* JADX WARN: Code duplicated, block: B:174:0x06a9 A[Catch: all -> 0x01b9, TRY_ENTER, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x06bb A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:183:0x06db  */
    /* JADX WARN: Code duplicated, block: B:184:0x06de  */
    /* JADX WARN: Code duplicated, block: B:187:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:188:0x06e8 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:191:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:194:0x0701  */
    /* JADX WARN: Code duplicated, block: B:195:0x0704  */
    /* JADX WARN: Code duplicated, block: B:198:0x0710  */
    /* JADX WARN: Code duplicated, block: B:199:0x0713  */
    /* JADX WARN: Code duplicated, block: B:202:0x071f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0722  */
    /* JADX WARN: Code duplicated, block: B:206:0x072e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0731  */
    /* JADX WARN: Code duplicated, block: B:210:0x073b  */
    /* JADX WARN: Code duplicated, block: B:211:0x073e  */
    /* JADX WARN: Code duplicated, block: B:214:0x074a  */
    /* JADX WARN: Code duplicated, block: B:215:0x074d  */
    /* JADX WARN: Code duplicated, block: B:217:0x075b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0764 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x077d A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0794 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x07b9 A[Catch: all -> 0x083d, TryCatch #7 {all -> 0x083d, blocks: (B:231:0x07b5, B:233:0x07b9, B:236:0x07cb, B:239:0x07df, B:241:0x07eb, B:243:0x07f7, B:245:0x0801, B:247:0x080f, B:249:0x0829, B:253:0x0844, B:255:0x0852, B:256:0x085b, B:258:0x0868, B:260:0x08ab, B:263:0x08b6, B:264:0x08c0, B:265:0x08c1, B:267:0x08cb), top: B:350:0x07b5 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x07c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x0864  */
    /* JADX WARN: Code duplicated, block: B:260:0x08ab A[Catch: all -> 0x083d, TryCatch #7 {all -> 0x083d, blocks: (B:231:0x07b5, B:233:0x07b9, B:236:0x07cb, B:239:0x07df, B:241:0x07eb, B:243:0x07f7, B:245:0x0801, B:247:0x080f, B:249:0x0829, B:253:0x0844, B:255:0x0852, B:256:0x085b, B:258:0x0868, B:260:0x08ab, B:263:0x08b6, B:264:0x08c0, B:265:0x08c1, B:267:0x08cb), top: B:350:0x07b5 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:263:0x08b6 A[Catch: all -> 0x083d, TryCatch #7 {all -> 0x083d, blocks: (B:231:0x07b5, B:233:0x07b9, B:236:0x07cb, B:239:0x07df, B:241:0x07eb, B:243:0x07f7, B:245:0x0801, B:247:0x080f, B:249:0x0829, B:253:0x0844, B:255:0x0852, B:256:0x085b, B:258:0x0868, B:260:0x08ab, B:263:0x08b6, B:264:0x08c0, B:265:0x08c1, B:267:0x08cb), top: B:350:0x07b5 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x08cb A[Catch: all -> 0x083d, TRY_LEAVE, TryCatch #7 {all -> 0x083d, blocks: (B:231:0x07b5, B:233:0x07b9, B:236:0x07cb, B:239:0x07df, B:241:0x07eb, B:243:0x07f7, B:245:0x0801, B:247:0x080f, B:249:0x0829, B:253:0x0844, B:255:0x0852, B:256:0x085b, B:258:0x0868, B:260:0x08ab, B:263:0x08b6, B:264:0x08c0, B:265:0x08c1, B:267:0x08cb), top: B:350:0x07b5 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x08e9 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x092b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0936 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0954 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x096d A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:290:0x09b7 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x09c9 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:295:0x09d8 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x09f4 A[Catch: all -> 0x08f5, TRY_LEAVE, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:307:0x0a6e A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0aa5 A[Catch: all -> 0x08f5, TryCatch #0 {all -> 0x08f5, blocks: (B:269:0x08d2, B:271:0x08e9, B:275:0x08f8, B:277:0x092e, B:279:0x0936, B:281:0x0940, B:282:0x094a, B:284:0x0954, B:285:0x095e, B:286:0x0967, B:288:0x096d, B:290:0x09b7, B:292:0x09c9, B:296:0x09e4, B:298:0x09f4, B:295:0x09d8, B:302:0x0a07, B:303:0x0a49, B:304:0x0a54, B:305:0x0a68, B:307:0x0a6e, B:316:0x0ab9, B:317:0x0b10, B:319:0x0b21, B:333:0x0b82, B:324:0x0b39, B:325:0x0b3c, B:310:0x0a7b, B:312:0x0aa5, B:330:0x0b57, B:331:0x0b6e, B:332:0x0b6f), top: B:338:0x08d2, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x0ab7 A[EDGE_INSN: B:315:0x0ab7->B:316:0x0ab9 BREAK  A[LOOP:2: B:305:0x0a68->B:359:?]] */
    /* JADX WARN: Code duplicated, block: B:319:0x0b21 A[Catch: all -> 0x08f5, SQLiteException -> 0x0b35, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0b35, blocks: (B:317:0x0b10, B:319:0x0b21), top: B:341:0x0b10, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:350:0x07b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0a01 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0a7b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0310 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0338  */
    /* JADX WARN: Code duplicated, block: B:92:0x0356  */
    /* JADX WARN: Code duplicated, block: B:93:0x0359 A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x036b A[Catch: all -> 0x01b9, TryCatch #5 {all -> 0x01b9, blocks: (B:37:0x0197, B:40:0x01a6, B:42:0x01ae, B:48:0x01bd, B:90:0x0347, B:99:0x037f, B:101:0x03c6, B:103:0x03cb, B:104:0x03e0, B:106:0x03eb, B:108:0x0405, B:110:0x040b, B:111:0x0420, B:114:0x043c, B:118:0x045b, B:119:0x0470, B:120:0x0479, B:123:0x0496, B:124:0x04aa, B:126:0x04b2, B:128:0x04bc, B:130:0x04c2, B:131:0x04c9, B:132:0x04d6, B:138:0x0519, B:139:0x052c, B:141:0x055e, B:144:0x0588, B:146:0x0592, B:150:0x05d8, B:152:0x0601, B:154:0x0630, B:155:0x0633, B:157:0x063b, B:158:0x063e, B:160:0x0646, B:161:0x0649, B:163:0x0651, B:164:0x0654, B:166:0x065d, B:167:0x0661, B:169:0x066c, B:171:0x0678, B:174:0x06a9, B:176:0x06bb, B:180:0x06d1, B:185:0x06df, B:218:0x075e, B:220:0x0764, B:221:0x0767, B:223:0x077d, B:224:0x0787, B:226:0x0794, B:228:0x079e, B:229:0x07a1, B:238:0x07d6, B:188:0x06e8, B:192:0x06f6, B:196:0x0705, B:200:0x0714, B:204:0x0723, B:208:0x0732, B:212:0x073f, B:216:0x074e, B:151:0x05f3, B:135:0x0500, B:93:0x0359, B:94:0x0365, B:96:0x036b, B:98:0x0379, B:53:0x01db, B:56:0x01ed, B:58:0x0202, B:64:0x021a, B:69:0x0248, B:71:0x024e, B:73:0x025c, B:75:0x026a, B:78:0x027f, B:85:0x0306, B:87:0x0310, B:79:0x02b1, B:80:0x02ca, B:84:0x02f0, B:83:0x02dd, B:67:0x0226, B:68:0x0242), top: B:347:0x0197, inners: #4, #6 }] */
    public final void g(hsg hsgVar, ndh ndhVar) throws Throwable {
        ich ichVar;
        String str;
        esg esgVar;
        long jRound;
        String str2;
        yea yeaVar;
        krg krgVarH0;
        int iJ0;
        och ochVar;
        boolean zB1;
        String str3;
        boolean zEquals;
        Iterator<String> it;
        long length;
        Object objC;
        esg esgVar2;
        drg drgVarH1;
        long jIntValue;
        Bundle bundleF;
        krg krgVarH1;
        long jDelete;
        yl ylVar;
        w3h w3hVar;
        String str4;
        String str5;
        bsg bsgVarA1;
        yl ylVar2;
        bsg bsgVar;
        u3h u3hVarW;
        String str6;
        String str7;
        String str8;
        long j;
        long j2;
        String str9;
        String str10;
        q5h q5hVarJ;
        boolean zL0;
        o5h o5hVar;
        String str11;
        String str12;
        long j3;
        long j4;
        String str13;
        q5h q5hVarJ2;
        boolean z;
        Pair pairE0;
        k1h k1hVarE1;
        k1h k1hVarE2;
        int i;
        List listX1;
        int i2;
        krg krgVarH2;
        krg krgVarH3;
        yl ylVar3;
        Iterator<String> it2;
        boolean zQ0;
        String str14;
        ContentValues contentValues;
        String str15;
        lch lchVarK0;
        long jJ1;
        List listR0;
        long j5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long jR0;
        qqg qqgVarF0;
        azg azgVar;
        och ochVarW1;
        Object obj;
        long jMax;
        long jIntValue2;
        String str16 = "_fx";
        oa7.A(ndhVar);
        boolean z10 = ndhVar.v;
        String str17 = ndhVar.a;
        oa7.x(str17);
        long jNanoTime = System.nanoTime();
        Z().A0();
        m0();
        k0();
        String str18 = ndhVar.b;
        if (TextUtils.isEmpty(str18)) {
            return;
        }
        if (!z10) {
            d0(ndhVar);
            return;
        }
        y2h y2hVarG0 = g0();
        String str19 = hsgVar.a;
        boolean zP0 = y2hVarG0.P0(str17, str19);
        String str20 = "_err";
        w3h w3hVar2 = this.z;
        String str21 = str18;
        yea yeaVar2 = this.Y0;
        if (zP0) {
            v().x.c(w0h.E0(str17), w3hVar2.x.a(str19), "Dropping blocked event. appId");
            if (!"1".equals(g0().M(str17, "measurement.upload.blacklist_internal")) && !"1".equals(g0().M(str17, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str19)) {
                    return;
                }
                l0();
                qch.S0(yeaVar2, str17, 11, "_ev", str19, 0);
                return;
            }
            k1h k1hVarE3 = h0().E1(str17);
            if (k1hVarE3 != null) {
                w3h w3hVar3 = k1hVarE3.a;
                m3h m3hVar = w3hVar3.g;
                w3h.h(m3hVar);
                m3hVar.A0();
                long j6 = k1hVarE3.T;
                m3h m3hVar2 = w3hVar3.g;
                w3h.h(m3hVar2);
                m3hVar2.A0();
                long jMax2 = Math.max(j6, k1hVarE3.S);
                E().getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                f0();
                if (jAbs > ((Long) bzg.N.a(null)).longValue()) {
                    v().Y.a("Fetching config for blocked app");
                    x(k1hVarE3);
                    return;
                }
                return;
            }
            return;
        }
        z0h z0hVarA = z0h.a(hsgVar);
        qch qchVarL0 = l0();
        qqg qqgVarF1 = f0();
        qqgVarF1.getClass();
        qchVarL0.L0(z0hVarA, Math.max(Math.min(qqgVarF1.J0(str17, bzg.X), 100), 25));
        int iMax = Math.max(Math.min(f0().J0(str17, bzg.f0), 35), 10);
        Bundle bundle = z0hVarA.e;
        Iterator it3 = new TreeSet(bundle.keySet()).iterator();
        while (it3.hasNext()) {
            String str22 = (String) it3.next();
            Iterator it4 = it3;
            if ("items".equals(str22)) {
                l0().M0(bundle.getParcelableArray(str22), iMax);
            }
            it3 = it4;
        }
        hsg hsgVarB = z0hVarA.b();
        esg esgVar3 = hsgVarB.b;
        String str23 = hsgVarB.a;
        if (Log.isLoggable(v().G0(), 2)) {
            v().Z.b(w3hVar2.x.d(hsgVarB), "Logging event");
        }
        h0().o1();
        try {
            d0(ndhVar);
            int i3 = 1;
            boolean z11 = "ecommerce_purchase".equals(str23) || "purchase".equals(str23) || "refund".equals(str23);
            if (!"_iap".equals(str23)) {
                if (z11) {
                    z11 = true;
                } else {
                    str = "app_id";
                    str16 = "_fx";
                    z10 = z10;
                    esgVar = esgVar3;
                    str2 = str23;
                    str21 = str21;
                    yeaVar = yeaVar2;
                    str20 = str20;
                }
                zB1 = qch.B1(str2);
                str3 = str2;
                zEquals = str20.equals(str3);
                l0();
                if (esgVar == null) {
                    length = 0;
                } else {
                    it = esgVar.a.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objC = esgVar.c(it.next());
                        if (objC instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objC).length;
                        }
                    }
                }
                esgVar2 = esgVar;
                drgVarH1 = h0().H1(b(), str17, length + 1, true, zB1, false, zEquals, false, false, false);
                long j7 = drgVarH1.b;
                f0();
                jIntValue = j7 - ((long) ((Integer) bzg.l.a(null)).intValue());
                if (jIntValue > 0) {
                    if (jIntValue % 1000 == 1) {
                        v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.b), "Data loss. Too many events logged. appId, count");
                    }
                    h0().p1();
                } else {
                    if (zB1) {
                        long j8 = drgVarH1.a;
                        f0();
                        jIntValue2 = j8 - ((long) ((Integer) bzg.n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.a), "Data loss. Too many public events logged. appId, count");
                            }
                            l0();
                            qch.S0(yeaVar, str17, 16, "_ev", hsgVarB.a, 0);
                            h0().p1();
                        }
                    }
                    if (zEquals) {
                        jMax = drgVarH1.d - ((long) Math.max(0, Math.min(1000000, f0().J0(str17, bzg.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.d), "Too many error events logged. appId, count");
                            }
                            h0().p1();
                        }
                    }
                    bundleF = esgVar2.f();
                    l0().R0(bundleF, "_o", hsgVarB.c);
                    if (l0().g1(str17, ndhVar.Q0)) {
                        l0().R0(bundleF, "_dbg", 1L);
                        l0().R0(bundleF, "_r", 1L);
                    }
                    if ("_s".equals(str3) && (ochVarW1 = h0().w1(str17, "_sno")) != null) {
                        obj = ochVarW1.e;
                        if (obj instanceof Long) {
                            l0().R0(bundleF, "_sno", obj);
                        }
                    }
                    krgVarH1 = h0();
                    oa7.x(str17);
                    krgVarH1.A0();
                    krgVarH1.B0();
                    try {
                        jDelete = krgVarH1.r1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str17, String.valueOf(Math.max(0, Math.min(1000000, ((w3h) krgVarH1.b).d.J0(str17, bzg.q))))});
                    } catch (SQLiteException e) {
                        ((w3h) krgVarH1.b).v().g.c(w0h.E0(str17), e, "Error deleting over the limit events. appId");
                        jDelete = 0;
                    }
                    if (jDelete > 0) {
                        v().x.c(w0h.E0(str17), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                    }
                    w3hVar = this.z;
                    ylVar = new yl(w3hVar, hsgVarB.c, str17, hsgVarB.a, hsgVarB.d, hsgVarB.e, 0L, bundleF);
                    str4 = str17;
                    krg krgVarH4 = h0();
                    str5 = (String) ylVar.f;
                    bsgVarA1 = krgVarH4.a1("events", str4, str5);
                    if (bsgVarA1 == null) {
                        jR0 = h0().R0(str4);
                        qqgVarF0 = f0();
                        qqgVarF0.getClass();
                        azgVar = bzg.W;
                        if (jR0 >= Math.max(Math.min(qqgVarF0.J0(str4, azgVar), 2000), 500) || !zB1 || l0().J1(str5)) {
                            str4 = str4;
                            bsgVar = new bsg(str4, str5, 0L, 0L, 0L, ylVar.b, 0L, null, null, null, null);
                            ylVar2 = ylVar;
                        } else {
                            tz0 tz0Var = v().g;
                            t0h t0hVarE0 = w0h.E0(str4);
                            String strA = w3hVar.x.a(str5);
                            qqg qqgVarF2 = f0();
                            qqgVarF2.getClass();
                            tz0Var.d("Too many event names used, ignoring event. appId, name, supported count", t0hVarE0, strA, Integer.valueOf(Math.max(Math.min(qqgVarF2.J0(str4, azgVar), 2000), 500)));
                            l0();
                            qch.S0(yeaVar, str4, 8, null, null, 0);
                        }
                    } else {
                        yl ylVarC = ylVar.c(w3hVar, bsgVarA1.f);
                        bsg bsgVarA = bsgVarA1.a(ylVarC.b);
                        ylVar2 = ylVarC;
                        bsgVar = bsgVarA;
                    }
                    h0().b1("events", bsgVar);
                    Z().A0();
                    m0();
                    String str24 = (String) ylVar2.e;
                    oa7.x(str24);
                    oa7.v(str24.equals(str4));
                    u3hVarW = z3h.W();
                    u3hVarW.z();
                    u3hVarW.j();
                    if (!TextUtils.isEmpty(str4)) {
                        u3hVarW.p(str4);
                    }
                    str6 = ndhVar.d;
                    if (!TextUtils.isEmpty(str6)) {
                        u3hVarW.n(str6);
                    }
                    str7 = ndhVar.c;
                    if (!TextUtils.isEmpty(str7)) {
                        u3hVarW.q(str7);
                    }
                    str8 = ndhVar.J0;
                    if (!TextUtils.isEmpty(str8)) {
                        u3hVarW.S(str8);
                    }
                    j = ndhVar.x;
                    if (j != -2147483648L) {
                        u3hVarW.M((int) j);
                    }
                    j2 = ndhVar.e;
                    u3hVarW.r(j2);
                    if (TextUtils.isEmpty(str21)) {
                        str9 = str21;
                    } else {
                        str9 = str21;
                        u3hVarW.I(str9);
                    }
                    oa7.A(str4);
                    str10 = str8;
                    q5h q5hVarA = a(str4);
                    String str25 = ndhVar.H0;
                    q5hVarJ = q5hVarA.j(q5h.c(100, str25));
                    u3hVarW.R(q5hVarJ.f());
                    upg.a();
                    zL0 = f0().L0(str4, bzg.O0);
                    o5hVar = o5h.AD_STORAGE;
                    if (zL0) {
                        l0();
                        if (qch.d1((String) bzg.q0.a(null), str4)) {
                            u3hVarW.A(ndhVar.O0);
                            str11 = str9;
                            str12 = str7;
                            j5 = ndhVar.P0;
                            if (!q5hVarJ.i(o5hVar) && j5 != 0) {
                                j5 = (j5 & (-2)) | 32;
                            }
                            if (j5 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            u3hVarW.V(z2);
                            if (j5 != 0) {
                                v1h v1hVarY = w1h.y();
                                if ((j5 & 1) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                v1hVarY.h(z3);
                                if ((j5 & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                v1hVarY.i(z4);
                                if ((j5 & 4) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                v1hVarY.j(z5);
                                if ((j5 & 8) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                v1hVarY.k(z6);
                                if ((j5 & 16) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                v1hVarY.l(z7);
                                if ((j5 & 32) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                v1hVarY.m(z8);
                                if ((j5 & 64) != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                v1hVarY.n(z9);
                                u3hVarW.B((w1h) v1hVarY.e());
                            }
                        } else {
                            str11 = str9;
                            str12 = str7;
                        }
                    } else {
                        str11 = str9;
                        str12 = str7;
                    }
                    j3 = ndhVar.f;
                    if (j3 != 0) {
                        u3hVarW.w(j3);
                    }
                    j4 = ndhVar.F0;
                    u3hVarW.P(j4);
                    str13 = str12;
                    if (f0().L0(null, bzg.U0)) {
                        f0();
                        u3hVarW.F(oog.a());
                    }
                    if (f0().L0(null, bzg.V0) && (listR0 = g0().R0(str4)) != null) {
                        u3hVarW.O(listR0);
                    }
                    q5hVarJ2 = a(str4).j(q5h.c(100, str25));
                    if (q5hVarJ2.i(o5hVar)) {
                        try {
                            z = ndhVar.Y;
                            if (z) {
                                pairE0 = this.w.E0(ndhVar, q5hVarJ2);
                                if (TextUtils.isEmpty((CharSequence) pairE0.first) && z) {
                                    u3hVarW.t((String) pairE0.first);
                                    Object obj2 = pairE0.second;
                                    if (obj2 != null) {
                                        u3hVarW.u(((Boolean) obj2).booleanValue());
                                    }
                                    String str26 = str16;
                                    if (((String) ylVar2.f).equals(str26) || ((String) pairE0.first).equals("00000000-0000-0000-0000-000000000000") || (k1hVarE1 = h0().E1(str4)) == null) {
                                        j4 = j4;
                                    } else {
                                        m3h m3hVar3 = k1hVarE1.a.g;
                                        w3h.h(m3hVar3);
                                        m3hVar3.A0();
                                        if (k1hVarE1.y) {
                                            q(str4, false, null, null);
                                            Bundle bundle2 = new Bundle();
                                            m3h m3hVar4 = k1hVarE1.a.g;
                                            w3h.h(m3hVar4);
                                            m3hVar4.A0();
                                            Long l = k1hVarE1.z;
                                            if (l != null) {
                                                bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                            }
                                            m3h m3hVar5 = k1hVarE1.a.g;
                                            w3h.h(m3hVar5);
                                            m3hVar5.A0();
                                            Long l2 = k1hVarE1.A;
                                            if (l2 != null) {
                                                bundle2.putLong("_uwa", l2.longValue());
                                            }
                                            bundle2.putLong("_r", 1L);
                                            yeaVar.c(str4, str26, bundle2);
                                        } else {
                                            j4 = j4;
                                        }
                                    }
                                } else {
                                    j4 = j4;
                                }
                            } else {
                                j4 = j4;
                            }
                        } catch (Throwable th) {
                            th = th;
                            ichVar = this;
                            ichVar.h0().q1();
                            throw th;
                        }
                    } else {
                        j4 = j4;
                    }
                    w3hVar.k().C0();
                    String str27 = Build.MODEL;
                    u3hVarW.k();
                    w3hVar.k().C0();
                    String str28 = Build.VERSION.RELEASE;
                    u3hVarW.c();
                    ((z3h) u3hVarW.b).q0(str28);
                    u3hVarW.m((int) w3hVar.k().E0());
                    u3hVarW.l(w3hVar.k().F0());
                    u3hVarW.T(ndhVar.L0);
                    if (w3hVar.a()) {
                        u3hVarW.o();
                        if (!TextUtils.isEmpty(null)) {
                            u3hVarW.c();
                            ((z3h) u3hVarW.b).T0(null);
                            throw null;
                        }
                    }
                    k1hVarE2 = h0().E1(str4);
                    if (k1hVarE2 == null) {
                        k1hVarE2 = new k1h(w3hVar, str4);
                        ichVar = this;
                        try {
                            k1hVarE2.G(ichVar.j(q5hVarJ2));
                            k1hVarE2.L(ndhVar.y);
                            k1hVarE2.I(str11);
                            if (q5hVarJ2.i(o5hVar)) {
                                k1hVarE2.J(ichVar.w.G0(ndhVar, q5hVarJ2));
                            }
                            k1hVarE2.e(0L);
                            k1hVarE2.M(0L);
                            k1hVarE2.N(0L);
                            k1hVarE2.P(str13);
                            k1hVarE2.R(j);
                            k1hVarE2.S(str6);
                            k1hVarE2.T(j2);
                            k1hVarE2.a(j3);
                            k1hVarE2.d(z10);
                            k1hVarE2.c(j4);
                            i = 0;
                            ichVar.h0().F1(k1hVarE2, false);
                        } catch (Throwable th2) {
                            th = th2;
                            ichVar.h0().q1();
                            throw th;
                        }
                    } else {
                        i = 0;
                        ichVar = this;
                    }
                    if (q5hVarJ2.i(o5h.ANALYTICS_STORAGE) && !TextUtils.isEmpty(k1hVarE2.F())) {
                        String strF = k1hVarE2.F();
                        oa7.A(strF);
                        u3hVarW.v(strF);
                    }
                    if (!TextUtils.isEmpty(k1hVarE2.K())) {
                        String strK = k1hVarE2.K();
                        oa7.A(strK);
                        u3hVarW.L(strK);
                    }
                    listX1 = ichVar.h0().x1(str4);
                    i2 = i;
                    while (i2 < listX1.size()) {
                        n4h n4hVarC = p4h.C();
                        String str29 = ((och) listX1.get(i2)).c;
                        n4hVarC.c();
                        ((p4h) n4hVarC.b).E(str29);
                        long j9 = ((och) listX1.get(i2)).d;
                        n4hVarC.c();
                        ((p4h) n4hVarC.b).D(j9);
                        ichVar.k0().X0(n4hVarC, ((och) listX1.get(i2)).e);
                        u3hVarW.b0(n4hVarC);
                        if ("_sid".equals(((och) listX1.get(i2)).c)) {
                            m3h m3hVar6 = k1hVarE2.a.g;
                            w3h.h(m3hVar6);
                            m3hVar6.A0();
                            if (k1hVarE2.w != 0) {
                                lchVarK0 = ichVar.k0();
                                if (TextUtils.isEmpty(str10)) {
                                    str15 = str10;
                                    jJ1 = 0;
                                } else {
                                    str15 = str10;
                                    jJ1 = lchVarK0.j1(str15.getBytes(StandardCharsets.UTF_8));
                                }
                                m3h m3hVar7 = k1hVarE2.a.g;
                                w3h.h(m3hVar7);
                                m3hVar7.A0();
                                if (jJ1 != k1hVarE2.w) {
                                    u3hVarW.c();
                                    ((z3h) u3hVarW.b).b1();
                                }
                            } else {
                                str15 = str10;
                            }
                        } else {
                            str15 = str10;
                        }
                        i2++;
                        str10 = str15;
                    }
                    try {
                        krgVarH2 = ichVar.h0();
                        z3h z3hVar = (z3h) u3hVarW.e();
                        krgVarH2.A0();
                        krgVarH2.B0();
                        oa7.x(z3hVar.r());
                        byte[] bArrA = z3hVar.a();
                        long jJ2 = krgVarH2.c.k0().j1(bArrA);
                        ContentValues contentValues2 = new ContentValues();
                        String str30 = str;
                        contentValues2.put(str30, z3hVar.r());
                        contentValues2.put("metadata_fingerprint", Long.valueOf(jJ2));
                        contentValues2.put("metadata", bArrA);
                        try {
                            krgVarH2.r1().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                            krgVarH3 = ichVar.h0();
                            ylVar3 = ylVar2;
                            it2 = ((esg) ylVar3.h).a.keySet().iterator();
                            do {
                                if (!it2.hasNext()) {
                                    y2h y2hVarG1 = ichVar.g0();
                                    String str31 = (String) ylVar3.e;
                                    zQ0 = y2hVarG1.Q0(str31, (String) ylVar3.f);
                                    drg drgVarG1 = ichVar.h0().G1(ichVar.b(), str31, false, false, false, false);
                                    if (!zQ0 && drgVarG1.e < ichVar.f0().J0(str31, bzg.p)) {
                                        break;
                                    }
                                    i3 = i;
                                    break;
                                }
                            } while (!"_r".equals(it2.next()));
                            krgVarH3.A0();
                            krgVarH3.B0();
                            str14 = (String) ylVar3.e;
                            oa7.x(str14);
                            byte[] bArrA2 = krgVarH3.c.k0().a1(ylVar3).a();
                            contentValues = new ContentValues();
                            contentValues.put(str30, str14);
                            contentValues.put("name", (String) ylVar3.f);
                            contentValues.put("timestamp", Long.valueOf(ylVar3.b));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jJ2));
                            contentValues.put("data", bArrA2);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            contentValues.put("elapsed_time", Long.valueOf(ylVar3.c));
                            try {
                                if (krgVarH3.r1().insert("raw_events", null, contentValues) == -1) {
                                    ((w3h) krgVarH3.b).v().g.b(w0h.E0(str14), "Failed to insert raw event (got -1). appId");
                                } else {
                                    ichVar.Z = 0L;
                                }
                            } catch (SQLiteException e2) {
                                ((w3h) krgVarH3.b).v().g.c(w0h.E0((String) ylVar3.e), e2, "Error storing raw event. appId");
                            }
                            ichVar.h0().p1();
                            ichVar.h0().q1();
                            ichVar.L();
                            ichVar.v().Z.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e3) {
                            ((w3h) krgVarH2.b).v().g.c(w0h.E0(z3hVar.r()), e3, "Error storing raw event metadata. appId");
                            throw e3;
                        }
                    } catch (IOException e4) {
                        ichVar.v().g.c(w0h.E0(u3hVarW.o()), e4, "Data loss. Failed to insert raw event metadata. appId");
                    }
                }
                h0().q1();
            }
            String strE = esgVar3.e();
            str = "app_id";
            Bundle bundle3 = esgVar3.a;
            esgVar = esgVar3;
            if (z11) {
                double dDoubleValue = esgVar.d().doubleValue() * 1000000.0d;
                if (dDoubleValue == 0.0d) {
                    dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                }
                if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                    v().x.c(w0h.E0(str17), Double.valueOf(dDoubleValue), "Data lost. Currency value is too big. appId");
                    h0().p1();
                } else {
                    jRound = Math.round(dDoubleValue);
                    if ("refund".equals(str23)) {
                        jRound = -jRound;
                    }
                }
                h0().q1();
            }
            z10 = z10;
            jRound = bundle3.getLong("value");
            if (!TextUtils.isEmpty(strE)) {
                String upperCase = strE.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String strConcat = "_ltv_".concat(upperCase);
                    och ochVarW2 = h0().w1(str17, strConcat);
                    try {
                        if (ochVarW2 != null) {
                            Object obj3 = ochVarW2.e;
                            if (obj3 instanceof Long) {
                                String str32 = hsgVarB.c;
                                E().getClass();
                                str2 = str23;
                                ochVar = new och(str17, str32, strConcat, System.currentTimeMillis(), Long.valueOf(((Long) obj3).longValue() + jRound));
                            }
                            if (h0().v1(ochVar)) {
                                yeaVar = yeaVar2;
                            } else {
                                v().g.d("Too many unique user properties are set. Ignoring user property. appId", w0h.E0(str17), w3hVar2.x.c(ochVar.c), ochVar.e);
                                l0();
                                qch.S0(yeaVar2, str17, 9, null, null, 0);
                                yeaVar = yeaVar2;
                            }
                        }
                        krgVarH0.r1().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str17, str17, String.valueOf(iJ0)});
                    } catch (SQLiteException e5) {
                        ((w3h) krgVarH0.b).v().g.c(w0h.E0(str17), e5, "Error pruning currencies. appId");
                    }
                    long j10 = jRound;
                    str2 = str23;
                    krgVarH0 = h0();
                    iJ0 = f0().J0(str17, bzg.T) - 1;
                    oa7.x(str17);
                    krgVarH0.A0();
                    krgVarH0.B0();
                    String str33 = hsgVarB.c;
                    E().getClass();
                    ochVar = new och(str17, str33, strConcat, System.currentTimeMillis(), Long.valueOf(j10));
                    if (h0().v1(ochVar)) {
                        v().g.d("Too many unique user properties are set. Ignoring user property. appId", w0h.E0(str17), w3hVar2.x.c(ochVar.c), ochVar.e);
                        l0();
                        qch.S0(yeaVar2, str17, 9, null, null, 0);
                        yeaVar = yeaVar2;
                    } else {
                        yeaVar = yeaVar2;
                    }
                }
                zB1 = qch.B1(str2);
                str3 = str2;
                zEquals = str20.equals(str3);
                l0();
                if (esgVar == null) {
                    length = 0;
                } else {
                    it = esgVar.a.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objC = esgVar.c(it.next());
                        if (objC instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objC).length;
                        }
                    }
                }
                esgVar2 = esgVar;
                drgVarH1 = h0().H1(b(), str17, length + 1, true, zB1, false, zEquals, false, false, false);
                long j11 = drgVarH1.b;
                f0();
                jIntValue = j11 - ((long) ((Integer) bzg.l.a(null)).intValue());
                if (jIntValue > 0) {
                    if (zB1) {
                        long j12 = drgVarH1.a;
                        f0();
                        jIntValue2 = j12 - ((long) ((Integer) bzg.n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.a), "Data loss. Too many public events logged. appId, count");
                            }
                            l0();
                            qch.S0(yeaVar, str17, 16, "_ev", hsgVarB.a, 0);
                            h0().p1();
                        }
                    }
                    if (zEquals) {
                        jMax = drgVarH1.d - ((long) Math.max(0, Math.min(1000000, f0().J0(str17, bzg.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.d), "Too many error events logged. appId, count");
                            }
                            h0().p1();
                        }
                    }
                    bundleF = esgVar2.f();
                    l0().R0(bundleF, "_o", hsgVarB.c);
                    if (l0().g1(str17, ndhVar.Q0)) {
                        l0().R0(bundleF, "_dbg", 1L);
                        l0().R0(bundleF, "_r", 1L);
                    }
                    if ("_s".equals(str3)) {
                        obj = ochVarW1.e;
                        if (obj instanceof Long) {
                            l0().R0(bundleF, "_sno", obj);
                        }
                    }
                    krgVarH1 = h0();
                    oa7.x(str17);
                    krgVarH1.A0();
                    krgVarH1.B0();
                    jDelete = krgVarH1.r1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str17, String.valueOf(Math.max(0, Math.min(1000000, ((w3h) krgVarH1.b).d.J0(str17, bzg.q))))});
                    if (jDelete > 0) {
                        v().x.c(w0h.E0(str17), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                    }
                    w3hVar = this.z;
                    ylVar = new yl(w3hVar, hsgVarB.c, str17, hsgVarB.a, hsgVarB.d, hsgVarB.e, 0L, bundleF);
                    str4 = str17;
                    krg krgVarH5 = h0();
                    str5 = (String) ylVar.f;
                    bsgVarA1 = krgVarH5.a1("events", str4, str5);
                    if (bsgVarA1 == null) {
                        jR0 = h0().R0(str4);
                        qqgVarF0 = f0();
                        qqgVarF0.getClass();
                        azgVar = bzg.W;
                        if (jR0 >= Math.max(Math.min(qqgVarF0.J0(str4, azgVar), 2000), 500)) {
                        }
                        str4 = str4;
                        bsgVar = new bsg(str4, str5, 0L, 0L, 0L, ylVar.b, 0L, null, null, null, null);
                        ylVar2 = ylVar;
                    } else {
                        yl ylVarC2 = ylVar.c(w3hVar, bsgVarA1.f);
                        bsg bsgVarA2 = bsgVarA1.a(ylVarC2.b);
                        ylVar2 = ylVarC2;
                        bsgVar = bsgVarA2;
                    }
                    h0().b1("events", bsgVar);
                    Z().A0();
                    m0();
                    String str210 = (String) ylVar2.e;
                    oa7.x(str210);
                    oa7.v(str210.equals(str4));
                    u3hVarW = z3h.W();
                    u3hVarW.z();
                    u3hVarW.j();
                    if (!TextUtils.isEmpty(str4)) {
                        u3hVarW.p(str4);
                    }
                    str6 = ndhVar.d;
                    if (!TextUtils.isEmpty(str6)) {
                        u3hVarW.n(str6);
                    }
                    str7 = ndhVar.c;
                    if (!TextUtils.isEmpty(str7)) {
                        u3hVarW.q(str7);
                    }
                    str8 = ndhVar.J0;
                    if (!TextUtils.isEmpty(str8)) {
                        u3hVarW.S(str8);
                    }
                    j = ndhVar.x;
                    if (j != -2147483648L) {
                        u3hVarW.M((int) j);
                    }
                    j2 = ndhVar.e;
                    u3hVarW.r(j2);
                    if (TextUtils.isEmpty(str21)) {
                        str9 = str21;
                        u3hVarW.I(str9);
                    } else {
                        str9 = str21;
                    }
                    oa7.A(str4);
                    str10 = str8;
                    q5h q5hVarA2 = a(str4);
                    String str211 = ndhVar.H0;
                    q5hVarJ = q5hVarA2.j(q5h.c(100, str211));
                    u3hVarW.R(q5hVarJ.f());
                    upg.a();
                    zL0 = f0().L0(str4, bzg.O0);
                    o5hVar = o5h.AD_STORAGE;
                    if (zL0) {
                        l0();
                        if (qch.d1((String) bzg.q0.a(null), str4)) {
                            u3hVarW.A(ndhVar.O0);
                            str11 = str9;
                            str12 = str7;
                            j5 = ndhVar.P0;
                            if (!q5hVarJ.i(o5hVar)) {
                                j5 = (j5 & (-2)) | 32;
                            }
                            if (j5 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            u3hVarW.V(z2);
                            if (j5 != 0) {
                                v1h v1hVarY2 = w1h.y();
                                if ((j5 & 1) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                v1hVarY2.h(z3);
                                if ((j5 & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                v1hVarY2.i(z4);
                                if ((j5 & 4) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                v1hVarY2.j(z5);
                                if ((j5 & 8) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                v1hVarY2.k(z6);
                                if ((j5 & 16) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                v1hVarY2.l(z7);
                                if ((j5 & 32) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                v1hVarY2.m(z8);
                                if ((j5 & 64) != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                v1hVarY2.n(z9);
                                u3hVarW.B((w1h) v1hVarY2.e());
                            }
                        } else {
                            str11 = str9;
                            str12 = str7;
                        }
                    } else {
                        str11 = str9;
                        str12 = str7;
                    }
                    j3 = ndhVar.f;
                    if (j3 != 0) {
                        u3hVarW.w(j3);
                    }
                    j4 = ndhVar.F0;
                    u3hVarW.P(j4);
                    str13 = str12;
                    if (f0().L0(null, bzg.U0)) {
                        f0();
                        u3hVarW.F(oog.a());
                    }
                    if (f0().L0(null, bzg.V0)) {
                        u3hVarW.O(listR0);
                    }
                    q5hVarJ2 = a(str4).j(q5h.c(100, str211));
                    if (q5hVarJ2.i(o5hVar)) {
                        z = ndhVar.Y;
                        if (z) {
                            pairE0 = this.w.E0(ndhVar, q5hVarJ2);
                            if (TextUtils.isEmpty((CharSequence) pairE0.first)) {
                                j4 = j4;
                            } else {
                                j4 = j4;
                            }
                        } else {
                            j4 = j4;
                        }
                    } else {
                        j4 = j4;
                    }
                    w3hVar.k().C0();
                    String str212 = Build.MODEL;
                    u3hVarW.k();
                    w3hVar.k().C0();
                    String str213 = Build.VERSION.RELEASE;
                    u3hVarW.c();
                    ((z3h) u3hVarW.b).q0(str213);
                    u3hVarW.m((int) w3hVar.k().E0());
                    u3hVarW.l(w3hVar.k().F0());
                    u3hVarW.T(ndhVar.L0);
                    if (w3hVar.a()) {
                        u3hVarW.o();
                        if (!TextUtils.isEmpty(null)) {
                            u3hVarW.c();
                            ((z3h) u3hVarW.b).T0(null);
                            throw null;
                        }
                    }
                    k1hVarE2 = h0().E1(str4);
                    if (k1hVarE2 == null) {
                        k1hVarE2 = new k1h(w3hVar, str4);
                        ichVar = this;
                        k1hVarE2.G(ichVar.j(q5hVarJ2));
                        k1hVarE2.L(ndhVar.y);
                        k1hVarE2.I(str11);
                        if (q5hVarJ2.i(o5hVar)) {
                            k1hVarE2.J(ichVar.w.G0(ndhVar, q5hVarJ2));
                        }
                        k1hVarE2.e(0L);
                        k1hVarE2.M(0L);
                        k1hVarE2.N(0L);
                        k1hVarE2.P(str13);
                        k1hVarE2.R(j);
                        k1hVarE2.S(str6);
                        k1hVarE2.T(j2);
                        k1hVarE2.a(j3);
                        k1hVarE2.d(z10);
                        k1hVarE2.c(j4);
                        i = 0;
                        ichVar.h0().F1(k1hVarE2, false);
                    } else {
                        i = 0;
                        ichVar = this;
                    }
                    if (q5hVarJ2.i(o5h.ANALYTICS_STORAGE)) {
                        String strF2 = k1hVarE2.F();
                        oa7.A(strF2);
                        u3hVarW.v(strF2);
                    }
                    if (!TextUtils.isEmpty(k1hVarE2.K())) {
                        String strK2 = k1hVarE2.K();
                        oa7.A(strK2);
                        u3hVarW.L(strK2);
                    }
                    listX1 = ichVar.h0().x1(str4);
                    i2 = i;
                    while (i2 < listX1.size()) {
                        n4h n4hVarC2 = p4h.C();
                        String str214 = ((och) listX1.get(i2)).c;
                        n4hVarC2.c();
                        ((p4h) n4hVarC2.b).E(str214);
                        long j13 = ((och) listX1.get(i2)).d;
                        n4hVarC2.c();
                        ((p4h) n4hVarC2.b).D(j13);
                        ichVar.k0().X0(n4hVarC2, ((och) listX1.get(i2)).e);
                        u3hVarW.b0(n4hVarC2);
                        if ("_sid".equals(((och) listX1.get(i2)).c)) {
                            m3h m3hVar8 = k1hVarE2.a.g;
                            w3h.h(m3hVar8);
                            m3hVar8.A0();
                            if (k1hVarE2.w != 0) {
                                lchVarK0 = ichVar.k0();
                                if (TextUtils.isEmpty(str10)) {
                                    str15 = str10;
                                    jJ1 = 0;
                                } else {
                                    str15 = str10;
                                    jJ1 = lchVarK0.j1(str15.getBytes(StandardCharsets.UTF_8));
                                }
                                m3h m3hVar9 = k1hVarE2.a.g;
                                w3h.h(m3hVar9);
                                m3hVar9.A0();
                                if (jJ1 != k1hVarE2.w) {
                                    u3hVarW.c();
                                    ((z3h) u3hVarW.b).b1();
                                }
                            } else {
                                str15 = str10;
                            }
                        } else {
                            str15 = str10;
                        }
                        i2++;
                        str10 = str15;
                    }
                    krgVarH2 = ichVar.h0();
                    z3h z3hVar2 = (z3h) u3hVarW.e();
                    krgVarH2.A0();
                    krgVarH2.B0();
                    oa7.x(z3hVar2.r());
                    byte[] bArrA3 = z3hVar2.a();
                    long jJ3 = krgVarH2.c.k0().j1(bArrA3);
                    ContentValues contentValues3 = new ContentValues();
                    String str34 = str;
                    contentValues3.put(str34, z3hVar2.r());
                    contentValues3.put("metadata_fingerprint", Long.valueOf(jJ3));
                    contentValues3.put("metadata", bArrA3);
                    krgVarH2.r1().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                    krgVarH3 = ichVar.h0();
                    ylVar3 = ylVar2;
                    it2 = ((esg) ylVar3.h).a.keySet().iterator();
                    do {
                        if (!it2.hasNext()) {
                            y2h y2hVarG2 = ichVar.g0();
                            String str35 = (String) ylVar3.e;
                            zQ0 = y2hVarG2.Q0(str35, (String) ylVar3.f);
                            drg drgVarG2 = ichVar.h0().G1(ichVar.b(), str35, false, false, false, false);
                            if (!zQ0) {
                                i3 = i;
                                break;
                            } else {
                                i3 = i;
                                break;
                            }
                        }
                    } while (!"_r".equals(it2.next()));
                    krgVarH3.A0();
                    krgVarH3.B0();
                    str14 = (String) ylVar3.e;
                    oa7.x(str14);
                    byte[] bArrA4 = krgVarH3.c.k0().a1(ylVar3).a();
                    contentValues = new ContentValues();
                    contentValues.put(str34, str14);
                    contentValues.put("name", (String) ylVar3.f);
                    contentValues.put("timestamp", Long.valueOf(ylVar3.b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jJ3));
                    contentValues.put("data", bArrA4);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    contentValues.put("elapsed_time", Long.valueOf(ylVar3.c));
                    if (krgVarH3.r1().insert("raw_events", null, contentValues) == -1) {
                        ((w3h) krgVarH3.b).v().g.b(w0h.E0(str14), "Failed to insert raw event (got -1). appId");
                    } else {
                        ichVar.Z = 0L;
                    }
                    ichVar.h0().p1();
                    ichVar.h0().q1();
                    ichVar.L();
                    ichVar.v().Z.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                }
                if (jIntValue % 1000 == 1) {
                    v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.b), "Data loss. Too many events logged. appId, count");
                }
                h0().p1();
                h0().q1();
            }
            str16 = "_fx";
            str2 = str23;
            str21 = str21;
            yeaVar = yeaVar2;
            str20 = str20;
            esgVar = esgVar;
            zB1 = qch.B1(str2);
            str3 = str2;
            zEquals = str20.equals(str3);
            l0();
            if (esgVar == null) {
                length = 0;
            } else {
                it = esgVar.a.keySet().iterator();
                length = 0;
                while (it.hasNext()) {
                    objC = esgVar.c(it.next());
                    if (objC instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objC).length;
                    }
                }
            }
            esgVar2 = esgVar;
            drgVarH1 = h0().H1(b(), str17, length + 1, true, zB1, false, zEquals, false, false, false);
            long j14 = drgVarH1.b;
            f0();
            jIntValue = j14 - ((long) ((Integer) bzg.l.a(null)).intValue());
            if (jIntValue > 0) {
                if (zB1) {
                    long j15 = drgVarH1.a;
                    f0();
                    jIntValue2 = j15 - ((long) ((Integer) bzg.n.a(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.a), "Data loss. Too many public events logged. appId, count");
                        }
                        l0();
                        qch.S0(yeaVar, str17, 16, "_ev", hsgVarB.a, 0);
                        h0().p1();
                    }
                }
                if (zEquals) {
                    jMax = drgVarH1.d - ((long) Math.max(0, Math.min(1000000, f0().J0(str17, bzg.m))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.d), "Too many error events logged. appId, count");
                        }
                        h0().p1();
                    }
                }
                bundleF = esgVar2.f();
                l0().R0(bundleF, "_o", hsgVarB.c);
                if (l0().g1(str17, ndhVar.Q0)) {
                    l0().R0(bundleF, "_dbg", 1L);
                    l0().R0(bundleF, "_r", 1L);
                }
                if ("_s".equals(str3)) {
                    obj = ochVarW1.e;
                    if (obj instanceof Long) {
                        l0().R0(bundleF, "_sno", obj);
                    }
                }
                krgVarH1 = h0();
                oa7.x(str17);
                krgVarH1.A0();
                krgVarH1.B0();
                jDelete = krgVarH1.r1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str17, String.valueOf(Math.max(0, Math.min(1000000, ((w3h) krgVarH1.b).d.J0(str17, bzg.q))))});
                if (jDelete > 0) {
                    v().x.c(w0h.E0(str17), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                }
                w3hVar = this.z;
                ylVar = new yl(w3hVar, hsgVarB.c, str17, hsgVarB.a, hsgVarB.d, hsgVarB.e, 0L, bundleF);
                str4 = str17;
                krg krgVarH6 = h0();
                str5 = (String) ylVar.f;
                bsgVarA1 = krgVarH6.a1("events", str4, str5);
                if (bsgVarA1 == null) {
                    jR0 = h0().R0(str4);
                    qqgVarF0 = f0();
                    qqgVarF0.getClass();
                    azgVar = bzg.W;
                    if (jR0 >= Math.max(Math.min(qqgVarF0.J0(str4, azgVar), 2000), 500)) {
                    }
                    str4 = str4;
                    bsgVar = new bsg(str4, str5, 0L, 0L, 0L, ylVar.b, 0L, null, null, null, null);
                    ylVar2 = ylVar;
                } else {
                    yl ylVarC3 = ylVar.c(w3hVar, bsgVarA1.f);
                    bsg bsgVarA3 = bsgVarA1.a(ylVarC3.b);
                    ylVar2 = ylVarC3;
                    bsgVar = bsgVarA3;
                }
                h0().b1("events", bsgVar);
                Z().A0();
                m0();
                String str215 = (String) ylVar2.e;
                oa7.x(str215);
                oa7.v(str215.equals(str4));
                u3hVarW = z3h.W();
                u3hVarW.z();
                u3hVarW.j();
                if (!TextUtils.isEmpty(str4)) {
                    u3hVarW.p(str4);
                }
                str6 = ndhVar.d;
                if (!TextUtils.isEmpty(str6)) {
                    u3hVarW.n(str6);
                }
                str7 = ndhVar.c;
                if (!TextUtils.isEmpty(str7)) {
                    u3hVarW.q(str7);
                }
                str8 = ndhVar.J0;
                if (!TextUtils.isEmpty(str8)) {
                    u3hVarW.S(str8);
                }
                j = ndhVar.x;
                if (j != -2147483648L) {
                    u3hVarW.M((int) j);
                }
                j2 = ndhVar.e;
                u3hVarW.r(j2);
                if (TextUtils.isEmpty(str21)) {
                    str9 = str21;
                    u3hVarW.I(str9);
                } else {
                    str9 = str21;
                }
                oa7.A(str4);
                str10 = str8;
                q5h q5hVarA3 = a(str4);
                String str216 = ndhVar.H0;
                q5hVarJ = q5hVarA3.j(q5h.c(100, str216));
                u3hVarW.R(q5hVarJ.f());
                upg.a();
                zL0 = f0().L0(str4, bzg.O0);
                o5hVar = o5h.AD_STORAGE;
                if (zL0) {
                    l0();
                    if (qch.d1((String) bzg.q0.a(null), str4)) {
                        u3hVarW.A(ndhVar.O0);
                        str11 = str9;
                        str12 = str7;
                        j5 = ndhVar.P0;
                        if (!q5hVarJ.i(o5hVar)) {
                            j5 = (j5 & (-2)) | 32;
                        }
                        if (j5 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        u3hVarW.V(z2);
                        if (j5 != 0) {
                            v1h v1hVarY3 = w1h.y();
                            if ((j5 & 1) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            v1hVarY3.h(z3);
                            if ((j5 & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            v1hVarY3.i(z4);
                            if ((j5 & 4) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            v1hVarY3.j(z5);
                            if ((j5 & 8) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            v1hVarY3.k(z6);
                            if ((j5 & 16) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            v1hVarY3.l(z7);
                            if ((j5 & 32) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            v1hVarY3.m(z8);
                            if ((j5 & 64) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            v1hVarY3.n(z9);
                            u3hVarW.B((w1h) v1hVarY3.e());
                        }
                    } else {
                        str11 = str9;
                        str12 = str7;
                    }
                } else {
                    str11 = str9;
                    str12 = str7;
                }
                j3 = ndhVar.f;
                if (j3 != 0) {
                    u3hVarW.w(j3);
                }
                j4 = ndhVar.F0;
                u3hVarW.P(j4);
                str13 = str12;
                if (f0().L0(null, bzg.U0)) {
                    f0();
                    u3hVarW.F(oog.a());
                }
                if (f0().L0(null, bzg.V0)) {
                    u3hVarW.O(listR0);
                }
                q5hVarJ2 = a(str4).j(q5h.c(100, str216));
                if (q5hVarJ2.i(o5hVar)) {
                    z = ndhVar.Y;
                    if (z) {
                        pairE0 = this.w.E0(ndhVar, q5hVarJ2);
                        if (TextUtils.isEmpty((CharSequence) pairE0.first)) {
                            j4 = j4;
                        } else {
                            j4 = j4;
                        }
                    } else {
                        j4 = j4;
                    }
                } else {
                    j4 = j4;
                }
                w3hVar.k().C0();
                String str217 = Build.MODEL;
                u3hVarW.k();
                w3hVar.k().C0();
                String str218 = Build.VERSION.RELEASE;
                u3hVarW.c();
                ((z3h) u3hVarW.b).q0(str218);
                u3hVarW.m((int) w3hVar.k().E0());
                u3hVarW.l(w3hVar.k().F0());
                u3hVarW.T(ndhVar.L0);
                if (w3hVar.a()) {
                    u3hVarW.o();
                    if (!TextUtils.isEmpty(null)) {
                        u3hVarW.c();
                        ((z3h) u3hVarW.b).T0(null);
                        throw null;
                    }
                }
                k1hVarE2 = h0().E1(str4);
                if (k1hVarE2 == null) {
                    k1hVarE2 = new k1h(w3hVar, str4);
                    ichVar = this;
                    k1hVarE2.G(ichVar.j(q5hVarJ2));
                    k1hVarE2.L(ndhVar.y);
                    k1hVarE2.I(str11);
                    if (q5hVarJ2.i(o5hVar)) {
                        k1hVarE2.J(ichVar.w.G0(ndhVar, q5hVarJ2));
                    }
                    k1hVarE2.e(0L);
                    k1hVarE2.M(0L);
                    k1hVarE2.N(0L);
                    k1hVarE2.P(str13);
                    k1hVarE2.R(j);
                    k1hVarE2.S(str6);
                    k1hVarE2.T(j2);
                    k1hVarE2.a(j3);
                    k1hVarE2.d(z10);
                    k1hVarE2.c(j4);
                    i = 0;
                    ichVar.h0().F1(k1hVarE2, false);
                } else {
                    i = 0;
                    ichVar = this;
                }
                if (q5hVarJ2.i(o5h.ANALYTICS_STORAGE)) {
                    String strF3 = k1hVarE2.F();
                    oa7.A(strF3);
                    u3hVarW.v(strF3);
                }
                if (!TextUtils.isEmpty(k1hVarE2.K())) {
                    String strK3 = k1hVarE2.K();
                    oa7.A(strK3);
                    u3hVarW.L(strK3);
                }
                listX1 = ichVar.h0().x1(str4);
                i2 = i;
                while (i2 < listX1.size()) {
                    n4h n4hVarC3 = p4h.C();
                    String str219 = ((och) listX1.get(i2)).c;
                    n4hVarC3.c();
                    ((p4h) n4hVarC3.b).E(str219);
                    long j16 = ((och) listX1.get(i2)).d;
                    n4hVarC3.c();
                    ((p4h) n4hVarC3.b).D(j16);
                    ichVar.k0().X0(n4hVarC3, ((och) listX1.get(i2)).e);
                    u3hVarW.b0(n4hVarC3);
                    if ("_sid".equals(((och) listX1.get(i2)).c)) {
                        m3h m3hVar10 = k1hVarE2.a.g;
                        w3h.h(m3hVar10);
                        m3hVar10.A0();
                        if (k1hVarE2.w != 0) {
                            lchVarK0 = ichVar.k0();
                            if (TextUtils.isEmpty(str10)) {
                                str15 = str10;
                                jJ1 = 0;
                            } else {
                                str15 = str10;
                                jJ1 = lchVarK0.j1(str15.getBytes(StandardCharsets.UTF_8));
                            }
                            m3h m3hVar11 = k1hVarE2.a.g;
                            w3h.h(m3hVar11);
                            m3hVar11.A0();
                            if (jJ1 != k1hVarE2.w) {
                                u3hVarW.c();
                                ((z3h) u3hVarW.b).b1();
                            }
                        } else {
                            str15 = str10;
                        }
                    } else {
                        str15 = str10;
                    }
                    i2++;
                    str10 = str15;
                }
                krgVarH2 = ichVar.h0();
                z3h z3hVar3 = (z3h) u3hVarW.e();
                krgVarH2.A0();
                krgVarH2.B0();
                oa7.x(z3hVar3.r());
                byte[] bArrA5 = z3hVar3.a();
                long jJ4 = krgVarH2.c.k0().j1(bArrA5);
                ContentValues contentValues4 = new ContentValues();
                String str36 = str;
                contentValues4.put(str36, z3hVar3.r());
                contentValues4.put("metadata_fingerprint", Long.valueOf(jJ4));
                contentValues4.put("metadata", bArrA5);
                krgVarH2.r1().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                krgVarH3 = ichVar.h0();
                ylVar3 = ylVar2;
                it2 = ((esg) ylVar3.h).a.keySet().iterator();
                do {
                    if (!it2.hasNext()) {
                        y2h y2hVarG3 = ichVar.g0();
                        String str37 = (String) ylVar3.e;
                        zQ0 = y2hVarG3.Q0(str37, (String) ylVar3.f);
                        drg drgVarG3 = ichVar.h0().G1(ichVar.b(), str37, false, false, false, false);
                        if (!zQ0) {
                            i3 = i;
                            break;
                        } else {
                            i3 = i;
                            break;
                        }
                    }
                } while (!"_r".equals(it2.next()));
                krgVarH3.A0();
                krgVarH3.B0();
                str14 = (String) ylVar3.e;
                oa7.x(str14);
                byte[] bArrA6 = krgVarH3.c.k0().a1(ylVar3).a();
                contentValues = new ContentValues();
                contentValues.put(str36, str14);
                contentValues.put("name", (String) ylVar3.f);
                contentValues.put("timestamp", Long.valueOf(ylVar3.b));
                contentValues.put("metadata_fingerprint", Long.valueOf(jJ4));
                contentValues.put("data", bArrA6);
                contentValues.put("realtime", Integer.valueOf(i3));
                contentValues.put("elapsed_time", Long.valueOf(ylVar3.c));
                if (krgVarH3.r1().insert("raw_events", null, contentValues) == -1) {
                    ((w3h) krgVarH3.b).v().g.b(w0h.E0(str14), "Failed to insert raw event (got -1). appId");
                } else {
                    ichVar.Z = 0L;
                }
                ichVar.h0().p1();
                ichVar.h0().q1();
                ichVar.L();
                ichVar.v().Z.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                return;
            }
            if (jIntValue % 1000 == 1) {
                v().g.c(w0h.E0(str17), Long.valueOf(drgVarH1.b), "Data loss. Too many events logged. appId, count");
            }
            h0().p1();
            h0().q1();
        } catch (Throwable th3) {
            th = th3;
            ichVar = this;
            ichVar.h0().q1();
            throw th;
        }
    }

    public final y2h g0() {
        y2h y2hVar = this.a;
        S(y2hVar);
        return y2hVar;
    }

    public final void h(k1h k1hVar, u3h u3hVar) {
        ysd ysdVar;
        p4h p4hVar;
        Z().A0();
        m0();
        String strD0 = ((z3h) u3hVar.b).D0();
        EnumMap enumMap = new EnumMap(o5h.class);
        int i = 0;
        if (strD0.length() < o5h.values().length || strD0.charAt(0) != '1') {
            ysdVar = new ysd(8);
        } else {
            o5h[] o5hVarArrValues = o5h.values();
            int length = o5hVarArrValues.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length) {
                enumMap.put(o5hVarArrValues[i2], sqg.a(strD0.charAt(i3)));
                i2++;
                i3++;
            }
            ysdVar = new ysd(enumMap);
        }
        String strE = k1hVar.E();
        Z().A0();
        m0();
        q5h q5hVarA = a(strE);
        EnumMap enumMap2 = q5hVarA.a;
        o5h o5hVar = o5h.AD_STORAGE;
        k5h k5hVar = (k5h) enumMap2.get(o5hVar);
        k5h k5hVar2 = k5h.UNINITIALIZED;
        if (k5hVar == null) {
            k5hVar = k5hVar2;
        }
        int i4 = q5hVarA.b;
        int iOrdinal = k5hVar.ordinal();
        sqg sqgVar = sqg.REMOTE_ENFORCED_DEFAULT;
        sqg sqgVar2 = sqg.FAILSAFE;
        if (iOrdinal == 1) {
            ysdVar.o(o5hVar, sqgVar);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            ysdVar.n(o5hVar, i4);
        } else {
            ysdVar.o(o5hVar, sqgVar2);
        }
        o5h o5hVar2 = o5h.ANALYTICS_STORAGE;
        k5h k5hVar3 = (k5h) enumMap2.get(o5hVar2);
        if (k5hVar3 != null) {
            k5hVar2 = k5hVar3;
        }
        int iOrdinal2 = k5hVar2.ordinal();
        if (iOrdinal2 == 1) {
            ysdVar.o(o5hVar2, sqgVar);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            ysdVar.n(o5hVar2, i4);
        } else {
            ysdVar.o(o5hVar2, sqgVar2);
        }
        String strE2 = k1hVar.E();
        Z().A0();
        m0();
        xrg xrgVarR0 = r0(strE2, p0(strE2), a(strE2), ysdVar);
        String str = xrgVarR0.d;
        Boolean bool = xrgVarR0.c;
        oa7.A(bool);
        boolean zBooleanValue = bool.booleanValue();
        u3hVar.c();
        ((z3h) u3hVar.b).h1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            u3hVar.c();
            ((z3h) u3hVar.b).i1(str);
        }
        Z().A0();
        m0();
        Iterator it = Collections.unmodifiableList(((z3h) u3hVar.b).X1()).iterator();
        do {
            if (!it.hasNext()) {
                p4hVar = null;
                break;
            }
            p4hVar = (p4h) it.next();
        } while (!"_npa".equals(p4hVar.t()));
        if (p4hVar != null) {
            EnumMap enumMap3 = (EnumMap) ysdVar.b;
            o5h o5hVar3 = o5h.AD_PERSONALIZATION;
            sqg sqgVar3 = (sqg) enumMap3.get(o5hVar3);
            sqg sqgVar4 = sqg.UNSET;
            if (sqgVar3 == null) {
                sqgVar3 = sqgVar4;
            }
            if (sqgVar3 == sqgVar4) {
                krg krgVar = this.c;
                S(krgVar);
                och ochVarW1 = krgVar.w1(k1hVar.E(), "_npa");
                sqg sqgVar5 = sqg.MANIFEST;
                sqg sqgVar6 = sqg.API;
                if (ochVarW1 != null) {
                    String str2 = ochVarW1.b;
                    if ("tcf".equals(str2)) {
                        ysdVar.o(o5hVar3, sqg.TCF);
                    } else if ("app".equals(str2)) {
                        ysdVar.o(o5hVar3, sqgVar6);
                    } else {
                        ysdVar.o(o5hVar3, sqgVar5);
                    }
                } else {
                    Boolean boolX = k1hVar.x();
                    if (boolX == null || ((boolX.booleanValue() && p4hVar.x() != 1) || !(boolX.booleanValue() || p4hVar.x() == 0))) {
                        ysdVar.o(o5hVar3, sqgVar6);
                    } else {
                        ysdVar.o(o5hVar3, sqgVar5);
                    }
                }
            }
        } else {
            int iC = C(ysdVar, k1hVar.E());
            n4h n4hVarC = p4h.C();
            n4hVarC.c();
            ((p4h) n4hVarC.b).E("_npa");
            E().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            n4hVarC.c();
            ((p4h) n4hVarC.b).D(jCurrentTimeMillis);
            n4hVarC.c();
            ((p4h) n4hVarC.b).H(iC);
            p4h p4hVar2 = (p4h) n4hVarC.e();
            u3hVar.c();
            ((z3h) u3hVar.b).f0(p4hVar2);
            v().Z.c("non_personalized_ads(_npa)", Integer.valueOf(iC), "Setting user property");
        }
        String string = ysdVar.toString();
        u3hVar.c();
        ((z3h) u3hVar.b).g1(string);
        String strE3 = k1hVar.E();
        y2h y2hVar = this.a;
        y2hVar.A0();
        y2hVar.G0(strE3);
        szg szgVarW0 = y2hVar.W0(strE3);
        boolean z = szgVarW0 == null || !szgVarW0.u() || szgVarW0.v();
        List listW = u3hVar.W();
        for (int i5 = 0; i5 < listW.size(); i5++) {
            if ("_tcf".equals(((v2h) listW.get(i5)).w())) {
                t2h t2hVar = (t2h) ((v2h) listW.get(i5)).i();
                List listH = t2hVar.h();
                for (int i6 = 0; i6 < listH.size(); i6++) {
                    if ("_tcfd".equals(((e3h) listH.get(i6)).s())) {
                        String strU = ((e3h) listH.get(i6)).u();
                        if (z && strU.length() > 4) {
                            char[] charArray = strU.toCharArray();
                            for (int i7 = 1; i7 < 64; i7++) {
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7)) {
                                    i = i7;
                                    break;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            strU = String.valueOf(charArray);
                        }
                        d3h d3hVarD = e3h.D();
                        d3hVarD.h("_tcfd");
                        d3hVarD.i(strU);
                        t2hVar.c();
                        ((v2h) t2hVar.b).I(i6, (e3h) d3hVarD.e());
                        break;
                    }
                }
                u3hVar.Y(i5, t2hVar);
                return;
            }
        }
    }

    public final krg h0() {
        krg krgVar = this.c;
        S(krgVar);
        return krgVar;
    }

    public final void i(k1h k1hVar, u3h u3hVar) {
        Serializable serializableS0;
        Z().A0();
        m0();
        c1h c1hVarW = o1h.W();
        w3h w3hVar = k1hVar.a;
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.A0();
        byte[] bArr = k1hVar.H;
        if (bArr != null) {
            try {
                c1hVarW = (c1h) lch.l1(c1hVarW, bArr);
            } catch (bng unused) {
                v().x.b(w0h.E0(k1hVar.E()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = u3hVar.W().iterator();
        while (it.hasNext()) {
            v2h v2hVar = (v2h) it.next();
            if (v2hVar.w().equals("_cmp")) {
                e3h e3hVarK0 = lch.K0("gclid", v2hVar);
                Serializable serializableS1 = e3hVarK0 == null ? null : lch.S0(e3hVarK0);
                if (serializableS1 == null) {
                    serializableS1 = "";
                }
                String str = (String) serializableS1;
                e3h e3hVarK1 = lch.K0("gbraid", v2hVar);
                Serializable serializableS2 = e3hVarK1 == null ? null : lch.S0(e3hVarK1);
                if (serializableS2 == null) {
                    serializableS2 = "";
                }
                String str2 = (String) serializableS2;
                e3h e3hVarK2 = lch.K0("gad_source", v2hVar);
                Serializable serializableS3 = e3hVarK2 == null ? null : lch.S0(e3hVarK2);
                if (serializableS3 == null) {
                    serializableS3 = "";
                }
                String str3 = (String) serializableS3;
                e3h e3hVarK3 = lch.K0("deep_link_url", v2hVar);
                Serializable serializableS4 = e3hVarK3 == null ? null : lch.S0(e3hVarK3);
                String str4 = (String) (serializableS4 != null ? serializableS4 : "");
                String[] strArrSplit = ((String) bzg.b1.a(null)).split(",");
                k0();
                HashMap map = new HashMap();
                for (e3h e3hVar : v2hVar.t()) {
                    Iterator it2 = it;
                    if (Arrays.asList(strArrSplit).contains(e3hVar.s()) && (serializableS0 = lch.S0(e3hVar)) != null) {
                        map.put(e3hVar.s(), serializableS0);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!map.isEmpty()) {
                    e3h e3hVarK4 = lch.K0("click_timestamp", v2hVar);
                    Serializable serializableS5 = e3hVarK4 == null ? null : lch.S0(e3hVarK4);
                    long jLongValue = ((Long) (serializableS5 != null ? serializableS5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = v2hVar.y();
                    }
                    long j = jLongValue;
                    e3h e3hVarK5 = lch.K0("_cis", v2hVar);
                    if ("referrer API v2".equals(e3hVarK5 == null ? null : lch.S0(e3hVarK5))) {
                        if (j > ((o1h) c1hVarW.b).T()) {
                            if (str.isEmpty()) {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).u();
                            } else {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).t(str);
                            }
                            if (str2.isEmpty()) {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).w();
                            } else {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).v(str2);
                            }
                            if (str3.isEmpty()) {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).y();
                            } else {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).x(str3);
                            }
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).z(j);
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).B().clear();
                            HashMap mapD = D(v2hVar);
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).B().putAll(mapD);
                        }
                    } else if (j > ((o1h) c1hVarW.b).L()) {
                        if (str.isEmpty()) {
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).Z();
                        } else {
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).Y(str);
                        }
                        if (str2.isEmpty()) {
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).b0();
                        } else {
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).a0(str2);
                        }
                        if (str3.isEmpty()) {
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).r();
                        } else {
                            c1hVarW.c();
                            ((o1h) c1hVarW.b).c0(str3);
                        }
                        if (f0().L0(null, bzg.a1)) {
                            if (str4.isEmpty()) {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).D();
                            } else {
                                c1hVarW.c();
                                ((o1h) c1hVarW.b).C(str4);
                            }
                        }
                        c1hVarW.c();
                        ((o1h) c1hVarW.b).s(j);
                        c1hVarW.c();
                        ((o1h) c1hVarW.b).A().clear();
                        HashMap mapD2 = D(v2hVar);
                        c1hVarW.c();
                        ((o1h) c1hVarW.b).A().putAll(mapD2);
                    }
                }
                it = it3;
            }
        }
        if (!((o1h) c1hVarW.e()).equals(o1h.X())) {
            o1h o1hVar = (o1h) c1hVarW.e();
            u3hVar.c();
            ((z3h) u3hVar.b).m1(o1hVar);
        }
        byte[] bArrA = ((o1h) c1hVarW.e()).a();
        m3h m3hVar2 = w3hVar.g;
        w3h.h(m3hVar2);
        m3hVar2.A0();
        k1hVar.R |= k1hVar.H != bArrA;
        k1hVar.H = bArrA;
        if (k1hVar.o()) {
            krg krgVar = this.c;
            S(krgVar);
            krgVar.F1(k1hVar, false);
        }
        if (f0().L0(null, bzg.a1)) {
            for (int i = 0; i < u3hVar.X(); i++) {
                v2h v2hVarW1 = ((z3h) u3hVar.b).W1(i);
                if ("_cmp".equals(v2hVarW1.w())) {
                    t2h t2hVar = (t2h) v2hVarW1.i();
                    List listH = t2hVar.h();
                    for (int i2 = 0; i2 < listH.size(); i2++) {
                        if ("deep_link_url".equals(((e3h) listH.get(i2)).s())) {
                            t2hVar.m(i2);
                            u3hVar.Y(i, t2hVar);
                            break;
                        }
                    }
                }
            }
        }
        if (f0().L0(null, bzg.Z0)) {
            krg krgVar2 = this.c;
            S(krgVar2);
            krgVar2.u1(k1hVar.E(), "_lgclid");
        }
    }

    public final q1h i0() {
        q1h q1hVar = this.d;
        if (q1hVar != null) {
            return q1hVar;
        }
        qc0.p("Network broadcast receiver not created");
        return null;
    }

    public final String j(q5h q5hVar) {
        if (!q5hVar.i(o5h.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        l0().A1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final fmg j0() {
        fmg fmgVar = this.f;
        S(fmgVar);
        return fmgVar;
    }

    public final void k(ArrayList arrayList) {
        oa7.v(!arrayList.isEmpty());
        if (this.N0 != null) {
            v().g.a("Set uploading progress before finishing the previous upload");
        } else {
            this.N0 = new ArrayList(arrayList);
        }
    }

    public final lch k0() {
        lch lchVar = this.g;
        S(lchVar);
        return lchVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ich] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
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
    public final void l() {
        SQLiteException e;
        k1h k1hVarE1;
        Z().A0();
        m0();
        this.K0 = true;
        try {
            w3h w3hVar = this.z;
            w3hVar.getClass();
            Boolean bool = w3hVar.j().f;
            if (bool == null) {
                v().x.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                v().g.a("Upload called in the client side when service should be used");
            } else if (this.Z > 0) {
                L();
            } else {
                Z().A0();
                if (this.N0 != null) {
                    v().Z.a("Uploading requested multiple times");
                } else {
                    g1h g1hVar = this.b;
                    S(g1hVar);
                    if (g1hVar.E0()) {
                        E().getClass();
                        ?? CurrentTimeMillis = System.currentTimeMillis();
                        ?? r7 = 0;
                        cursorRawQuery = null;
                        Cursor cursorRawQuery = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iJ0 = f0().J0(null, bzg.h0);
                        f0();
                        long jLongValue = CurrentTimeMillis - ((Long) bzg.e.a(null)).longValue();
                        for (int i = 0; i < iJ0 && G(jLongValue, null); i++) {
                        }
                        upg.a();
                        Z().A0();
                        F();
                        long jA = this.w.w.a();
                        if (jA != 0) {
                            v().Y.b(Long.valueOf(Math.abs(CurrentTimeMillis - jA)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        krg krgVar = this.c;
                        S(krgVar);
                        String strI0 = krgVar.I0();
                        long j = -1;
                        if (TextUtils.isEmpty(strI0)) {
                            try {
                                this.P0 = -1L;
                                krg krgVar2 = this.c;
                                S(krgVar2);
                                f0();
                                long jLongValue2 = CurrentTimeMillis - ((Long) bzg.e.a(null)).longValue();
                                krgVar2.A0();
                                krgVar2.B0();
                                try {
                                    CurrentTimeMillis = krgVar2.r1().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                    try {
                                        if (CurrentTimeMillis.moveToFirst()) {
                                            string = CurrentTimeMillis.getString(0);
                                        } else {
                                            w0h w0hVar = ((w3h) krgVar2.b).f;
                                            w3h.h(w0hVar);
                                            w0hVar.Z.a("No expired configs for apps with pending events");
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        w0h w0hVar2 = ((w3h) krgVar2.b).f;
                                        w3h.h(w0hVar2);
                                        w0hVar2.g.b(e, "Error selecting expired configs");
                                        if (CurrentTimeMillis != 0) {
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            krg krgVar3 = this.c;
                                            S(krgVar3);
                                            k1hVarE1 = krgVar3.E1(string);
                                            if (k1hVarE1 != null) {
                                                x(k1hVarE1);
                                            }
                                        }
                                        this.K0 = false;
                                        M();
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    CurrentTimeMillis = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    throw th;
                                }
                                CurrentTimeMillis.close();
                                if (!TextUtils.isEmpty(string)) {
                                    krg krgVar4 = this.c;
                                    S(krgVar4);
                                    k1hVarE1 = krgVar4.E1(string);
                                    if (k1hVarE1 != null) {
                                        x(k1hVarE1);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r7 = CurrentTimeMillis;
                            }
                        } else {
                            if (this.P0 == -1) {
                                krg krgVar5 = this.c;
                                S(krgVar5);
                                try {
                                    try {
                                        cursorRawQuery = krgVar5.r1().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(0);
                                        }
                                    } catch (SQLiteException e4) {
                                        w0h w0hVar3 = ((w3h) krgVar5.b).f;
                                        w3h.h(w0hVar3);
                                        w0hVar3.g.b(e4, "Error querying raw events");
                                        if (cursorRawQuery != null) {
                                        }
                                        this.P0 = j;
                                        m(CurrentTimeMillis, strI0);
                                        this.K0 = false;
                                        M();
                                    }
                                    cursorRawQuery.close();
                                    this.P0 = j;
                                } catch (Throwable th3) {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    throw th3;
                                }
                            }
                            m(CurrentTimeMillis, strI0);
                        }
                    } else {
                        v().Z.a("Network not connected, ignoring upload request");
                        L();
                    }
                }
            }
            this.K0 = false;
            M();
        } catch (Throwable th4) {
            this.K0 = false;
            M();
            throw th4;
        }
    }

    public final qch l0() {
        w3h w3hVar = this.z;
        oa7.A(w3hVar);
        qch qchVar = w3hVar.w;
        w3h.f(qchVar);
        return qchVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0229  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x025c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0268  */
    /* JADX WARN: Code duplicated, block: B:145:0x037f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:175:0x0459 A[LOOP:10: B:151:0x03d9->B:175:0x0459, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x045f  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r11 r24
  0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v55 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v57 android.database.Cursor) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v19 long) = (r24v2 long), (r24v20 long) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x0493  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:193:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:199:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:202:0x0505  */
    /* JADX WARN: Code duplicated, block: B:204:0x051e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0521  */
    /* JADX WARN: Code duplicated, block: B:208:0x0527 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0529  */
    /* JADX WARN: Code duplicated, block: B:210:0x052b  */
    /* JADX WARN: Code duplicated, block: B:211:0x052d  */
    /* JADX WARN: Code duplicated, block: B:212:0x052f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0534  */
    /* JADX WARN: Code duplicated, block: B:216:0x0544  */
    /* JADX WARN: Code duplicated, block: B:218:0x0547  */
    /* JADX WARN: Code duplicated, block: B:219:0x0549  */
    /* JADX WARN: Code duplicated, block: B:224:0x0582  */
    /* JADX WARN: Code duplicated, block: B:226:0x0586  */
    /* JADX WARN: Code duplicated, block: B:230:0x058f  */
    /* JADX WARN: Code duplicated, block: B:233:0x059d  */
    /* JADX WARN: Code duplicated, block: B:236:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:241:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:244:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:247:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:251:0x05f3 A[EDGE_INSN: B:251:0x05f3->B:252:0x05f4 BREAK  A[LOOP:3: B:242:0x05c4->B:250:0x05f0]] */
    /* JADX WARN: Code duplicated, block: B:254:0x060f  */
    /* JADX WARN: Code duplicated, block: B:257:0x061b  */
    /* JADX WARN: Code duplicated, block: B:261:0x064f  */
    /* JADX WARN: Code duplicated, block: B:263:0x0690  */
    /* JADX WARN: Code duplicated, block: B:265:0x069c  */
    /* JADX WARN: Code duplicated, block: B:267:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:270:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:272:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:275:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:278:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:279:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:283:0x0719  */
    /* JADX WARN: Code duplicated, block: B:287:0x0741  */
    /* JADX WARN: Code duplicated, block: B:291:0x0756  */
    /* JADX WARN: Code duplicated, block: B:294:0x0769  */
    /* JADX WARN: Code duplicated, block: B:299:0x0787  */
    /* JADX WARN: Code duplicated, block: B:301:0x079d  */
    /* JADX WARN: Code duplicated, block: B:305:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:307:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:310:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:315:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:317:0x080d  */
    /* JADX WARN: Code duplicated, block: B:319:0x081e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0820  */
    /* JADX WARN: Code duplicated, block: B:323:0x0825 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x0827  */
    /* JADX WARN: Code duplicated, block: B:325:0x0829  */
    /* JADX WARN: Code duplicated, block: B:326:0x082c  */
    /* JADX WARN: Code duplicated, block: B:330:0x0841  */
    /* JADX WARN: Code duplicated, block: B:336:0x0871  */
    /* JADX WARN: Code duplicated, block: B:339:0x0889  */
    /* JADX WARN: Code duplicated, block: B:343:0x089f A[LOOP:7: B:341:0x0899->B:343:0x089f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:347:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:350:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:353:0x092c A[LOOP:8: B:351:0x0926->B:353:0x092c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:356:0x097d  */
    /* JADX WARN: Code duplicated, block: B:358:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:360:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:362:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:365:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:367:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:370:0x09fe A[LOOP:9: B:368:0x09f8->B:370:0x09fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:373:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:? A[LOOP:2: B:234:0x05a1->B:435:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x07f2 A[EDGE_INSN: B:438:0x07f2->B:313:0x07f2 BREAK  A[LOOP:4: B:259:0x064b->B:312:0x07e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x07e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x0778 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x074b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0856 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x084d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:? A[LOOP:6: B:328:0x083b->B:450:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x041a A[EDGE_INSN: B:454:0x041a->B:164:0x041a BREAK  A[LOOP:10: B:151:0x03d9->B:175:0x0459], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r31v0, types: [ich] */
    public final void m(long j, String str) throws Throwable {
        ?? r14;
        long j2;
        Cursor cursorQuery;
        List list;
        List<Pair> list2;
        dpg dpgVar;
        azg azgVar;
        boolean zL0;
        o5h o5hVar;
        List list3;
        q5h q5hVarA;
        o5h o5hVar2;
        int i;
        List listSubList;
        n3h n3hVarY;
        int size;
        ArrayList arrayList;
        int i2;
        boolean zI;
        boolean zI2;
        boolean zL1;
        zbh zbhVar;
        ybh ybhVarB0;
        List list4;
        w3h w3hVar;
        t3h t3hVar;
        ArrayList arrayList2;
        s8h s8hVar;
        boolean z;
        boolean z2;
        String str2;
        g1h g1hVar;
        String strB1;
        Iterator it;
        String string;
        n3h n3hVarZ;
        String strN0;
        ArrayList arrayList3;
        Iterator it2;
        String strH;
        t3h t3hVar2;
        n3h n3hVar;
        int i3;
        n3h n3hVarY2;
        String strN1;
        boolean zIsEmpty;
        s8h s8hVar2;
        s8h s8hVar3;
        ybh ybhVar;
        u3h u3hVar;
        String strX;
        int i4;
        ArrayList arrayList4;
        Iterator it3;
        boolean z3;
        Long lValueOf;
        Long lValueOf2;
        boolean z4;
        boolean z5;
        int i5;
        List list5;
        boolean z6;
        v2h v2hVar;
        e3h e3hVarK0;
        e3h e3hVarK1;
        m4h m4hVar;
        Iterator it4;
        String strX2;
        int i6;
        z3h z3hVar;
        z3h z3hVar2;
        List list6;
        boolean zIsEmpty2;
        ArrayList arrayList5;
        w3h w3hVar2;
        ArrayList arrayList6;
        Cursor cursor;
        w3h w3hVar3;
        List list7;
        Cursor cursorQuery2;
        List list8;
        List list9;
        Iterator it5;
        boolean z7;
        u3h u3hVar2;
        szg szgVarW0;
        ArrayList arrayList7;
        Iterator it6;
        int iR;
        Iterator it7;
        int i7;
        int i8;
        int iT;
        SQLiteDatabase sQLiteDatabaseR1;
        long jCurrentTimeMillis;
        List list10;
        krg krgVar;
        long jX;
        long jX2;
        String str3 = str;
        int iJ0 = f0().J0(str3, bzg.h);
        int i9 = 0;
        int iMax = Math.max(0, f0().J0(str3, bzg.i));
        krg krgVarH0 = h0();
        w3h w3hVar4 = (w3h) krgVarH0.b;
        krgVarH0.A0();
        krgVarH0.B0();
        int i10 = 1;
        oa7.v(iJ0 > 0);
        ?? r11 = iMax > 0 ? 1 : 0;
        oa7.v(r11);
        oa7.x(str3);
        try {
            try {
                try {
                    j2 = -1;
                    try {
                        cursorQuery = krgVarH0.r1().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str3}, null, null, "rowid", String.valueOf(iJ0));
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList8 = new ArrayList();
                                int length = 0;
                                while (true) {
                                    long j3 = cursorQuery.getLong(i9);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i10);
                                        lch lchVarK0 = krgVarH0.c.k0();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                                            krgVar = krgVarH0;
                                            while (true) {
                                                try {
                                                    int i11 = gZIPInputStream.read(bArr);
                                                    if (i11 <= 0) {
                                                        break;
                                                    }
                                                    w3hVar4 = w3hVar4;
                                                    try {
                                                        byteArrayOutputStream.write(bArr, 0, i11);
                                                        w3hVar4 = w3hVar4;
                                                    } catch (IOException e) {
                                                        e = e;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    w3hVar4 = w3hVar4;
                                                }
                                                try {
                                                    ((w3h) lchVarK0.b).v().g.b(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e3) {
                                                    e = e3;
                                                    w3hVar4.v().g.c(w0h.E0(str3), e, "Failed to unzip queued bundle. appId");
                                                    try {
                                                        if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        cursorQuery.close();
                                                        list2 = arrayList8;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        w3hVar4.v().g.c(w0h.E0(str3), e, "Error querying bundles. appId");
                                                        list = Collections.EMPTY_LIST;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        list2 = list;
                                                    }
                                                    if (list2.isEmpty()) {
                                                        return;
                                                    }
                                                    dpgVar = dpg.b;
                                                    ((epg) dpgVar.a.get()).getClass();
                                                    qqg qqgVarF0 = f0();
                                                    azgVar = bzg.c1;
                                                    zL0 = qqgVarF0.L0(null, azgVar);
                                                    o5hVar = o5h.ANALYTICS_STORAGE;
                                                    if (zL0) {
                                                        ((epg) dpgVar.a.get()).getClass();
                                                        if (!f0().L0(null, azgVar)) {
                                                            list6 = list2;
                                                        } else if (a(str3).i(o5hVar)) {
                                                            arrayList5 = new ArrayList(list2.size());
                                                            krg krgVarH1 = h0();
                                                            w3hVar2 = (w3h) krgVarH1.b;
                                                            oa7.x(str3);
                                                            krgVarH1.A0();
                                                            krgVarH1.B0();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseR1 = krgVarH1.r1();
                                                            w3hVar2.E().getClass();
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseR1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            w3hVar3 = w3hVar2;
                                                            if (cursorQuery2.moveToFirst()) {
                                                                list7 = list2;
                                                                while (true) {
                                                                    arrayList6.add((v2h) ((t2h) lch.l1(v2h.H(), cursorQuery2.getBlob(0))).e());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        cursorQuery2 = cursorQuery2;
                                                                        arrayList6 = arrayList6;
                                                                    }
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                tz0 tz0Var = w3hVar3.v().Z;
                                                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb.append("Pruned ");
                                                                sb.append(iDelete);
                                                                sb.append(" NO_DATA mode events. appId");
                                                                tz0Var.b(str3, sb.toString());
                                                                list10 = list7;
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                list10 = list2;
                                                                cursorQuery2.close();
                                                            }
                                                            list8 = arrayList6;
                                                            list9 = list10;
                                                            it5 = list9.iterator();
                                                            z7 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                u3hVar2 = (u3h) ((z3h) pair.first).i();
                                                                if (z7) {
                                                                    List listW = u3hVar2.W();
                                                                    u3hVar2.c();
                                                                    ((z3h) u3hVar2.b).c0();
                                                                    u3hVar2.c();
                                                                    ((z3h) u3hVar2.b).b0(list8);
                                                                    u3hVar2.c();
                                                                    ((z3h) u3hVar2.b).b0(listW);
                                                                    z7 = false;
                                                                }
                                                                b2h b2hVarS = n2h.s();
                                                                szgVarW0 = g0().W0(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (szgVarW0 != null) {
                                                                    it6 = szgVarW0.r().iterator();
                                                                    while (it6.hasNext()) {
                                                                        xyg xygVar = (xyg) it6.next();
                                                                        Iterator it8 = it5;
                                                                        h2h h2hVarR = j2h.r();
                                                                        boolean z8 = z7;
                                                                        iR = xygVar.r() - 1;
                                                                        List list11 = list8;
                                                                        if (iR != 1) {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            i8 = 2;
                                                                        } else if (iR != 2) {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            if (iR != 3) {
                                                                                i8 = 4;
                                                                            } else if (iR != 4) {
                                                                                i8 = 1;
                                                                            } else {
                                                                                i8 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            i8 = 3;
                                                                        }
                                                                        h2hVarR.h(i8);
                                                                        iT = xygVar.t() - 1;
                                                                        if (iT != 1) {
                                                                            i7 = 2;
                                                                        } else if (iT != 2) {
                                                                            i7 = 1;
                                                                        }
                                                                        h2hVarR.i(i7);
                                                                        arrayList7.add((j2h) h2hVarR.e());
                                                                        it5 = it8;
                                                                        list8 = list11;
                                                                        z7 = z8;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z9 = z7;
                                                                List list12 = list8;
                                                                b2hVarS.h(arrayList7);
                                                                u3hVar2.E(b2hVarS);
                                                                arrayList5.add(Pair.create((z3h) u3hVar2.e(), (Long) pair.second));
                                                                it5 = it9;
                                                                list8 = list12;
                                                                z7 = z9;
                                                            }
                                                            list6 = arrayList5;
                                                        } else {
                                                            arrayList5 = new ArrayList(list2.size());
                                                            krg krgVarH2 = h0();
                                                            w3hVar2 = (w3h) krgVarH2.b;
                                                            oa7.x(str3);
                                                            krgVarH2.A0();
                                                            krgVarH2.B0();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    sQLiteDatabaseR1 = krgVarH2.r1();
                                                                    w3hVar2.E().getClass();
                                                                    jCurrentTimeMillis = System.currentTimeMillis();
                                                                    cursorQuery2 = sQLiteDatabaseR1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                    w3hVar3 = w3hVar2;
                                                                    try {
                                                                        try {
                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                list7 = list2;
                                                                                while (true) {
                                                                                    try {
                                                                                        try {
                                                                                            arrayList6.add((v2h) ((t2h) lch.l1(v2h.H(), cursorQuery2.getBlob(0))).e());
                                                                                        } catch (SQLiteException e5) {
                                                                                            e = e5;
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            w3hVar3.v().g.c(w0h.E0(str3), e, "Error flushing NO_DATA mode events. appId");
                                                                                            list8 = Collections.EMPTY_LIST;
                                                                                            list9 = list7;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                                list9 = list7;
                                                                                            }
                                                                                            it5 = list9.iterator();
                                                                                            z7 = true;
                                                                                            while (it5.hasNext()) {
                                                                                                Pair pair2 = (Pair) it5.next();
                                                                                                u3hVar2 = (u3h) ((z3h) pair2.first).i();
                                                                                                if (z7) {
                                                                                                    List listW2 = u3hVar2.W();
                                                                                                    u3hVar2.c();
                                                                                                    ((z3h) u3hVar2.b).c0();
                                                                                                    u3hVar2.c();
                                                                                                    ((z3h) u3hVar2.b).b0(list8);
                                                                                                    u3hVar2.c();
                                                                                                    ((z3h) u3hVar2.b).b0(listW2);
                                                                                                    z7 = false;
                                                                                                }
                                                                                                b2h b2hVarS2 = n2h.s();
                                                                                                szgVarW0 = g0().W0(str3);
                                                                                                arrayList7 = new ArrayList();
                                                                                                if (szgVarW0 != null) {
                                                                                                    it6 = szgVarW0.r().iterator();
                                                                                                    while (it6.hasNext()) {
                                                                                                        xyg xygVar2 = (xyg) it6.next();
                                                                                                        Iterator it10 = it5;
                                                                                                        h2h h2hVarR2 = j2h.r();
                                                                                                        boolean z10 = z7;
                                                                                                        iR = xygVar2.r() - 1;
                                                                                                        List list13 = list8;
                                                                                                        if (iR != 1) {
                                                                                                            it7 = it6;
                                                                                                            i7 = 3;
                                                                                                            i8 = 2;
                                                                                                        } else if (iR != 2) {
                                                                                                            it7 = it6;
                                                                                                            i7 = 3;
                                                                                                            if (iR != 3) {
                                                                                                                i8 = 4;
                                                                                                            } else if (iR != 4) {
                                                                                                                i8 = 1;
                                                                                                            } else {
                                                                                                                i8 = 5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it7 = it6;
                                                                                                            i7 = 3;
                                                                                                            i8 = 3;
                                                                                                        }
                                                                                                        h2hVarR2.h(i8);
                                                                                                        iT = xygVar2.t() - 1;
                                                                                                        if (iT != 1) {
                                                                                                            i7 = 2;
                                                                                                        } else if (iT != 2) {
                                                                                                            i7 = 1;
                                                                                                        }
                                                                                                        h2hVarR2.i(i7);
                                                                                                        arrayList7.add((j2h) h2hVarR2.e());
                                                                                                        it5 = it10;
                                                                                                        list8 = list13;
                                                                                                        z7 = z10;
                                                                                                        it6 = it7;
                                                                                                    }
                                                                                                }
                                                                                                Iterator it11 = it5;
                                                                                                boolean z11 = z7;
                                                                                                List list14 = list8;
                                                                                                b2hVarS2.h(arrayList7);
                                                                                                u3hVar2.E(b2hVarS2);
                                                                                                arrayList5.add(Pair.create((z3h) u3hVar2.e(), (Long) pair2.second));
                                                                                                it5 = it11;
                                                                                                list8 = list14;
                                                                                                z7 = z11;
                                                                                            }
                                                                                            list6 = arrayList5;
                                                                                            zIsEmpty2 = list6.isEmpty();
                                                                                            list3 = list6;
                                                                                            if (zIsEmpty2) {
                                                                                                return;
                                                                                            }
                                                                                            q5hVarA = a(str3);
                                                                                            o5hVar2 = o5h.AD_STORAGE;
                                                                                            if (q5hVarA.i(o5hVar2)) {
                                                                                                i = 0;
                                                                                                listSubList = list3;
                                                                                                break;
                                                                                            }
                                                                                            it4 = list3.iterator();
                                                                                            while (true) {
                                                                                                if (it4.hasNext()) {
                                                                                                    strX2 = null;
                                                                                                    break;
                                                                                                }
                                                                                                z3hVar2 = (z3h) ((Pair) it4.next()).first;
                                                                                                if (!z3hVar2.x().isEmpty()) {
                                                                                                    strX2 = z3hVar2.x();
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (strX2 != null) {
                                                                                                i = 0;
                                                                                                listSubList = list3;
                                                                                                break;
                                                                                            }
                                                                                            i6 = 0;
                                                                                            while (true) {
                                                                                                if (i6 < list3.size()) {
                                                                                                    i = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                z3hVar = (z3h) ((Pair) list3.get(i6)).first;
                                                                                                if (!z3hVar.x().isEmpty()) {
                                                                                                    i = 0;
                                                                                                    listSubList = list3.subList(0, i6);
                                                                                                    break;
                                                                                                }
                                                                                                i6++;
                                                                                            }
                                                                                            n3hVarY = t3h.y();
                                                                                            size = listSubList.size();
                                                                                            arrayList = new ArrayList(listSubList.size());
                                                                                            if (f0().B0(str3)) {
                                                                                                i2 = i;
                                                                                            } else {
                                                                                                i2 = i;
                                                                                            }
                                                                                            zI = a(str3).i(o5hVar2);
                                                                                            zI2 = a(str3).i(o5hVar);
                                                                                            ((dqg) cqg.b.a.get()).getClass();
                                                                                            zL1 = f0().L0(str3, bzg.M0);
                                                                                            zbhVar = this.x;
                                                                                            ybhVarB0 = zbhVar.B0(str3);
                                                                                            list4 = listSubList;
                                                                                            while (true) {
                                                                                                w3hVar = this.z;
                                                                                                if (i < size) {
                                                                                                    break;
                                                                                                }
                                                                                                u3hVar = (u3h) ((z3h) ((Pair) list4.get(i)).first).i();
                                                                                                int i12 = i;
                                                                                                arrayList.add((Long) ((Pair) list4.get(i)).second);
                                                                                                f0().G0();
                                                                                                u3hVar.s();
                                                                                                u3hVar.c();
                                                                                                ((z3h) u3hVar.b).h0(j);
                                                                                                w3hVar.getClass();
                                                                                                u3hVar.J();
                                                                                                if (i2 == 0) {
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).U0();
                                                                                                }
                                                                                                if (!zI) {
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).B1();
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).D1();
                                                                                                }
                                                                                                if (!zI2) {
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).F1();
                                                                                                }
                                                                                                r(str3, u3hVar);
                                                                                                if (!zL1) {
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).b1();
                                                                                                }
                                                                                                if (!zI2) {
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).N1();
                                                                                                }
                                                                                                strX = ((z3h) u3hVar.b).x();
                                                                                                if (TextUtils.isEmpty(strX)) {
                                                                                                    i4 = size;
                                                                                                } else {
                                                                                                    i4 = size;
                                                                                                    if (strX.equals("00000000-0000-0000-0000-000000000000")) {
                                                                                                        z3 = zI2;
                                                                                                        i5 = i2;
                                                                                                        list5 = list4;
                                                                                                        z6 = zL1;
                                                                                                    }
                                                                                                    if (u3hVar.X() != 0) {
                                                                                                        if (f0().L0(str3, bzg.C0)) {
                                                                                                            u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                                                                                                        }
                                                                                                        m4hVar = ybhVarB0.d;
                                                                                                        if (m4hVar != null) {
                                                                                                            u3hVar.C(m4hVar);
                                                                                                        }
                                                                                                        n3hVarY.c();
                                                                                                        ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                                                                                                    }
                                                                                                    i = i12 + 1;
                                                                                                    size = i4;
                                                                                                    zI2 = z3;
                                                                                                    list4 = list5;
                                                                                                    i2 = i5;
                                                                                                    zL1 = z6;
                                                                                                }
                                                                                                arrayList4 = new ArrayList(u3hVar.W());
                                                                                                it3 = arrayList4.iterator();
                                                                                                z3 = zI2;
                                                                                                lValueOf = null;
                                                                                                lValueOf2 = null;
                                                                                                z4 = false;
                                                                                                z5 = false;
                                                                                                while (it3.hasNext()) {
                                                                                                    i2 = i2;
                                                                                                    v2hVar = (v2h) it3.next();
                                                                                                    list4 = list4;
                                                                                                    zL1 = zL1;
                                                                                                    if ("_fx".equals(v2hVar.w())) {
                                                                                                        it3.remove();
                                                                                                        z4 = true;
                                                                                                    } else if ("_f".equals(v2hVar.w())) {
                                                                                                        k0();
                                                                                                        e3hVarK0 = lch.K0("_pfo", v2hVar);
                                                                                                        if (e3hVarK0 != null) {
                                                                                                            lValueOf = Long.valueOf(e3hVarK0.w());
                                                                                                        }
                                                                                                        k0();
                                                                                                        e3hVarK1 = lch.K0("_uwa", v2hVar);
                                                                                                        if (e3hVarK1 != null) {
                                                                                                            lValueOf2 = Long.valueOf(e3hVarK1.w());
                                                                                                        }
                                                                                                    } else {
                                                                                                        list4 = list4;
                                                                                                        i2 = i2;
                                                                                                        zL1 = zL1;
                                                                                                    }
                                                                                                    z5 = true;
                                                                                                }
                                                                                                i5 = i2;
                                                                                                list5 = list4;
                                                                                                z6 = zL1;
                                                                                                if (z4) {
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).c0();
                                                                                                    u3hVar.c();
                                                                                                    ((z3h) u3hVar.b).b0(arrayList4);
                                                                                                }
                                                                                                if (z5) {
                                                                                                    q(u3hVar.o(), true, lValueOf, lValueOf2);
                                                                                                }
                                                                                                if (u3hVar.X() != 0) {
                                                                                                    if (f0().L0(str3, bzg.C0)) {
                                                                                                        u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                                                                                                    }
                                                                                                    m4hVar = ybhVarB0.d;
                                                                                                    if (m4hVar != null) {
                                                                                                        u3hVar.C(m4hVar);
                                                                                                    }
                                                                                                    n3hVarY.c();
                                                                                                    ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                                                                                                }
                                                                                                i = i12 + 1;
                                                                                                size = i4;
                                                                                                zI2 = z3;
                                                                                                list4 = list5;
                                                                                                i2 = i5;
                                                                                                zL1 = z6;
                                                                                            }
                                                                                            if (((t3h) n3hVarY.b).s() == 0) {
                                                                                                k(arrayList);
                                                                                                w(false, 204, null, null, str3, Collections.EMPTY_LIST, null);
                                                                                                return;
                                                                                            }
                                                                                            t3hVar = (t3h) n3hVarY.e();
                                                                                            arrayList2 = new ArrayList();
                                                                                            s8hVar = ybhVarB0.c;
                                                                                            if (s8hVar == s8h.SGTM_CLIENT) {
                                                                                                z = true;
                                                                                            } else {
                                                                                                z = false;
                                                                                            }
                                                                                            if (s8hVar != s8h.SGTM) {
                                                                                                if (z) {
                                                                                                    z2 = true;
                                                                                                } else {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                g1hVar = this.b;
                                                                                                S(g1hVar);
                                                                                                if (g1hVar.E0()) {
                                                                                                    if (Log.isLoggable(v().G0(), 2)) {
                                                                                                        strB1 = k0().b1(t3hVar);
                                                                                                    } else {
                                                                                                        strB1 = str2;
                                                                                                    }
                                                                                                    k0();
                                                                                                    byte[] bArrA = t3hVar.a();
                                                                                                    k(arrayList);
                                                                                                    this.w.x.b(j);
                                                                                                    v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA.length), strB1);
                                                                                                    this.J0 = true;
                                                                                                    S(g1hVar);
                                                                                                    g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            z2 = z;
                                                                                            it = ((t3h) n3hVarY.e()).r().iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    if (((z3h) it.next()).P()) {
                                                                                                        string = UUID.randomUUID().toString();
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    string = null;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            t3h t3hVar3 = (t3h) n3hVarY.e();
                                                                                            Z().A0();
                                                                                            m0();
                                                                                            n3hVarZ = t3h.z(t3hVar3);
                                                                                            if (!TextUtils.isEmpty(string)) {
                                                                                                n3hVarZ.c();
                                                                                                ((t3h) n3hVarZ.b).E(string);
                                                                                            }
                                                                                            strN0 = g0().N0(str3);
                                                                                            if (!TextUtils.isEmpty(strN0)) {
                                                                                                n3hVarZ.i(strN0);
                                                                                            }
                                                                                            arrayList3 = new ArrayList();
                                                                                            it2 = t3hVar3.r().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                u3h u3hVarX = z3h.X((z3h) it2.next());
                                                                                                u3hVarX.c();
                                                                                                ((z3h) u3hVarX.b).U0();
                                                                                                arrayList3.add((z3h) u3hVarX.e());
                                                                                            }
                                                                                            n3hVarZ.c();
                                                                                            ((t3h) n3hVarZ.b).D();
                                                                                            n3hVarZ.c();
                                                                                            ((t3h) n3hVarZ.b).C(arrayList3);
                                                                                            tz0 tz0Var2 = v().Z;
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                strH = "null";
                                                                                            } else {
                                                                                                strH = n3hVarZ.h();
                                                                                            }
                                                                                            tz0Var2.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                            t3hVar2 = (t3h) n3hVarZ.e();
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                str2 = null;
                                                                                            } else {
                                                                                                t3h t3hVar4 = (t3h) n3hVarY.e();
                                                                                                Z().A0();
                                                                                                m0();
                                                                                                n3hVarY2 = t3h.y();
                                                                                                v().Z.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                n3hVarY2.c();
                                                                                                ((t3h) n3hVarY2.b).E(string);
                                                                                                for (z3h z3hVar3 : t3hVar4.r()) {
                                                                                                    u3h u3hVarW = z3h.W();
                                                                                                    String strQ = z3hVar3.Q();
                                                                                                    u3hVarW.c();
                                                                                                    ((z3h) u3hVarW.b).T0(strQ);
                                                                                                    int iM0 = z3hVar3.M0();
                                                                                                    u3hVarW.c();
                                                                                                    ((z3h) u3hVarW.b).l1(iM0);
                                                                                                    n3hVarY2.c();
                                                                                                    ((t3h) n3hVarY2.b).B((z3h) u3hVarW.e());
                                                                                                }
                                                                                                t3h t3hVar5 = (t3h) n3hVarY2.e();
                                                                                                strN1 = zbhVar.c.g0().N0(str3);
                                                                                                zIsEmpty = TextUtils.isEmpty(strN1);
                                                                                                s8hVar2 = s8h.GOOGLE_SIGNAL;
                                                                                                s8hVar3 = s8h.GOOGLE_SIGNAL_PENDING;
                                                                                                if (zIsEmpty) {
                                                                                                    str2 = null;
                                                                                                    String str4 = (String) bzg.s.a(null);
                                                                                                    if (z2) {
                                                                                                        s8hVar2 = s8hVar3;
                                                                                                    }
                                                                                                    ybhVar = new ybh(str4, Collections.EMPTY_MAP, s8hVar2, null);
                                                                                                } else {
                                                                                                    Uri uri = Uri.parse((String) bzg.s.a(null));
                                                                                                    Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                    String authority = uri.getAuthority();
                                                                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strN1).length() + 1 + String.valueOf(authority).length());
                                                                                                    sb2.append(strN1);
                                                                                                    sb2.append(".");
                                                                                                    sb2.append(authority);
                                                                                                    builderBuildUpon.authority(sb2.toString());
                                                                                                    String string2 = builderBuildUpon.build().toString();
                                                                                                    if (z2) {
                                                                                                        s8hVar2 = s8hVar3;
                                                                                                    }
                                                                                                    str2 = null;
                                                                                                    ybhVar = new ybh(string2, Collections.EMPTY_MAP, s8hVar2, null);
                                                                                                }
                                                                                                arrayList2.add(Pair.create(t3hVar5, ybhVar));
                                                                                            }
                                                                                            if (z2) {
                                                                                                str3 = str;
                                                                                                t3hVar = t3hVar2;
                                                                                                g1hVar = this.b;
                                                                                                S(g1hVar);
                                                                                                if (g1hVar.E0()) {
                                                                                                    if (Log.isLoggable(v().G0(), 2)) {
                                                                                                        strB1 = k0().b1(t3hVar);
                                                                                                    } else {
                                                                                                        strB1 = str2;
                                                                                                    }
                                                                                                    k0();
                                                                                                    byte[] bArrA2 = t3hVar.a();
                                                                                                    k(arrayList);
                                                                                                    this.w.x.b(j);
                                                                                                    v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA2.length), strB1);
                                                                                                    this.J0 = true;
                                                                                                    S(g1hVar);
                                                                                                    g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            n3hVar = (n3h) t3hVar2.i();
                                                                                            for (i3 = 0; i3 < t3hVar2.s(); i3++) {
                                                                                                u3h u3hVar3 = (u3h) t3hVar2.t(i3).i();
                                                                                                u3hVar3.c0();
                                                                                                u3hVar3.D(j);
                                                                                                n3hVar.c();
                                                                                                ((t3h) n3hVar.b).A(i3, (z3h) u3hVar3.e());
                                                                                            }
                                                                                            arrayList2.add(Pair.create((t3h) n3hVar.e(), ybhVarB0));
                                                                                            k(arrayList);
                                                                                            w(false, 204, null, null, str, arrayList2, null);
                                                                                            if (n(str, ybhVarB0.a)) {
                                                                                                v().Z.b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                Intent intent = new Intent();
                                                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                intent.setPackage(str);
                                                                                                Q(w3hVar.a0(), intent);
                                                                                            }
                                                                                        }
                                                                                    } catch (bng e6) {
                                                                                        w3hVar3.v().z.c(w0h.E0(str3), e6, "Failed to parse stored NO_DATA mode event, appId");
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                break;
                                                                                            }
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            arrayList6 = arrayList6;
                                                                                        } catch (Throwable th) {
                                                                                            th = th;
                                                                                            cursor = cursorQuery2;
                                                                                            if (cursor != null) {
                                                                                                cursor.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        w3hVar3.v().g.c(w0h.E0(str3), e, "Error flushing NO_DATA mode events. appId");
                                                                                        list8 = Collections.EMPTY_LIST;
                                                                                        list9 = list7;
                                                                                        if (cursorQuery2 != null) {
                                                                                            cursorQuery2.close();
                                                                                            list9 = list7;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                cursorQuery2.close();
                                                                                try {
                                                                                    int iDelete2 = sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                                    tz0 tz0Var3 = w3hVar3.v().Z;
                                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                    sb3.append("Pruned ");
                                                                                    sb3.append(iDelete2);
                                                                                    sb3.append(" NO_DATA mode events. appId");
                                                                                    tz0Var3.b(str3, sb3.toString());
                                                                                    list10 = list7;
                                                                                } catch (SQLiteException e8) {
                                                                                    e = e8;
                                                                                    cursorQuery2 = null;
                                                                                    w3hVar3.v().g.c(w0h.E0(str3), e, "Error flushing NO_DATA mode events. appId");
                                                                                    list8 = Collections.EMPTY_LIST;
                                                                                    list9 = list7;
                                                                                    if (cursorQuery2 != null) {
                                                                                        cursorQuery2.close();
                                                                                        list9 = list7;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList6 = arrayList6;
                                                                                list10 = list2;
                                                                                cursorQuery2.close();
                                                                            }
                                                                            list8 = arrayList6;
                                                                            list9 = list10;
                                                                        } catch (SQLiteException e9) {
                                                                            e = e9;
                                                                            cursorQuery2 = cursorQuery2;
                                                                            list7 = list2;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        cursorQuery2 = cursorQuery2;
                                                                        cursor = cursorQuery2;
                                                                        if (cursor != null) {
                                                                            cursor.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    cursor = null;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e10) {
                                                                e = e10;
                                                                w3hVar3 = w3hVar2;
                                                                list7 = list2;
                                                            }
                                                            it5 = list9.iterator();
                                                            z7 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair3 = (Pair) it5.next();
                                                                u3hVar2 = (u3h) ((z3h) pair3.first).i();
                                                                if (z7) {
                                                                    List listW3 = u3hVar2.W();
                                                                    u3hVar2.c();
                                                                    ((z3h) u3hVar2.b).c0();
                                                                    u3hVar2.c();
                                                                    ((z3h) u3hVar2.b).b0(list8);
                                                                    u3hVar2.c();
                                                                    ((z3h) u3hVar2.b).b0(listW3);
                                                                    z7 = false;
                                                                }
                                                                b2h b2hVarS3 = n2h.s();
                                                                szgVarW0 = g0().W0(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (szgVarW0 != null) {
                                                                    it6 = szgVarW0.r().iterator();
                                                                    while (it6.hasNext()) {
                                                                        xyg xygVar3 = (xyg) it6.next();
                                                                        Iterator it12 = it5;
                                                                        h2h h2hVarR3 = j2h.r();
                                                                        boolean z12 = z7;
                                                                        iR = xygVar3.r() - 1;
                                                                        List list15 = list8;
                                                                        if (iR != 1) {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            i8 = 2;
                                                                        } else if (iR != 2) {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            if (iR != 3) {
                                                                                i8 = 4;
                                                                            } else if (iR != 4) {
                                                                                i8 = 1;
                                                                            } else {
                                                                                i8 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            i8 = 3;
                                                                        }
                                                                        h2hVarR3.h(i8);
                                                                        iT = xygVar3.t() - 1;
                                                                        if (iT != 1) {
                                                                            i7 = 2;
                                                                        } else if (iT != 2) {
                                                                            i7 = 1;
                                                                        }
                                                                        h2hVarR3.i(i7);
                                                                        arrayList7.add((j2h) h2hVarR3.e());
                                                                        it5 = it12;
                                                                        list8 = list15;
                                                                        z7 = z12;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it13 = it5;
                                                                boolean z13 = z7;
                                                                List list16 = list8;
                                                                b2hVarS3.h(arrayList7);
                                                                u3hVar2.E(b2hVarS3);
                                                                arrayList5.add(Pair.create((z3h) u3hVar2.e(), (Long) pair3.second));
                                                                it5 = it13;
                                                                list8 = list16;
                                                                z7 = z13;
                                                            }
                                                            list6 = arrayList5;
                                                        }
                                                        zIsEmpty2 = list6.isEmpty();
                                                        list3 = list6;
                                                        if (zIsEmpty2) {
                                                            return;
                                                        }
                                                    } else {
                                                        list3 = list2;
                                                    }
                                                    q5hVarA = a(str3);
                                                    o5hVar2 = o5h.AD_STORAGE;
                                                    if (q5hVarA.i(o5hVar2)) {
                                                        i = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    it4 = list3.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            strX2 = null;
                                                            break;
                                                        }
                                                        z3hVar2 = (z3h) ((Pair) it4.next()).first;
                                                        if (!z3hVar2.x().isEmpty()) {
                                                            strX2 = z3hVar2.x();
                                                            break;
                                                        }
                                                    }
                                                    if (strX2 != null) {
                                                        i = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    i6 = 0;
                                                    while (true) {
                                                        if (i6 < list3.size()) {
                                                            i = 0;
                                                            listSubList = list3;
                                                            break;
                                                        }
                                                        z3hVar = (z3h) ((Pair) list3.get(i6)).first;
                                                        if (!z3hVar.x().isEmpty()) {
                                                            i = 0;
                                                            listSubList = list3.subList(0, i6);
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                    n3hVarY = t3h.y();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (f0().B0(str3)) {
                                                        i2 = i;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    zI = a(str3).i(o5hVar2);
                                                    zI2 = a(str3).i(o5hVar);
                                                    ((dqg) cqg.b.a.get()).getClass();
                                                    zL1 = f0().L0(str3, bzg.M0);
                                                    zbhVar = this.x;
                                                    ybhVarB0 = zbhVar.B0(str3);
                                                    list4 = listSubList;
                                                    while (true) {
                                                        w3hVar = this.z;
                                                        if (i < size) {
                                                            break;
                                                            break;
                                                        }
                                                        u3hVar = (u3h) ((z3h) ((Pair) list4.get(i)).first).i();
                                                        int i13 = i;
                                                        arrayList.add((Long) ((Pair) list4.get(i)).second);
                                                        f0().G0();
                                                        u3hVar.s();
                                                        u3hVar.c();
                                                        ((z3h) u3hVar.b).h0(j);
                                                        w3hVar.getClass();
                                                        u3hVar.J();
                                                        if (i2 == 0) {
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).U0();
                                                        }
                                                        if (!zI) {
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).B1();
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).D1();
                                                        }
                                                        if (!zI2) {
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).F1();
                                                        }
                                                        r(str3, u3hVar);
                                                        if (!zL1) {
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).b1();
                                                        }
                                                        if (!zI2) {
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).N1();
                                                        }
                                                        strX = ((z3h) u3hVar.b).x();
                                                        if (TextUtils.isEmpty(strX)) {
                                                            i4 = size;
                                                            if (strX.equals("00000000-0000-0000-0000-000000000000")) {
                                                                z3 = zI2;
                                                                i5 = i2;
                                                                list5 = list4;
                                                                z6 = zL1;
                                                            }
                                                            if (u3hVar.X() != 0) {
                                                                if (f0().L0(str3, bzg.C0)) {
                                                                    u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                                                                }
                                                                m4hVar = ybhVarB0.d;
                                                                if (m4hVar != null) {
                                                                    u3hVar.C(m4hVar);
                                                                }
                                                                n3hVarY.c();
                                                                ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                                                            }
                                                            i = i13 + 1;
                                                            size = i4;
                                                            zI2 = z3;
                                                            list4 = list5;
                                                            i2 = i5;
                                                            zL1 = z6;
                                                        } else {
                                                            i4 = size;
                                                        }
                                                        arrayList4 = new ArrayList(u3hVar.W());
                                                        it3 = arrayList4.iterator();
                                                        z3 = zI2;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z4 = false;
                                                        z5 = false;
                                                        while (it3.hasNext()) {
                                                            i2 = i2;
                                                            v2hVar = (v2h) it3.next();
                                                            list4 = list4;
                                                            zL1 = zL1;
                                                            if ("_fx".equals(v2hVar.w())) {
                                                                it3.remove();
                                                                z4 = true;
                                                            } else if ("_f".equals(v2hVar.w())) {
                                                                k0();
                                                                e3hVarK0 = lch.K0("_pfo", v2hVar);
                                                                if (e3hVarK0 != null) {
                                                                    lValueOf = Long.valueOf(e3hVarK0.w());
                                                                }
                                                                k0();
                                                                e3hVarK1 = lch.K0("_uwa", v2hVar);
                                                                if (e3hVarK1 != null) {
                                                                    lValueOf2 = Long.valueOf(e3hVarK1.w());
                                                                }
                                                            } else {
                                                                list4 = list4;
                                                                i2 = i2;
                                                                zL1 = zL1;
                                                            }
                                                            z5 = true;
                                                        }
                                                        i5 = i2;
                                                        list5 = list4;
                                                        z6 = zL1;
                                                        if (z4) {
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).c0();
                                                            u3hVar.c();
                                                            ((z3h) u3hVar.b).b0(arrayList4);
                                                        }
                                                        if (z5) {
                                                            q(u3hVar.o(), true, lValueOf, lValueOf2);
                                                        }
                                                        if (u3hVar.X() != 0) {
                                                            if (f0().L0(str3, bzg.C0)) {
                                                                u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                                                            }
                                                            m4hVar = ybhVarB0.d;
                                                            if (m4hVar != null) {
                                                                u3hVar.C(m4hVar);
                                                            }
                                                            n3hVarY.c();
                                                            ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                                                        }
                                                        i = i13 + 1;
                                                        size = i4;
                                                        zI2 = z3;
                                                        list4 = list5;
                                                        i2 = i5;
                                                        zL1 = z6;
                                                    }
                                                    if (((t3h) n3hVarY.b).s() == 0) {
                                                        k(arrayList);
                                                        w(false, 204, null, null, str3, Collections.EMPTY_LIST, null);
                                                        return;
                                                    }
                                                    t3hVar = (t3h) n3hVarY.e();
                                                    arrayList2 = new ArrayList();
                                                    s8hVar = ybhVarB0.c;
                                                    if (s8hVar == s8h.SGTM_CLIENT) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (s8hVar != s8h.SGTM) {
                                                        if (z) {
                                                            z2 = true;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        g1hVar = this.b;
                                                        S(g1hVar);
                                                        if (g1hVar.E0()) {
                                                            if (Log.isLoggable(v().G0(), 2)) {
                                                                strB1 = k0().b1(t3hVar);
                                                            } else {
                                                                strB1 = str2;
                                                            }
                                                            k0();
                                                            byte[] bArrA3 = t3hVar.a();
                                                            k(arrayList);
                                                            this.w.x.b(j);
                                                            v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA3.length), strB1);
                                                            this.J0 = true;
                                                            S(g1hVar);
                                                            g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    z2 = z;
                                                    it = ((t3h) n3hVarY.e()).r().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((z3h) it.next()).P()) {
                                                                string = UUID.randomUUID().toString();
                                                                break;
                                                            }
                                                        } else {
                                                            string = null;
                                                            break;
                                                        }
                                                    }
                                                    t3h t3hVar6 = (t3h) n3hVarY.e();
                                                    Z().A0();
                                                    m0();
                                                    n3hVarZ = t3h.z(t3hVar6);
                                                    if (!TextUtils.isEmpty(string)) {
                                                        n3hVarZ.c();
                                                        ((t3h) n3hVarZ.b).E(string);
                                                    }
                                                    strN0 = g0().N0(str3);
                                                    if (!TextUtils.isEmpty(strN0)) {
                                                        n3hVarZ.i(strN0);
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    it2 = t3hVar6.r().iterator();
                                                    while (it2.hasNext()) {
                                                        u3h u3hVarX2 = z3h.X((z3h) it2.next());
                                                        u3hVarX2.c();
                                                        ((z3h) u3hVarX2.b).U0();
                                                        arrayList3.add((z3h) u3hVarX2.e());
                                                    }
                                                    n3hVarZ.c();
                                                    ((t3h) n3hVarZ.b).D();
                                                    n3hVarZ.c();
                                                    ((t3h) n3hVarZ.b).C(arrayList3);
                                                    tz0 tz0Var4 = v().Z;
                                                    if (TextUtils.isEmpty(string)) {
                                                        strH = "null";
                                                    } else {
                                                        strH = n3hVarZ.h();
                                                    }
                                                    tz0Var4.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                    t3hVar2 = (t3h) n3hVarZ.e();
                                                    if (TextUtils.isEmpty(string)) {
                                                        t3h t3hVar7 = (t3h) n3hVarY.e();
                                                        Z().A0();
                                                        m0();
                                                        n3hVarY2 = t3h.y();
                                                        v().Z.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                        n3hVarY2.c();
                                                        ((t3h) n3hVarY2.b).E(string);
                                                        while (r0.hasNext()) {
                                                            u3h u3hVarW2 = z3h.W();
                                                            String strQ2 = z3hVar3.Q();
                                                            u3hVarW2.c();
                                                            ((z3h) u3hVarW2.b).T0(strQ2);
                                                            int iM1 = z3hVar3.M0();
                                                            u3hVarW2.c();
                                                            ((z3h) u3hVarW2.b).l1(iM1);
                                                            n3hVarY2.c();
                                                            ((t3h) n3hVarY2.b).B((z3h) u3hVarW2.e());
                                                        }
                                                        t3h t3hVar8 = (t3h) n3hVarY2.e();
                                                        strN1 = zbhVar.c.g0().N0(str3);
                                                        zIsEmpty = TextUtils.isEmpty(strN1);
                                                        s8hVar2 = s8h.GOOGLE_SIGNAL;
                                                        s8hVar3 = s8h.GOOGLE_SIGNAL_PENDING;
                                                        if (zIsEmpty) {
                                                            Uri uri2 = Uri.parse((String) bzg.s.a(null));
                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                            String authority2 = uri2.getAuthority();
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(strN1).length() + 1 + String.valueOf(authority2).length());
                                                            sb4.append(strN1);
                                                            sb4.append(".");
                                                            sb4.append(authority2);
                                                            builderBuildUpon2.authority(sb4.toString());
                                                            String string3 = builderBuildUpon2.build().toString();
                                                            if (z2) {
                                                                s8hVar2 = s8hVar3;
                                                            }
                                                            str2 = null;
                                                            ybhVar = new ybh(string3, Collections.EMPTY_MAP, s8hVar2, null);
                                                        } else {
                                                            str2 = null;
                                                            String str5 = (String) bzg.s.a(null);
                                                            if (z2) {
                                                                s8hVar2 = s8hVar3;
                                                            }
                                                            ybhVar = new ybh(str5, Collections.EMPTY_MAP, s8hVar2, null);
                                                        }
                                                        arrayList2.add(Pair.create(t3hVar8, ybhVar));
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (z2) {
                                                        str3 = str;
                                                        t3hVar = t3hVar2;
                                                        g1hVar = this.b;
                                                        S(g1hVar);
                                                        if (g1hVar.E0()) {
                                                            if (Log.isLoggable(v().G0(), 2)) {
                                                                strB1 = k0().b1(t3hVar);
                                                            } else {
                                                                strB1 = str2;
                                                            }
                                                            k0();
                                                            byte[] bArrA4 = t3hVar.a();
                                                            k(arrayList);
                                                            this.w.x.b(j);
                                                            v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA4.length), strB1);
                                                            this.J0 = true;
                                                            S(g1hVar);
                                                            g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    n3hVar = (n3h) t3hVar2.i();
                                                    while (i3 < t3hVar2.s()) {
                                                        u3h u3hVar4 = (u3h) t3hVar2.t(i3).i();
                                                        u3hVar4.c0();
                                                        u3hVar4.D(j);
                                                        n3hVar.c();
                                                        ((t3h) n3hVar.b).A(i3, (z3h) u3hVar4.e());
                                                    }
                                                    arrayList2.add(Pair.create((t3h) n3hVar.e(), ybhVarB0));
                                                    k(arrayList);
                                                    w(false, 204, null, null, str, arrayList2, null);
                                                    if (n(str, ybhVarB0.a)) {
                                                        v().Z.b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                        Intent intent2 = new Intent();
                                                        intent2.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                        intent2.setPackage(str);
                                                        Q(w3hVar.a0(), intent2);
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                u3h u3hVar5 = (u3h) lch.l1(z3h.W(), byteArray);
                                                if (!arrayList8.isEmpty()) {
                                                    z3h z3hVar4 = (z3h) ((Pair) arrayList8.get(0)).first;
                                                    z3h z3hVar5 = (z3h) u3hVar5.e();
                                                    if (!z3hVar4.w0().equals(z3hVar5.w0()) || !z3hVar4.D0().equals(z3hVar5.D0()) || z3hVar4.F0() != z3hVar5.F0() || !z3hVar4.H0().equals(z3hVar5.H0())) {
                                                        break;
                                                    }
                                                    Iterator it14 = z3hVar4.X1().iterator();
                                                    while (true) {
                                                        if (!it14.hasNext()) {
                                                            jX = -1;
                                                            break;
                                                        }
                                                        p4h p4hVar = (p4h) it14.next();
                                                        Iterator it15 = it14;
                                                        if ("_npa".equals(p4hVar.t())) {
                                                            jX = p4hVar.x();
                                                            break;
                                                        }
                                                        it14 = it15;
                                                    }
                                                    Iterator it16 = z3hVar5.X1().iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            jX2 = -1;
                                                            break;
                                                        }
                                                        p4h p4hVar2 = (p4h) it16.next();
                                                        if ("_npa".equals(p4hVar2.t())) {
                                                            jX2 = p4hVar2.x();
                                                            break;
                                                        }
                                                    }
                                                    if (jX != jX2) {
                                                        break;
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i14 = cursorQuery.getInt(2);
                                                    u3hVar5.c();
                                                    ((z3h) u3hVar5.b).V0(i14);
                                                }
                                                length += byteArray.length;
                                                arrayList8.add(Pair.create((z3h) u3hVar5.e(), Long.valueOf(j3)));
                                            } catch (IOException e11) {
                                                w3hVar4.v().g.c(w0h.E0(str3), e11, "Failed to merge queued bundle. appId");
                                            }
                                            w3hVar4 = w3hVar4;
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            }
                                            krgVarH0 = krgVar;
                                            w3hVar4 = w3hVar4;
                                            i9 = 0;
                                            i10 = 1;
                                        } catch (IOException e12) {
                                            e = e12;
                                            krgVar = krgVarH0;
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        krgVar = krgVarH0;
                                        w3hVar4 = w3hVar4;
                                    }
                                }
                                cursorQuery.close();
                                list2 = arrayList8;
                            } else {
                                list = Collections.EMPTY_LIST;
                                cursorQuery.close();
                                list2 = list;
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            w3hVar4 = w3hVar4;
                        }
                    } catch (SQLiteException e15) {
                        e = e15;
                        cursorQuery = null;
                        w3hVar4.v().g.c(w0h.E0(str3), e, "Error querying bundles. appId");
                        list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        list2 = list;
                        if (list2.isEmpty()) {
                            return;
                        }
                        dpgVar = dpg.b;
                        ((epg) dpgVar.a.get()).getClass();
                        qqg qqgVarF1 = f0();
                        azgVar = bzg.c1;
                        zL0 = qqgVarF1.L0(null, azgVar);
                        o5hVar = o5h.ANALYTICS_STORAGE;
                        if (zL0) {
                            ((epg) dpgVar.a.get()).getClass();
                            if (!f0().L0(null, azgVar)) {
                                list6 = list2;
                            } else if (a(str3).i(o5hVar)) {
                                arrayList5 = new ArrayList(list2.size());
                                krg krgVarH3 = h0();
                                w3hVar2 = (w3h) krgVarH3.b;
                                oa7.x(str3);
                                krgVarH3.A0();
                                krgVarH3.B0();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseR1 = krgVarH3.r1();
                                w3hVar2.E().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseR1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                w3hVar3 = w3hVar2;
                                if (cursorQuery2.moveToFirst()) {
                                    list7 = list2;
                                    while (true) {
                                        arrayList6.add((v2h) ((t2h) lch.l1(v2h.H(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    tz0 tz0Var5 = w3hVar3.v().Z;
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb5.append("Pruned ");
                                    sb5.append(iDelete3);
                                    sb5.append(" NO_DATA mode events. appId");
                                    tz0Var5.b(str3, sb5.toString());
                                    list10 = list7;
                                } else {
                                    arrayList6 = arrayList6;
                                    list10 = list2;
                                    cursorQuery2.close();
                                }
                                list8 = arrayList6;
                                list9 = list10;
                                it5 = list9.iterator();
                                z7 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    u3hVar2 = (u3h) ((z3h) pair4.first).i();
                                    if (z7) {
                                        List listW4 = u3hVar2.W();
                                        u3hVar2.c();
                                        ((z3h) u3hVar2.b).c0();
                                        u3hVar2.c();
                                        ((z3h) u3hVar2.b).b0(list8);
                                        u3hVar2.c();
                                        ((z3h) u3hVar2.b).b0(listW4);
                                        z7 = false;
                                    }
                                    b2h b2hVarS4 = n2h.s();
                                    szgVarW0 = g0().W0(str3);
                                    arrayList7 = new ArrayList();
                                    if (szgVarW0 != null) {
                                        it6 = szgVarW0.r().iterator();
                                        while (it6.hasNext()) {
                                            xyg xygVar4 = (xyg) it6.next();
                                            Iterator it17 = it5;
                                            h2h h2hVarR4 = j2h.r();
                                            boolean z14 = z7;
                                            iR = xygVar4.r() - 1;
                                            List list17 = list8;
                                            if (iR != 1) {
                                                it7 = it6;
                                                i7 = 3;
                                                i8 = 2;
                                            } else if (iR != 2) {
                                                it7 = it6;
                                                i7 = 3;
                                                if (iR != 3) {
                                                    i8 = 4;
                                                } else if (iR != 4) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i7 = 3;
                                                i8 = 3;
                                            }
                                            h2hVarR4.h(i8);
                                            iT = xygVar4.t() - 1;
                                            if (iT != 1) {
                                                i7 = 2;
                                            } else if (iT != 2) {
                                                i7 = 1;
                                            }
                                            h2hVarR4.i(i7);
                                            arrayList7.add((j2h) h2hVarR4.e());
                                            it5 = it17;
                                            list8 = list17;
                                            z7 = z14;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it18 = it5;
                                    boolean z15 = z7;
                                    List list18 = list8;
                                    b2hVarS4.h(arrayList7);
                                    u3hVar2.E(b2hVarS4);
                                    arrayList5.add(Pair.create((z3h) u3hVar2.e(), (Long) pair4.second));
                                    it5 = it18;
                                    list8 = list18;
                                    z7 = z15;
                                }
                                list6 = arrayList5;
                            } else {
                                arrayList5 = new ArrayList(list2.size());
                                krg krgVarH4 = h0();
                                w3hVar2 = (w3h) krgVarH4.b;
                                oa7.x(str3);
                                krgVarH4.A0();
                                krgVarH4.B0();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseR1 = krgVarH4.r1();
                                w3hVar2.E().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseR1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                w3hVar3 = w3hVar2;
                                if (cursorQuery2.moveToFirst()) {
                                    list7 = list2;
                                    while (true) {
                                        arrayList6.add((v2h) ((t2h) lch.l1(v2h.H(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete4 = sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    tz0 tz0Var6 = w3hVar3.v().Z;
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                    sb6.append("Pruned ");
                                    sb6.append(iDelete4);
                                    sb6.append(" NO_DATA mode events. appId");
                                    tz0Var6.b(str3, sb6.toString());
                                    list10 = list7;
                                } else {
                                    arrayList6 = arrayList6;
                                    list10 = list2;
                                    cursorQuery2.close();
                                }
                                list8 = arrayList6;
                                list9 = list10;
                                it5 = list9.iterator();
                                z7 = true;
                                while (it5.hasNext()) {
                                    Pair pair5 = (Pair) it5.next();
                                    u3hVar2 = (u3h) ((z3h) pair5.first).i();
                                    if (z7) {
                                        List listW5 = u3hVar2.W();
                                        u3hVar2.c();
                                        ((z3h) u3hVar2.b).c0();
                                        u3hVar2.c();
                                        ((z3h) u3hVar2.b).b0(list8);
                                        u3hVar2.c();
                                        ((z3h) u3hVar2.b).b0(listW5);
                                        z7 = false;
                                    }
                                    b2h b2hVarS5 = n2h.s();
                                    szgVarW0 = g0().W0(str3);
                                    arrayList7 = new ArrayList();
                                    if (szgVarW0 != null) {
                                        it6 = szgVarW0.r().iterator();
                                        while (it6.hasNext()) {
                                            xyg xygVar5 = (xyg) it6.next();
                                            Iterator it19 = it5;
                                            h2h h2hVarR5 = j2h.r();
                                            boolean z16 = z7;
                                            iR = xygVar5.r() - 1;
                                            List list19 = list8;
                                            if (iR != 1) {
                                                it7 = it6;
                                                i7 = 3;
                                                i8 = 2;
                                            } else if (iR != 2) {
                                                it7 = it6;
                                                i7 = 3;
                                                if (iR != 3) {
                                                    i8 = 4;
                                                } else if (iR != 4) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i7 = 3;
                                                i8 = 3;
                                            }
                                            h2hVarR5.h(i8);
                                            iT = xygVar5.t() - 1;
                                            if (iT != 1) {
                                                i7 = 2;
                                            } else if (iT != 2) {
                                                i7 = 1;
                                            }
                                            h2hVarR5.i(i7);
                                            arrayList7.add((j2h) h2hVarR5.e());
                                            it5 = it19;
                                            list8 = list19;
                                            z7 = z16;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it110 = it5;
                                    boolean z17 = z7;
                                    List list110 = list8;
                                    b2hVarS5.h(arrayList7);
                                    u3hVar2.E(b2hVarS5);
                                    arrayList5.add(Pair.create((z3h) u3hVar2.e(), (Long) pair5.second));
                                    it5 = it110;
                                    list8 = list110;
                                    z7 = z17;
                                }
                                list6 = arrayList5;
                            }
                            zIsEmpty2 = list6.isEmpty();
                            list3 = list6;
                            if (zIsEmpty2) {
                                return;
                            }
                        } else {
                            list3 = list2;
                        }
                        q5hVarA = a(str3);
                        o5hVar2 = o5h.AD_STORAGE;
                        if (q5hVarA.i(o5hVar2)) {
                            i = 0;
                            listSubList = list3;
                            break;
                        }
                        it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                strX2 = null;
                                break;
                            }
                            z3hVar2 = (z3h) ((Pair) it4.next()).first;
                            if (!z3hVar2.x().isEmpty()) {
                                strX2 = z3hVar2.x();
                                break;
                            }
                        }
                        if (strX2 != null) {
                            i = 0;
                            listSubList = list3;
                            break;
                        }
                        i6 = 0;
                        while (true) {
                            if (i6 < list3.size()) {
                                i = 0;
                                listSubList = list3;
                                break;
                            }
                            z3hVar = (z3h) ((Pair) list3.get(i6)).first;
                            if (!z3hVar.x().isEmpty()) {
                                i = 0;
                                listSubList = list3.subList(0, i6);
                                break;
                            }
                            i6++;
                        }
                        n3hVarY = t3h.y();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (f0().B0(str3)) {
                            i2 = i;
                        } else {
                            i2 = i;
                        }
                        zI = a(str3).i(o5hVar2);
                        zI2 = a(str3).i(o5hVar);
                        ((dqg) cqg.b.a.get()).getClass();
                        zL1 = f0().L0(str3, bzg.M0);
                        zbhVar = this.x;
                        ybhVarB0 = zbhVar.B0(str3);
                        list4 = listSubList;
                        while (true) {
                            w3hVar = this.z;
                            if (i < size) {
                                break;
                                break;
                            }
                            u3hVar = (u3h) ((z3h) ((Pair) list4.get(i)).first).i();
                            int i15 = i;
                            arrayList.add((Long) ((Pair) list4.get(i)).second);
                            f0().G0();
                            u3hVar.s();
                            u3hVar.c();
                            ((z3h) u3hVar.b).h0(j);
                            w3hVar.getClass();
                            u3hVar.J();
                            if (i2 == 0) {
                                u3hVar.c();
                                ((z3h) u3hVar.b).U0();
                            }
                            if (!zI) {
                                u3hVar.c();
                                ((z3h) u3hVar.b).B1();
                                u3hVar.c();
                                ((z3h) u3hVar.b).D1();
                            }
                            if (!zI2) {
                                u3hVar.c();
                                ((z3h) u3hVar.b).F1();
                            }
                            r(str3, u3hVar);
                            if (!zL1) {
                                u3hVar.c();
                                ((z3h) u3hVar.b).b1();
                            }
                            if (!zI2) {
                                u3hVar.c();
                                ((z3h) u3hVar.b).N1();
                            }
                            strX = ((z3h) u3hVar.b).x();
                            if (TextUtils.isEmpty(strX)) {
                                i4 = size;
                                if (strX.equals("00000000-0000-0000-0000-000000000000")) {
                                    z3 = zI2;
                                    i5 = i2;
                                    list5 = list4;
                                    z6 = zL1;
                                }
                                if (u3hVar.X() != 0) {
                                    if (f0().L0(str3, bzg.C0)) {
                                        u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                                    }
                                    m4hVar = ybhVarB0.d;
                                    if (m4hVar != null) {
                                        u3hVar.C(m4hVar);
                                    }
                                    n3hVarY.c();
                                    ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                                }
                                i = i15 + 1;
                                size = i4;
                                zI2 = z3;
                                list4 = list5;
                                i2 = i5;
                                zL1 = z6;
                            } else {
                                i4 = size;
                            }
                            arrayList4 = new ArrayList(u3hVar.W());
                            it3 = arrayList4.iterator();
                            z3 = zI2;
                            lValueOf = null;
                            lValueOf2 = null;
                            z4 = false;
                            z5 = false;
                            while (it3.hasNext()) {
                                i2 = i2;
                                v2hVar = (v2h) it3.next();
                                list4 = list4;
                                zL1 = zL1;
                                if ("_fx".equals(v2hVar.w())) {
                                    it3.remove();
                                    z4 = true;
                                } else if ("_f".equals(v2hVar.w())) {
                                    k0();
                                    e3hVarK0 = lch.K0("_pfo", v2hVar);
                                    if (e3hVarK0 != null) {
                                        lValueOf = Long.valueOf(e3hVarK0.w());
                                    }
                                    k0();
                                    e3hVarK1 = lch.K0("_uwa", v2hVar);
                                    if (e3hVarK1 != null) {
                                        lValueOf2 = Long.valueOf(e3hVarK1.w());
                                    }
                                } else {
                                    list4 = list4;
                                    i2 = i2;
                                    zL1 = zL1;
                                }
                                z5 = true;
                            }
                            i5 = i2;
                            list5 = list4;
                            z6 = zL1;
                            if (z4) {
                                u3hVar.c();
                                ((z3h) u3hVar.b).c0();
                                u3hVar.c();
                                ((z3h) u3hVar.b).b0(arrayList4);
                            }
                            if (z5) {
                                q(u3hVar.o(), true, lValueOf, lValueOf2);
                            }
                            if (u3hVar.X() != 0) {
                                if (f0().L0(str3, bzg.C0)) {
                                    u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                                }
                                m4hVar = ybhVarB0.d;
                                if (m4hVar != null) {
                                    u3hVar.C(m4hVar);
                                }
                                n3hVarY.c();
                                ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                            }
                            i = i15 + 1;
                            size = i4;
                            zI2 = z3;
                            list4 = list5;
                            i2 = i5;
                            zL1 = z6;
                        }
                        if (((t3h) n3hVarY.b).s() == 0) {
                            k(arrayList);
                            w(false, 204, null, null, str3, Collections.EMPTY_LIST, null);
                            return;
                        }
                        t3hVar = (t3h) n3hVarY.e();
                        arrayList2 = new ArrayList();
                        s8hVar = ybhVarB0.c;
                        if (s8hVar == s8h.SGTM_CLIENT) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (s8hVar != s8h.SGTM) {
                            if (z) {
                                z2 = true;
                            } else {
                                str2 = null;
                            }
                            g1hVar = this.b;
                            S(g1hVar);
                            if (g1hVar.E0()) {
                                if (Log.isLoggable(v().G0(), 2)) {
                                    strB1 = k0().b1(t3hVar);
                                } else {
                                    strB1 = str2;
                                }
                                k0();
                                byte[] bArrA5 = t3hVar.a();
                                k(arrayList);
                                this.w.x.b(j);
                                v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA5.length), strB1);
                                this.J0 = true;
                                S(g1hVar);
                                g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        it = ((t3h) n3hVarY.e()).r().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((z3h) it.next()).P()) {
                                    string = UUID.randomUUID().toString();
                                    break;
                                }
                            } else {
                                string = null;
                                break;
                            }
                        }
                        t3h t3hVar9 = (t3h) n3hVarY.e();
                        Z().A0();
                        m0();
                        n3hVarZ = t3h.z(t3hVar9);
                        if (!TextUtils.isEmpty(string)) {
                            n3hVarZ.c();
                            ((t3h) n3hVarZ.b).E(string);
                        }
                        strN0 = g0().N0(str3);
                        if (!TextUtils.isEmpty(strN0)) {
                            n3hVarZ.i(strN0);
                        }
                        arrayList3 = new ArrayList();
                        it2 = t3hVar9.r().iterator();
                        while (it2.hasNext()) {
                            u3h u3hVarX3 = z3h.X((z3h) it2.next());
                            u3hVarX3.c();
                            ((z3h) u3hVarX3.b).U0();
                            arrayList3.add((z3h) u3hVarX3.e());
                        }
                        n3hVarZ.c();
                        ((t3h) n3hVarZ.b).D();
                        n3hVarZ.c();
                        ((t3h) n3hVarZ.b).C(arrayList3);
                        tz0 tz0Var7 = v().Z;
                        if (TextUtils.isEmpty(string)) {
                            strH = "null";
                        } else {
                            strH = n3hVarZ.h();
                        }
                        tz0Var7.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                        t3hVar2 = (t3h) n3hVarZ.e();
                        if (TextUtils.isEmpty(string)) {
                            t3h t3hVar10 = (t3h) n3hVarY.e();
                            Z().A0();
                            m0();
                            n3hVarY2 = t3h.y();
                            v().Z.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                            n3hVarY2.c();
                            ((t3h) n3hVarY2.b).E(string);
                            while (r0.hasNext()) {
                                u3h u3hVarW3 = z3h.W();
                                String strQ3 = z3hVar3.Q();
                                u3hVarW3.c();
                                ((z3h) u3hVarW3.b).T0(strQ3);
                                int iM2 = z3hVar3.M0();
                                u3hVarW3.c();
                                ((z3h) u3hVarW3.b).l1(iM2);
                                n3hVarY2.c();
                                ((t3h) n3hVarY2.b).B((z3h) u3hVarW3.e());
                            }
                            t3h t3hVar11 = (t3h) n3hVarY2.e();
                            strN1 = zbhVar.c.g0().N0(str3);
                            zIsEmpty = TextUtils.isEmpty(strN1);
                            s8hVar2 = s8h.GOOGLE_SIGNAL;
                            s8hVar3 = s8h.GOOGLE_SIGNAL_PENDING;
                            if (zIsEmpty) {
                                Uri uri3 = Uri.parse((String) bzg.s.a(null));
                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                String authority3 = uri3.getAuthority();
                                StringBuilder sb7 = new StringBuilder(String.valueOf(strN1).length() + 1 + String.valueOf(authority3).length());
                                sb7.append(strN1);
                                sb7.append(".");
                                sb7.append(authority3);
                                builderBuildUpon3.authority(sb7.toString());
                                String string4 = builderBuildUpon3.build().toString();
                                if (z2) {
                                    s8hVar2 = s8hVar3;
                                }
                                str2 = null;
                                ybhVar = new ybh(string4, Collections.EMPTY_MAP, s8hVar2, null);
                            } else {
                                str2 = null;
                                String str6 = (String) bzg.s.a(null);
                                if (z2) {
                                    s8hVar2 = s8hVar3;
                                }
                                ybhVar = new ybh(str6, Collections.EMPTY_MAP, s8hVar2, null);
                            }
                            arrayList2.add(Pair.create(t3hVar11, ybhVar));
                        } else {
                            str2 = null;
                        }
                        if (z2) {
                            str3 = str;
                            t3hVar = t3hVar2;
                            g1hVar = this.b;
                            S(g1hVar);
                            if (g1hVar.E0()) {
                                if (Log.isLoggable(v().G0(), 2)) {
                                    strB1 = k0().b1(t3hVar);
                                } else {
                                    strB1 = str2;
                                }
                                k0();
                                byte[] bArrA6 = t3hVar.a();
                                k(arrayList);
                                this.w.x.b(j);
                                v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA6.length), strB1);
                                this.J0 = true;
                                S(g1hVar);
                                g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                                return;
                            }
                            return;
                        }
                        n3hVar = (n3h) t3hVar2.i();
                        while (i3 < t3hVar2.s()) {
                            u3h u3hVar6 = (u3h) t3hVar2.t(i3).i();
                            u3hVar6.c0();
                            u3hVar6.D(j);
                            n3hVar.c();
                            ((t3h) n3hVar.b).A(i3, (z3h) u3hVar6.e());
                        }
                        arrayList2.add(Pair.create((t3h) n3hVar.e(), ybhVarB0));
                        k(arrayList);
                        w(false, 204, null, null, str, arrayList2, null);
                        if (n(str, ybhVarB0.a)) {
                            v().Z.b(str, "[sgtm] Sending sgtm batches available notification to app");
                            Intent intent3 = new Intent();
                            intent3.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            intent3.setPackage(str);
                            Q(w3hVar.a0(), intent3);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r14 = 0;
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e16) {
                e = e16;
                j2 = -1;
            }
            if (list2.isEmpty()) {
                return;
            }
            dpgVar = dpg.b;
            ((epg) dpgVar.a.get()).getClass();
            qqg qqgVarF2 = f0();
            azgVar = bzg.c1;
            zL0 = qqgVarF2.L0(null, azgVar);
            o5hVar = o5h.ANALYTICS_STORAGE;
            if (zL0) {
                ((epg) dpgVar.a.get()).getClass();
                if (!f0().L0(null, azgVar)) {
                    list6 = list2;
                } else if (a(str3).i(o5hVar) || !g0().F0(str3)) {
                    arrayList5 = new ArrayList(list2.size());
                    krg krgVarH5 = h0();
                    w3hVar2 = (w3h) krgVarH5.b;
                    oa7.x(str3);
                    krgVarH5.A0();
                    krgVarH5.B0();
                    arrayList6 = new ArrayList();
                    sQLiteDatabaseR1 = krgVarH5.r1();
                    w3hVar2.E().getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    cursorQuery2 = sQLiteDatabaseR1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                    w3hVar3 = w3hVar2;
                    if (cursorQuery2.moveToFirst()) {
                        list7 = list2;
                        while (true) {
                            arrayList6.add((v2h) ((t2h) lch.l1(v2h.H(), cursorQuery2.getBlob(0))).e());
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            } else {
                                cursorQuery2 = cursorQuery2;
                                arrayList6 = arrayList6;
                            }
                        }
                        cursorQuery2.close();
                        int iDelete5 = sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                        tz0 tz0Var8 = w3hVar3.v().Z;
                        StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                        sb8.append("Pruned ");
                        sb8.append(iDelete5);
                        sb8.append(" NO_DATA mode events. appId");
                        tz0Var8.b(str3, sb8.toString());
                        list10 = list7;
                    } else {
                        arrayList6 = arrayList6;
                        list10 = list2;
                        cursorQuery2.close();
                    }
                    list8 = arrayList6;
                    list9 = list10;
                    it5 = list9.iterator();
                    z7 = true;
                    while (it5.hasNext()) {
                        Pair pair6 = (Pair) it5.next();
                        u3hVar2 = (u3h) ((z3h) pair6.first).i();
                        if (z7 && !list8.isEmpty()) {
                            List listW6 = u3hVar2.W();
                            u3hVar2.c();
                            ((z3h) u3hVar2.b).c0();
                            u3hVar2.c();
                            ((z3h) u3hVar2.b).b0(list8);
                            u3hVar2.c();
                            ((z3h) u3hVar2.b).b0(listW6);
                            z7 = false;
                        }
                        b2h b2hVarS6 = n2h.s();
                        szgVarW0 = g0().W0(str3);
                        arrayList7 = new ArrayList();
                        if (szgVarW0 != null) {
                            it6 = szgVarW0.r().iterator();
                            while (it6.hasNext()) {
                                xyg xygVar6 = (xyg) it6.next();
                                Iterator it111 = it5;
                                h2h h2hVarR6 = j2h.r();
                                boolean z18 = z7;
                                iR = xygVar6.r() - 1;
                                List list111 = list8;
                                if (iR != 1) {
                                    it7 = it6;
                                    i7 = 3;
                                    i8 = 2;
                                } else if (iR != 2) {
                                    it7 = it6;
                                    i7 = 3;
                                    if (iR != 3) {
                                        i8 = 4;
                                    } else if (iR != 4) {
                                        i8 = 1;
                                    } else {
                                        i8 = 5;
                                    }
                                } else {
                                    it7 = it6;
                                    i7 = 3;
                                    i8 = 3;
                                }
                                h2hVarR6.h(i8);
                                iT = xygVar6.t() - 1;
                                if (iT != 1) {
                                    i7 = 2;
                                } else if (iT != 2) {
                                    i7 = 1;
                                }
                                h2hVarR6.i(i7);
                                arrayList7.add((j2h) h2hVarR6.e());
                                it5 = it111;
                                list8 = list111;
                                z7 = z18;
                                it6 = it7;
                            }
                        }
                        Iterator it112 = it5;
                        boolean z19 = z7;
                        List list112 = list8;
                        b2hVarS6.h(arrayList7);
                        u3hVar2.E(b2hVarS6);
                        arrayList5.add(Pair.create((z3h) u3hVar2.e(), (Long) pair6.second));
                        it5 = it112;
                        list8 = list112;
                        z7 = z19;
                    }
                    list6 = arrayList5;
                } else {
                    List listAsList = Arrays.asList(((String) bzg.d1.a(null)).split(","));
                    for (Pair pair7 : list2) {
                        try {
                            h0().J0(((Long) pair7.second).longValue());
                            for (v2h v2hVar2 : ((z3h) pair7.first).R1()) {
                                if (listAsList.contains(v2hVar2.w())) {
                                    if (v2hVar2.w().equals("_f") || v2hVar2.w().equals("_v")) {
                                        t2h t2hVar = (t2h) v2hVar2.i();
                                        k0();
                                        lch.I0(t2hVar, "_dac", 1L);
                                        v2hVar2 = (v2h) t2hVar.e();
                                    }
                                    krg krgVarH6 = h0();
                                    krgVarH6.A0();
                                    krgVarH6.B0();
                                    oa7.x(str3);
                                    w3h w3hVar5 = (w3h) krgVarH6.b;
                                    w3hVar5.v().Z.b(v2hVar2, "Caching events in NO_DATA mode");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("app_id", str3);
                                    v2h v2hVar3 = v2hVar2;
                                    contentValues.put("name", v2hVar3.w());
                                    contentValues.put("data", v2hVar3.a());
                                    contentValues.put("timestamp_millis", Long.valueOf(v2hVar3.y()));
                                    try {
                                        if (krgVarH6.r1().insert("no_data_mode_events", null, contentValues) == j2) {
                                            w3hVar5.v().g.b(w0h.E0(str3), "Failed to insert NO_DATA mode event (got -1). appId");
                                        }
                                    } catch (SQLiteException e17) {
                                        ((w3h) krgVarH6.b).v().g.c(w0h.E0(str3), e17, "Error storing NO_DATA mode event. appId");
                                    }
                                }
                            }
                        } catch (SQLiteException unused) {
                            v().z.b(str3, "Failed handling NO_DATA mode bundles. appId");
                        }
                    }
                    list6 = Collections.EMPTY_LIST;
                }
                zIsEmpty2 = list6.isEmpty();
                list3 = list6;
                if (zIsEmpty2) {
                    return;
                }
            } else {
                list3 = list2;
            }
            q5hVarA = a(str3);
            o5hVar2 = o5h.AD_STORAGE;
            if (q5hVarA.i(o5hVar2)) {
                i = 0;
                listSubList = list3;
                break;
            }
            it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    strX2 = null;
                    break;
                }
                z3hVar2 = (z3h) ((Pair) it4.next()).first;
                if (!z3hVar2.x().isEmpty()) {
                    strX2 = z3hVar2.x();
                    break;
                }
            }
            if (strX2 != null) {
                i = 0;
                listSubList = list3;
                break;
            }
            i6 = 0;
            while (true) {
                if (i6 < list3.size()) {
                    i = 0;
                    listSubList = list3;
                    break;
                }
                z3hVar = (z3h) ((Pair) list3.get(i6)).first;
                if (!z3hVar.x().isEmpty() && !z3hVar.x().equals(strX2)) {
                    i = 0;
                    listSubList = list3.subList(0, i6);
                    break;
                }
                i6++;
            }
            n3hVarY = t3h.y();
            size = listSubList.size();
            arrayList = new ArrayList(listSubList.size());
            if (f0().B0(str3) || !a(str3).i(o5hVar2)) {
                i2 = i;
            } else {
                i2 = 1;
            }
            zI = a(str3).i(o5hVar2);
            zI2 = a(str3).i(o5hVar);
            ((dqg) cqg.b.a.get()).getClass();
            zL1 = f0().L0(str3, bzg.M0);
            zbhVar = this.x;
            ybhVarB0 = zbhVar.B0(str3);
            list4 = listSubList;
            while (true) {
                w3hVar = this.z;
                if (i < size) {
                    break;
                    break;
                }
                u3hVar = (u3h) ((z3h) ((Pair) list4.get(i)).first).i();
                int i16 = i;
                arrayList.add((Long) ((Pair) list4.get(i)).second);
                f0().G0();
                u3hVar.s();
                u3hVar.c();
                ((z3h) u3hVar.b).h0(j);
                w3hVar.getClass();
                u3hVar.J();
                if (i2 == 0) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).U0();
                }
                if (!zI) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).B1();
                    u3hVar.c();
                    ((z3h) u3hVar.b).D1();
                }
                if (!zI2) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).F1();
                }
                r(str3, u3hVar);
                if (!zL1) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).b1();
                }
                if (!zI2) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).N1();
                }
                strX = ((z3h) u3hVar.b).x();
                if (TextUtils.isEmpty(strX)) {
                    i4 = size;
                    if (strX.equals("00000000-0000-0000-0000-000000000000")) {
                        z3 = zI2;
                        i5 = i2;
                        list5 = list4;
                        z6 = zL1;
                    }
                    if (u3hVar.X() != 0) {
                        if (f0().L0(str3, bzg.C0)) {
                            u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                        }
                        m4hVar = ybhVarB0.d;
                        if (m4hVar != null) {
                            u3hVar.C(m4hVar);
                        }
                        n3hVarY.c();
                        ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                    }
                    i = i16 + 1;
                    size = i4;
                    zI2 = z3;
                    list4 = list5;
                    i2 = i5;
                    zL1 = z6;
                } else {
                    i4 = size;
                }
                arrayList4 = new ArrayList(u3hVar.W());
                it3 = arrayList4.iterator();
                z3 = zI2;
                lValueOf = null;
                lValueOf2 = null;
                z4 = false;
                z5 = false;
                while (it3.hasNext()) {
                    i2 = i2;
                    v2hVar = (v2h) it3.next();
                    list4 = list4;
                    zL1 = zL1;
                    if ("_fx".equals(v2hVar.w())) {
                        it3.remove();
                        z4 = true;
                    } else if ("_f".equals(v2hVar.w())) {
                        k0();
                        e3hVarK0 = lch.K0("_pfo", v2hVar);
                        if (e3hVarK0 != null) {
                            lValueOf = Long.valueOf(e3hVarK0.w());
                        }
                        k0();
                        e3hVarK1 = lch.K0("_uwa", v2hVar);
                        if (e3hVarK1 != null) {
                            lValueOf2 = Long.valueOf(e3hVarK1.w());
                        }
                    } else {
                        list4 = list4;
                        i2 = i2;
                        zL1 = zL1;
                    }
                    z5 = true;
                }
                i5 = i2;
                list5 = list4;
                z6 = zL1;
                if (z4) {
                    u3hVar.c();
                    ((z3h) u3hVar.b).c0();
                    u3hVar.c();
                    ((z3h) u3hVar.b).b0(arrayList4);
                }
                if (z5) {
                    q(u3hVar.o(), true, lValueOf, lValueOf2);
                }
                if (u3hVar.X() != 0) {
                    if (f0().L0(str3, bzg.C0)) {
                        u3hVar.Q(k0().j1(((z3h) u3hVar.e()).a()));
                    }
                    m4hVar = ybhVarB0.d;
                    if (m4hVar != null) {
                        u3hVar.C(m4hVar);
                    }
                    n3hVarY.c();
                    ((t3h) n3hVarY.b).B((z3h) u3hVar.e());
                }
                i = i16 + 1;
                size = i4;
                zI2 = z3;
                list4 = list5;
                i2 = i5;
                zL1 = z6;
            }
            if (((t3h) n3hVarY.b).s() == 0) {
                k(arrayList);
                w(false, 204, null, null, str3, Collections.EMPTY_LIST, null);
                return;
            }
            t3hVar = (t3h) n3hVarY.e();
            arrayList2 = new ArrayList();
            s8hVar = ybhVarB0.c;
            if (s8hVar == s8h.SGTM_CLIENT) {
                z = true;
            } else {
                z = false;
            }
            if (s8hVar != s8h.SGTM) {
                if (z) {
                    z2 = true;
                } else {
                    str2 = null;
                }
                g1hVar = this.b;
                S(g1hVar);
                if (g1hVar.E0()) {
                    if (Log.isLoggable(v().G0(), 2)) {
                        strB1 = k0().b1(t3hVar);
                    } else {
                        strB1 = str2;
                    }
                    k0();
                    byte[] bArrA7 = t3hVar.a();
                    k(arrayList);
                    this.w.x.b(j);
                    v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA7.length), strB1);
                    this.J0 = true;
                    S(g1hVar);
                    g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                    return;
                }
                return;
            }
            z2 = z;
            it = ((t3h) n3hVarY.e()).r().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((z3h) it.next()).P()) {
                        string = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    string = null;
                    break;
                }
            }
            t3h t3hVar12 = (t3h) n3hVarY.e();
            Z().A0();
            m0();
            n3hVarZ = t3h.z(t3hVar12);
            if (!TextUtils.isEmpty(string)) {
                n3hVarZ.c();
                ((t3h) n3hVarZ.b).E(string);
            }
            strN0 = g0().N0(str3);
            if (!TextUtils.isEmpty(strN0)) {
                n3hVarZ.i(strN0);
            }
            arrayList3 = new ArrayList();
            it2 = t3hVar12.r().iterator();
            while (it2.hasNext()) {
                u3h u3hVarX4 = z3h.X((z3h) it2.next());
                u3hVarX4.c();
                ((z3h) u3hVarX4.b).U0();
                arrayList3.add((z3h) u3hVarX4.e());
            }
            n3hVarZ.c();
            ((t3h) n3hVarZ.b).D();
            n3hVarZ.c();
            ((t3h) n3hVarZ.b).C(arrayList3);
            tz0 tz0Var9 = v().Z;
            if (TextUtils.isEmpty(string)) {
                strH = "null";
            } else {
                strH = n3hVarZ.h();
            }
            tz0Var9.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
            t3hVar2 = (t3h) n3hVarZ.e();
            if (TextUtils.isEmpty(string)) {
                t3h t3hVar13 = (t3h) n3hVarY.e();
                Z().A0();
                m0();
                n3hVarY2 = t3h.y();
                v().Z.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                n3hVarY2.c();
                ((t3h) n3hVarY2.b).E(string);
                while (r0.hasNext()) {
                    u3h u3hVarW4 = z3h.W();
                    String strQ4 = z3hVar3.Q();
                    u3hVarW4.c();
                    ((z3h) u3hVarW4.b).T0(strQ4);
                    int iM3 = z3hVar3.M0();
                    u3hVarW4.c();
                    ((z3h) u3hVarW4.b).l1(iM3);
                    n3hVarY2.c();
                    ((t3h) n3hVarY2.b).B((z3h) u3hVarW4.e());
                }
                t3h t3hVar14 = (t3h) n3hVarY2.e();
                strN1 = zbhVar.c.g0().N0(str3);
                zIsEmpty = TextUtils.isEmpty(strN1);
                s8hVar2 = s8h.GOOGLE_SIGNAL;
                s8hVar3 = s8h.GOOGLE_SIGNAL_PENDING;
                if (zIsEmpty) {
                    Uri uri4 = Uri.parse((String) bzg.s.a(null));
                    Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                    String authority4 = uri4.getAuthority();
                    StringBuilder sb9 = new StringBuilder(String.valueOf(strN1).length() + 1 + String.valueOf(authority4).length());
                    sb9.append(strN1);
                    sb9.append(".");
                    sb9.append(authority4);
                    builderBuildUpon4.authority(sb9.toString());
                    String string5 = builderBuildUpon4.build().toString();
                    if (z2) {
                        s8hVar2 = s8hVar3;
                    }
                    str2 = null;
                    ybhVar = new ybh(string5, Collections.EMPTY_MAP, s8hVar2, null);
                } else {
                    str2 = null;
                    String str7 = (String) bzg.s.a(null);
                    if (z2) {
                        s8hVar2 = s8hVar3;
                    }
                    ybhVar = new ybh(str7, Collections.EMPTY_MAP, s8hVar2, null);
                }
                arrayList2.add(Pair.create(t3hVar14, ybhVar));
            } else {
                str2 = null;
            }
            if (z2) {
                str3 = str;
                t3hVar = t3hVar2;
                g1hVar = this.b;
                S(g1hVar);
                if (g1hVar.E0()) {
                    if (Log.isLoggable(v().G0(), 2)) {
                        strB1 = k0().b1(t3hVar);
                    } else {
                        strB1 = str2;
                    }
                    k0();
                    byte[] bArrA8 = t3hVar.a();
                    k(arrayList);
                    this.w.x.b(j);
                    v().Z.d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA8.length), strB1);
                    this.J0 = true;
                    S(g1hVar);
                    g1hVar.H0(str3, ybhVarB0, t3hVar, new pbh(this, str3, arrayList2, 1));
                    return;
                }
                return;
            }
            n3hVar = (n3h) t3hVar2.i();
            while (i3 < t3hVar2.s()) {
                u3h u3hVar7 = (u3h) t3hVar2.t(i3).i();
                u3hVar7.c0();
                u3hVar7.D(j);
                n3hVar.c();
                ((t3h) n3hVar.b).A(i3, (z3h) u3hVar7.e());
            }
            arrayList2.add(Pair.create((t3h) n3hVar.e(), ybhVarB0));
            k(arrayList);
            w(false, 204, null, null, str, arrayList2, null);
            if (n(str, ybhVarB0.a)) {
                v().Z.b(str, "[sgtm] Sending sgtm batches available notification to app");
                Intent intent4 = new Intent();
                intent4.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                intent4.setPackage(str);
                Q(w3hVar.a0(), intent4);
            }
        } catch (Throwable th5) {
            th = th5;
            r14 = r11;
        }
    }

    public final void m0() {
        if (this.X.get()) {
            return;
        }
        qc0.p("UploadController is not initialized");
    }

    public final boolean n(String str, String str2) {
        krg krgVar = this.c;
        S(krgVar);
        k1h k1hVarE1 = krgVar.E1(str);
        HashMap map = this.T0;
        if (k1hVarE1 != null && l0().g1(str, k1hVarE1.D())) {
            map.remove(str2);
            return true;
        }
        hch hchVar = (hch) map.get(str2);
        if (hchVar != null) {
            hchVar.a.E().getClass();
            if (System.currentTimeMillis() < hchVar.c) {
                return false;
            }
        }
        return true;
    }

    public final void n0(ndh ndhVar) {
        Z().A0();
        m0();
        String str = ndhVar.a;
        oa7.x(str);
        q5h q5hVarC = q5h.c(ndhVar.M0, ndhVar.H0);
        a(str);
        v().Z.c(str, q5hVarC, "Setting storage consent for package");
        Z().A0();
        m0();
        this.Q0.put(str, q5hVarC);
        krg krgVar = this.c;
        S(krgVar);
        krgVar.g1(str, q5hVarC);
    }

    public final void o(String str) {
        Z().A0();
        m0();
        this.K0 = true;
        try {
            w3h w3hVar = this.z;
            w3hVar.getClass();
            Boolean bool = w3hVar.j().f;
            if (bool == null) {
                v().x.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                v().g.a("Upload called in the client side when service should be used");
            } else if (this.Z > 0) {
                L();
            } else {
                g1h g1hVar = this.b;
                S(g1hVar);
                if (g1hVar.E0()) {
                    krg krgVar = this.c;
                    S(krgVar);
                    if (krgVar.G0(str)) {
                        krg krgVar2 = this.c;
                        S(krgVar2);
                        oa7.x(str);
                        krgVar2.A0();
                        krgVar2.B0();
                        List listF0 = krgVar2.F0(str, sbh.c(s8h.GOOGLE_SIGNAL), 1);
                        kch kchVar = listF0.isEmpty() ? null : (kch) listF0.get(0);
                        if (kchVar != null) {
                            t3h t3hVar = kchVar.b;
                            v().Z.d("[sgtm] Uploading data from upload queue. appId, type, url", str, kchVar.e, kchVar.c);
                            byte[] bArrA = t3hVar.a();
                            int i = 2;
                            if (Log.isLoggable(v().G0(), 2)) {
                                lch lchVar = this.g;
                                S(lchVar);
                                v().Z.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), lchVar.b1(t3hVar));
                            }
                            ybh ybhVar = new ybh(kchVar.c, kchVar.d, kchVar.e, null);
                            this.J0 = true;
                            g1h g1hVar2 = this.b;
                            S(g1hVar2);
                            g1hVar2.H0(str, ybhVar, t3hVar, new pbh(this, str, kchVar, i));
                        }
                    } else {
                        v().Z.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    v().Z.a("Network not connected, ignoring upload request");
                    L();
                }
            }
        } finally {
            this.K0 = false;
            M();
        }
    }

    public final void o0(ndh ndhVar) {
        Z().A0();
        m0();
        String str = ndhVar.a;
        oa7.x(str);
        xrg xrgVarB = xrg.b(ndhVar.N0);
        v().Z.c(str, xrgVarB, "Setting DMA consent for package");
        Z().A0();
        m0();
        k5h k5hVarA = xrg.c(100, q0(str)).a();
        this.R0.put(str, xrgVarB);
        krg krgVar = this.c;
        S(krgVar);
        oa7.A(str);
        oa7.A(xrgVarB);
        krgVar.A0();
        krgVar.B0();
        q5h q5hVarU0 = krgVar.U0(str);
        q5h q5hVar = q5h.c;
        if (q5hVarU0 == q5hVar) {
            krgVar.g1(str, q5hVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", xrgVarB.b);
        krgVar.Z0(contentValues);
        k5h k5hVarA2 = xrg.c(100, q0(str)).a();
        Z().A0();
        m0();
        k5h k5hVar = k5h.GRANTED;
        k5h k5hVar2 = k5h.DENIED;
        boolean z = k5hVarA == k5hVar2 && k5hVarA2 == k5hVar;
        boolean z2 = k5hVarA == k5hVar && k5hVarA2 == k5hVar2;
        if (z || z2) {
            v().Z.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            krg krgVar2 = this.c;
            S(krgVar2);
            if (krgVar2.G1(b(), str, false, false, false, false).f < f0().J0(str, bzg.l0)) {
                bundle.putLong("_r", 1L);
                krg krgVar3 = this.c;
                S(krgVar3);
                v().Z.c(str, Long.valueOf(krgVar3.G1(b(), str, false, false, true, false).f), "_dcu realtime event count");
            }
            this.Y0.c(str, "_dcu", bundle);
        }
    }

    @Override // defpackage.i5h
    public final w1e p() {
        return this.z.c;
    }

    public final xrg p0(String str) {
        Z().A0();
        m0();
        HashMap map = this.R0;
        xrg xrgVar = (xrg) map.get(str);
        if (xrgVar != null) {
            return xrgVar;
        }
        krg krgVar = this.c;
        S(krgVar);
        oa7.A(str);
        krgVar.A0();
        krgVar.B0();
        xrg xrgVarB = xrg.b(krgVar.Y0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, xrgVarB);
        return xrgVarB;
    }

    public final void q(String str, boolean z, Long l, Long l2) {
        krg krgVar = this.c;
        S(krgVar);
        k1h k1hVarE1 = krgVar.E1(str);
        if (k1hVarE1 != null) {
            w3h w3hVar = k1hVarE1.a;
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.A0();
            k1hVarE1.R |= k1hVarE1.y != z;
            k1hVarE1.y = z;
            m3h m3hVar2 = w3hVar.g;
            w3h.h(m3hVar2);
            m3hVar2.A0();
            k1hVarE1.R |= !Objects.equals(k1hVarE1.z, l);
            k1hVarE1.z = l;
            m3h m3hVar3 = w3hVar.g;
            w3h.h(m3hVar3);
            m3hVar3.A0();
            k1hVarE1.R |= !Objects.equals(k1hVarE1.A, l2);
            k1hVarE1.A = l2;
            if (k1hVarE1.o()) {
                krg krgVar2 = this.c;
                S(krgVar2);
                krgVar2.F1(k1hVarE1, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle q0(String str) {
        Z().A0();
        m0();
        y2h y2hVar = this.a;
        S(y2hVar);
        if (y2hVar.W0(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        q5h q5hVarA = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = q5hVarA.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((k5h) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((o5h) entry.getKey()).zze, str2);
            }
        }
        bundle.putAll(bundle2);
        xrg xrgVarR0 = r0(str, p0(str), q5hVarA, new ysd(8));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : xrgVarR0.e.entrySet()) {
            int iOrdinal2 = ((k5h) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((o5h) entry2.getKey()).zze, str3);
            }
        }
        Boolean bool = xrgVarR0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = xrgVarR0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        krg krgVar = this.c;
        S(krgVar);
        och ochVarW1 = krgVar.w1(str, "_npa");
        bundle.putString("ad_personalization", 1 != (ochVarW1 != null ? ochVarW1.e.equals(1L) : C(new ysd(8), str)) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    public final void r(String str, u3h u3hVar) {
        int iM1;
        int iIndexOf;
        y2h y2hVar = this.a;
        S(y2hVar);
        y2hVar.A0();
        y2hVar.G0(str);
        kd0 kd0Var = y2hVar.f;
        Set set = (Set) kd0Var.get(str);
        if (set != null) {
            u3hVar.c();
            ((z3h) u3hVar.b).c1(set);
        }
        S(y2hVar);
        y2hVar.A0();
        y2hVar.G0(str);
        if (kd0Var.get(str) != null && (((Set) kd0Var.get(str)).contains("device_model") || ((Set) kd0Var.get(str)).contains("device_info"))) {
            u3hVar.c();
            ((z3h) u3hVar.b).s1();
        }
        S(y2hVar);
        if (y2hVar.T0(str)) {
            String strL2 = ((z3h) u3hVar.b).l2();
            if (!TextUtils.isEmpty(strL2) && (iIndexOf = strL2.indexOf(".")) != -1) {
                String strSubstring = strL2.substring(0, iIndexOf);
                u3hVar.c();
                ((z3h) u3hVar.b).q0(strSubstring);
            }
        }
        S(y2hVar);
        y2hVar.A0();
        y2hVar.G0(str);
        if (kd0Var.get(str) != null && ((Set) kd0Var.get(str)).contains("user_id") && (iM1 = lch.m1("_id", u3hVar)) != -1) {
            u3hVar.c();
            ((z3h) u3hVar.b).g0(iM1);
        }
        S(y2hVar);
        y2hVar.A0();
        y2hVar.G0(str);
        if (kd0Var.get(str) != null && ((Set) kd0Var.get(str)).contains("google_signals")) {
            u3hVar.c();
            ((z3h) u3hVar.b).U0();
        }
        S(y2hVar);
        if (y2hVar.U0(str)) {
            u3hVar.c();
            ((z3h) u3hVar.b).F1();
            if (a(str).i(o5h.ANALYTICS_STORAGE)) {
                HashMap map = this.S0;
                gch gchVar = (gch) map.get(str);
                if (gchVar != null) {
                    long jI0 = f0().I0(str, bzg.j0) + gchVar.b;
                    E().getClass();
                    if (jI0 < SystemClock.elapsedRealtime()) {
                        gchVar = new gch(this, l0().y1());
                        map.put(str, gchVar);
                    }
                } else {
                    gchVar = new gch(this, l0().y1());
                    map.put(str, gchVar);
                }
                String str2 = gchVar.a;
                u3hVar.c();
                ((z3h) u3hVar.b).d1(str2);
            }
        }
        S(y2hVar);
        y2hVar.A0();
        y2hVar.G0(str);
        if (kd0Var.get(str) == null || !((Set) kd0Var.get(str)).contains("enhanced_user_id")) {
            return;
        }
        u3hVar.c();
        ((z3h) u3hVar.b).b1();
    }

    public final xrg r0(String str, xrg xrgVar, q5h q5hVar, ysd ysdVar) {
        o5h o5hVarL0;
        k5h k5hVarE0;
        y2h y2hVar = this.a;
        S(y2hVar);
        szg szgVarW0 = y2hVar.W0(str);
        int i = 90;
        k5h k5hVar = k5h.DENIED;
        o5h o5hVar = o5h.AD_USER_DATA;
        if (szgVarW0 == null) {
            if (xrgVar.a() == k5hVar) {
                i = xrgVar.a;
                ysdVar.n(o5hVar, i);
            } else {
                ysdVar.o(o5hVar, sqg.FAILSAFE);
            }
            return new xrg(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        k5h k5hVarA = xrgVar.a();
        k5h k5hVar2 = k5h.GRANTED;
        if (k5hVarA == k5hVar2 || k5hVarA == k5hVar) {
            i = xrgVar.a;
            ysdVar.n(o5hVar, i);
        } else {
            k5h k5hVar3 = k5h.POLICY;
            k5h k5hVar4 = k5h.UNINITIALIZED;
            if (k5hVarA != k5hVar3 || (k5hVarE0 = y2hVar.E0(str, o5hVar)) == k5hVar4) {
                y2hVar.A0();
                y2hVar.G0(str);
                szg szgVarW1 = y2hVar.W0(str);
                if (szgVarW1 != null) {
                    Iterator it = szgVarW1.s().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            o5hVarL0 = null;
                            break;
                        }
                        zyg zygVar = (zyg) it.next();
                        if (o5hVar == y2h.L0(zygVar.r())) {
                            o5hVarL0 = y2h.L0(zygVar.s());
                            break;
                        }
                    }
                } else {
                    o5hVarL0 = null;
                    break;
                }
                EnumMap enumMap = q5hVar.a;
                o5h o5hVar2 = o5h.AD_STORAGE;
                k5h k5hVar5 = (k5h) enumMap.get(o5hVar2);
                if (k5hVar5 != null) {
                    k5hVar4 = k5hVar5;
                }
                boolean z = k5hVar4 == k5hVar2 || k5hVar4 == k5hVar;
                if (o5hVarL0 == o5hVar2 && z) {
                    ysdVar.o(o5hVar, sqg.REMOTE_DELEGATION);
                    k5hVarA = k5hVar4;
                } else {
                    ysdVar.o(o5hVar, sqg.REMOTE_DEFAULT);
                    k5hVarA = true != y2hVar.V0(str, o5hVar) ? k5hVar : k5hVar2;
                }
            } else {
                ysdVar.o(o5hVar, sqg.REMOTE_ENFORCED_DEFAULT);
                k5hVarA = k5hVarE0;
            }
        }
        y2hVar.A0();
        y2hVar.G0(str);
        szg szgVarW2 = y2hVar.W0(str);
        boolean z2 = szgVarW2 == null || !szgVarW2.u() || szgVarW2.v();
        S(y2hVar);
        y2hVar.A0();
        y2hVar.G0(str);
        TreeSet treeSet = new TreeSet();
        szg szgVarW3 = y2hVar.W0(str);
        if (szgVarW3 != null) {
            Iterator it2 = szgVarW3.t().iterator();
            while (it2.hasNext()) {
                treeSet.add(((jzg) it2.next()).r());
            }
        }
        if (k5hVarA == k5hVar || treeSet.isEmpty()) {
            return new xrg(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new xrg(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }

    public final void s(u3h u3hVar, oa5 oa5Var) {
        String strY1;
        String strY2;
        for (int i = 0; i < u3hVar.X(); i++) {
            t2h t2hVar = (t2h) ((z3h) u3hVar.b).W1(i).i();
            Iterator it = t2hVar.h().iterator();
            while (it.hasNext()) {
                if ("_c".equals(((e3h) it.next()).s())) {
                    if (((z3h) oa5Var.b).I0() >= f0().J0(((z3h) oa5Var.b).r(), bzg.k0)) {
                        int iJ0 = f0().J0(((z3h) oa5Var.b).r(), bzg.x0);
                        LinkedList linkedList = this.F0;
                        lch lchVar = this.g;
                        if (iJ0 > 0) {
                            krg krgVar = this.c;
                            S(krgVar);
                            if (krgVar.G1(b(), ((z3h) oa5Var.b).r(), false, false, false, true).g > iJ0) {
                                d3h d3hVarD = e3h.D();
                                d3hVarD.h("_tnr");
                                d3hVarD.j(1L);
                                t2hVar.k((e3h) d3hVarD.e());
                            } else {
                                if (f0().L0(((z3h) oa5Var.b).r(), bzg.Q0)) {
                                    strY2 = l0().y1();
                                    d3h d3hVarD2 = e3h.D();
                                    d3hVarD2.h("_tu");
                                    d3hVarD2.i(strY2);
                                    t2hVar.k((e3h) d3hVarD2.e());
                                } else {
                                    strY2 = null;
                                }
                                d3h d3hVarD3 = e3h.D();
                                d3hVarD3.h("_tr");
                                d3hVarD3.j(1L);
                                t2hVar.k((e3h) d3hVarD3.e());
                                S(lchVar);
                                kbh kbhVarZ0 = lchVar.Z0(((z3h) oa5Var.b).r(), u3hVar, t2hVar, strY2);
                                if (kbhVarZ0 != null) {
                                    v().Z.c(((z3h) oa5Var.b).r(), kbhVarZ0.a, "Generated trigger URI. appId, uri");
                                    krg krgVar2 = this.c;
                                    S(krgVar2);
                                    krgVar2.V0(((z3h) oa5Var.b).r(), kbhVarZ0);
                                    if (!linkedList.contains(((z3h) oa5Var.b).r())) {
                                        linkedList.add(((z3h) oa5Var.b).r());
                                    }
                                }
                            }
                        } else {
                            if (f0().L0(((z3h) oa5Var.b).r(), bzg.Q0)) {
                                strY1 = l0().y1();
                                d3h d3hVarD4 = e3h.D();
                                d3hVarD4.h("_tu");
                                d3hVarD4.i(strY1);
                                t2hVar.k((e3h) d3hVarD4.e());
                            } else {
                                strY1 = null;
                            }
                            d3h d3hVarD5 = e3h.D();
                            d3hVarD5.h("_tr");
                            d3hVarD5.j(1L);
                            t2hVar.k((e3h) d3hVarD5.e());
                            S(lchVar);
                            kbh kbhVarZ1 = lchVar.Z0(((z3h) oa5Var.b).r(), u3hVar, t2hVar, strY1);
                            if (kbhVarZ1 != null) {
                                v().Z.c(((z3h) oa5Var.b).r(), kbhVarZ1.a, "Generated trigger URI. appId, uri");
                                krg krgVar3 = this.c;
                                S(krgVar3);
                                krgVar3.V0(((z3h) oa5Var.b).r(), kbhVarZ1);
                                if (!linkedList.contains(((z3h) oa5Var.b).r())) {
                                    linkedList.add(((z3h) oa5Var.b).r());
                                }
                            }
                        }
                    }
                    v2h v2hVar = (v2h) t2hVar.e();
                    u3hVar.c();
                    ((z3h) u3hVar.b).Z(i, v2hVar);
                    break;
                }
            }
        }
    }

    public final void t(String str, d3h d3hVar, Bundle bundle, String str2) {
        int iF0;
        List listD = f0().L0(str2, bzg.a1) ? bzd.D("_o", "_sn", "_sc", "_si", "deep_link_url") : bzd.D("_o", "_sn", "_sc", "_si");
        if (qch.f1(((e3h) d3hVar.b).s()) || qch.f1(str)) {
            iF0 = f0().F0(str2, true);
        } else {
            qqg qqgVarF0 = f0();
            qqgVarF0.getClass();
            iF0 = Math.max(Math.min(qqgVarF0.J0(str2, bzg.g0), 500), 100);
        }
        long j = iF0;
        long jCodePointCount = ((e3h) d3hVar.b).u().codePointCount(0, ((e3h) d3hVar.b).u().length());
        l0();
        String strS = ((e3h) d3hVar.b).s();
        f0();
        String strH0 = qch.H0(40, strS, true);
        if (jCodePointCount <= j || listD.contains(((e3h) d3hVar.b).s())) {
            return;
        }
        if ("_ev".equals(((e3h) d3hVar.b).s())) {
            l0();
            bundle.putString("_ev", qch.H0(f0().F0(str2, true), ((e3h) d3hVar.b).u(), true));
            return;
        }
        v().z.c(strH0, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strH0);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((e3h) d3hVar.b).s());
    }

    public final boolean u(t2h t2hVar) {
        ArrayList arrayList = new ArrayList(t2hVar.h());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("value".equals(((e3h) arrayList.get(i3)).s())) {
                i = i3;
            } else if ("currency".equals(((e3h) arrayList.get(i3)).s())) {
                i2 = i3;
            }
        }
        if (i == -1) {
            if (!f0().L0(null, bzg.f1) || !"_iap".equals(t2hVar.n())) {
                return true;
            }
            B(t2hVar, "_c");
            A(t2hVar, 18, "value");
            return false;
        }
        if (!((e3h) arrayList.get(i)).v() && !((e3h) arrayList.get(i)).z()) {
            v().z.a("Value must be specified with a numeric type.");
            t2hVar.m(i);
            B(t2hVar, "_c");
            A(t2hVar, 18, "value");
            return false;
        }
        if (i2 != -1) {
            String strU = ((e3h) arrayList.get(i2)).u();
            if (strU.length() == 3) {
                int iCharCount = 0;
                while (iCharCount < strU.length()) {
                    int iCodePointAt = strU.codePointAt(iCharCount);
                    if (Character.isLetter(iCodePointAt)) {
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return true;
            }
        }
        v().z.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
        t2hVar.m(i);
        B(t2hVar, "_c");
        A(t2hVar, 19, "currency");
        return false;
    }

    @Override // defpackage.i5h
    public final w0h v() {
        w3h w3hVar = this.z;
        oa7.A(w3hVar);
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        return w0hVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0169 A[EDGE_INSN: B:109:0x0169->B:55:0x0169 BREAK  A[LOOP:0: B:36:0x010b->B:111:0x010b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[Catch: all -> 0x0018, PHI: r0
  0x00a5: PHI (r0v2 int) = (r0v0 int), (r0v35 int) binds: [B:12:0x003b, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef, B:99:0x027d), top: B:105:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00de A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0115 A[Catch: all -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0135 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x019e A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x020b A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:71:0x0205, B:73:0x020b, B:74:0x0212, B:77:0x0220, B:79:0x0224, B:82:0x022b, B:83:0x022c), top: B:104:0x0102, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0247 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0252 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0258 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0261 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x026b A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x0234, B:86:0x0247, B:88:0x0252, B:96:0x0271, B:90:0x0258, B:92:0x0261, B:94:0x0267, B:95:0x026b, B:97:0x0274, B:98:0x027c, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
    public final void w(boolean z, int i, Throwable th, byte[] bArr, String str, List list, Map map) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map2;
        Iterator it;
        boolean zHasNext;
        s8h s8hVar;
        Iterator it2;
        List listF0;
        krg krgVar;
        long j;
        t3h t3hVar;
        ybh ybhVar;
        Map map3;
        t3h t3hVar2;
        ybh ybhVar2;
        s8h s8hVar2;
        s8h s8hVar3;
        Map map4;
        long jE0;
        int i2 = i;
        g1h g1hVar = this.b;
        Z().A0();
        m0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.J0 = false;
                M();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        if (f0().L0(null, bzg.e1)) {
            lch lchVar = this.g;
            S(lchVar);
            lchVar.G0(map);
        }
        ArrayList<Long> arrayList = this.N0;
        oa7.A(arrayList);
        this.N0 = null;
        if (z) {
            if (i2 == 200) {
                if (th != null) {
                    tz0 tz0Var = v().Z;
                    numValueOf = Integer.valueOf(i2);
                    tz0Var.c(numValueOf, Boolean.valueOf(z), "Network upload successful with code, uploadAttempted");
                    if (z) {
                        v vVar = this.w.w;
                        E().getClass();
                        vVar.b(System.currentTimeMillis());
                    }
                    this.w.x.b(0L);
                    L();
                    if (z) {
                        v().Z.c(numValueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
                    } else {
                        v().Z.a("Purged empty bundles");
                    }
                    krg krgVar2 = this.c;
                    S(krgVar2);
                    krgVar2.o1();
                    map2 = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        s8hVar = s8h.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        t3hVar2 = (t3h) pair.first;
                        ybhVar2 = (ybh) pair.second;
                        s8hVar2 = ybhVar2.c;
                        s8hVar3 = ybhVar2.c;
                        if (s8hVar2 != s8hVar) {
                            krg krgVar3 = this.c;
                            S(krgVar3);
                            String str2 = ybhVar2.a;
                            map4 = ybhVar2.b;
                            if (map4 == null) {
                                map4 = Collections.EMPTY_MAP;
                            }
                            jE0 = krgVar3.E0(str, t3hVar2, str2, map4, s8hVar3, null);
                            if (s8hVar3 == s8h.GOOGLE_SIGNAL_PENDING) {
                                map2.put(t3hVar2.v(), Long.valueOf(jE0));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        t3hVar = (t3h) pair2.first;
                        ybhVar = (ybh) pair2.second;
                        if (ybhVar.c == s8hVar) {
                            Long l = (Long) map2.get(t3hVar.v());
                            krg krgVar4 = this.c;
                            S(krgVar4);
                            s8h s8hVar4 = s8hVar;
                            String str3 = ybhVar.a;
                            map3 = ybhVar.b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            krgVar4.E0(str, t3hVar, str3, map3, ybhVar.c, l);
                            s8hVar = s8hVar4;
                        }
                    }
                    krg krgVar5 = this.c;
                    S(krgVar5);
                    listF0 = krgVar5.F0(str, sbh.c(s8hVar), 1);
                    if (!listF0.isEmpty()) {
                        j = ((kch) listF0.get(0)).f;
                        E().getClass();
                        if (System.currentTimeMillis() > ((Long) bzg.F.a(null)).longValue() + j) {
                            v().x.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                        }
                    }
                    for (Long l2 : arrayList) {
                        krg krgVar6 = this.c;
                        S(krgVar6);
                        krgVar6.J0(l2.longValue());
                    }
                    krg krgVar7 = this.c;
                    S(krgVar7);
                    krgVar7.p1();
                    krg krgVar8 = this.c;
                    S(krgVar8);
                    krgVar8.q1();
                    this.O0 = null;
                    S(g1hVar);
                    if (g1hVar.E0()) {
                        krgVar = this.c;
                        S(krgVar);
                        if (krgVar.G0(str)) {
                            o(str);
                        } else {
                            S(g1hVar);
                            if (g1hVar.E0()) {
                                this.P0 = -1L;
                                L();
                            } else {
                                this.P0 = -1L;
                                L();
                            }
                        }
                    } else {
                        S(g1hVar);
                        if (g1hVar.E0()) {
                            this.P0 = -1L;
                            L();
                        } else {
                            this.P0 = -1L;
                            L();
                        }
                    }
                    this.Z = 0L;
                }
            } else if (i2 == 204) {
                i2 = 204;
                if (th != null) {
                    tz0 tz0Var2 = v().Z;
                    numValueOf = Integer.valueOf(i2);
                    tz0Var2.c(numValueOf, Boolean.valueOf(z), "Network upload successful with code, uploadAttempted");
                    if (z) {
                        v vVar2 = this.w.w;
                        E().getClass();
                        vVar2.b(System.currentTimeMillis());
                    }
                    this.w.x.b(0L);
                    L();
                    if (z) {
                        v().Z.c(numValueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
                    } else {
                        v().Z.a("Purged empty bundles");
                    }
                    krg krgVar9 = this.c;
                    S(krgVar9);
                    krgVar9.o1();
                    map2 = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        s8hVar = s8h.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair3 = (Pair) it.next();
                        t3hVar2 = (t3h) pair3.first;
                        ybhVar2 = (ybh) pair3.second;
                        s8hVar2 = ybhVar2.c;
                        s8hVar3 = ybhVar2.c;
                        if (s8hVar2 != s8hVar) {
                            krg krgVar10 = this.c;
                            S(krgVar10);
                            String str4 = ybhVar2.a;
                            map4 = ybhVar2.b;
                            if (map4 == null) {
                                map4 = Collections.EMPTY_MAP;
                            }
                            jE0 = krgVar10.E0(str, t3hVar2, str4, map4, s8hVar3, null);
                            if (s8hVar3 == s8h.GOOGLE_SIGNAL_PENDING) {
                                map2.put(t3hVar2.v(), Long.valueOf(jE0));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair4 = (Pair) it2.next();
                        t3hVar = (t3h) pair4.first;
                        ybhVar = (ybh) pair4.second;
                        if (ybhVar.c == s8hVar) {
                            Long l3 = (Long) map2.get(t3hVar.v());
                            krg krgVar11 = this.c;
                            S(krgVar11);
                            s8h s8hVar5 = s8hVar;
                            String str5 = ybhVar.a;
                            map3 = ybhVar.b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            krgVar11.E0(str, t3hVar, str5, map3, ybhVar.c, l3);
                            s8hVar = s8hVar5;
                        }
                    }
                    krg krgVar12 = this.c;
                    S(krgVar12);
                    listF0 = krgVar12.F0(str, sbh.c(s8hVar), 1);
                    if (!listF0.isEmpty()) {
                        j = ((kch) listF0.get(0)).f;
                        E().getClass();
                        if (System.currentTimeMillis() > ((Long) bzg.F.a(null)).longValue() + j) {
                            v().x.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                        }
                    }
                    while (r2.hasNext()) {
                        krg krgVar13 = this.c;
                        S(krgVar13);
                        krgVar13.J0(l2.longValue());
                    }
                    krg krgVar14 = this.c;
                    S(krgVar14);
                    krgVar14.p1();
                    krg krgVar15 = this.c;
                    S(krgVar15);
                    krgVar15.q1();
                    this.O0 = null;
                    S(g1hVar);
                    if (g1hVar.E0()) {
                        krgVar = this.c;
                        S(krgVar);
                        if (krgVar.G0(str)) {
                            o(str);
                        } else {
                            S(g1hVar);
                            if (g1hVar.E0()) {
                                this.P0 = -1L;
                                L();
                            } else {
                                this.P0 = -1L;
                                L();
                            }
                        }
                    } else {
                        S(g1hVar);
                        if (g1hVar.E0()) {
                            this.P0 = -1L;
                            L();
                        } else {
                            this.P0 = -1L;
                            L();
                        }
                    }
                    this.Z = 0L;
                }
            }
            String str6 = new String(bArr2, StandardCharsets.UTF_8);
            v().z.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str6.substring(0, Math.min(32, str6.length())));
            v vVar3 = this.w.x;
            E().getClass();
            vVar3.b(System.currentTimeMillis());
            if (i2 == 503 || i2 == 429) {
                v vVar4 = this.w.v;
                E().getClass();
                vVar4.b(System.currentTimeMillis());
            }
            krg krgVar16 = this.c;
            S(krgVar16);
            krgVar16.L0(arrayList);
            L();
        } else {
            tz0 tz0Var3 = v().Z;
            numValueOf = Integer.valueOf(i2);
            tz0Var3.c(numValueOf, Boolean.valueOf(z), "Network upload successful with code, uploadAttempted");
            if (z) {
                try {
                    v vVar5 = this.w.w;
                    E().getClass();
                    vVar5.b(System.currentTimeMillis());
                } catch (SQLiteException e) {
                    v().g.b(e, "Database error while trying to delete uploaded bundles");
                    E().getClass();
                    this.Z = SystemClock.elapsedRealtime();
                    v().Z.b(Long.valueOf(this.Z), "Disable upload, time");
                }
            }
            this.w.x.b(0L);
            L();
            if (z) {
                v().Z.c(numValueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
            } else {
                v().Z.a("Purged empty bundles");
            }
            krg krgVar17 = this.c;
            S(krgVar17);
            krgVar17.o1();
            try {
                map2 = new HashMap();
                it = list.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    s8hVar = s8h.SGTM_CLIENT;
                    if (!zHasNext) {
                        break;
                    }
                    Pair pair5 = (Pair) it.next();
                    t3hVar2 = (t3h) pair5.first;
                    ybhVar2 = (ybh) pair5.second;
                    s8hVar2 = ybhVar2.c;
                    s8hVar3 = ybhVar2.c;
                    if (s8hVar2 != s8hVar) {
                        krg krgVar18 = this.c;
                        S(krgVar18);
                        String str7 = ybhVar2.a;
                        map4 = ybhVar2.b;
                        if (map4 == null) {
                            map4 = Collections.EMPTY_MAP;
                        }
                        jE0 = krgVar18.E0(str, t3hVar2, str7, map4, s8hVar3, null);
                        if (s8hVar3 == s8h.GOOGLE_SIGNAL_PENDING && jE0 != -1 && !t3hVar2.v().isEmpty()) {
                            map2.put(t3hVar2.v(), Long.valueOf(jE0));
                        }
                    }
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair6 = (Pair) it2.next();
                    t3hVar = (t3h) pair6.first;
                    ybhVar = (ybh) pair6.second;
                    if (ybhVar.c == s8hVar) {
                        Long l4 = (Long) map2.get(t3hVar.v());
                        krg krgVar19 = this.c;
                        S(krgVar19);
                        s8h s8hVar6 = s8hVar;
                        String str8 = ybhVar.a;
                        map3 = ybhVar.b;
                        if (map3 == null) {
                            map3 = Collections.EMPTY_MAP;
                        }
                        krgVar19.E0(str, t3hVar, str8, map3, ybhVar.c, l4);
                        s8hVar = s8hVar6;
                    }
                }
                krg krgVar110 = this.c;
                S(krgVar110);
                listF0 = krgVar110.F0(str, sbh.c(s8hVar), 1);
                if (!listF0.isEmpty()) {
                    j = ((kch) listF0.get(0)).f;
                    E().getClass();
                    if (System.currentTimeMillis() > ((Long) bzg.F.a(null)).longValue() + j) {
                        v().x.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                    }
                }
                while (r2.hasNext()) {
                    try {
                        krg krgVar111 = this.c;
                        S(krgVar111);
                        krgVar111.J0(l2.longValue());
                    } catch (SQLiteException e2) {
                        ArrayList arrayList2 = this.O0;
                        if (arrayList2 == null || !arrayList2.contains(l2)) {
                            throw e2;
                        }
                    }
                }
                krg krgVar112 = this.c;
                S(krgVar112);
                krgVar112.p1();
                krg krgVar113 = this.c;
                S(krgVar113);
                krgVar113.q1();
                this.O0 = null;
                S(g1hVar);
                if (g1hVar.E0()) {
                    krgVar = this.c;
                    S(krgVar);
                    if (krgVar.G0(str)) {
                        o(str);
                    } else {
                        S(g1hVar);
                        if (g1hVar.E0() || !K()) {
                            this.P0 = -1L;
                            L();
                        } else {
                            l();
                        }
                    }
                } else {
                    S(g1hVar);
                    if (g1hVar.E0()) {
                        this.P0 = -1L;
                        L();
                    } else {
                        this.P0 = -1L;
                        L();
                    }
                }
                this.Z = 0L;
            } catch (Throwable th3) {
                krg krgVar20 = this.c;
                S(krgVar20);
                krgVar20.q1();
                throw th3;
            }
        }
        this.J0 = false;
        M();
    }

    public final void x(k1h k1hVar) {
        kd0 kd0Var;
        kd0 kd0Var2;
        Z().A0();
        if (TextUtils.isEmpty(k1hVar.H())) {
            String strE = k1hVar.E();
            oa7.A(strE);
            y(strE, 204, null, null, null);
            return;
        }
        String strE2 = k1hVar.E();
        oa7.A(strE2);
        v().Z.b(strE2, "Fetching remote configuration");
        y2h y2hVar = this.a;
        S(y2hVar);
        d0h d0hVarM0 = y2hVar.M0(strE2);
        S(y2hVar);
        y2hVar.A0();
        String str = (String) y2hVar.Z.get(strE2);
        if (d0hVarM0 != null) {
            if (TextUtils.isEmpty(str)) {
                kd0Var2 = null;
            } else {
                kd0Var2 = new kd0(0);
                kd0Var2.put("If-Modified-Since", str);
            }
            S(y2hVar);
            y2hVar.A0();
            String str2 = (String) y2hVar.E0.get(strE2);
            if (!TextUtils.isEmpty(str2)) {
                if (kd0Var2 == null) {
                    kd0Var2 = new kd0(0);
                }
                kd0Var2.put("If-None-Match", str2);
            }
            kd0Var = kd0Var2;
        } else {
            kd0Var = null;
        }
        this.I0 = true;
        g1h g1hVar = this.b;
        S(g1hVar);
        g5b g5bVar = new g5b(23, this);
        w3h w3hVar = (w3h) g1hVar.b;
        g1hVar.A0();
        g1hVar.B0();
        zbh zbhVar = g1hVar.c.x;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) bzg.f.a(null)).encodedAuthority((String) bzg.g.a(null)).path("config/app/".concat(String.valueOf(k1hVar.H()))).appendQueryParameter("platform", "android");
        ((w3h) zbhVar.b).d.G0();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.M0(new e1h(g1hVar, k1hVar.E(), url, (byte[]) null, kd0Var, g5bVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.c(w0h.E0(k1hVar.E()), string, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[PHI: r11
  0x005c: PHI (r11v12 int) = (r11v2 int), (r11v0 int) binds: [B:18:0x005e, B:15:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0045, B:21:0x0063, B:58:0x0177, B:29:0x0080, B:34:0x00dc, B:33:0x00ca, B:35:0x00e1, B:39:0x00f8, B:43:0x010e, B:45:0x0126, B:47:0x0141, B:49:0x014a, B:51:0x0150, B:52:0x0154, B:54:0x015d, B:56:0x016c, B:57:0x0174, B:46:0x0132, B:40:0x00ff, B:42:0x0108), top: B:66:0x0045, outer: #1 }] */
    public final void y(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        g1h g1hVar = this.b;
        Z().A0();
        m0();
        oa7.x(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.I0 = false;
                M();
                throw th2;
            }
        }
        tz0 tz0Var = v().Z;
        Integer numValueOf = Integer.valueOf(bArr.length);
        tz0Var.b(numValueOf, "onConfigFetched. Response size");
        if (f0().L0(null, bzg.e1)) {
            lch lchVar = this.g;
            S(lchVar);
            lchVar.G0(map);
        }
        krg krgVar = this.c;
        S(krgVar);
        krgVar.o1();
        try {
            krg krgVar2 = this.c;
            S(krgVar2);
            k1h k1hVarE1 = krgVar2.E1(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (k1hVarE1 == null) {
                v().x.b(w0h.E0(str), "App does not exist in onConfigFetched. appId");
            } else {
                y2h y2hVar = this.a;
                if (z || i == 404) {
                    k0();
                    String strL0 = lch.L0("Last-Modified", map);
                    k0();
                    String strL1 = lch.L0("ETag", map);
                    if (i == 404 || i == 304) {
                        S(y2hVar);
                        if (y2hVar.M0(str) == null) {
                            S(y2hVar);
                            y2hVar.O0(str, null, null, null);
                        }
                    } else {
                        S(y2hVar);
                        y2hVar.O0(str, strL0, strL1, bArr);
                    }
                    E().getClass();
                    k1hVarE1.f(System.currentTimeMillis());
                    krg krgVar3 = this.c;
                    S(krgVar3);
                    krgVar3.F1(k1hVarE1, false);
                    if (i == 404) {
                        v().z.b(str, "Config not found. Using empty config. appId");
                    } else {
                        v().Z.c(Integer.valueOf(i), numValueOf, "Successfully fetched config. Got network response. code, size");
                    }
                    S(g1hVar);
                    if (g1hVar.E0() && K()) {
                        l();
                    } else {
                        S(g1hVar);
                        if (g1hVar.E0()) {
                            krg krgVar4 = this.c;
                            S(krgVar4);
                            if (krgVar4.G0(k1hVarE1.E())) {
                                o(k1hVarE1.E());
                            } else {
                                L();
                            }
                        } else {
                            L();
                        }
                    }
                } else {
                    E().getClass();
                    k1hVarE1.g(System.currentTimeMillis());
                    krg krgVar5 = this.c;
                    S(krgVar5);
                    krgVar5.F1(k1hVarE1, false);
                    v().Z.c(Integer.valueOf(i), th, "Fetching config failed. code, error");
                    S(y2hVar);
                    y2hVar.A0();
                    y2hVar.Z.put(str, null);
                    v vVar = this.w.x;
                    E().getClass();
                    vVar.b(System.currentTimeMillis());
                    if (i == 503 || i == 429) {
                        v vVar2 = this.w.v;
                        E().getClass();
                        vVar2.b(System.currentTimeMillis());
                    }
                    L();
                }
            }
            krg krgVar6 = this.c;
            S(krgVar6);
            krgVar6.p1();
            krg krgVar7 = this.c;
            S(krgVar7);
            krgVar7.q1();
            this.I0 = false;
            M();
        } catch (Throwable th3) {
            krg krgVar8 = this.c;
            S(krgVar8);
            krgVar8.q1();
            throw th3;
        }
    }
}

package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import io.sentry.android.core.b1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cs4 {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static cch m;
    public static uch n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final kw k = new kw(15);
    public static final pwg l = new pwg(12);
    public static final pwg b = new pwg(18);
    public static final nwg c = new nwg(19);
    public static final pwg d = new pwg(19);

    public cs4(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (ym8.w(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            b1.d("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            b1.l("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            b1.d("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238 A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0249 A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x025f A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0268 A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0270 A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027a A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0288  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0307  */
    /* JADX WARN: Code duplicated, block: B:144:0x0318 A[Catch: all -> 0x00b8, TryCatch #10 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0295, B:120:0x029c, B:128:0x02ab, B:130:0x02d3, B:132:0x02e4, B:142:0x0310, B:143:0x0317, B:123:0x029f, B:124:0x02a0, B:125:0x02a7, B:144:0x0318, B:145:0x0338, B:146:0x0339, B:147:0x0386), top: B:166:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #10 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0295, B:120:0x029c, B:128:0x02ab, B:130:0x02d3, B:132:0x02e4, B:142:0x0310, B:143:0x0317, B:123:0x029f, B:124:0x02a0, B:125:0x02a7, B:144:0x0318, B:145:0x0338, B:146:0x0339, B:147:0x0386), top: B:166:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0284, TryCatch #2 {all -> 0x0284, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:159:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TRY_ENTER, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0136 A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TRY_ENTER, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5 A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0 A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3 A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0206 A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x020e A[Catch: all -> 0x016f, zr4 -> 0x0174, RemoteException -> 0x0179, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x0179, zr4 -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022a A[Catch: all -> 0x0221, zr4 -> 0x0224, RemoteException -> 0x0227, TryCatch #11 {RemoteException -> 0x0227, zr4 -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:163:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [bs4] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static cs4 c(Context context, bs4 bs4Var, String str) throws zr4 {
        ?? r7;
        int i2;
        cs4 cs4Var;
        Cursor cursor;
        int i3;
        Boolean bool;
        cch cchVarH;
        int i4;
        vt6 vt6VarO;
        Object objN;
        aah aahVar;
        uch uchVar;
        aah aahVar2;
        boolean z;
        vt6 vt6VarO2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new zr4("null application Context");
        }
        ThreadLocal threadLocal = j;
        aah aahVar3 = (aah) threadLocal.get();
        aah aahVar4 = new aah();
        threadLocal.set(aahVar4);
        kw kwVar = k;
        Long l2 = (Long) kwVar.get();
        long jLongValue = l2.longValue();
        try {
            kwVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            e6 e6VarC = bs4Var.c(context, str, l);
            int i5 = e6VarC.a;
            int i6 = e6VarC.b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i5).length() + 19 + str.length() + 1 + String.valueOf(i6).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i6);
            Log.i("DynamiteModule", sb.toString());
            int i7 = e6VarC.c;
            if (i7 != 0) {
                if (i7 != -1) {
                    if (i7 == 1 || e6VarC.b != 0) {
                        if (i7 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            cs4 cs4Var2 = new cs4(applicationContext);
                            if (jLongValue == 0) {
                                kwVar.remove();
                            } else {
                                kwVar.set(l2);
                            }
                            cursor2 = aahVar4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(aahVar3);
                            return cs4Var2;
                        }
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i7);
                            throw new zr4(sb2.toString());
                        }
                        try {
                            try {
                                i3 = e6VarC.b;
                                try {
                                    try {
                                        try {
                                            synchronized (cs4.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new zr4("Remote loading disabled");
                                                    }
                                                    bool = e;
                                                    if (bool != null) {
                                                        throw new zr4("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i3);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (cs4.class) {
                                                            uchVar = n;
                                                        }
                                                        if (uchVar != null) {
                                                            throw new zr4("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        aahVar2 = (aah) threadLocal.get();
                                                        if (aahVar2 != null || aahVar2.a == null) {
                                                            throw new zr4("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = aahVar2.a;
                                                        new tk9(null);
                                                        synchronized (cs4.class) {
                                                            z = h >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            vt6VarO2 = uchVar.P(new tk9(applicationContext2), str, i3, new tk9(cursor3));
                                                        } else {
                                                            b1.l("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            vt6VarO2 = uchVar.O(new tk9(applicationContext2), str, i3, new tk9(cursor3));
                                                        }
                                                        Context context2 = (Context) tk9.N(vt6VarO2);
                                                        if (context2 == null) {
                                                            throw new zr4("Failed to get module context");
                                                        }
                                                        cs4Var = new cs4(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i3);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        cchVarH = h(context);
                                                        if (cchVarH != null) {
                                                            throw new zr4("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelH = cchVarH.H(cchVarH.J(), 6);
                                                        i4 = parcelH.readInt();
                                                        parcelH.recycle();
                                                        if (i4 >= 3) {
                                                            aahVar = (aah) threadLocal.get();
                                                            if (aahVar != null) {
                                                                throw new zr4("No cached result cursor holder");
                                                            }
                                                            vt6VarO = cchVarH.R(new tk9(context), str, i3, new tk9(aahVar.a));
                                                        } else if (i4 == 2) {
                                                            b1.l("DynamiteModule", "IDynamite loader version = 2");
                                                            vt6VarO = cchVarH.P(new tk9(context), str, i3);
                                                        } else {
                                                            b1.l("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            vt6VarO = cchVarH.O(new tk9(context), str, i3);
                                                        }
                                                        objN = tk9.N(vt6VarO);
                                                        if (objN != null) {
                                                            throw new zr4("Failed to load remote module.");
                                                        }
                                                        cs4Var = new cs4((Context) objN);
                                                    }
                                                    if (jLongValue == 0) {
                                                        k.remove();
                                                    } else {
                                                        k.set(l2);
                                                    }
                                                    cursor = aahVar4.a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    j.set(aahVar3);
                                                    return cs4Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (RemoteException e2) {
                                            e = e2;
                                            throw new zr4("Failed to load remote module.", e);
                                        } catch (zr4 e3) {
                                            throw e3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw new zr4("Failed to load remote module.", th);
                                        }
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        throw new zr4("Failed to load remote module.", e);
                                    } catch (zr4 e5) {
                                        throw e5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new zr4("Failed to load remote module.", th);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (zr4 e6) {
                                e = e6;
                                r7 = kwVar;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                b1.l("DynamiteModule", sb5.toString());
                                i2 = e6VarC.a;
                                if (i2 != 0) {
                                }
                                throw new zr4("Remote load failed. No local fallback found.", e);
                            }
                        } catch (zr4 e7) {
                            e = e7;
                            r7 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            b1.l("DynamiteModule", sb6.toString());
                            i2 = e6VarC.a;
                            if (i2 != 0 || bs4Var.c(r7, str, new ff8(i2, 14)).c != -1) {
                                throw new zr4("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            cs4Var = new cs4(applicationContext);
                        }
                    }
                } else if (e6VarC.a != 0) {
                    i7 = -1;
                    if (i7 == 1) {
                    }
                    if (i7 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        cs4 cs4Var3 = new cs4(applicationContext);
                        if (jLongValue == 0) {
                            kwVar.remove();
                        } else {
                            kwVar.set(l2);
                        }
                        cursor2 = aahVar4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(aahVar3);
                        return cs4Var3;
                    }
                    if (i7 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i7);
                        throw new zr4(sb7.toString());
                    }
                    i3 = e6VarC.b;
                    synchronized (cs4.class) {
                        if (e(context)) {
                            throw new zr4("Remote loading disabled");
                        }
                        bool = e;
                        if (bool != null) {
                            throw new zr4("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i3);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (cs4.class) {
                                uchVar = n;
                                if (uchVar != null) {
                                    throw new zr4("DynamiteLoaderV2 was not cached.");
                                }
                                aahVar2 = (aah) threadLocal.get();
                                if (aahVar2 != null) {
                                }
                                throw new zr4("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i3);
                        Log.i("DynamiteModule", sb9.toString());
                        cchVarH = h(context);
                        if (cchVarH != null) {
                            throw new zr4("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelH2 = cchVarH.H(cchVarH.J(), 6);
                        i4 = parcelH2.readInt();
                        parcelH2.recycle();
                        if (i4 >= 3) {
                            aahVar = (aah) threadLocal.get();
                            if (aahVar != null) {
                                throw new zr4("No cached result cursor holder");
                            }
                            vt6VarO = cchVarH.R(new tk9(context), str, i3, new tk9(aahVar.a));
                        } else if (i4 == 2) {
                            b1.l("DynamiteModule", "IDynamite loader version = 2");
                            vt6VarO = cchVarH.P(new tk9(context), str, i3);
                        } else {
                            b1.l("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            vt6VarO = cchVarH.O(new tk9(context), str, i3);
                        }
                        objN = tk9.N(vt6VarO);
                        if (objN != null) {
                            throw new zr4("Failed to load remote module.");
                        }
                        cs4Var = new cs4((Context) objN);
                        if (jLongValue == 0) {
                            k.remove();
                        } else {
                            k.set(l2);
                        }
                        cursor = aahVar4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(aahVar3);
                        return cs4Var;
                    }
                }
            }
            int i8 = e6VarC.a;
            int i9 = e6VarC.b;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i8);
            sb10.append(" and remote version is ");
            sb10.append(i9);
            sb10.append(".");
            throw new zr4(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                k.remove();
            } else {
                k.set(l2);
            }
            Cursor cursor4 = aahVar4.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            j.set(aahVar3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #13 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:152:0x002b, inners: #4 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i2;
        Cursor cursor;
        try {
            synchronized (cs4.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (zr4 unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z, true);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderU = urg.U();
                                                    if (classLoaderU == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            yr4.b();
                                                            String str3 = f;
                                                            oa7.A(str3);
                                                            classLoaderU = yr4.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f;
                                                            oa7.A(str4);
                                                            classLoaderU = new xvg(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderU);
                                                    declaredField.set(null, classLoaderU);
                                                    e = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (zr4 unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        b1.l("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (zr4 e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        b1.l("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                cch cchVarH = h(context);
                try {
                    if (cchVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelH = cchVarH.H(cchVarH.J(), 6);
                        int i3 = parcelH.readInt();
                        parcelH.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = j;
                            aah aahVar = (aah) threadLocal.get();
                            if (aahVar != null && (cursor = aahVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) tk9.N(cchVarH.Q(new tk9(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            aah aahVar2 = (aah) threadLocal.get();
                                            if (aahVar2 == null || aahVar2.a != null) {
                                                z2 = false;
                                            } else {
                                                aahVar2.a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    remoteException = e4;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    b1.l("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            b1.l("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            b1.l("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            tk9 tk9Var = new tk9(context);
                            Parcel parcelJ = cchVarH.J();
                            itg.b(parcelJ, tk9Var);
                            parcelJ.writeString(str);
                            parcelJ.writeInt(z ? 1 : 0);
                            Parcel parcelH2 = cchVarH.H(parcelJ, 5);
                            i2 = parcelH2.readInt();
                            parcelH2.recycle();
                        } else {
                            b1.l("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            tk9 tk9Var2 = new tk9(context);
                            Parcel parcelJ2 = cchVarH.J();
                            itg.b(parcelJ2, tk9Var2);
                            parcelJ2.writeString(str);
                            parcelJ2.writeInt(z ? 1 : 0);
                            Parcel parcelH3 = cchVarH.H(parcelJ2, 3);
                            i2 = parcelH3.readInt();
                            parcelH3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        remoteException = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                oa7.A(context);
                throw th5;
            } catch (Exception e6) {
                b1.e("CrashUtils", "Error adding exception to DropBox!", e6);
                throw th5;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (bc6.b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            b1.d("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (cs4.class) {
                                    try {
                                        f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                aah aahVar = (aah) j.get();
                                if (aahVar == null || aahVar.a != null) {
                                    z4 = false;
                                } else {
                                    aahVar.a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new zr4("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof zr4) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new zr4(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                b1.l("DynamiteModule", "Failed to retrieve remote module version.");
                throw new zr4("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public static void g(ClassLoader classLoader) throws zr4 {
        try {
            uch uchVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                uchVar = iInterfaceQueryLocalInterface instanceof uch ? (uch) iInterfaceQueryLocalInterface : new uch(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 3);
            }
            n = uchVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new zr4("Failed to instantiate dynamite loader", e2);
        }
    }

    public static cch h(Context context) {
        cch cchVar;
        synchronized (cs4.class) {
            cch cchVar2 = m;
            if (cchVar2 != null) {
                return cchVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    cchVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    cchVar = iInterfaceQueryLocalInterface instanceof cch ? (cch) iInterfaceQueryLocalInterface : new cch(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 3);
                }
                if (cchVar != null) {
                    m = cchVar;
                    return cchVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                b1.d("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws zr4 {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new zr4("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}

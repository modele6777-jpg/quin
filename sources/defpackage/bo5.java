package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bo5 implements zn5 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final vn5 d;
    public z69 f;
    public oo5 h;
    public final oo5 c = new oo5(2, 14, null);
    public final ao5 e = new ao5(this);
    public final i79 g = new i79(1);

    public bo5(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new vn5(this, androidComposeView2);
    }

    public final boolean b(boolean z) {
        wo0 wo0Var;
        if (g() != null) {
            oo5 oo5VarG = g();
            j(null);
            if (oo5VarG != null) {
                ko5 ko5Var = ko5.a;
                ko5 ko5Var2 = ko5.c;
                oo5VarG.m1(ko5Var, ko5Var2);
                if (!oo5VarG.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09 i09Var = oo5VarG.a.e;
                LayoutNode layoutNodeS0 = vd0.s0(oo5VarG);
                while (layoutNodeS0 != null) {
                    if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        while (i09Var != null) {
                            if ((i09Var.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                i09 i09VarM0 = i09Var;
                                p89 p89Var = null;
                                while (i09VarM0 != null) {
                                    if (i09VarM0 instanceof oo5) {
                                        ((oo5) i09VarM0).m1(ko5.b, ko5Var2);
                                    } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                        int i = 0;
                                        for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                            if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    i09VarM0 = i09Var2;
                                                } else {
                                                    if (p89Var == null) {
                                                        p89Var = new p89(0, new i09[16]);
                                                    }
                                                    if (i09VarM0 != null) {
                                                        p89Var.b(i09VarM0);
                                                        i09VarM0 = null;
                                                    }
                                                    p89Var.b(i09Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    i09VarM0 = vd0.m0(p89Var);
                                }
                            }
                            i09Var = i09Var.e;
                        }
                    }
                    layoutNodeS0 = layoutNodeS0.F();
                    i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = t72.N(this.c, i).ordinal()) == 0) {
            b(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                ap.c();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x013c A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0142 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0180 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0190 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:329:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0189 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0172 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008a A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[ADDED_TO_REGION, LOOP:12: B:52:0x00a1->B:80:0x00ed, LOOP_START, PHI: r5
  0x00a1: PHI (r5v30 i09) = (r5v24 i09), (r5v31 i09) binds: [B:51:0x009f, B:80:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0106 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x010c A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0112 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x011f A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x012b A[ADDED_TO_REGION, LOOP:16: B:98:0x012b->B:126:0x0177, LOOP_START, PHI: r12
  0x012b: PHI (r12v14 i09) = (r12v8 i09), (r12v15 i09) binds: [B:97:0x0129, B:126:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [p89] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [p89] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [i09] */
    /* JADX WARN: Type inference failed for: r12v25, types: [i09] */
    /* JADX WARN: Type inference failed for: r12v29, types: [i09] */
    /* JADX WARN: Type inference failed for: r12v30, types: [i09] */
    /* JADX WARN: Type inference failed for: r12v34, types: [i09] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [i09] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [p89] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v40 */
    public final boolean e(KeyEvent keyEvent, x16 x16Var) {
        i09 i09Var;
        LayoutNode layoutNodeS0;
        Object obj;
        Object obj2;
        i09 i09Var2;
        wo0 wo0Var;
        i09 i09VarM0;
        p89 p89Var;
        i09 i09Var3;
        LayoutNode layoutNodeS1;
        Object obj3;
        Object obj4;
        wo0 wo0Var2;
        p89 p89Var2;
        i09 i09VarM1;
        int size;
        wo0 wo0Var3;
        boolean z;
        oo5 oo5Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            long jQ = nk8.q(keyEvent);
            int iR = nk8.r(keyEvent);
            if (iR == 2) {
                z69 z69Var = this.f;
                if (z69Var == null) {
                    z69Var = new z69(3);
                    this.f = z69Var;
                }
                z69Var.d(jQ);
            } else if (iR == 1) {
                z69 z69Var2 = this.f;
                if (z69Var2 == null || !z69Var2.a(jQ)) {
                    Trace.endSection();
                    return false;
                }
                z69 z69Var3 = this.f;
                if (z69Var3 != null) {
                    z69Var3.e(jQ);
                }
            }
            oo5 oo5VarX = vpf.x(oo5Var);
            if (oo5VarX != null) {
                if (!oo5VarX.a.Y) {
                    i37.c("visitLocalDescendants called on an unattached node");
                }
                i09 i09Var4 = oo5VarX.a;
                if ((i09Var4.d & 9216) != 0) {
                    i09Var2 = null;
                    for (i09 i09Var5 = i09Var4.f; i09Var5 != null; i09Var5 = i09Var5.f) {
                        int i = i09Var5.c;
                        if ((i & 9216) != 0) {
                            if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                break;
                            }
                            i09Var2 = i09Var5;
                        }
                    }
                } else {
                    i09Var2 = null;
                }
                if (i09Var2 == null) {
                    if (oo5VarX == null) {
                        if (!oo5Var.a.Y) {
                            i37.c("visitAncestors called on an unattached node");
                        }
                        i09Var = oo5Var.a.e;
                        layoutNodeS0 = vd0.s0(oo5Var);
                        loop15: while (true) {
                            if (layoutNodeS0 != null) {
                                obj = null;
                                break;
                            }
                            if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                while (i09Var != null) {
                                    if ((i09Var.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                        i09VarM0 = i09Var;
                                        p89Var = null;
                                        while (i09VarM0 != null) {
                                            if (i09VarM0 instanceof qo7) {
                                                obj = i09VarM0;
                                                break loop15;
                                            }
                                            if ((i09VarM0.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                                            }
                                            i09VarM0 = vd0.m0(p89Var);
                                        }
                                    }
                                    i09Var = i09Var.e;
                                }
                            }
                            layoutNodeS0 = layoutNodeS0.F();
                            if (layoutNodeS0 != null) {
                            }
                        }
                        obj2 = (qo7) obj;
                        if (obj2 != null) {
                            i09Var2 = ((i09) obj2).a;
                        } else {
                            i09Var2 = null;
                        }
                    } else {
                        if (!oo5VarX.a.Y) {
                            i37.c("visitAncestors called on an unattached node");
                        }
                        i09Var3 = oo5VarX.a;
                        layoutNodeS1 = vd0.s0(oo5VarX);
                        loop11: while (true) {
                            if (layoutNodeS1 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((((i09) layoutNodeS1.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                while (i09Var3 != null) {
                                    if ((i09Var3.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                        p89Var2 = null;
                                        i09VarM1 = i09Var3;
                                        while (i09VarM1 != null) {
                                            if (i09VarM1 instanceof qo7) {
                                                obj3 = i09VarM1;
                                                break loop11;
                                            }
                                            if ((i09VarM1.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                                            }
                                            i09VarM1 = vd0.m0(p89Var2);
                                        }
                                    }
                                    i09Var3 = i09Var3.e;
                                }
                            }
                            layoutNodeS1 = layoutNodeS1.F();
                            if (layoutNodeS1 != null) {
                            }
                        }
                        obj4 = (qo7) obj3;
                        if (obj4 != null) {
                            i09Var2 = ((i09) obj4).a;
                        } else {
                            if (!oo5Var.a.Y) {
                                i37.c("visitAncestors called on an unattached node");
                            }
                            i09Var = oo5Var.a.e;
                            layoutNodeS0 = vd0.s0(oo5Var);
                            loop15: while (true) {
                                if (layoutNodeS0 != null) {
                                    obj = null;
                                    break;
                                }
                                if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                    while (i09Var != null) {
                                        if ((i09Var.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                            i09VarM0 = i09Var;
                                            p89Var = null;
                                            while (i09VarM0 != null) {
                                                if (i09VarM0 instanceof qo7) {
                                                    obj = i09VarM0;
                                                    break loop15;
                                                }
                                                if ((i09VarM0.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                                                }
                                                i09VarM0 = vd0.m0(p89Var);
                                            }
                                        }
                                        i09Var = i09Var.e;
                                    }
                                }
                                layoutNodeS0 = layoutNodeS0.F();
                                if (layoutNodeS0 != null) {
                                }
                            }
                            obj2 = (qo7) obj;
                            if (obj2 != null) {
                                i09Var2 = ((i09) obj2).a;
                            } else {
                                i09Var2 = null;
                            }
                        }
                    }
                }
            } else if (oo5VarX == null) {
                if (!oo5Var.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09Var = oo5Var.a.e;
                layoutNodeS0 = vd0.s0(oo5Var);
                loop15: while (true) {
                    if (layoutNodeS0 != null) {
                        obj = null;
                        break;
                    }
                    if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                        while (i09Var != null) {
                            if ((i09Var.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                i09VarM0 = i09Var;
                                p89Var = null;
                                while (i09VarM0 != null) {
                                    if (i09VarM0 instanceof qo7) {
                                        obj = i09VarM0;
                                        break loop15;
                                    }
                                    if ((i09VarM0.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 && (i09VarM0 instanceof sv3)) {
                                        i09 i09Var6 = ((sv3) i09VarM0).E0;
                                        int i2 = 0;
                                        while (i09Var6 != null) {
                                            if ((i09Var6.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    i09VarM0 = i09VarM0;
                                                    p89Var = p89Var;
                                                    p89Var = p89Var;
                                                    i09VarM0 = i09Var6;
                                                } else {
                                                    if (p89Var == null) {
                                                        p89Var = new p89(0, new i09[16]);
                                                    }
                                                    if (i09VarM0 != null) {
                                                        p89Var.b(i09VarM0);
                                                        i09VarM0 = null;
                                                    }
                                                    p89Var.b(i09Var6);
                                                }
                                            } else {
                                                i09VarM0 = i09VarM0;
                                                p89Var = p89Var;
                                            }
                                            i09Var6 = i09Var6.f;
                                            i09VarM0 = i09VarM0;
                                            p89Var = p89Var;
                                        }
                                        if (i2 == 1) {
                                            i09VarM0 = i09VarM0;
                                            p89Var = p89Var;
                                        } else {
                                            i09VarM0 = i09VarM0;
                                            p89Var = p89Var;
                                        }
                                    }
                                    i09VarM0 = vd0.m0(p89Var);
                                }
                            }
                            i09Var = i09Var.e;
                        }
                    }
                    layoutNodeS0 = layoutNodeS0.F();
                    i09Var = (layoutNodeS0 != null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
                }
                obj2 = (qo7) obj;
                if (obj2 != null) {
                    i09Var2 = ((i09) obj2).a;
                } else {
                    i09Var2 = null;
                }
            } else {
                if (!oo5VarX.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09Var3 = oo5VarX.a;
                layoutNodeS1 = vd0.s0(oo5VarX);
                loop11: while (true) {
                    if (layoutNodeS1 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((((i09) layoutNodeS1.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                        while (i09Var3 != null) {
                            if ((i09Var3.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                p89Var2 = null;
                                i09VarM1 = i09Var3;
                                while (i09VarM1 != null) {
                                    if (i09VarM1 instanceof qo7) {
                                        obj3 = i09VarM1;
                                        break loop11;
                                    }
                                    if ((i09VarM1.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 && (i09VarM1 instanceof sv3)) {
                                        i09 i09Var7 = ((sv3) i09VarM1).E0;
                                        int i3 = 0;
                                        while (i09Var7 != null) {
                                            if ((i09Var7.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    i09VarM1 = i09VarM1;
                                                    p89Var2 = p89Var2;
                                                    p89Var2 = p89Var2;
                                                    i09VarM1 = i09Var7;
                                                } else {
                                                    if (p89Var2 == null) {
                                                        p89Var2 = new p89(0, new i09[16]);
                                                    }
                                                    if (i09VarM1 != null) {
                                                        p89Var2.b(i09VarM1);
                                                        i09VarM1 = null;
                                                    }
                                                    p89Var2.b(i09Var7);
                                                }
                                            } else {
                                                i09VarM1 = i09VarM1;
                                                p89Var2 = p89Var2;
                                            }
                                            i09Var7 = i09Var7.f;
                                            i09VarM1 = i09VarM1;
                                            p89Var2 = p89Var2;
                                        }
                                        if (i3 == 1) {
                                            i09VarM1 = i09VarM1;
                                            p89Var2 = p89Var2;
                                        } else {
                                            i09VarM1 = i09VarM1;
                                            p89Var2 = p89Var2;
                                        }
                                    }
                                    i09VarM1 = vd0.m0(p89Var2);
                                }
                            }
                            i09Var3 = i09Var3.e;
                        }
                    }
                    layoutNodeS1 = layoutNodeS1.F();
                    i09Var3 = (layoutNodeS1 != null || (wo0Var2 = layoutNodeS1.V0) == null) ? null : (zde) wo0Var2.f;
                }
                obj4 = (qo7) obj3;
                if (obj4 != null) {
                    i09Var2 = ((i09) obj4).a;
                } else {
                    if (!oo5Var.a.Y) {
                        i37.c("visitAncestors called on an unattached node");
                    }
                    i09Var = oo5Var.a.e;
                    layoutNodeS0 = vd0.s0(oo5Var);
                    loop15: while (true) {
                        if (layoutNodeS0 != null) {
                            obj = null;
                            break;
                        }
                        if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                            while (i09Var != null) {
                                if ((i09Var.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                    i09VarM0 = i09Var;
                                    p89Var = null;
                                    while (i09VarM0 != null) {
                                        if (i09VarM0 instanceof qo7) {
                                            obj = i09VarM0;
                                            break loop15;
                                        }
                                        if ((i09VarM0.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                                        }
                                        i09VarM0 = vd0.m0(p89Var);
                                    }
                                }
                                i09Var = i09Var.e;
                            }
                        }
                        layoutNodeS0 = layoutNodeS0.F();
                        if (layoutNodeS0 != null) {
                        }
                    }
                    obj2 = (qo7) obj;
                    if (obj2 != null) {
                        i09Var2 = ((i09) obj2).a;
                    } else {
                        i09Var2 = null;
                    }
                }
            }
            if (i09Var2 != null) {
                if (!i09Var2.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09 i09Var8 = i09Var2.a.e;
                LayoutNode layoutNodeS2 = vd0.s0(i09Var2);
                ArrayList arrayList = null;
                while (layoutNodeS2 != null) {
                    if ((((i09) layoutNodeS2.V0.g).d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                        while (i09Var8 != null) {
                            if ((i09Var8.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                i09 i09VarM2 = i09Var8;
                                p89 p89Var3 = null;
                                while (i09VarM2 != null) {
                                    if (i09VarM2 instanceof qo7) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(i09VarM2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (i09VarM2.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 && (i09VarM2 instanceof sv3)) {
                                        int i4 = 0;
                                        for (i09 i09Var9 = ((sv3) i09VarM2).E0; i09Var9 != null; i09Var9 = i09Var9.f) {
                                            if ((i09Var9.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    i09VarM2 = i09Var9;
                                                } else {
                                                    if (p89Var3 == null) {
                                                        p89Var3 = new p89(0, new i09[16]);
                                                    }
                                                    if (i09VarM2 != null) {
                                                        p89Var3.b(i09VarM2);
                                                        i09VarM2 = null;
                                                    }
                                                    p89Var3.b(i09Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    i09VarM2 = vd0.m0(p89Var3);
                                }
                            }
                            i09Var8 = i09Var8.e;
                        }
                    }
                    layoutNodeS2 = layoutNodeS2.F();
                    i09Var8 = (layoutNodeS2 == null || (wo0Var3 = layoutNodeS2.V0) == null) ? null : (zde) wo0Var3.f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((qo7) arrayList.get(size)).l(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M0 = i09Var2.a;
                ?? p89Var4 = 0;
                while (M0 != 0) {
                    if (M0 instanceof qo7) {
                        if (((qo7) M0).l(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M0.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 && (M0 instanceof sv3)) {
                        i09 i09Var10 = ((sv3) M0).E0;
                        int i6 = 0;
                        while (i09Var10 != null) {
                            if ((i09Var10.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    p89Var4 = p89Var4;
                                    M0 = M0;
                                    p89Var4 = p89Var4;
                                    M0 = i09Var10;
                                } else {
                                    if (p89Var4 == 0) {
                                        p89Var4 = new p89(0, new i09[16]);
                                    }
                                    if (M0 != 0) {
                                        p89Var4.b(M0);
                                        M0 = 0;
                                    }
                                    p89Var4.b(i09Var10);
                                }
                            } else {
                                p89Var4 = p89Var4;
                                M0 = M0;
                            }
                            i09Var10 = i09Var10.f;
                            p89Var4 = p89Var4;
                            M0 = M0;
                        }
                        if (i6 == 1) {
                            p89Var4 = p89Var4;
                            M0 = M0;
                        } else {
                            p89Var4 = p89Var4;
                            M0 = M0;
                        }
                    }
                    M0 = vd0.m0(p89Var4);
                }
                if (((Boolean) x16Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? M1 = i09Var2.a;
                ?? p89Var5 = 0;
                while (M1 != 0) {
                    if (M1 instanceof qo7) {
                        if (((qo7) M1).M(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M1.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 && (M1 instanceof sv3)) {
                        i09 i09Var11 = ((sv3) M1).E0;
                        int i7 = 0;
                        while (i09Var11 != null) {
                            if ((i09Var11.c & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    M1 = M1;
                                    p89Var5 = p89Var5;
                                    p89Var5 = p89Var5;
                                    M1 = i09Var11;
                                } else {
                                    if (p89Var5 == 0) {
                                        p89Var5 = new p89(0, new i09[16]);
                                    }
                                    if (M1 != 0) {
                                        p89Var5.b(M1);
                                        M1 = 0;
                                    }
                                    p89Var5.b(i09Var11);
                                }
                            } else {
                                M1 = M1;
                                p89Var5 = p89Var5;
                            }
                            i09Var11 = i09Var11.f;
                            M1 = M1;
                            p89Var5 = p89Var5;
                        }
                        if (i7 == 1) {
                            M1 = M1;
                            p89Var5 = p89Var5;
                        } else {
                            M1 = M1;
                            p89Var5 = p89Var5;
                        }
                    }
                    M1 = vd0.m0(p89Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((qo7) arrayList.get(i8)).M(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean f(int i, hkb hkbVar, a26 a26Var) {
        boolean zK;
        boolean z;
        oo5 oo5Var;
        wo0 wo0Var;
        boolean z2;
        oo5 oo5Var2 = this.c;
        oo5 oo5VarX = vpf.x(oo5Var2);
        int i2 = 4;
        AndroidComposeView androidComposeView = this.b;
        if (oo5VarX != null) {
            cv7 layoutDirection = androidComposeView.getLayoutDirection();
            do5 do5VarN1 = oo5VarX.n1();
            fo5 fo5Var = do5VarN1.h;
            fo5 fo5Var2 = do5VarN1.i;
            if (i == 1) {
                fo5Var = do5VarN1.b;
            } else if (i == 2) {
                fo5Var = do5VarN1.c;
            } else if (i == 5) {
                fo5Var = do5VarN1.d;
            } else if (i == 6) {
                fo5Var = do5VarN1.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    fo5Var = fo5Var2;
                }
                if (fo5Var == fo5.b) {
                    fo5Var = null;
                }
                if (fo5Var == null) {
                    fo5Var = do5VarN1.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    fo5Var = fo5Var2;
                } else if (iOrdinal2 != 1) {
                    ap.c();
                    return null;
                }
                if (fo5Var == fo5.b) {
                    fo5Var = null;
                }
                if (fo5Var == null) {
                    fo5Var = do5VarN1.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    qc0.p("invalid FocusDirection");
                    return null;
                }
                ml1 ml1Var = new ml1(i);
                bo5 bo5Var = (bo5) vd0.t0(oo5VarX).getFocusOwner();
                oo5 oo5VarG = bo5Var.g();
                if (i == 7) {
                    do5VarN1.j.d(ml1Var);
                } else {
                    do5VarN1.k.d(ml1Var);
                }
                fo5Var = ml1Var.b ? fo5.c : oo5VarG != bo5Var.g() ? fo5.d : fo5.b;
            }
            fo5 fo5Var3 = fo5.c;
            if (!pa7.t(fo5Var, fo5Var3)) {
                if (pa7.t(fo5Var, fo5.d)) {
                    oo5 oo5VarX2 = vpf.x(oo5Var2);
                    if (oo5VarX2 != null) {
                        return (Boolean) a26Var.d(oo5VarX2);
                    }
                } else {
                    fo5 fo5Var4 = fo5.b;
                    if (!pa7.t(fo5Var, fo5Var4)) {
                        if (fo5Var == fo5Var4) {
                            qc0.p("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (fo5Var == fo5Var3) {
                            qc0.p("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        p89 p89Var = fo5Var.a;
                        int i3 = p89Var.c;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z2 = false;
                        } else {
                            Object[] objArr = p89Var.a;
                            boolean z3 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = (ho5) objArr[i4];
                                if (!((i09) obj).a.Y) {
                                    i37.c("visitChildren called on an unattached node");
                                }
                                p89 p89Var2 = new p89(0, new i09[16]);
                                i09 i09Var = ((i09) obj).a;
                                i09 i09Var2 = i09Var.f;
                                if (i09Var2 == null) {
                                    vd0.H(p89Var2, i09Var);
                                } else {
                                    p89Var2.b(i09Var2);
                                }
                                while (true) {
                                    int i5 = p89Var2.c;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    i09 i09VarM0 = (i09) p89Var2.k(i5 - 1);
                                    if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                                        vd0.H(p89Var2, i09VarM0);
                                    } else {
                                        while (i09VarM0 != null) {
                                            if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                p89 p89Var3 = null;
                                                while (i09VarM0 != null) {
                                                    if (i09VarM0 instanceof oo5) {
                                                        if (((Boolean) a26Var.d((oo5) i09VarM0)).booleanValue()) {
                                                            z3 = true;
                                                            break;
                                                        }
                                                    } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                                        p89 p89Var4 = p89Var3;
                                                        int i6 = 0;
                                                        for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                                            if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    i09VarM0 = i09Var3;
                                                                } else {
                                                                    if (p89Var4 == null) {
                                                                        p89Var4 = new p89(0, new i09[16]);
                                                                    }
                                                                    if (i09VarM0 != null) {
                                                                        p89Var4.b(i09VarM0);
                                                                        i09VarM0 = null;
                                                                    }
                                                                    p89Var4.b(i09Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                            p89Var3 = p89Var4;
                                                        } else {
                                                            p89Var3 = p89Var4;
                                                        }
                                                    }
                                                    i09VarM0 = vd0.m0(p89Var3);
                                                }
                                                break;
                                            }
                                            i09VarM0 = i09VarM0.f;
                                        }
                                    }
                                }
                            }
                            z2 = z3;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
            }
            return null;
        }
        oo5VarX = null;
        cv7 layoutDirection2 = androidComposeView.getLayoutDirection();
        it3 it3Var = new it3(oo5VarX, this, a26Var, 7);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zK = urg.w(oo5Var2, it3Var);
            } else {
                if (i != 2) {
                    qc0.p("This function should only be used for 1-D focus search");
                    return null;
                }
                zK = urg.k(oo5Var2, it3Var);
            }
            return Boolean.valueOf(zK);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return uyb.D(i, it3Var, oo5Var2, hkbVar);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    ap.c();
                    return null;
                }
                i2 = 3;
            }
            oo5 oo5VarX3 = vpf.x(oo5Var2);
            if (oo5VarX3 != null) {
                return uyb.D(i2, it3Var, oo5VarX3, hkbVar);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(mn5.a(i)).toString());
        }
        oo5 oo5VarX4 = vpf.x(oo5Var2);
        if (oo5VarX4 != null) {
            if (!oo5VarX4.a.Y) {
                i37.c("visitAncestors called on an unattached node");
            }
            i09 i09Var4 = oo5VarX4.a.e;
            LayoutNode layoutNodeS0 = vd0.s0(oo5VarX4);
            loop5: while (true) {
                if (layoutNodeS0 == null) {
                    oo5Var = null;
                    break;
                }
                if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    while (i09Var4 != null) {
                        if ((i09Var4.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            i09 i09VarM1 = i09Var4;
                            p89 p89Var5 = null;
                            while (i09VarM1 != null) {
                                if (i09VarM1 instanceof oo5) {
                                    oo5 oo5Var3 = (oo5) i09VarM1;
                                    if (oo5Var3.n1().a) {
                                        oo5Var = oo5Var3;
                                        break loop5;
                                    }
                                } else if ((i09VarM1.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM1 instanceof sv3)) {
                                    int i7 = 0;
                                    for (i09 i09Var5 = ((sv3) i09VarM1).E0; i09Var5 != null; i09Var5 = i09Var5.f) {
                                        if ((i09Var5.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                i09VarM1 = i09Var5;
                                            } else {
                                                if (p89Var5 == null) {
                                                    p89Var5 = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM1 != null) {
                                                    p89Var5.b(i09VarM1);
                                                    i09VarM1 = null;
                                                }
                                                p89Var5.b(i09Var5);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        i09VarM1 = vd0.m0(p89Var5);
                                    }
                                }
                                i09VarM1 = vd0.m0(p89Var5);
                            }
                        }
                        i09Var4 = i09Var4.e;
                    }
                }
                layoutNodeS0 = layoutNodeS0.F();
                i09Var4 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
            }
            z = false;
        } else {
            z = false;
            oo5Var = null;
        }
        return Boolean.valueOf((oo5Var == null || oo5Var == oo5Var2) ? z : ((Boolean) it3Var.d(oo5Var)).booleanValue());
    }

    public final oo5 g() {
        oo5 oo5Var = this.h;
        if (oo5Var == null || !oo5Var.Y) {
            return null;
        }
        return oo5Var;
    }

    public final boolean h(int i, boolean z) {
        oo5 oo5VarG = g();
        AndroidComposeView androidComposeView = this.a;
        if (oo5VarG == null || !oo5VarG.Z || !androidComposeView.t(i)) {
            mmb mmbVar = new mmb();
            mmbVar.element = Boolean.FALSE;
            oo5 oo5VarG2 = g();
            Boolean boolF = f(i, androidComposeView.getEmbeddedViewFocusRect(), new vj(mmbVar, i, 3));
            if (!pa7.t(boolF, Boolean.TRUE) || oo5VarG2 == g()) {
                if (boolF != null && mmbVar.element != null) {
                    if (!boolF.booleanValue() || !((Boolean) mmbVar.element).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean boolF2 = f(i, null, new xp(i, 7));
                            if (boolF2 != null ? boolF2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        if (!c(i, false, false)) {
            return false;
        }
        Boolean boolF = f(i, null, new xp(i, 6));
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    public final void j(oo5 oo5Var) {
        oo5 oo5Var2 = this.h;
        this.h = oo5Var;
        i79 i79Var = this.g;
        Object[] objArr = i79Var.a;
        int i = i79Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((wn5) objArr[i2]).a(oo5Var2, oo5Var);
        }
    }
}

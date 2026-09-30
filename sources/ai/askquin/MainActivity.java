package ai.askquin;

import android.content.Intent;
import defpackage.ace;
import defpackage.bm8;
import defpackage.dd2;
import defpackage.dzb;
import defpackage.eb3;
import defpackage.ezb;
import defpackage.f17;
import defpackage.h1;
import defpackage.lr7;
import defpackage.lw7;
import defpackage.qj8;
import defpackage.rj8;
import defpackage.ru7;
import defpackage.tj8;
import defpackage.tq0;
import defpackage.uj8;
import defpackage.vx8;
import defpackage.wb2;
import defpackage.wj7;
import defpackage.wk8;
import defpackage.xh9;
import defpackage.z18;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends h1 implements lr7 {
    public static final /* synthetic */ int Z0 = 0;
    public final lw7 Q0 = eb3.N(z18.c, new wj7(12, this));
    public final lw7 R0;
    public vx8 S0;
    public boolean T0;
    public final lw7 U0;
    public final lw7 V0;
    public final lw7 W0;
    public final f17 X0;
    public final ace Y0;

    public MainActivity() {
        tq0 tq0Var = new tq0(29, this);
        z18 z18Var = z18.a;
        this.R0 = eb3.N(z18Var, tq0Var);
        this.U0 = eb3.N(z18Var, new uj8(0, this));
        this.V0 = eb3.N(z18Var, new uj8(1, this));
        this.W0 = eb3.N(z18Var, new uj8(2, this));
        this.X0 = new f17(3, (boolean) (0 == true ? 1 : 0));
        this.Y0 = new ace(new qj8(this, 0 == true ? 1 : 0));
    }

    @Override // defpackage.vb2, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        this.X0.b = false;
    }

    @Override // defpackage.h1
    public final void u() {
        Object dzbVar;
        try {
            dzbVar = xh9.d(this);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            d().h("Failed to refresh notification permission status", thA);
        }
        ru7 ru7Var = (ru7) w().b.getValue();
        if (!ru7Var.e) {
            bm8.P(new tj8(this, ru7Var, null));
        }
        wb2.a(this, new dd2(new rj8(this, 0), true, 1863488298));
    }

    public final wk8 w() {
        return (wk8) this.Q0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:119:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0402  */
    /* JADX WARN: Code duplicated, block: B:123:0x041e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0448 A[PHI: r0 r4 r5 r7 r9 r10 r11 r12 r15 r24 r25 r28
  0x0448: PHI (r0v9 ru7) = (r0v5 ru7), (r0v5 ru7), (r0v64 ru7) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r4v7 int) = (r4v5 int), (r4v5 int), (r4v14 int) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r5v44 dh9) = (r5v39 dh9), (r5v39 dh9), (r5v52 dh9) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r7v8 boolean) = (r7v6 boolean), (r7v6 boolean), (r7v10 boolean) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r9v28 java.lang.String) = (r9v25 java.lang.String), (r9v25 java.lang.String), (r9v32 java.lang.String) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r10v23 java.lang.String) = (r10v20 java.lang.String), (r10v20 java.lang.String), (r10v40 java.lang.String) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r11v9 boolean) = (r11v7 boolean), (r11v7 boolean), (r11v10 boolean) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r12v18 java.lang.String) = (r12v14 java.lang.String), (r12v14 java.lang.String), (r12v32 java.lang.String) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r15v16 boolean) = (r15v14 boolean), (r15v14 boolean), (r15v18 boolean) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r24v4 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>) = 
  (r24v2 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>)
  (r24v2 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>)
  (r24v6 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>)
 binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r25v8 java.lang.String) = (r25v5 java.lang.String), (r25v5 java.lang.String), (r25v9 java.lang.String) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x0448: PHI (r28v4 java.lang.String) = (r28v2 java.lang.String), (r28v2 java.lang.String), (r28v5 java.lang.String) binds: [B:122:0x041c, B:123:0x041e, B:128:0x0445] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x047b A[EDGE_INSN: B:132:0x047b->B:141:0x049d BREAK  A[LOOP:0: B:134:0x0483->B:260:?]] */
    /* JADX WARN: Code duplicated, block: B:133:0x047d A[Catch: all -> 0x049b, TryCatch #0 {all -> 0x049b, blocks: (B:130:0x045e, B:141:0x049d, B:133:0x047d, B:134:0x0483, B:136:0x0489), top: B:256:0x045e }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0489 A[Catch: all -> 0x049b, TryCatch #0 {all -> 0x049b, blocks: (B:130:0x045e, B:141:0x049d, B:133:0x047d, B:134:0x0483, B:136:0x0489), top: B:256:0x045e }] */
    /* JADX WARN: Code duplicated, block: B:146:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:149:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:154:0x0507  */
    /* JADX WARN: Code duplicated, block: B:155:0x050c  */
    /* JADX WARN: Code duplicated, block: B:157:0x050f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0515  */
    /* JADX WARN: Code duplicated, block: B:162:0x0522  */
    /* JADX WARN: Code duplicated, block: B:165:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x054f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0574  */
    /* JADX WARN: Code duplicated, block: B:174:0x0579  */
    /* JADX WARN: Code duplicated, block: B:177:0x0582  */
    /* JADX WARN: Code duplicated, block: B:182:0x059f  */
    /* JADX WARN: Code duplicated, block: B:185:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:203:0x0644  */
    /* JADX WARN: Code duplicated, block: B:206:0x0652  */
    /* JADX WARN: Code duplicated, block: B:208:0x0668  */
    /* JADX WARN: Code duplicated, block: B:210:0x0674 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0686  */
    /* JADX WARN: Code duplicated, block: B:214:0x068e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0693  */
    /* JADX WARN: Code duplicated, block: B:217:0x0696  */
    /* JADX WARN: Code duplicated, block: B:218:0x06a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:221:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:224:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:226:0x06e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:229:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:230:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:233:0x0700  */
    /* JADX WARN: Code duplicated, block: B:234:0x0705  */
    /* JADX WARN: Code duplicated, block: B:237:0x0719  */
    /* JADX WARN: Code duplicated, block: B:240:0x0727  */
    /* JADX WARN: Code duplicated, block: B:242:0x0731  */
    /* JADX WARN: Code duplicated, block: B:245:0x0745  */
    /* JADX WARN: Code duplicated, block: B:247:0x077a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0786  */
    /* JADX WARN: Code duplicated, block: B:250:0x0789  */
    /* JADX WARN: Code duplicated, block: B:252:0x0791  */
    /* JADX WARN: Code duplicated, block: B:258:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:? A[LOOP:0: B:134:0x0483->B:260:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0283  */
    /* JADX WARN: Code duplicated, block: B:67:0x0297  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0322  */
    /* JADX WARN: Code duplicated, block: B:95:0x037c A[PHI: r0 r4 r7 r11 r13 r24 r25 r26 r27 r28 r29
  0x037c: PHI (r0v5 ru7) = (r0v4 ru7), (r0v6 ru7) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r7v6 boolean) = (r7v5 boolean), (r7v7 boolean) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r11v6 boolean) = (r11v5 boolean), (r11v8 boolean) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r13v9 boolean) = (r13v8 boolean), (r13v13 boolean) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r24v2 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>) = 
  (r12v0 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>)
  (r24v3 java.lang.Class<ai.askquin.ui.conversation.ConversationActivity>)
 binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r25v2 java.lang.String) = (r7v0 java.lang.String), (r25v7 java.lang.String) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r26v2 java.lang.String) = (r8v0 java.lang.String), (r26v3 java.lang.String) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r27v4 java.lang.String) = (r27v3 java.lang.String), (r27v5 java.lang.String) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r28v2 java.lang.String) = (r5v0 java.lang.String), (r28v3 java.lang.String) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x037c: PHI (r29v2 java.lang.String) = (r10v0 java.lang.String), (r29v3 java.lang.String) binds: [B:87:0x0320, B:92:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0386  */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05a5, code lost:
    
        if (r2.equals("awaiting_registration") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05ac, code lost:
    
        if (r2.equals("paywall_pending") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05b1, code lost:
    
        if (r2 == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05b3, code lost:
    
        r2 = defpackage.xqa.c;
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05cb, code lost:
    
        if (((java.lang.Boolean) defpackage.z5c.I(r6, new defpackage.yj8(r2.a, r2.b, null))).booleanValue() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05d1, code lost:
    
        if (defpackage.f8a.c() == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05d3, code lost:
    
        defpackage.x57.V(r39, ai.askquin.ui.onboard.OnboardingActivity.class, new defpackage.iy9[]{new defpackage.iy9("KEY_START_DESTINATION", "profile_sync")});
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05e4, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x05e5, code lost:
    
        r0 = r12.a;
        r3.L$0 = null;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.L$3 = null;
        r3.L$4 = null;
        r3.L$5 = null;
        r3.L$6 = null;
        r3.Z$0 = r11;
        r3.Z$1 = r15;
        r3.I$0 = r4;
        r3.Z$2 = r7;
        r3.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0605, code lost:
    
        if (defpackage.bsa.n(r0, "paywall_pending", r3) != r14) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0632, code lost:
    
        defpackage.x57.V(r39, ai.askquin.ui.onboard.OnboardingActivity.class, new defpackage.iy9[]{new defpackage.iy9("KEY_START_DESTINATION", "post_first_reading_auth")});
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0361, code lost:
    
        if (r2 == r14) goto L198;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:219:0x06a8, please report this as an issue */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [dw2, xn2] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(defpackage.ru7 r40, boolean r41, defpackage.vx8 r42, defpackage.zn2 r43) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.MainActivity.x(ru7, boolean, vx8, zn2):java.lang.Object");
    }
}

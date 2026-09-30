package defpackage;

import ai.askquin.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.adjust.sdk.sig.r3;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hq extends kd9 {
    public final /* synthetic */ lq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(lq lqVar) {
        super(2);
        this.d = lqVar;
    }

    @Override // defpackage.kd9
    public final t6 C(int i) {
        lq lqVar = this.d;
        if (i != 1) {
            if (i == 2) {
                return w(lqVar.y);
            }
            qc0.j(tec.e(i, "Unknown focus type: "));
            return null;
        }
        int i2 = lqVar.z;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x0263  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0432  */
    /* JADX WARN: Code duplicated, block: B:272:0x0434  */
    /* JADX WARN: Code duplicated, block: B:275:0x0439  */
    /* JADX WARN: Code duplicated, block: B:276:0x043b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0441  */
    /* JADX WARN: Code duplicated, block: B:280:0x0443  */
    /* JADX WARN: Code duplicated, block: B:283:0x0449  */
    /* JADX WARN: Code duplicated, block: B:284:0x044b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0451  */
    /* JADX WARN: Code duplicated, block: B:288:0x0453  */
    /* JADX WARN: Code duplicated, block: B:291:0x0459  */
    /* JADX WARN: Code duplicated, block: B:292:0x045b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0467  */
    /* JADX WARN: Code duplicated, block: B:306:0x0473  */
    /* JADX WARN: Code duplicated, block: B:309:0x0478  */
    /* JADX WARN: Code duplicated, block: B:311:0x0480  */
    /* JADX WARN: Code duplicated, block: B:314:0x048b  */
    /* JADX WARN: Code duplicated, block: B:317:0x0490  */
    /* JADX WARN: Code duplicated, block: B:319:0x0494  */
    /* JADX WARN: Code duplicated, block: B:321:0x049c  */
    /* JADX WARN: Code duplicated, block: B:322:0x049e  */
    /* JADX WARN: Code duplicated, block: B:326:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:329:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:331:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:333:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:336:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:338:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:340:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:343:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:348:0x0507  */
    /* JADX WARN: Code duplicated, block: B:351:0x0510  */
    /* JADX WARN: Code duplicated, block: B:355:0x0517  */
    /* JADX WARN: Code duplicated, block: B:357:0x0521  */
    /* JADX WARN: Code duplicated, block: B:360:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:400:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:403:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:406:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:408:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:409:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:411:0x05c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:412:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:415:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:417:0x05da  */
    /* JADX WARN: Code duplicated, block: B:424:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:426:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:428:0x0602  */
    /* JADX WARN: Code duplicated, block: B:429:0x0604  */
    /* JADX WARN: Code duplicated, block: B:431:0x0608  */
    /* JADX WARN: Code duplicated, block: B:433:0x060e  */
    /* JADX WARN: Code duplicated, block: B:434:0x0610  */
    /* JADX WARN: Code duplicated, block: B:437:0x0615  */
    /* JADX WARN: Code duplicated, block: B:504:0x06fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:505:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:507:0x070b  */
    /* JADX WARN: Code duplicated, block: B:508:0x070d  */
    /* JADX WARN: Code duplicated, block: B:512:0x0713  */
    /* JADX WARN: Code duplicated, block: B:514:0x0719  */
    /* JADX WARN: Code duplicated, block: B:517:0x0727  */
    /* JADX WARN: Code duplicated, block: B:522:0x0735  */
    /* JADX WARN: Code duplicated, block: B:534:0x074c  */
    /* JADX WARN: Code duplicated, block: B:539:0x075f  */
    /* JADX WARN: Code duplicated, block: B:546:0x0771  */
    /* JADX WARN: Code duplicated, block: B:548:0x0775  */
    /* JADX WARN: Code duplicated, block: B:550:0x0782  */
    /* JADX WARN: Code duplicated, block: B:552:0x0786  */
    /* JADX WARN: Code duplicated, block: B:565:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:567:0x07ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:568:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:569:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:572:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:573:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:576:0x0804  */
    /* JADX WARN: Code duplicated, block: B:578:0x080c  */
    /* JADX WARN: Code duplicated, block: B:590:0x082d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:591:0x082f  */
    /* JADX WARN: Code duplicated, block: B:592:0x0831  */
    /* JADX WARN: Code duplicated, block: B:595:0x0835  */
    /* JADX WARN: Code duplicated, block: B:596:0x0837  */
    /* JADX WARN: Code duplicated, block: B:599:0x084b  */
    /* JADX WARN: Code duplicated, block: B:601:0x0850  */
    /* JADX WARN: Code duplicated, block: B:603:0x0860 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:605:0x0863  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005c, please report this as an issue */
    @Override // defpackage.kd9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq.L(int, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.kd9
    public final void e(int i, t6 t6Var, String str, Bundle bundle) {
        this.d.j(i, t6Var, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0200  */
    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:107:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x022e  */
    /* JADX WARN: Code duplicated, block: B:112:0x024f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0258  */
    /* JADX WARN: Code duplicated, block: B:119:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:137:0x030c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0312  */
    /* JADX WARN: Code duplicated, block: B:141:0x0318  */
    /* JADX WARN: Code duplicated, block: B:144:0x0324  */
    /* JADX WARN: Code duplicated, block: B:146:0x032e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0345  */
    /* JADX WARN: Code duplicated, block: B:152:0x0378  */
    /* JADX WARN: Code duplicated, block: B:155:0x0383  */
    /* JADX WARN: Code duplicated, block: B:157:0x0393  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x03cb A[LOOP:3: B:165:0x03b7->B:168:0x03cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:183:0x041d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0435  */
    /* JADX WARN: Code duplicated, block: B:189:0x0458  */
    /* JADX WARN: Code duplicated, block: B:191:0x0466  */
    /* JADX WARN: Code duplicated, block: B:193:0x046d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0481  */
    /* JADX WARN: Code duplicated, block: B:197:0x0493  */
    /* JADX WARN: Code duplicated, block: B:199:0x049d  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:209:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:212:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:215:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:216:0x0503  */
    /* JADX WARN: Code duplicated, block: B:219:0x051b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0521  */
    /* JADX WARN: Code duplicated, block: B:224:0x0525  */
    /* JADX WARN: Code duplicated, block: B:225:0x052a  */
    /* JADX WARN: Code duplicated, block: B:227:0x052e  */
    /* JADX WARN: Code duplicated, block: B:230:0x053a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0540  */
    /* JADX WARN: Code duplicated, block: B:235:0x0546  */
    /* JADX WARN: Code duplicated, block: B:236:0x054a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0551  */
    /* JADX WARN: Code duplicated, block: B:241:0x055b  */
    /* JADX WARN: Code duplicated, block: B:246:0x056d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0575  */
    /* JADX WARN: Code duplicated, block: B:251:0x057b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0582  */
    /* JADX WARN: Code duplicated, block: B:256:0x058f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0595  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0598  */
    /* JADX WARN: Code duplicated, block: B:264:0x05af A[LOOP:7: B:260:0x0596->B:264:0x05af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:267:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:270:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:273:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:274:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:277:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:280:0x05df  */
    /* JADX WARN: Code duplicated, block: B:283:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:285:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:289:0x060d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:292:0x0620  */
    /* JADX WARN: Code duplicated, block: B:295:0x0626  */
    /* JADX WARN: Code duplicated, block: B:296:0x062b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0645  */
    /* JADX WARN: Code duplicated, block: B:301:0x0658  */
    /* JADX WARN: Code duplicated, block: B:303:0x0662  */
    /* JADX WARN: Code duplicated, block: B:304:0x0669  */
    /* JADX WARN: Code duplicated, block: B:307:0x067a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0682  */
    /* JADX WARN: Code duplicated, block: B:311:0x068d  */
    /* JADX WARN: Code duplicated, block: B:314:0x0699  */
    /* JADX WARN: Code duplicated, block: B:317:0x069f  */
    /* JADX WARN: Code duplicated, block: B:319:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:320:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:326:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:329:0x06be  */
    /* JADX WARN: Code duplicated, block: B:331:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:335:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:338:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:345:0x06e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:349:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:352:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:357:0x0713  */
    /* JADX WARN: Code duplicated, block: B:360:0x0718  */
    /* JADX WARN: Code duplicated, block: B:362:0x0722  */
    /* JADX WARN: Code duplicated, block: B:365:0x0737  */
    /* JADX WARN: Code duplicated, block: B:368:0x073c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:371:0x074e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0758  */
    /* JADX WARN: Code duplicated, block: B:376:0x076e  */
    /* JADX WARN: Code duplicated, block: B:379:0x0785  */
    /* JADX WARN: Code duplicated, block: B:382:0x079b  */
    /* JADX WARN: Code duplicated, block: B:386:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:387:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:389:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:392:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:397:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:398:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:401:0x0812  */
    /* JADX WARN: Code duplicated, block: B:403:0x0818  */
    /* JADX WARN: Code duplicated, block: B:412:0x0839  */
    /* JADX WARN: Code duplicated, block: B:414:0x083f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:422:0x0857  */
    /* JADX WARN: Code duplicated, block: B:424:0x085d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0867  */
    /* JADX WARN: Code duplicated, block: B:428:0x086f  */
    /* JADX WARN: Code duplicated, block: B:431:0x0873  */
    /* JADX WARN: Code duplicated, block: B:434:0x088c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:442:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:445:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:448:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:450:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:451:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:454:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:457:0x0903  */
    /* JADX WARN: Code duplicated, block: B:461:0x0911  */
    /* JADX WARN: Code duplicated, block: B:464:0x0916  */
    /* JADX WARN: Code duplicated, block: B:467:0x0921  */
    /* JADX WARN: Code duplicated, block: B:470:0x0926  */
    /* JADX WARN: Code duplicated, block: B:473:0x0931  */
    /* JADX WARN: Code duplicated, block: B:478:0x0959  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:480:0x095c  */
    /* JADX WARN: Code duplicated, block: B:483:0x0964  */
    /* JADX WARN: Code duplicated, block: B:485:0x0972  */
    /* JADX WARN: Code duplicated, block: B:487:0x0975  */
    /* JADX WARN: Code duplicated, block: B:489:0x0983  */
    /* JADX WARN: Code duplicated, block: B:492:0x0988  */
    /* JADX WARN: Code duplicated, block: B:497:0x0992  */
    /* JADX WARN: Code duplicated, block: B:500:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:502:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:504:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:506:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:510:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:512:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:513:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:515:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:516:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a30 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:527:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:542:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:552:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:553:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:557:0x0ab3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:582:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:585:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b9d  */
    /* JADX WARN: Code duplicated, block: B:604:0x0bab  */
    /* JADX WARN: Code duplicated, block: B:606:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:608:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:610:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:611:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:615:0x0bf7  */
    /* JADX WARN: Code duplicated, block: B:617:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:618:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:620:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:622:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:624:0x0c14  */
    /* JADX WARN: Code duplicated, block: B:626:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c32  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c3d  */
    /* JADX WARN: Code duplicated, block: B:635:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:637:0x0c64  */
    /* JADX WARN: Code duplicated, block: B:638:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:640:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c82  */
    /* JADX WARN: Code duplicated, block: B:648:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:659:0x0cb3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:663:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:680:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x05b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0854 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x084f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:694:0x09db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x09db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x018a  */
    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fb  */
    /* JADX WARN: Instruction removed from duplicated block: B:659:0x0cb3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [pu4] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.util.ArrayList] */
    @Override // defpackage.kd9
    public final t6 w(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        t6 t6Var;
        int i2;
        ywc ywcVarL;
        Integer numValueOf;
        int iIntValue;
        o69 o69Var;
        fud fudVar;
        Resources resources;
        twc twcVar;
        w79 w79Var;
        Object objG;
        i5c i5cVar;
        AccessibilityManager accessibilityManager;
        fud fudVar2;
        boolean zC;
        List listI;
        int size;
        boolean z;
        int i3;
        int i4;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        k00 k00VarV;
        ywc ywcVar;
        twc twcVar2;
        i5c i5cVar2;
        w79 w79Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        t6 t6Var2;
        SpannableString spannableString;
        gxc gxcVar;
        w79 w79Var3;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        ywc ywcVar2;
        String strU;
        Object objG2;
        yye yyeVar;
        Object objG3;
        Boolean bool;
        i5c i5cVar3;
        int i6;
        twc twcVar3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        t6 t6Var3;
        Object objG7;
        int i7;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        gxc gxcVar2;
        lq lqVar;
        boolean z2;
        ywc ywcVarL2;
        Object objG10;
        s98 s98Var;
        Object objG11;
        f6 f6Var;
        Object objG12;
        f6 f6Var2;
        Object objG13;
        f6 f6Var3;
        String strT;
        ArrayList arrayList;
        CharSequence charSequenceF;
        rwa rwaVar;
        Object objG14;
        rgc rgcVar;
        rgc rgcVar2;
        boolean z3;
        int iD;
        AndroidComposeView androidComposeView;
        Bundle bundle;
        int iD2;
        String str3;
        t6 t6Var4;
        ax axVarK;
        ax axVarK2;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        gxc gxcVar3;
        List list2;
        int size2;
        p69 p69Var;
        int i8;
        fud fudVar3;
        e79 e79Var;
        int[] iArr;
        int i9;
        int[] iArrCopyOf;
        int i10;
        int i11;
        ArrayList arrayList2;
        int i12;
        Object objG15;
        boolean z4;
        cv7 cv7Var;
        LayoutNode layoutNode;
        o6 o6Var;
        o6 o6Var2;
        Object objG16;
        ywc ywcVarL3;
        Object objG17;
        Object objG18;
        p72 p72Var;
        ArrayList arrayList3;
        List listI2;
        int size3;
        int i13;
        int i14;
        boolean zO;
        int i15;
        int i16;
        Object objG19;
        ywc ywcVar3;
        f6 f6Var7;
        float f;
        b62 b62Var;
        gxc gxcVar4;
        float f2;
        float f3;
        float f4;
        f6 f6Var8;
        String str4;
        List list3;
        LayoutNode layoutNodeF;
        twc twcVarH;
        boolean zT;
        Object objG20;
        twc twcVarH2;
        f6 f6Var9;
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG21;
        boolean z5;
        boolean z6;
        int i17;
        int i18;
        int iD3;
        ywc ywcVarL4;
        boolean zBooleanValue;
        twc twcVar4;
        gxc gxcVar5;
        boolean zBooleanValue2;
        Object objG22;
        xp5 fontFamilyResolver;
        sw3 density;
        psd psdVar;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size4;
        int i19;
        int size5;
        int i20;
        List listA;
        int size6;
        int i21;
        j00 j00Var;
        int i22;
        Object obj;
        int i23;
        l68 l68Var;
        WeakHashMap weakHashMap;
        Object ke2Var;
        j00 j00Var2;
        k68 k68Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        shf shfVar;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size7;
        int i24;
        j00 j00Var3;
        ftf ftfVar;
        int i25;
        int i26;
        int size8;
        int i27;
        j00 j00Var4;
        int size9;
        int i28;
        int i29;
        int i30;
        xtd xtdVarA;
        cte cteVar;
        mne mneVar;
        yp5 yp5Var;
        wq5 wq5Var;
        SpannableString spannableString4;
        ar5 ar5Var;
        int i31;
        int i32;
        long j;
        int i33;
        xq5 xq5Var;
        int i34;
        ywc ywcVar4;
        u67 u67VarS;
        int i35;
        ax axVar;
        axc axcVar;
        boolean zT2;
        ywc ywcVar5;
        int i36;
        int i37;
        String strL;
        Object parentForAccessibility;
        View view;
        lq lqVar2 = this.d;
        AccessibilityManager accessibilityManager2 = lqVar2.g;
        AndroidComposeView androidComposeView2 = lqVar2.d;
        if (((a58) androidComposeView2.getComposeViewContext().d().k()).i == g48.a) {
            if (accessibilityManager2.isEnabled()) {
                t6Var4 = null;
            } else {
                t6Var4 = new t6(AccessibilityNodeInfo.obtain());
            }
            lqVar = lqVar2;
            i7 = i;
        } else {
            axc axcVar2 = (axc) lqVar2.s().b(i);
            if (axcVar2 == null) {
                if (accessibilityManager2.isEnabled()) {
                    t6Var4 = null;
                } else {
                    t6Var4 = new t6(AccessibilityNodeInfo.obtain());
                }
                lqVar = lqVar2;
                i7 = i;
            } else {
                ywc ywcVar6 = axcVar2.a;
                twc twcVarK = ywcVar6.k();
                LayoutNode layoutNode2 = ywcVar6.c;
                Object objG23 = twcVarK.a.g(cxc.o);
                if (objG23 == null) {
                    objG23 = null;
                }
                boolean zT3 = pa7.t(objG23, Boolean.TRUE);
                if (!zT3) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    t6Var = new t6(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        hgc.S(accessibilityNodeInfoObtain, zT3);
                    } else {
                        t6Var.g(64, zT3);
                    }
                    if (i == -1) {
                        parentForAccessibility = androidComposeView2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        t6Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        ywcVarL = ywcVar6.l();
                        if (ywcVarL != null) {
                            numValueOf = Integer.valueOf(ywcVarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            i37.d("semanticsNode " + i + " has null parent");
                            oo3.f();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        t6Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                    }
                    t6Var.c = i;
                    accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(lqVar2.k(axcVar2));
                    o69Var = lqVar2.Y0;
                    fudVar = lqVar2.H0;
                    resources = androidComposeView2.getContext().getResources();
                    t6Var.h("android.view.View");
                    twcVar = ywcVar6.d;
                    w79Var = twcVar.a;
                    if (w79Var.c(cxc.G)) {
                        t6Var.h("android.widget.EditText");
                    }
                    if (w79Var.c(cxc.C)) {
                        t6Var.h("android.widget.TextView");
                    }
                    objG = w79Var.g(cxc.z);
                    if (objG == null) {
                        objG = null;
                    }
                    i5cVar = (i5c) objG;
                    if (i5cVar != null) {
                        i36 = i5cVar.a;
                        if (ywcVar6.n()) {
                            accessibilityManager = accessibilityManager2;
                            i37 = 4;
                            fudVar2 = fudVar;
                            if (ywcVar6.i((4 & 1) != 0 ? !ywcVar6.b : false, (4 & 2) == 0).isEmpty()) {
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i37 = 4;
                            fudVar2 = fudVar;
                        }
                        if (i36 == i37) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i36 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strL = ndc.l(i36);
                            if (i36 == 5 || bzd.C(ywcVar6) || twcVar.c) {
                                t6Var.h(strL);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        fudVar2 = fudVar;
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(x57.Y(ywcVar6));
                    if (i2 >= 34) {
                        zC = hgc.C(accessibilityManager);
                    } else {
                        zC = true;
                    }
                    listI = ywcVar6.i((4 & 1) != 0 ? !ywcVar6.b : false, (4 & 2) == 0);
                    size = listI.size();
                    z = zC;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i38 = size;
                        ywcVar4 = (ywc) listI.get(i4);
                        List list5 = listI;
                        u67VarS = lqVar2.s();
                        int i39 = i4;
                        i35 = ywcVar4.f;
                        if (u67VarS.a(i35)) {
                            axVar = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(ywcVar4.c);
                            if (i35 != -1) {
                                if (axVar != null) {
                                    accessibilityNodeInfoObtain.addChild(axVar);
                                } else {
                                    axcVar = (axc) lqVar2.s().b(i35);
                                    if (axcVar != null || (ywcVar5 = axcVar.a) == null) {
                                        zT2 = false;
                                    } else {
                                        Object objG24 = ywcVar5.k().a.g(cxc.o);
                                        if (objG24 == null) {
                                            objG24 = null;
                                        }
                                        zT2 = pa7.t(objG24, Boolean.TRUE);
                                    }
                                    if (z || !zT2) {
                                        accessibilityNodeInfoObtain.addChild(androidComposeView2, i35);
                                    }
                                }
                                o69Var.f(i35, i3);
                                i3++;
                            }
                        }
                        i4 = i39 + 1;
                        listI = list5;
                        size = i38;
                    }
                    i5 = lqVar2.y;
                    accessibilityNodeInfo = t6Var.a;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        t6Var.b(o6.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        t6Var.b(o6.c);
                    }
                    k00VarV = bzd.v(ywcVar6);
                    if (k00VarV != null) {
                        fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                        density = androidComposeView2.getDensity();
                        psdVar = lqVar2.U0;
                        String str5 = k00VarV.b;
                        list4 = k00VarV.a;
                        spannableString2 = new SpannableString(str5);
                        arrayList4 = k00VarV.c;
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            i28 = 0;
                            while (i28 < size9) {
                                int i40 = size9;
                                j00 j00Var5 = (j00) arrayList4.get(i28);
                                ArrayList arrayList7 = arrayList4;
                                xtd xtdVar = (xtd) j00Var5.a;
                                int i41 = i28;
                                i29 = j00Var5.b;
                                i30 = j00Var5.c;
                                twc twcVar5 = twcVar;
                                i5c i5cVar4 = i5cVar;
                                xtdVarA = xtd.a(xtdVar, 0L, 65503);
                                bte bteVar = xtdVarA.a;
                                cteVar = xtdVarA.j;
                                mneVar = xtdVarA.m;
                                yp5Var = xtdVarA.f;
                                t6 t6Var5 = t6Var;
                                wq5Var = xtdVarA.d;
                                w79 w79Var4 = w79Var;
                                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoObtain;
                                q6c.k(spannableString2, bteVar.b(), i29, i30);
                                spannableString4 = spannableString2;
                                q6c.m(spannableString4, xtdVarA.b, density, i29, i30);
                                ar5Var = xtdVarA.c;
                                if (ar5Var == null || wq5Var != null) {
                                    if (ar5Var == null) {
                                        ar5Var = ar5.w;
                                    }
                                    if (wq5Var != null) {
                                        i31 = wq5Var.a;
                                    } else {
                                        i31 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(vpf.D(ar5Var, i31));
                                    i32 = 33;
                                    spannableString4.setSpan(styleSpan, i29, i30, 33);
                                } else {
                                    i32 = 33;
                                }
                                if (yp5Var == null) {
                                    if (yp5Var instanceof o66) {
                                        spannableString4.setSpan(new TypefaceSpan(((o66) yp5Var).f), i29, i30, i32);
                                    } else if (Build.VERSION.SDK_INT >= 28) {
                                        xq5Var = xtdVarA.e;
                                        if (xq5Var != null) {
                                            i34 = xq5Var.a;
                                        } else {
                                            i34 = 65535;
                                        }
                                        Object value = ((zp5) fontFamilyResolver).b(yp5Var, ar5.w, 0, i34).getValue();
                                        value.getClass();
                                        i32 = 33;
                                        spannableString4.setSpan(s.o((Typeface) value), i29, i30, 33);
                                    } else {
                                        i32 = 33;
                                    }
                                }
                                if (mneVar != null) {
                                    i33 = mneVar.a;
                                    if ((i33 | 1) == i33) {
                                        spannableString4.setSpan(new UnderlineSpan(), i29, i30, i32);
                                    }
                                    if ((i33 | 2) == i33) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i29, i30, i32);
                                    }
                                }
                                if (cteVar != null) {
                                    spannableString4.setSpan(new ScaleXSpan(cteVar.a), i29, i30, i32);
                                }
                                q6c.n(spannableString4, xtdVarA.k, i29, i30);
                                j = xtdVarA.l;
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(abg.Z(j)), i29, i30, 33);
                                }
                                i28 = i41 + 1;
                                spannableString2 = spannableString4;
                                ywcVar6 = ywcVar6;
                                size9 = i40;
                                arrayList4 = arrayList7;
                                twcVar = twcVar5;
                                i5cVar = i5cVar4;
                                t6Var = t6Var5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo4;
                                w79Var = w79Var4;
                            }
                        }
                        ywcVar = ywcVar6;
                        twcVar2 = twcVar;
                        i5cVar2 = i5cVar;
                        w79Var2 = w79Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        t6Var2 = t6Var;
                        spannableString3 = spannableString2;
                        int length = str5.length();
                        arrayList5 = pu4.a;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size8 = list4.size();
                            while (i27 < size8) {
                                Object obj2 = list4.get(i27);
                                j00Var4 = (j00) obj2;
                                if (!(j00Var4.a instanceof ftf) && l00.b(0, length, j00Var4.b, j00Var4.c)) {
                                    arrayList6.add(obj2);
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size4 = arrayList6.size();
                        while (i19 < size4) {
                            j00 j00Var6 = (j00) arrayList6.get(i19);
                            ftfVar = (ftf) j00Var6.a;
                            i25 = j00Var6.b;
                            i26 = j00Var6.c;
                            if (ftfVar instanceof ftf) {
                                ap.c();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ftfVar.a).build(), i25, i26, 33);
                        }
                        int length2 = str5.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size7 = list4.size();
                            while (i24 < size7) {
                                Object obj3 = list4.get(i24);
                                j00Var3 = (j00) obj3;
                                if (!(j00Var3.a instanceof shf) && l00.b(0, length2, j00Var3.b, j00Var3.c)) {
                                    arrayList5.add(obj3);
                                }
                            }
                        }
                        size5 = arrayList5.size();
                        while (i20 < size5) {
                            j00 j00Var7 = (j00) arrayList5.get(i20);
                            shfVar = (shf) j00Var7.a;
                            int i42 = j00Var7.b;
                            int i43 = j00Var7.c;
                            weakHashMap3 = (WeakHashMap) psdVar.b;
                            uRLSpan2 = weakHashMap3.get(shfVar);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(shfVar.a);
                                weakHashMap3.put(shfVar, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i42, i43, 33);
                        }
                        listA = k00VarV.a(str5.length());
                        size6 = listA.size();
                        while (i21 < size6) {
                            j00Var = (j00) listA.get(i21);
                            i22 = j00Var.b;
                            obj = j00Var.a;
                            i23 = j00Var.c;
                            if (i22 != i23) {
                                l68Var = (l68) obj;
                                if (l68Var instanceof k68) {
                                    obj.getClass();
                                    k68Var = (k68) obj;
                                    j00Var2 = new j00(k68Var, i22, i23);
                                    weakHashMap2 = (WeakHashMap) psdVar.c;
                                    uRLSpan = weakHashMap2.get(j00Var2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(k68Var.a);
                                        weakHashMap2.put(j00Var2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i22, i23, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) psdVar.d;
                                    ke2Var = weakHashMap.get(j00Var);
                                    if (ke2Var == null) {
                                        ke2Var = new ke2(l68Var);
                                        weakHashMap.put(j00Var, ke2Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) ke2Var, i22, i23, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) lq.P(spannableString3);
                    } else {
                        o69Var = o69Var;
                        ywcVar = ywcVar6;
                        twcVar2 = twcVar;
                        i5cVar2 = i5cVar;
                        w79Var2 = w79Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        t6Var2 = t6Var;
                        spannableString = null;
                    }
                    accessibilityNodeInfo.setText(spannableString);
                    gxcVar = cxc.O;
                    w79Var3 = w79Var2;
                    if (w79Var3.c(gxcVar)) {
                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        objG22 = w79Var3.g(gxcVar);
                        if (objG22 == null) {
                            objG22 = null;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objG22);
                    } else {
                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    }
                    ywcVar2 = ywcVar;
                    strU = bzd.u(ywcVar2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        p6.t(accessibilityNodeInfo, strU);
                    } else {
                        accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strU);
                    }
                    accessibilityNodeInfo3.setCheckable(bzd.t(ywcVar2));
                    objG2 = w79Var3.g(cxc.L);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    yyeVar = (yye) objG2;
                    if (yyeVar != null) {
                        if (yyeVar == yye.a) {
                            accessibilityNodeInfo.setChecked(true);
                        } else if (yyeVar == yye.b) {
                            accessibilityNodeInfo.setChecked(false);
                        }
                    }
                    objG3 = w79Var3.g(cxc.K);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (i5cVar2 == null) {
                            i5cVar3 = i5cVar2;
                            i6 = 4;
                        } else {
                            i5cVar3 = i5cVar2;
                            i6 = 4;
                            if (i5cVar3.a == 4) {
                                accessibilityNodeInfo3.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo.setChecked(zBooleanValue2);
                    } else {
                        i5cVar3 = i5cVar2;
                        i6 = 4;
                    }
                    twcVar3 = twcVar2;
                    if (twcVar3.c || ywcVar2.i((4 & 1) != 0 ? !ywcVar2.b : false, (4 & 2) == 0).isEmpty()) {
                        objG4 = w79Var3.g(cxc.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) s72.x0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo3.setContentDescription(str);
                    }
                    objG5 = w79Var3.g(cxc.A);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    str2 = (String) objG5;
                    if (str2 != null) {
                        ywcVarL4 = ywcVar2;
                        while (true) {
                            if (ywcVarL4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            twcVar4 = ywcVarL4.d;
                            gxcVar5 = oa7.f;
                            if (twcVar4.a.c(gxcVar5)) {
                                zBooleanValue = ((Boolean) twcVar4.e(gxcVar5)).booleanValue();
                                break;
                            }
                            ywcVarL4 = ywcVarL4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo3.setViewIdResourceName(str2);
                        }
                    }
                    objG6 = w79Var3.g(cxc.h);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    if (((wef) objG6) != null) {
                        t6Var3 = t6Var2;
                        t6Var3.i(true);
                    } else {
                        t6Var3 = t6Var2;
                    }
                    objG7 = w79Var3.g(cxc.i);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (((wef) objG7) != null) {
                        t6Var3.l();
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = o69Var.d(ywcVar2.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfo3.setDrawingOrder(iD3);
                        } else {
                            b1.l("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo3.setPassword(w79Var3.c(cxc.N));
                    objG8 = w79Var3.g(cxc.Q);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo3.setEditable(pa7.t(objG8, bool2));
                    objG9 = w79Var3.g(cxc.R);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    num = (Integer) objG9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo3.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo3.setEnabled(bzd.r(ywcVar2));
                    gxcVar2 = cxc.l;
                    accessibilityNodeInfo3.setFocusable(w79Var3.c(gxcVar2));
                    if (accessibilityNodeInfo3.isFocusable()) {
                        accessibilityNodeInfo3.setFocused(((Boolean) twcVar3.e(gxcVar2)).booleanValue());
                        if (accessibilityNodeInfo3.isFocused()) {
                            t6Var3.a(2);
                            lqVar = lqVar2;
                            lqVar.z = i7;
                        } else {
                            lqVar = lqVar2;
                            z2 = true;
                            t6Var3.a(1);
                        }
                        accessibilityNodeInfo.setVisibleToUser(x57.X(ywcVar2) ^ z2);
                        if (ywcVar2.n()) {
                            ywcVarL2 = ywcVar2.l();
                            ywcVarL2.getClass();
                        } else {
                            ywcVarL2 = ywcVar2;
                        }
                        if (ywcVarL2.m().h()) {
                            accessibilityNodeInfo.setVisibleToUser(false);
                        }
                        objG10 = w79Var3.g(cxc.k);
                        if (objG10 == null) {
                            objG10 = null;
                        }
                        s98Var = (s98) objG10;
                        if (s98Var != null) {
                            i17 = s98Var.a;
                            if (i17 == 0 && i17 == 1) {
                                i18 = 2;
                            } else {
                                i18 = 1;
                            }
                            accessibilityNodeInfo3.setLiveRegion(i18);
                        }
                        accessibilityNodeInfo.setClickable(false);
                        objG11 = w79Var3.g(swc.b);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        f6Var = (f6) objG11;
                        if (f6Var != null) {
                            objG21 = w79Var3.g(cxc.K);
                            if (objG21 == null) {
                                objG21 = null;
                            }
                            boolean zT4 = pa7.t(objG21, bool2);
                            z5 = (i5cVar3 == null && i5cVar3.a == 4) || (i5cVar3 != null && i5cVar3.a == 3);
                            if (z5 || (z5 && !zT4)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            accessibilityNodeInfo.setClickable(z6);
                            if (bzd.r(ywcVar2) && accessibilityNodeInfo3.isClickable()) {
                                t6Var3.b(new o6(null, 16, f6Var.a, null));
                            }
                        }
                        accessibilityNodeInfo.setLongClickable(false);
                        objG12 = w79Var3.g(swc.c);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        f6Var2 = (f6) objG12;
                        if (f6Var2 != null) {
                            accessibilityNodeInfo.setLongClickable(true);
                            if (bzd.r(ywcVar2)) {
                                t6Var3.b(new o6(null, 32, f6Var2.a, null));
                            }
                        }
                        objG13 = w79Var3.g(swc.q);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        f6Var3 = (f6) objG13;
                        if (f6Var3 != null) {
                            t6Var3.b(new o6(16384, f6Var3.a));
                        }
                        if (bzd.r(ywcVar2)) {
                            f6Var9 = (f6) jcc.f(twcVar3, swc.k);
                            if (f6Var9 != null) {
                                t6Var3.b(new o6(2097152, f6Var9.a));
                            }
                            f6Var10 = (f6) jcc.f(twcVar3, swc.p);
                            if (f6Var10 != null) {
                                t6Var3.b(new o6(android.R.id.accessibilityActionImeEnter, f6Var10.a));
                            }
                            f6Var11 = (f6) jcc.f(twcVar3, swc.r);
                            if (f6Var11 != null) {
                                t6Var3.b(new o6(65536, f6Var11.a));
                            }
                            f6Var12 = (f6) jcc.f(twcVar3, swc.s);
                            if (f6Var12 != null && accessibilityNodeInfo3.isFocused()) {
                                primaryClipDescription = ((k47) androidComposeView2.getClipboardManager()).A().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    t6Var3.b(new o6(32768, f6Var12.a));
                                }
                            }
                        }
                        strT = lq.t(ywcVar2);
                        if (strT != null && strT.length() != 0) {
                            accessibilityNodeInfo3.setTextSelection(lqVar.r(ywcVar2), lqVar.q(ywcVar2));
                            f6Var8 = (f6) jcc.f(twcVar3, swc.j);
                            if (f6Var8 != null) {
                                str4 = f6Var8.a;
                            } else {
                                str4 = null;
                            }
                            t6Var3.b(new o6(131072, str4));
                            t6Var3.a(256);
                            t6Var3.a(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            list3 = (List) jcc.f(twcVar3, cxc.a);
                            if ((list3 != null || list3.isEmpty()) && w79Var3.c(swc.a) && (!w79Var3.c(cxc.G) || pa7.t(jcc.f(twcVar3, gxcVar2), bool2))) {
                                layoutNodeF = layoutNode2.F();
                                while (true) {
                                    if (layoutNodeF == null) {
                                        layoutNodeF = null;
                                        break;
                                    }
                                    twcVarH2 = layoutNodeF.H();
                                    if (twcVarH2 == null && twcVarH2.c) {
                                        if (twcVarH2.a.c(cxc.G)) {
                                            break;
                                        }
                                    }
                                    layoutNodeF = layoutNodeF.F();
                                }
                                if (layoutNodeF == null) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                } else {
                                    twcVarH = layoutNodeF.H();
                                    if (twcVarH != null) {
                                        objG20 = twcVarH.a.g(cxc.l);
                                        if (objG20 == null) {
                                            objG20 = null;
                                        }
                                        zT = pa7.t(objG20, Boolean.TRUE);
                                    } else {
                                        zT = false;
                                    }
                                    if (zT) {
                                        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceF = t6Var3.f();
                        if (charSequenceF != null && charSequenceF.length() != 0 && w79Var3.c(swc.a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (w79Var3.c(cxc.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (w79Var3.c(cxc.S)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                        rwaVar = (rwa) jcc.f(twcVar3, cxc.c);
                        if (rwaVar != null) {
                            f = rwaVar.a;
                            b62Var = rwaVar.b;
                            gxcVar4 = swc.i;
                            if (w79Var3.c(gxcVar4)) {
                                t6Var3.h("android.widget.SeekBar");
                            } else {
                                t6Var3.h("android.widget.ProgressBar");
                            }
                            if (rwaVar != rwa.d) {
                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, b62Var.a, b62Var.b, f));
                            }
                            if (w79Var3.c(gxcVar4) && bzd.r(ywcVar2)) {
                                f2 = b62Var.b;
                                f3 = b62Var.a;
                                if (f2 < f3) {
                                    f2 = f3;
                                }
                                if (f < f2) {
                                    t6Var3.b(o6.e);
                                }
                                f4 = b62Var.b;
                                if (f3 > f4) {
                                    f3 = f4;
                                }
                                if (f > f3) {
                                    t6Var3.b(o6.f);
                                }
                            }
                        }
                        if (bzd.r(ywcVar2) && (f6Var7 = (f6) jcc.f(twcVar3, swc.i)) != null) {
                            t6Var3.b(new o6(android.R.id.accessibilityActionSetProgress, f6Var7.a));
                        }
                        z5c.J(t6Var3, ywcVar2);
                        objG14 = ywcVar2.k().a.g(cxc.g);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            ywcVarL3 = ywcVar2.l();
                            if (ywcVarL3 != null) {
                                objG17 = ywcVarL3.k().a.g(cxc.e);
                                if (objG17 == null) {
                                    objG17 = null;
                                }
                                if (objG17 != null) {
                                    objG18 = ywcVarL3.k().a.g(cxc.f);
                                    if (objG18 == null) {
                                        objG18 = null;
                                    }
                                    p72Var = (p72) objG18;
                                    if (p72Var != null || (p72Var.a >= 0 && p72Var.b >= 0)) {
                                        if (ywcVar2.k().a.c(cxc.K)) {
                                            arrayList3 = new ArrayList();
                                            listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                            size3 = listI2.size();
                                            i14 = 0;
                                            while (i13 < size3) {
                                                ywcVar3 = (ywc) listI2.get(i13);
                                                if (ywcVar3.k().a.c(cxc.K)) {
                                                    arrayList3.add(ywcVar3);
                                                    if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                        i14++;
                                                    }
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                zO = z5c.o(arrayList3);
                                                if (zO) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = i14;
                                                }
                                                if (zO) {
                                                    i16 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                                objG19 = ywcVar2.k().a.g(cxc.K);
                                                if (objG19 == null) {
                                                    objG19 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            r3.f();
                        }
                        rgcVar = (rgc) jcc.f(twcVar3, cxc.v);
                        f6 f6Var13 = (f6) jcc.f(twcVar3, swc.d);
                        if (rgcVar != null && f6Var13 != null) {
                            objG15 = ywcVar2.k().a.g(cxc.f);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 == null) {
                                objG16 = ywcVar2.k().a.g(cxc.e);
                                if (objG16 == null) {
                                    objG16 = null;
                                }
                                if (objG16 == null) {
                                    t6Var3.h("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) rgcVar.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (bzd.r(ywcVar2)) {
                                z4 = lq.z(rgcVar);
                                cv7Var = cv7.b;
                                if (z4) {
                                    t6Var3.b(o6.e);
                                    if (layoutNode.P0 == cv7Var) {
                                        layoutNode = layoutNode2;
                                        o6Var2 = o6.h;
                                    } else {
                                        layoutNode = layoutNode2;
                                        o6Var2 = o6.j;
                                    }
                                    t6Var3.b(o6Var2);
                                } else {
                                    layoutNode = layoutNode2;
                                }
                                if (lq.y(rgcVar)) {
                                    t6Var3.b(o6.f);
                                    if (layoutNode.P0 == cv7Var) {
                                        o6Var = o6.j;
                                    } else {
                                        o6Var = o6.h;
                                    }
                                    t6Var3.b(o6Var);
                                }
                            }
                        }
                        rgcVar2 = (rgc) jcc.f(twcVar3, cxc.w);
                        if (rgcVar2 != null || f6Var13 == null) {
                            z3 = true;
                        } else {
                            Object objG25 = ywcVar2.k().a.g(cxc.f);
                            if (objG25 == null) {
                                objG25 = null;
                            }
                            if (objG25 == null) {
                                Object objG26 = ywcVar2.k().a.g(cxc.e);
                                if (objG26 == null) {
                                    objG26 = null;
                                }
                                if (objG26 == null) {
                                    t6Var3.h("android.widget.ScrollView");
                                }
                            }
                            z3 = true;
                            if (((Number) rgcVar2.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (bzd.r(ywcVar2)) {
                                if (lq.z(rgcVar2)) {
                                    t6Var3.b(o6.e);
                                    t6Var3.b(o6.i);
                                }
                                if (lq.y(rgcVar2)) {
                                    t6Var3.b(o6.f);
                                    t6Var3.b(o6.g);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            z5c.h(t6Var3, ywcVar2);
                        }
                        t6Var3.j((CharSequence) jcc.f(twcVar3, cxc.d));
                        if (bzd.r(ywcVar2)) {
                            f6Var4 = (f6) jcc.f(twcVar3, swc.t);
                            if (f6Var4 != null) {
                                t6Var3.b(new o6(262144, f6Var4.a));
                            }
                            f6Var5 = (f6) jcc.f(twcVar3, swc.u);
                            if (f6Var5 != null) {
                                t6Var3.b(new o6(524288, f6Var5.a));
                            }
                            f6Var6 = (f6) jcc.f(twcVar3, swc.v);
                            if (f6Var6 != null) {
                                t6Var3.b(new o6(1048576, f6Var6.a));
                            }
                            gxcVar3 = swc.x;
                            if (w79Var3.c(gxcVar3)) {
                                list2 = (List) twcVar3.e(gxcVar3);
                                size2 = list2.size();
                                p69Var = lq.c1;
                                i8 = p69Var.b;
                                if (size2 < i8) {
                                    qc0.p(tec.f(i8, "Can't have more than ", " custom actions for one widget"));
                                    return null;
                                }
                                fud fudVar4 = new fud(0);
                                e79 e79VarA = ok9.a();
                                fudVar3 = fudVar2;
                                if (fudVar3.a) {
                                    abg.x(fudVar3);
                                }
                                if (cgg.q(fudVar3.d, i7, fudVar3.b) < 0) {
                                    z3 = false;
                                }
                                if (z3) {
                                    e79Var = (e79) abg.q(fudVar3, i7);
                                    iArr = p69Var.a;
                                    i9 = p69Var.b;
                                    iArrCopyOf = new int[16];
                                    i10 = 0;
                                    i11 = 0;
                                    while (i10 < i9) {
                                        int i44 = iArr[i10];
                                        int i45 = i9;
                                        i12 = i11 + 1;
                                        int i46 = i10;
                                        if (iArrCopyOf.length < i12) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i11] = i44;
                                        i10 = i46 + 1;
                                        i11 = i12;
                                        i9 = i45;
                                    }
                                    arrayList2 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        kv2.z(list2.get(0));
                                        e79Var.getClass();
                                        throw null;
                                    }
                                    if (arrayList2.size() <= 0) {
                                        kv2.z(arrayList2.get(0));
                                        if (i11 <= 0) {
                                            r3.i("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i47 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    kv2.z(list2.get(0));
                                    p69Var.a(0);
                                    throw null;
                                }
                                lqVar.G0.c(i7, fudVar4);
                                fudVar3.c(i7, e79VarA);
                            }
                        }
                        t6Var3.k(bzd.B(ywcVar2, resources));
                        iD = lqVar.Q0.d(i7);
                        if (iD != -1) {
                            axVarK2 = ndc.k(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                            if (axVarK2 != null) {
                                accessibilityNodeInfo.setTraversalBefore(axVarK2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                accessibilityNodeInfo.setTraversalBefore(androidComposeView, iD);
                            }
                            bundle = null;
                            lqVar.j(i7, t6Var3, lqVar.S0, null);
                        } else {
                            androidComposeView = androidComposeView2;
                            bundle = null;
                        }
                        iD2 = lqVar.R0.d(i7);
                        if (iD2 != -1 && (axVarK = ndc.k(androidComposeView.getAndroidViewsHandler$ui(), iD2)) != null) {
                            accessibilityNodeInfo.setTraversalAfter(axVarK);
                            lqVar.j(i7, t6Var3, lqVar.T0, bundle);
                        }
                        str3 = (String) jcc.f(twcVar3, oa7.g);
                        if (str3 != null) {
                            t6Var3.h(str3);
                        }
                        t6Var4 = t6Var3;
                    } else {
                        lqVar = lqVar2;
                    }
                    z2 = true;
                    accessibilityNodeInfo.setVisibleToUser(x57.X(ywcVar2) ^ z2);
                    if (ywcVar2.n()) {
                        ywcVarL2 = ywcVar2.l();
                        ywcVarL2.getClass();
                    } else {
                        ywcVarL2 = ywcVar2;
                    }
                    if (ywcVarL2.m().h()) {
                        accessibilityNodeInfo.setVisibleToUser(false);
                    }
                    objG10 = w79Var3.g(cxc.k);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    s98Var = (s98) objG10;
                    if (s98Var != null) {
                        i17 = s98Var.a;
                        if (i17 == 0) {
                            i18 = 1;
                        } else {
                            i18 = 2;
                        }
                        accessibilityNodeInfo3.setLiveRegion(i18);
                    }
                    accessibilityNodeInfo.setClickable(false);
                    objG11 = w79Var3.g(swc.b);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    f6Var = (f6) objG11;
                    if (f6Var != null) {
                        objG21 = w79Var3.g(cxc.K);
                        if (objG21 == null) {
                            objG21 = null;
                        }
                        boolean zT5 = pa7.t(objG21, bool2);
                        if (i5cVar3 == null) {
                        }
                        if (z5) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        accessibilityNodeInfo.setClickable(z6);
                        if (bzd.r(ywcVar2)) {
                            t6Var3.b(new o6(null, 16, f6Var.a, null));
                        }
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    objG12 = w79Var3.g(swc.c);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    f6Var2 = (f6) objG12;
                    if (f6Var2 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (bzd.r(ywcVar2)) {
                            t6Var3.b(new o6(null, 32, f6Var2.a, null));
                        }
                    }
                    objG13 = w79Var3.g(swc.q);
                    if (objG13 == null) {
                        objG13 = null;
                    }
                    f6Var3 = (f6) objG13;
                    if (f6Var3 != null) {
                        t6Var3.b(new o6(16384, f6Var3.a));
                    }
                    if (bzd.r(ywcVar2)) {
                        f6Var9 = (f6) jcc.f(twcVar3, swc.k);
                        if (f6Var9 != null) {
                            t6Var3.b(new o6(2097152, f6Var9.a));
                        }
                        f6Var10 = (f6) jcc.f(twcVar3, swc.p);
                        if (f6Var10 != null) {
                            t6Var3.b(new o6(android.R.id.accessibilityActionImeEnter, f6Var10.a));
                        }
                        f6Var11 = (f6) jcc.f(twcVar3, swc.r);
                        if (f6Var11 != null) {
                            t6Var3.b(new o6(65536, f6Var11.a));
                        }
                        f6Var12 = (f6) jcc.f(twcVar3, swc.s);
                        if (f6Var12 != null) {
                            primaryClipDescription = ((k47) androidComposeView2.getClipboardManager()).A().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                t6Var3.b(new o6(32768, f6Var12.a));
                            }
                        }
                    }
                    strT = lq.t(ywcVar2);
                    if (strT != null) {
                        accessibilityNodeInfo3.setTextSelection(lqVar.r(ywcVar2), lqVar.q(ywcVar2));
                        f6Var8 = (f6) jcc.f(twcVar3, swc.j);
                        if (f6Var8 != null) {
                            str4 = f6Var8.a;
                        } else {
                            str4 = null;
                        }
                        t6Var3.b(new o6(131072, str4));
                        t6Var3.a(256);
                        t6Var3.a(512);
                        accessibilityNodeInfo.setMovementGranularities(11);
                        list3 = (List) jcc.f(twcVar3, cxc.a);
                        if (list3 != null) {
                            layoutNodeF = layoutNode2.F();
                            while (true) {
                                if (layoutNodeF == null) {
                                    layoutNodeF = null;
                                    break;
                                }
                                twcVarH2 = layoutNodeF.H();
                                if (twcVarH2 == null) {
                                }
                                layoutNodeF = layoutNodeF.F();
                            }
                            if (layoutNodeF == null) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            } else {
                                twcVarH = layoutNodeF.H();
                                if (twcVarH != null) {
                                    objG20 = twcVarH.a.g(cxc.l);
                                    if (objG20 == null) {
                                        objG20 = null;
                                    }
                                    zT = pa7.t(objG20, Boolean.TRUE);
                                } else {
                                    zT = false;
                                }
                                if (zT) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            layoutNodeF = layoutNode2.F();
                            while (true) {
                                if (layoutNodeF == null) {
                                    layoutNodeF = null;
                                    break;
                                }
                                twcVarH2 = layoutNodeF.H();
                                if (twcVarH2 == null) {
                                }
                                layoutNodeF = layoutNodeF.F();
                            }
                            if (layoutNodeF == null) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            } else {
                                twcVarH = layoutNodeF.H();
                                if (twcVarH != null) {
                                    objG20 = twcVarH.a.g(cxc.l);
                                    if (objG20 == null) {
                                        objG20 = null;
                                    }
                                    zT = pa7.t(objG20, Boolean.TRUE);
                                } else {
                                    zT = false;
                                }
                                if (zT) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceF = t6Var3.f();
                    if (charSequenceF != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (w79Var3.c(cxc.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (w79Var3.c(cxc.S)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                    rwaVar = (rwa) jcc.f(twcVar3, cxc.c);
                    if (rwaVar != null) {
                        f = rwaVar.a;
                        b62Var = rwaVar.b;
                        gxcVar4 = swc.i;
                        if (w79Var3.c(gxcVar4)) {
                            t6Var3.h("android.widget.SeekBar");
                        } else {
                            t6Var3.h("android.widget.ProgressBar");
                        }
                        if (rwaVar != rwa.d) {
                            accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, b62Var.a, b62Var.b, f));
                        }
                        if (w79Var3.c(gxcVar4)) {
                            f2 = b62Var.b;
                            f3 = b62Var.a;
                            if (f2 < f3) {
                                f2 = f3;
                            }
                            if (f < f2) {
                                t6Var3.b(o6.e);
                            }
                            f4 = b62Var.b;
                            if (f3 > f4) {
                                f3 = f4;
                            }
                            if (f > f3) {
                                t6Var3.b(o6.f);
                            }
                        }
                    }
                    if (bzd.r(ywcVar2)) {
                        t6Var3.b(new o6(android.R.id.accessibilityActionSetProgress, f6Var7.a));
                    }
                    z5c.J(t6Var3, ywcVar2);
                    objG14 = ywcVar2.k().a.g(cxc.g);
                    if (objG14 == null) {
                        objG14 = null;
                    }
                    if (objG14 == null) {
                        ywcVarL3 = ywcVar2.l();
                        if (ywcVarL3 != null) {
                            objG17 = ywcVarL3.k().a.g(cxc.e);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            if (objG17 != null) {
                                objG18 = ywcVarL3.k().a.g(cxc.f);
                                if (objG18 == null) {
                                    objG18 = null;
                                }
                                p72Var = (p72) objG18;
                                if (p72Var != null) {
                                    if (ywcVar2.k().a.c(cxc.K)) {
                                        arrayList3 = new ArrayList();
                                        listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                        size3 = listI2.size();
                                        i14 = 0;
                                        while (i13 < size3) {
                                            ywcVar3 = (ywc) listI2.get(i13);
                                            if (ywcVar3.k().a.c(cxc.K)) {
                                                arrayList3.add(ywcVar3);
                                                if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            zO = z5c.o(arrayList3);
                                            if (zO) {
                                                i15 = 0;
                                            } else {
                                                i15 = i14;
                                            }
                                            if (zO) {
                                                i16 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            objG19 = ywcVar2.k().a.g(cxc.K);
                                            if (objG19 == null) {
                                                objG19 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                        }
                                    }
                                } else if (ywcVar2.k().a.c(cxc.K)) {
                                    arrayList3 = new ArrayList();
                                    listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                    size3 = listI2.size();
                                    i14 = 0;
                                    while (i13 < size3) {
                                        ywcVar3 = (ywc) listI2.get(i13);
                                        if (ywcVar3.k().a.c(cxc.K)) {
                                            arrayList3.add(ywcVar3);
                                            if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                i14++;
                                            }
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        zO = z5c.o(arrayList3);
                                        if (zO) {
                                            i15 = 0;
                                        } else {
                                            i15 = i14;
                                        }
                                        if (zO) {
                                            i16 = i14;
                                        } else {
                                            i16 = 0;
                                        }
                                        objG19 = ywcVar2.k().a.g(cxc.K);
                                        if (objG19 == null) {
                                            objG19 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                    }
                                }
                            }
                        }
                    } else {
                        r3.f();
                    }
                    rgcVar = (rgc) jcc.f(twcVar3, cxc.v);
                    f6 f6Var14 = (f6) jcc.f(twcVar3, swc.d);
                    if (rgcVar != null) {
                        objG15 = ywcVar2.k().a.g(cxc.f);
                        if (objG15 == null) {
                            objG15 = null;
                        }
                        if (objG15 == null) {
                            objG16 = ywcVar2.k().a.g(cxc.e);
                            if (objG16 == null) {
                                objG16 = null;
                            }
                            if (objG16 == null) {
                                t6Var3.h("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) rgcVar.b.invoke()).floatValue() > 0.0f) {
                            accessibilityNodeInfo.setScrollable(true);
                        }
                        if (bzd.r(ywcVar2)) {
                            z4 = lq.z(rgcVar);
                            cv7Var = cv7.b;
                            if (z4) {
                                t6Var3.b(o6.e);
                                if (layoutNode.P0 == cv7Var) {
                                    layoutNode = layoutNode2;
                                    o6Var2 = o6.h;
                                } else {
                                    layoutNode = layoutNode2;
                                    o6Var2 = o6.j;
                                }
                                t6Var3.b(o6Var2);
                            } else {
                                layoutNode = layoutNode2;
                            }
                            if (lq.y(rgcVar)) {
                                t6Var3.b(o6.f);
                                if (layoutNode.P0 == cv7Var) {
                                    o6Var = o6.j;
                                } else {
                                    o6Var = o6.h;
                                }
                                t6Var3.b(o6Var);
                            }
                        }
                    }
                    rgcVar2 = (rgc) jcc.f(twcVar3, cxc.w);
                    if (rgcVar2 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        z5c.h(t6Var3, ywcVar2);
                    }
                    t6Var3.j((CharSequence) jcc.f(twcVar3, cxc.d));
                    if (bzd.r(ywcVar2)) {
                        f6Var4 = (f6) jcc.f(twcVar3, swc.t);
                        if (f6Var4 != null) {
                            t6Var3.b(new o6(262144, f6Var4.a));
                        }
                        f6Var5 = (f6) jcc.f(twcVar3, swc.u);
                        if (f6Var5 != null) {
                            t6Var3.b(new o6(524288, f6Var5.a));
                        }
                        f6Var6 = (f6) jcc.f(twcVar3, swc.v);
                        if (f6Var6 != null) {
                            t6Var3.b(new o6(1048576, f6Var6.a));
                        }
                        gxcVar3 = swc.x;
                        if (w79Var3.c(gxcVar3)) {
                            list2 = (List) twcVar3.e(gxcVar3);
                            size2 = list2.size();
                            p69Var = lq.c1;
                            i8 = p69Var.b;
                            if (size2 < i8) {
                                qc0.p(tec.f(i8, "Can't have more than ", " custom actions for one widget"));
                                return null;
                            }
                            fud fudVar5 = new fud(0);
                            e79 e79VarA2 = ok9.a();
                            fudVar3 = fudVar2;
                            if (fudVar3.a) {
                                abg.x(fudVar3);
                            }
                            if (cgg.q(fudVar3.d, i7, fudVar3.b) < 0) {
                                z3 = false;
                            }
                            if (z3) {
                                e79Var = (e79) abg.q(fudVar3, i7);
                                iArr = p69Var.a;
                                i9 = p69Var.b;
                                iArrCopyOf = new int[16];
                                i10 = 0;
                                i11 = 0;
                                while (i10 < i9) {
                                    int i48 = iArr[i10];
                                    int i49 = i9;
                                    i12 = i11 + 1;
                                    int i410 = i10;
                                    if (iArrCopyOf.length < i12) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i11] = i48;
                                    i10 = i410 + 1;
                                    i11 = i12;
                                    i9 = i49;
                                }
                                arrayList2 = new ArrayList();
                                if (list2.size() <= 0) {
                                    kv2.z(list2.get(0));
                                    e79Var.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() <= 0) {
                                    kv2.z(arrayList2.get(0));
                                    if (i11 <= 0) {
                                        r3.i("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i411 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                kv2.z(list2.get(0));
                                p69Var.a(0);
                                throw null;
                            }
                            lqVar.G0.c(i7, fudVar5);
                            fudVar3.c(i7, e79VarA2);
                        }
                    }
                    t6Var3.k(bzd.B(ywcVar2, resources));
                    iD = lqVar.Q0.d(i7);
                    if (iD != -1) {
                        axVarK2 = ndc.k(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                        if (axVarK2 != null) {
                            accessibilityNodeInfo.setTraversalBefore(axVarK2);
                            androidComposeView = androidComposeView2;
                        } else {
                            androidComposeView = androidComposeView2;
                            accessibilityNodeInfo.setTraversalBefore(androidComposeView, iD);
                        }
                        bundle = null;
                        lqVar.j(i7, t6Var3, lqVar.S0, null);
                    } else {
                        androidComposeView = androidComposeView2;
                        bundle = null;
                    }
                    iD2 = lqVar.R0.d(i7);
                    if (iD2 != -1) {
                        accessibilityNodeInfo.setTraversalAfter(axVarK);
                        lqVar.j(i7, t6Var3, lqVar.T0, bundle);
                    }
                    str3 = (String) jcc.f(twcVar3, oa7.g);
                    if (str3 != null) {
                        t6Var3.h(str3);
                    }
                    t6Var4 = t6Var3;
                } else if (Build.VERSION.SDK_INT >= 34 ? hgc.C(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    t6Var = new t6(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        hgc.S(accessibilityNodeInfoObtain, zT3);
                    } else {
                        t6Var.g(64, zT3);
                    }
                    if (i == -1) {
                        parentForAccessibility = androidComposeView2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        t6Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        ywcVarL = ywcVar6.l();
                        if (ywcVarL != null) {
                            numValueOf = Integer.valueOf(ywcVarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            i37.d("semanticsNode " + i + " has null parent");
                            oo3.f();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        t6Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                    }
                    t6Var.c = i;
                    accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(lqVar2.k(axcVar2));
                    o69Var = lqVar2.Y0;
                    fudVar = lqVar2.H0;
                    resources = androidComposeView2.getContext().getResources();
                    t6Var.h("android.view.View");
                    twcVar = ywcVar6.d;
                    w79Var = twcVar.a;
                    if (w79Var.c(cxc.G)) {
                        t6Var.h("android.widget.EditText");
                    }
                    if (w79Var.c(cxc.C)) {
                        t6Var.h("android.widget.TextView");
                    }
                    objG = w79Var.g(cxc.z);
                    if (objG == null) {
                        objG = null;
                    }
                    i5cVar = (i5c) objG;
                    if (i5cVar != null) {
                        i36 = i5cVar.a;
                        if (ywcVar6.n()) {
                            accessibilityManager = accessibilityManager2;
                            i37 = 4;
                            fudVar2 = fudVar;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i37 = 4;
                            fudVar2 = fudVar;
                            if (ywcVar6.i((4 & 1) != 0 ? !ywcVar6.b : false, (4 & 2) == 0).isEmpty()) {
                            }
                        }
                        if (i36 == i37) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i36 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strL = ndc.l(i36);
                            if (i36 == 5) {
                                t6Var.h(strL);
                            } else {
                                t6Var.h(strL);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        fudVar2 = fudVar;
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(x57.Y(ywcVar6));
                    if (i2 >= 34) {
                        zC = hgc.C(accessibilityManager);
                    } else {
                        zC = true;
                    }
                    listI = ywcVar6.i((4 & 1) != 0 ? !ywcVar6.b : false, (4 & 2) == 0);
                    size = listI.size();
                    z = zC;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i310 = size;
                        ywcVar4 = (ywc) listI.get(i4);
                        List list6 = listI;
                        u67VarS = lqVar2.s();
                        int i311 = i4;
                        i35 = ywcVar4.f;
                        if (u67VarS.a(i35)) {
                            axVar = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(ywcVar4.c);
                            if (i35 != -1) {
                                if (axVar != null) {
                                    accessibilityNodeInfoObtain.addChild(axVar);
                                } else {
                                    axcVar = (axc) lqVar2.s().b(i35);
                                    if (axcVar != null) {
                                        zT2 = false;
                                    } else {
                                        zT2 = false;
                                    }
                                    if (z) {
                                        accessibilityNodeInfoObtain.addChild(androidComposeView2, i35);
                                    } else {
                                        accessibilityNodeInfoObtain.addChild(androidComposeView2, i35);
                                    }
                                }
                                o69Var.f(i35, i3);
                                i3++;
                            }
                        }
                        i4 = i311 + 1;
                        listI = list6;
                        size = i310;
                    }
                    i5 = lqVar2.y;
                    accessibilityNodeInfo = t6Var.a;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        t6Var.b(o6.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        t6Var.b(o6.c);
                    }
                    k00VarV = bzd.v(ywcVar6);
                    if (k00VarV != null) {
                        fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                        density = androidComposeView2.getDensity();
                        psdVar = lqVar2.U0;
                        String str6 = k00VarV.b;
                        list4 = k00VarV.a;
                        spannableString2 = new SpannableString(str6);
                        arrayList4 = k00VarV.c;
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            i28 = 0;
                            while (i28 < size9) {
                                int i412 = size9;
                                j00 j00Var8 = (j00) arrayList4.get(i28);
                                ArrayList arrayList8 = arrayList4;
                                xtd xtdVar2 = (xtd) j00Var8.a;
                                int i413 = i28;
                                i29 = j00Var8.b;
                                i30 = j00Var8.c;
                                twc twcVar6 = twcVar;
                                i5c i5cVar5 = i5cVar;
                                xtdVarA = xtd.a(xtdVar2, 0L, 65503);
                                bte bteVar2 = xtdVarA.a;
                                cteVar = xtdVarA.j;
                                mneVar = xtdVarA.m;
                                yp5Var = xtdVarA.f;
                                t6 t6Var6 = t6Var;
                                wq5Var = xtdVarA.d;
                                w79 w79Var5 = w79Var;
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                q6c.k(spannableString2, bteVar2.b(), i29, i30);
                                spannableString4 = spannableString2;
                                q6c.m(spannableString4, xtdVarA.b, density, i29, i30);
                                ar5Var = xtdVarA.c;
                                if (ar5Var == null) {
                                    if (ar5Var == null) {
                                        ar5Var = ar5.w;
                                    }
                                    if (wq5Var != null) {
                                        i31 = wq5Var.a;
                                    } else {
                                        i31 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(vpf.D(ar5Var, i31));
                                    i32 = 33;
                                    spannableString4.setSpan(styleSpan2, i29, i30, 33);
                                } else {
                                    if (ar5Var == null) {
                                        ar5Var = ar5.w;
                                    }
                                    if (wq5Var != null) {
                                        i31 = wq5Var.a;
                                    } else {
                                        i31 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(vpf.D(ar5Var, i31));
                                    i32 = 33;
                                    spannableString4.setSpan(styleSpan3, i29, i30, 33);
                                }
                                if (yp5Var == null) {
                                    if (yp5Var instanceof o66) {
                                        spannableString4.setSpan(new TypefaceSpan(((o66) yp5Var).f), i29, i30, i32);
                                    } else if (Build.VERSION.SDK_INT >= 28) {
                                        xq5Var = xtdVarA.e;
                                        if (xq5Var != null) {
                                            i34 = xq5Var.a;
                                        } else {
                                            i34 = 65535;
                                        }
                                        Object value2 = ((zp5) fontFamilyResolver).b(yp5Var, ar5.w, 0, i34).getValue();
                                        value2.getClass();
                                        i32 = 33;
                                        spannableString4.setSpan(s.o((Typeface) value2), i29, i30, 33);
                                    } else {
                                        i32 = 33;
                                    }
                                }
                                if (mneVar != null) {
                                    i33 = mneVar.a;
                                    if ((i33 | 1) == i33) {
                                        spannableString4.setSpan(new UnderlineSpan(), i29, i30, i32);
                                    }
                                    if ((i33 | 2) == i33) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i29, i30, i32);
                                    }
                                }
                                if (cteVar != null) {
                                    spannableString4.setSpan(new ScaleXSpan(cteVar.a), i29, i30, i32);
                                }
                                q6c.n(spannableString4, xtdVarA.k, i29, i30);
                                j = xtdVarA.l;
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(abg.Z(j)), i29, i30, 33);
                                }
                                i28 = i413 + 1;
                                spannableString2 = spannableString4;
                                ywcVar6 = ywcVar6;
                                size9 = i412;
                                arrayList4 = arrayList8;
                                twcVar = twcVar6;
                                i5cVar = i5cVar5;
                                t6Var = t6Var6;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                w79Var = w79Var5;
                            }
                        }
                        ywcVar = ywcVar6;
                        twcVar2 = twcVar;
                        i5cVar2 = i5cVar;
                        w79Var2 = w79Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        t6Var2 = t6Var;
                        spannableString3 = spannableString2;
                        int length3 = str6.length();
                        arrayList5 = pu4.a;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size8 = list4.size();
                            for (i27 = 0; i27 < size8; i27++) {
                                Object obj4 = list4.get(i27);
                                j00Var4 = (j00) obj4;
                                if (!(j00Var4.a instanceof ftf)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size4 = arrayList6.size();
                        for (i19 = 0; i19 < size4; i19++) {
                            j00 j00Var9 = (j00) arrayList6.get(i19);
                            ftfVar = (ftf) j00Var9.a;
                            i25 = j00Var9.b;
                            i26 = j00Var9.c;
                            if (ftfVar instanceof ftf) {
                                ap.c();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ftfVar.a).build(), i25, i26, 33);
                        }
                        int length4 = str6.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size7 = list4.size();
                            for (i24 = 0; i24 < size7; i24++) {
                                Object obj5 = list4.get(i24);
                                j00Var3 = (j00) obj5;
                                if (!(j00Var3.a instanceof shf)) {
                                }
                            }
                        }
                        size5 = arrayList5.size();
                        for (i20 = 0; i20 < size5; i20++) {
                            j00 j00Var10 = (j00) arrayList5.get(i20);
                            shfVar = (shf) j00Var10.a;
                            int i414 = j00Var10.b;
                            int i415 = j00Var10.c;
                            weakHashMap3 = (WeakHashMap) psdVar.b;
                            uRLSpan2 = weakHashMap3.get(shfVar);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(shfVar.a);
                                weakHashMap3.put(shfVar, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i414, i415, 33);
                        }
                        listA = k00VarV.a(str6.length());
                        size6 = listA.size();
                        for (i21 = 0; i21 < size6; i21++) {
                            j00Var = (j00) listA.get(i21);
                            i22 = j00Var.b;
                            obj = j00Var.a;
                            i23 = j00Var.c;
                            if (i22 != i23) {
                                l68Var = (l68) obj;
                                if (l68Var instanceof k68) {
                                    obj.getClass();
                                    k68Var = (k68) obj;
                                    j00Var2 = new j00(k68Var, i22, i23);
                                    weakHashMap2 = (WeakHashMap) psdVar.c;
                                    uRLSpan = weakHashMap2.get(j00Var2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(k68Var.a);
                                        weakHashMap2.put(j00Var2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i22, i23, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) psdVar.d;
                                    ke2Var = weakHashMap.get(j00Var);
                                    if (ke2Var == null) {
                                        ke2Var = new ke2(l68Var);
                                        weakHashMap.put(j00Var, ke2Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) ke2Var, i22, i23, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) lq.P(spannableString3);
                    } else {
                        o69Var = o69Var;
                        ywcVar = ywcVar6;
                        twcVar2 = twcVar;
                        i5cVar2 = i5cVar;
                        w79Var2 = w79Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        t6Var2 = t6Var;
                        spannableString = null;
                    }
                    accessibilityNodeInfo.setText(spannableString);
                    gxcVar = cxc.O;
                    w79Var3 = w79Var2;
                    if (w79Var3.c(gxcVar)) {
                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        objG22 = w79Var3.g(gxcVar);
                        if (objG22 == null) {
                            objG22 = null;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objG22);
                    } else {
                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    }
                    ywcVar2 = ywcVar;
                    strU = bzd.u(ywcVar2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        p6.t(accessibilityNodeInfo, strU);
                    } else {
                        accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strU);
                    }
                    accessibilityNodeInfo3.setCheckable(bzd.t(ywcVar2));
                    objG2 = w79Var3.g(cxc.L);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    yyeVar = (yye) objG2;
                    if (yyeVar != null) {
                        if (yyeVar == yye.a) {
                            accessibilityNodeInfo.setChecked(true);
                        } else if (yyeVar == yye.b) {
                            accessibilityNodeInfo.setChecked(false);
                        }
                    }
                    objG3 = w79Var3.g(cxc.K);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (i5cVar2 == null) {
                            i5cVar3 = i5cVar2;
                            i6 = 4;
                        } else {
                            i5cVar3 = i5cVar2;
                            i6 = 4;
                            if (i5cVar3.a == 4) {
                                accessibilityNodeInfo3.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo.setChecked(zBooleanValue2);
                    } else {
                        i5cVar3 = i5cVar2;
                        i6 = 4;
                    }
                    twcVar3 = twcVar2;
                    if (twcVar3.c) {
                        objG4 = w79Var3.g(cxc.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) s72.x0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo3.setContentDescription(str);
                    } else {
                        objG4 = w79Var3.g(cxc.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) s72.x0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo3.setContentDescription(str);
                    }
                    objG5 = w79Var3.g(cxc.A);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    str2 = (String) objG5;
                    if (str2 != null) {
                        ywcVarL4 = ywcVar2;
                        while (true) {
                            if (ywcVarL4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            twcVar4 = ywcVarL4.d;
                            gxcVar5 = oa7.f;
                            if (twcVar4.a.c(gxcVar5)) {
                                zBooleanValue = ((Boolean) twcVar4.e(gxcVar5)).booleanValue();
                                break;
                            }
                            ywcVarL4 = ywcVarL4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo3.setViewIdResourceName(str2);
                        }
                    }
                    objG6 = w79Var3.g(cxc.h);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    if (((wef) objG6) != null) {
                        t6Var3 = t6Var2;
                        t6Var3.i(true);
                    } else {
                        t6Var3 = t6Var2;
                    }
                    objG7 = w79Var3.g(cxc.i);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (((wef) objG7) != null) {
                        t6Var3.l();
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = o69Var.d(ywcVar2.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfo3.setDrawingOrder(iD3);
                        } else {
                            b1.l("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo3.setPassword(w79Var3.c(cxc.N));
                    objG8 = w79Var3.g(cxc.Q);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo3.setEditable(pa7.t(objG8, bool2));
                    objG9 = w79Var3.g(cxc.R);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    num = (Integer) objG9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo3.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo3.setEnabled(bzd.r(ywcVar2));
                    gxcVar2 = cxc.l;
                    accessibilityNodeInfo3.setFocusable(w79Var3.c(gxcVar2));
                    if (accessibilityNodeInfo3.isFocusable()) {
                        accessibilityNodeInfo3.setFocused(((Boolean) twcVar3.e(gxcVar2)).booleanValue());
                        if (accessibilityNodeInfo3.isFocused()) {
                            t6Var3.a(2);
                            lqVar = lqVar2;
                            lqVar.z = i7;
                        } else {
                            lqVar = lqVar2;
                            z2 = true;
                            t6Var3.a(1);
                        }
                        accessibilityNodeInfo.setVisibleToUser(x57.X(ywcVar2) ^ z2);
                        if (ywcVar2.n()) {
                            ywcVarL2 = ywcVar2.l();
                            ywcVarL2.getClass();
                        } else {
                            ywcVarL2 = ywcVar2;
                        }
                        if (ywcVarL2.m().h()) {
                            accessibilityNodeInfo.setVisibleToUser(false);
                        }
                        objG10 = w79Var3.g(cxc.k);
                        if (objG10 == null) {
                            objG10 = null;
                        }
                        s98Var = (s98) objG10;
                        if (s98Var != null) {
                            i17 = s98Var.a;
                            if (i17 == 0) {
                                i18 = 1;
                            } else {
                                i18 = 2;
                            }
                            accessibilityNodeInfo3.setLiveRegion(i18);
                        }
                        accessibilityNodeInfo.setClickable(false);
                        objG11 = w79Var3.g(swc.b);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        f6Var = (f6) objG11;
                        if (f6Var != null) {
                            objG21 = w79Var3.g(cxc.K);
                            if (objG21 == null) {
                                objG21 = null;
                            }
                            boolean zT6 = pa7.t(objG21, bool2);
                            if (i5cVar3 == null) {
                            }
                            if (z5) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            accessibilityNodeInfo.setClickable(z6);
                            if (bzd.r(ywcVar2)) {
                                t6Var3.b(new o6(null, 16, f6Var.a, null));
                            }
                        }
                        accessibilityNodeInfo.setLongClickable(false);
                        objG12 = w79Var3.g(swc.c);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        f6Var2 = (f6) objG12;
                        if (f6Var2 != null) {
                            accessibilityNodeInfo.setLongClickable(true);
                            if (bzd.r(ywcVar2)) {
                                t6Var3.b(new o6(null, 32, f6Var2.a, null));
                            }
                        }
                        objG13 = w79Var3.g(swc.q);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        f6Var3 = (f6) objG13;
                        if (f6Var3 != null) {
                            t6Var3.b(new o6(16384, f6Var3.a));
                        }
                        if (bzd.r(ywcVar2)) {
                            f6Var9 = (f6) jcc.f(twcVar3, swc.k);
                            if (f6Var9 != null) {
                                t6Var3.b(new o6(2097152, f6Var9.a));
                            }
                            f6Var10 = (f6) jcc.f(twcVar3, swc.p);
                            if (f6Var10 != null) {
                                t6Var3.b(new o6(android.R.id.accessibilityActionImeEnter, f6Var10.a));
                            }
                            f6Var11 = (f6) jcc.f(twcVar3, swc.r);
                            if (f6Var11 != null) {
                                t6Var3.b(new o6(65536, f6Var11.a));
                            }
                            f6Var12 = (f6) jcc.f(twcVar3, swc.s);
                            if (f6Var12 != null) {
                                primaryClipDescription = ((k47) androidComposeView2.getClipboardManager()).A().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    t6Var3.b(new o6(32768, f6Var12.a));
                                }
                            }
                        }
                        strT = lq.t(ywcVar2);
                        if (strT != null) {
                            accessibilityNodeInfo3.setTextSelection(lqVar.r(ywcVar2), lqVar.q(ywcVar2));
                            f6Var8 = (f6) jcc.f(twcVar3, swc.j);
                            if (f6Var8 != null) {
                                str4 = f6Var8.a;
                            } else {
                                str4 = null;
                            }
                            t6Var3.b(new o6(131072, str4));
                            t6Var3.a(256);
                            t6Var3.a(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            list3 = (List) jcc.f(twcVar3, cxc.a);
                            if (list3 != null) {
                                layoutNodeF = layoutNode2.F();
                                while (true) {
                                    if (layoutNodeF == null) {
                                        layoutNodeF = null;
                                        break;
                                    }
                                    twcVarH2 = layoutNodeF.H();
                                    if (twcVarH2 == null) {
                                    }
                                    layoutNodeF = layoutNodeF.F();
                                }
                                if (layoutNodeF == null) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                } else {
                                    twcVarH = layoutNodeF.H();
                                    if (twcVarH != null) {
                                        objG20 = twcVarH.a.g(cxc.l);
                                        if (objG20 == null) {
                                            objG20 = null;
                                        }
                                        zT = pa7.t(objG20, Boolean.TRUE);
                                    } else {
                                        zT = false;
                                    }
                                    if (zT) {
                                        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                layoutNodeF = layoutNode2.F();
                                while (true) {
                                    if (layoutNodeF == null) {
                                        layoutNodeF = null;
                                        break;
                                    }
                                    twcVarH2 = layoutNodeF.H();
                                    if (twcVarH2 == null) {
                                    }
                                    layoutNodeF = layoutNodeF.F();
                                }
                                if (layoutNodeF == null) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                } else {
                                    twcVarH = layoutNodeF.H();
                                    if (twcVarH != null) {
                                        objG20 = twcVarH.a.g(cxc.l);
                                        if (objG20 == null) {
                                            objG20 = null;
                                        }
                                        zT = pa7.t(objG20, Boolean.TRUE);
                                    } else {
                                        zT = false;
                                    }
                                    if (zT) {
                                        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceF = t6Var3.f();
                        if (charSequenceF != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (w79Var3.c(cxc.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (w79Var3.c(cxc.S)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                        rwaVar = (rwa) jcc.f(twcVar3, cxc.c);
                        if (rwaVar != null) {
                            f = rwaVar.a;
                            b62Var = rwaVar.b;
                            gxcVar4 = swc.i;
                            if (w79Var3.c(gxcVar4)) {
                                t6Var3.h("android.widget.SeekBar");
                            } else {
                                t6Var3.h("android.widget.ProgressBar");
                            }
                            if (rwaVar != rwa.d) {
                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, b62Var.a, b62Var.b, f));
                            }
                            if (w79Var3.c(gxcVar4)) {
                                f2 = b62Var.b;
                                f3 = b62Var.a;
                                if (f2 < f3) {
                                    f2 = f3;
                                }
                                if (f < f2) {
                                    t6Var3.b(o6.e);
                                }
                                f4 = b62Var.b;
                                if (f3 > f4) {
                                    f3 = f4;
                                }
                                if (f > f3) {
                                    t6Var3.b(o6.f);
                                }
                            }
                        }
                        if (bzd.r(ywcVar2)) {
                            t6Var3.b(new o6(android.R.id.accessibilityActionSetProgress, f6Var7.a));
                        }
                        z5c.J(t6Var3, ywcVar2);
                        objG14 = ywcVar2.k().a.g(cxc.g);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            ywcVarL3 = ywcVar2.l();
                            if (ywcVarL3 != null) {
                                objG17 = ywcVarL3.k().a.g(cxc.e);
                                if (objG17 == null) {
                                    objG17 = null;
                                }
                                if (objG17 != null) {
                                    objG18 = ywcVarL3.k().a.g(cxc.f);
                                    if (objG18 == null) {
                                        objG18 = null;
                                    }
                                    p72Var = (p72) objG18;
                                    if (p72Var != null) {
                                        if (ywcVar2.k().a.c(cxc.K)) {
                                            arrayList3 = new ArrayList();
                                            listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                            size3 = listI2.size();
                                            i14 = 0;
                                            for (i13 = 0; i13 < size3; i13++) {
                                                ywcVar3 = (ywc) listI2.get(i13);
                                                if (ywcVar3.k().a.c(cxc.K)) {
                                                    arrayList3.add(ywcVar3);
                                                    if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                        i14++;
                                                    }
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                zO = z5c.o(arrayList3);
                                                if (zO) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = i14;
                                                }
                                                if (zO) {
                                                    i16 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                                objG19 = ywcVar2.k().a.g(cxc.K);
                                                if (objG19 == null) {
                                                    objG19 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                            }
                                        }
                                    } else if (ywcVar2.k().a.c(cxc.K)) {
                                        arrayList3 = new ArrayList();
                                        listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                        size3 = listI2.size();
                                        i14 = 0;
                                        while (i13 < size3) {
                                            ywcVar3 = (ywc) listI2.get(i13);
                                            if (ywcVar3.k().a.c(cxc.K)) {
                                                arrayList3.add(ywcVar3);
                                                if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            zO = z5c.o(arrayList3);
                                            if (zO) {
                                                i15 = 0;
                                            } else {
                                                i15 = i14;
                                            }
                                            if (zO) {
                                                i16 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            objG19 = ywcVar2.k().a.g(cxc.K);
                                            if (objG19 == null) {
                                                objG19 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                        }
                                    }
                                }
                            }
                        } else {
                            r3.f();
                        }
                        rgcVar = (rgc) jcc.f(twcVar3, cxc.v);
                        f6 f6Var15 = (f6) jcc.f(twcVar3, swc.d);
                        if (rgcVar != null) {
                            objG15 = ywcVar2.k().a.g(cxc.f);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 == null) {
                                objG16 = ywcVar2.k().a.g(cxc.e);
                                if (objG16 == null) {
                                    objG16 = null;
                                }
                                if (objG16 == null) {
                                    t6Var3.h("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) rgcVar.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (bzd.r(ywcVar2)) {
                                z4 = lq.z(rgcVar);
                                cv7Var = cv7.b;
                                if (z4) {
                                    t6Var3.b(o6.e);
                                    if (layoutNode.P0 == cv7Var) {
                                        layoutNode = layoutNode2;
                                        o6Var2 = o6.h;
                                    } else {
                                        layoutNode = layoutNode2;
                                        o6Var2 = o6.j;
                                    }
                                    t6Var3.b(o6Var2);
                                } else {
                                    layoutNode = layoutNode2;
                                }
                                if (lq.y(rgcVar)) {
                                    t6Var3.b(o6.f);
                                    if (layoutNode.P0 == cv7Var) {
                                        o6Var = o6.j;
                                    } else {
                                        o6Var = o6.h;
                                    }
                                    t6Var3.b(o6Var);
                                }
                            }
                        }
                        rgcVar2 = (rgc) jcc.f(twcVar3, cxc.w);
                        if (rgcVar2 != null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            z5c.h(t6Var3, ywcVar2);
                        }
                        t6Var3.j((CharSequence) jcc.f(twcVar3, cxc.d));
                        if (bzd.r(ywcVar2)) {
                            f6Var4 = (f6) jcc.f(twcVar3, swc.t);
                            if (f6Var4 != null) {
                                t6Var3.b(new o6(262144, f6Var4.a));
                            }
                            f6Var5 = (f6) jcc.f(twcVar3, swc.u);
                            if (f6Var5 != null) {
                                t6Var3.b(new o6(524288, f6Var5.a));
                            }
                            f6Var6 = (f6) jcc.f(twcVar3, swc.v);
                            if (f6Var6 != null) {
                                t6Var3.b(new o6(1048576, f6Var6.a));
                            }
                            gxcVar3 = swc.x;
                            if (w79Var3.c(gxcVar3)) {
                                list2 = (List) twcVar3.e(gxcVar3);
                                size2 = list2.size();
                                p69Var = lq.c1;
                                i8 = p69Var.b;
                                if (size2 < i8) {
                                    qc0.p(tec.f(i8, "Can't have more than ", " custom actions for one widget"));
                                    return null;
                                }
                                fud fudVar6 = new fud(0);
                                e79 e79VarA3 = ok9.a();
                                fudVar3 = fudVar2;
                                if (fudVar3.a) {
                                    abg.x(fudVar3);
                                }
                                if (cgg.q(fudVar3.d, i7, fudVar3.b) < 0) {
                                    z3 = false;
                                }
                                if (z3) {
                                    e79Var = (e79) abg.q(fudVar3, i7);
                                    iArr = p69Var.a;
                                    i9 = p69Var.b;
                                    iArrCopyOf = new int[16];
                                    i10 = 0;
                                    i11 = 0;
                                    while (i10 < i9) {
                                        int i416 = iArr[i10];
                                        int i417 = i9;
                                        i12 = i11 + 1;
                                        int i418 = i10;
                                        if (iArrCopyOf.length < i12) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i11] = i416;
                                        i10 = i418 + 1;
                                        i11 = i12;
                                        i9 = i417;
                                    }
                                    arrayList2 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        kv2.z(list2.get(0));
                                        e79Var.getClass();
                                        throw null;
                                    }
                                    if (arrayList2.size() <= 0) {
                                        kv2.z(arrayList2.get(0));
                                        if (i11 <= 0) {
                                            r3.i("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i419 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    kv2.z(list2.get(0));
                                    p69Var.a(0);
                                    throw null;
                                }
                                lqVar.G0.c(i7, fudVar6);
                                fudVar3.c(i7, e79VarA3);
                            }
                        }
                        t6Var3.k(bzd.B(ywcVar2, resources));
                        iD = lqVar.Q0.d(i7);
                        if (iD != -1) {
                            axVarK2 = ndc.k(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                            if (axVarK2 != null) {
                                accessibilityNodeInfo.setTraversalBefore(axVarK2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                accessibilityNodeInfo.setTraversalBefore(androidComposeView, iD);
                            }
                            bundle = null;
                            lqVar.j(i7, t6Var3, lqVar.S0, null);
                        } else {
                            androidComposeView = androidComposeView2;
                            bundle = null;
                        }
                        iD2 = lqVar.R0.d(i7);
                        if (iD2 != -1) {
                            accessibilityNodeInfo.setTraversalAfter(axVarK);
                            lqVar.j(i7, t6Var3, lqVar.T0, bundle);
                        }
                        str3 = (String) jcc.f(twcVar3, oa7.g);
                        if (str3 != null) {
                            t6Var3.h(str3);
                        }
                        t6Var4 = t6Var3;
                    } else {
                        lqVar = lqVar2;
                    }
                    z2 = true;
                    accessibilityNodeInfo.setVisibleToUser(x57.X(ywcVar2) ^ z2);
                    if (ywcVar2.n()) {
                        ywcVarL2 = ywcVar2.l();
                        ywcVarL2.getClass();
                    } else {
                        ywcVarL2 = ywcVar2;
                    }
                    if (ywcVarL2.m().h()) {
                        accessibilityNodeInfo.setVisibleToUser(false);
                    }
                    objG10 = w79Var3.g(cxc.k);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    s98Var = (s98) objG10;
                    if (s98Var != null) {
                        i17 = s98Var.a;
                        if (i17 == 0) {
                            i18 = 1;
                        } else {
                            i18 = 2;
                        }
                        accessibilityNodeInfo3.setLiveRegion(i18);
                    }
                    accessibilityNodeInfo.setClickable(false);
                    objG11 = w79Var3.g(swc.b);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    f6Var = (f6) objG11;
                    if (f6Var != null) {
                        objG21 = w79Var3.g(cxc.K);
                        if (objG21 == null) {
                            objG21 = null;
                        }
                        boolean zT7 = pa7.t(objG21, bool2);
                        if (i5cVar3 == null) {
                        }
                        if (z5) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        accessibilityNodeInfo.setClickable(z6);
                        if (bzd.r(ywcVar2)) {
                            t6Var3.b(new o6(null, 16, f6Var.a, null));
                        }
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    objG12 = w79Var3.g(swc.c);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    f6Var2 = (f6) objG12;
                    if (f6Var2 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (bzd.r(ywcVar2)) {
                            t6Var3.b(new o6(null, 32, f6Var2.a, null));
                        }
                    }
                    objG13 = w79Var3.g(swc.q);
                    if (objG13 == null) {
                        objG13 = null;
                    }
                    f6Var3 = (f6) objG13;
                    if (f6Var3 != null) {
                        t6Var3.b(new o6(16384, f6Var3.a));
                    }
                    if (bzd.r(ywcVar2)) {
                        f6Var9 = (f6) jcc.f(twcVar3, swc.k);
                        if (f6Var9 != null) {
                            t6Var3.b(new o6(2097152, f6Var9.a));
                        }
                        f6Var10 = (f6) jcc.f(twcVar3, swc.p);
                        if (f6Var10 != null) {
                            t6Var3.b(new o6(android.R.id.accessibilityActionImeEnter, f6Var10.a));
                        }
                        f6Var11 = (f6) jcc.f(twcVar3, swc.r);
                        if (f6Var11 != null) {
                            t6Var3.b(new o6(65536, f6Var11.a));
                        }
                        f6Var12 = (f6) jcc.f(twcVar3, swc.s);
                        if (f6Var12 != null) {
                            primaryClipDescription = ((k47) androidComposeView2.getClipboardManager()).A().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                t6Var3.b(new o6(32768, f6Var12.a));
                            }
                        }
                    }
                    strT = lq.t(ywcVar2);
                    if (strT != null) {
                        accessibilityNodeInfo3.setTextSelection(lqVar.r(ywcVar2), lqVar.q(ywcVar2));
                        f6Var8 = (f6) jcc.f(twcVar3, swc.j);
                        if (f6Var8 != null) {
                            str4 = f6Var8.a;
                        } else {
                            str4 = null;
                        }
                        t6Var3.b(new o6(131072, str4));
                        t6Var3.a(256);
                        t6Var3.a(512);
                        accessibilityNodeInfo.setMovementGranularities(11);
                        list3 = (List) jcc.f(twcVar3, cxc.a);
                        if (list3 != null) {
                            layoutNodeF = layoutNode2.F();
                            while (true) {
                                if (layoutNodeF == null) {
                                    layoutNodeF = null;
                                    break;
                                }
                                twcVarH2 = layoutNodeF.H();
                                if (twcVarH2 == null) {
                                }
                                layoutNodeF = layoutNodeF.F();
                            }
                            if (layoutNodeF == null) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            } else {
                                twcVarH = layoutNodeF.H();
                                if (twcVarH != null) {
                                    objG20 = twcVarH.a.g(cxc.l);
                                    if (objG20 == null) {
                                        objG20 = null;
                                    }
                                    zT = pa7.t(objG20, Boolean.TRUE);
                                } else {
                                    zT = false;
                                }
                                if (zT) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            layoutNodeF = layoutNode2.F();
                            while (true) {
                                if (layoutNodeF == null) {
                                    layoutNodeF = null;
                                    break;
                                }
                                twcVarH2 = layoutNodeF.H();
                                if (twcVarH2 == null) {
                                }
                                layoutNodeF = layoutNodeF.F();
                            }
                            if (layoutNodeF == null) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            } else {
                                twcVarH = layoutNodeF.H();
                                if (twcVarH != null) {
                                    objG20 = twcVarH.a.g(cxc.l);
                                    if (objG20 == null) {
                                        objG20 = null;
                                    }
                                    zT = pa7.t(objG20, Boolean.TRUE);
                                } else {
                                    zT = false;
                                }
                                if (zT) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceF = t6Var3.f();
                    if (charSequenceF != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (w79Var3.c(cxc.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (w79Var3.c(cxc.S)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                    rwaVar = (rwa) jcc.f(twcVar3, cxc.c);
                    if (rwaVar != null) {
                        f = rwaVar.a;
                        b62Var = rwaVar.b;
                        gxcVar4 = swc.i;
                        if (w79Var3.c(gxcVar4)) {
                            t6Var3.h("android.widget.SeekBar");
                        } else {
                            t6Var3.h("android.widget.ProgressBar");
                        }
                        if (rwaVar != rwa.d) {
                            accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, b62Var.a, b62Var.b, f));
                        }
                        if (w79Var3.c(gxcVar4)) {
                            f2 = b62Var.b;
                            f3 = b62Var.a;
                            if (f2 < f3) {
                                f2 = f3;
                            }
                            if (f < f2) {
                                t6Var3.b(o6.e);
                            }
                            f4 = b62Var.b;
                            if (f3 > f4) {
                                f3 = f4;
                            }
                            if (f > f3) {
                                t6Var3.b(o6.f);
                            }
                        }
                    }
                    if (bzd.r(ywcVar2)) {
                        t6Var3.b(new o6(android.R.id.accessibilityActionSetProgress, f6Var7.a));
                    }
                    z5c.J(t6Var3, ywcVar2);
                    objG14 = ywcVar2.k().a.g(cxc.g);
                    if (objG14 == null) {
                        objG14 = null;
                    }
                    if (objG14 == null) {
                        ywcVarL3 = ywcVar2.l();
                        if (ywcVarL3 != null) {
                            objG17 = ywcVarL3.k().a.g(cxc.e);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            if (objG17 != null) {
                                objG18 = ywcVarL3.k().a.g(cxc.f);
                                if (objG18 == null) {
                                    objG18 = null;
                                }
                                p72Var = (p72) objG18;
                                if (p72Var != null) {
                                    if (ywcVar2.k().a.c(cxc.K)) {
                                        arrayList3 = new ArrayList();
                                        listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                        size3 = listI2.size();
                                        i14 = 0;
                                        while (i13 < size3) {
                                            ywcVar3 = (ywc) listI2.get(i13);
                                            if (ywcVar3.k().a.c(cxc.K)) {
                                                arrayList3.add(ywcVar3);
                                                if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            zO = z5c.o(arrayList3);
                                            if (zO) {
                                                i15 = 0;
                                            } else {
                                                i15 = i14;
                                            }
                                            if (zO) {
                                                i16 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            objG19 = ywcVar2.k().a.g(cxc.K);
                                            if (objG19 == null) {
                                                objG19 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                        }
                                    }
                                } else if (ywcVar2.k().a.c(cxc.K)) {
                                    arrayList3 = new ArrayList();
                                    listI2 = ywcVarL3.i((4 & 1) != 0 ? !ywcVarL3.b : false, (4 & 2) == 0);
                                    size3 = listI2.size();
                                    i14 = 0;
                                    while (i13 < size3) {
                                        ywcVar3 = (ywc) listI2.get(i13);
                                        if (ywcVar3.k().a.c(cxc.K)) {
                                            arrayList3.add(ywcVar3);
                                            if (ywcVar3.c.G() < ywcVar2.c.G()) {
                                                i14++;
                                            }
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        zO = z5c.o(arrayList3);
                                        if (zO) {
                                            i15 = 0;
                                        } else {
                                            i15 = i14;
                                        }
                                        if (zO) {
                                            i16 = i14;
                                        } else {
                                            i16 = 0;
                                        }
                                        objG19 = ywcVar2.k().a.g(cxc.K);
                                        if (objG19 == null) {
                                            objG19 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG19).booleanValue()));
                                    }
                                }
                            }
                        }
                    } else {
                        r3.f();
                    }
                    rgcVar = (rgc) jcc.f(twcVar3, cxc.v);
                    f6 f6Var16 = (f6) jcc.f(twcVar3, swc.d);
                    if (rgcVar != null) {
                        objG15 = ywcVar2.k().a.g(cxc.f);
                        if (objG15 == null) {
                            objG15 = null;
                        }
                        if (objG15 == null) {
                            objG16 = ywcVar2.k().a.g(cxc.e);
                            if (objG16 == null) {
                                objG16 = null;
                            }
                            if (objG16 == null) {
                                t6Var3.h("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) rgcVar.b.invoke()).floatValue() > 0.0f) {
                            accessibilityNodeInfo.setScrollable(true);
                        }
                        if (bzd.r(ywcVar2)) {
                            z4 = lq.z(rgcVar);
                            cv7Var = cv7.b;
                            if (z4) {
                                t6Var3.b(o6.e);
                                if (layoutNode.P0 == cv7Var) {
                                    layoutNode = layoutNode2;
                                    o6Var2 = o6.h;
                                } else {
                                    layoutNode = layoutNode2;
                                    o6Var2 = o6.j;
                                }
                                t6Var3.b(o6Var2);
                            } else {
                                layoutNode = layoutNode2;
                            }
                            if (lq.y(rgcVar)) {
                                t6Var3.b(o6.f);
                                if (layoutNode.P0 == cv7Var) {
                                    o6Var = o6.j;
                                } else {
                                    o6Var = o6.h;
                                }
                                t6Var3.b(o6Var);
                            }
                        }
                    }
                    rgcVar2 = (rgc) jcc.f(twcVar3, cxc.w);
                    if (rgcVar2 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        z5c.h(t6Var3, ywcVar2);
                    }
                    t6Var3.j((CharSequence) jcc.f(twcVar3, cxc.d));
                    if (bzd.r(ywcVar2)) {
                        f6Var4 = (f6) jcc.f(twcVar3, swc.t);
                        if (f6Var4 != null) {
                            t6Var3.b(new o6(262144, f6Var4.a));
                        }
                        f6Var5 = (f6) jcc.f(twcVar3, swc.u);
                        if (f6Var5 != null) {
                            t6Var3.b(new o6(524288, f6Var5.a));
                        }
                        f6Var6 = (f6) jcc.f(twcVar3, swc.v);
                        if (f6Var6 != null) {
                            t6Var3.b(new o6(1048576, f6Var6.a));
                        }
                        gxcVar3 = swc.x;
                        if (w79Var3.c(gxcVar3)) {
                            list2 = (List) twcVar3.e(gxcVar3);
                            size2 = list2.size();
                            p69Var = lq.c1;
                            i8 = p69Var.b;
                            if (size2 < i8) {
                                qc0.p(tec.f(i8, "Can't have more than ", " custom actions for one widget"));
                                return null;
                            }
                            fud fudVar7 = new fud(0);
                            e79 e79VarA4 = ok9.a();
                            fudVar3 = fudVar2;
                            if (fudVar3.a) {
                                abg.x(fudVar3);
                            }
                            if (cgg.q(fudVar3.d, i7, fudVar3.b) < 0) {
                                z3 = false;
                            }
                            if (z3) {
                                e79Var = (e79) abg.q(fudVar3, i7);
                                iArr = p69Var.a;
                                i9 = p69Var.b;
                                iArrCopyOf = new int[16];
                                i10 = 0;
                                i11 = 0;
                                while (i10 < i9) {
                                    int i4110 = iArr[i10];
                                    int i4111 = i9;
                                    i12 = i11 + 1;
                                    int i4112 = i10;
                                    if (iArrCopyOf.length < i12) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i11] = i4110;
                                    i10 = i4112 + 1;
                                    i11 = i12;
                                    i9 = i4111;
                                }
                                arrayList2 = new ArrayList();
                                if (list2.size() <= 0) {
                                    kv2.z(list2.get(0));
                                    e79Var.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() <= 0) {
                                    kv2.z(arrayList2.get(0));
                                    if (i11 <= 0) {
                                        r3.i("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i4113 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                kv2.z(list2.get(0));
                                p69Var.a(0);
                                throw null;
                            }
                            lqVar.G0.c(i7, fudVar7);
                            fudVar3.c(i7, e79VarA4);
                        }
                    }
                    t6Var3.k(bzd.B(ywcVar2, resources));
                    iD = lqVar.Q0.d(i7);
                    if (iD != -1) {
                        axVarK2 = ndc.k(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                        if (axVarK2 != null) {
                            accessibilityNodeInfo.setTraversalBefore(axVarK2);
                            androidComposeView = androidComposeView2;
                        } else {
                            androidComposeView = androidComposeView2;
                            accessibilityNodeInfo.setTraversalBefore(androidComposeView, iD);
                        }
                        bundle = null;
                        lqVar.j(i7, t6Var3, lqVar.S0, null);
                    } else {
                        androidComposeView = androidComposeView2;
                        bundle = null;
                    }
                    iD2 = lqVar.R0.d(i7);
                    if (iD2 != -1) {
                        accessibilityNodeInfo.setTraversalAfter(axVarK);
                        lqVar.j(i7, t6Var3, lqVar.T0, bundle);
                    }
                    str3 = (String) jcc.f(twcVar3, oa7.g);
                    if (str3 != null) {
                        t6Var3.h(str3);
                    }
                    t6Var4 = t6Var3;
                } else {
                    lqVar = lqVar2;
                    i7 = i;
                    t6Var4 = null;
                }
            }
        }
        if (lqVar.Z) {
            if (i7 == lqVar.y) {
                lqVar.X = t6Var4;
            }
            if (i7 == lqVar.z) {
                lqVar.Y = t6Var4;
            }
        }
        return t6Var4;
    }
}

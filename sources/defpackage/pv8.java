package defpackage;

import androidx.work.OverwritingInputMerger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pv8 extends nv8 {
    public static final pv8 d = new pv8(11, 12, 0);
    public static final pv8 e = new pv8(12, 13, 1);
    public static final pv8 f = new pv8(15, 16, 2);
    public static final pv8 g = new pv8(16, 17, 3);
    public static final pv8 h = new pv8(1, 2, 4);
    public static final pv8 i = new pv8(3, 4, 5);
    public static final pv8 j = new pv8(4, 5, 6);
    public static final pv8 k = new pv8(6, 7, 7);
    public static final pv8 l = new pv8(7, 8, 8);
    public static final pv8 m = new pv8(8, 9, 9);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv8(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }

    @Override // defpackage.nv8
    public final void b(f9e f9eVar) {
        int i2 = this.c;
        f9eVar.getClass();
        switch (i2) {
            case 0:
                f9eVar.z("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                f9eVar.z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                f9eVar.z("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                break;
            case 2:
                f9eVar.z("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                f9eVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                f9eVar.z("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                f9eVar.z("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                f9eVar.z("DROP TABLE `SystemIdInfo`");
                f9eVar.z("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                break;
            case 3:
                f9eVar.z(w4e.p("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                f9eVar.z("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                f9eVar.z("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                f9eVar.z("DROP TABLE `WorkSpec`");
                f9eVar.z("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                f9eVar.z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                f9eVar.z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                break;
            case 4:
                f9eVar.z("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                f9eVar.z("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                f9eVar.z("DROP TABLE IF EXISTS alarmInfo");
                f9eVar.z("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            case 5:
                f9eVar.z("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                break;
            case 6:
                f9eVar.z("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                f9eVar.z("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                f9eVar.z("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                break;
            case 8:
                f9eVar.z("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                break;
            case 9:
                f9eVar.z("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                f9eVar.z("DELETE FROM PersonalityReportEntity");
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                f9eVar.z("ALTER TABLE divination ADD COLUMN divinationType TEXT DEFAULT NULL");
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                f9eVar.z("ALTER TABLE divination ADD COLUMN usedSkinType TEXT DEFAULT NULL");
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                f9eVar.z("ALTER TABLE divination ADD COLUMN aiRecommendedSpreads TEXT DEFAULT NULL");
                break;
            case 14:
                f9eVar.z("CREATE TABLE IF NOT EXISTS `quick_decision` (\n  `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  `cardKey` TEXT NOT NULL,\n  `isReversed` INTEGER NOT NULL,\n  `answer` TEXT NOT NULL,\n  `tagline` TEXT NOT NULL,\n  `reading` TEXT NOT NULL,\n  `drawnAt` TEXT NOT NULL\n)");
                break;
            case 15:
                f9eVar.z("ALTER TABLE divination ADD COLUMN selectedAiSpreadIndex INTEGER DEFAULT NULL");
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                f9eVar.z("ALTER TABLE divination RENAME TO divination_old");
                f9eVar.z("CREATE TABLE IF NOT EXISTS `divination` (\n  `id` TEXT NOT NULL,\n  `createAt` TEXT NOT NULL,\n  `updateAt` TEXT NOT NULL,\n  `drawnAt` TEXT,\n  `title` TEXT NOT NULL,\n  `messageCount` INTEGER NOT NULL,\n  `content` TEXT NOT NULL,\n  `hasFeedback` INTEGER NOT NULL DEFAULT 0,\n  `sceneTarot` TEXT DEFAULT NULL,\n  `interruptedDrawing` TEXT DEFAULT NULL,\n  `divinationType` TEXT DEFAULT NULL,\n  `usedSkinType` TEXT DEFAULT NULL,\n  `aiRecommendedSpreads` TEXT DEFAULT NULL,\n  `selectedAiSpreadIndex` INTEGER DEFAULT NULL,\n  PRIMARY KEY(`id`)\n)");
                f9eVar.z("INSERT INTO divination (\n  id, createAt, updateAt, drawnAt, title, messageCount, content,\n  hasFeedback, sceneTarot, interruptedDrawing,\n  divinationType, usedSkinType, aiRecommendedSpreads, selectedAiSpreadIndex\n)\nSELECT id, createAt, updateAt, drawnAt, title, messageCount, content,\n  hasFeedback, sceneTarot, interruptedDrawing,\n  divinationType, usedSkinType, aiRecommendedSpreads, selectedAiSpreadIndex\nFROM divination_old");
                f9eVar.z("DROP TABLE divination_old");
                f9eVar.z("DROP TABLE IF EXISTS TarotRoleEntity");
                break;
            case 17:
                f9eVar.z("ALTER TABLE divination ADD COLUMN syncedAt TEXT DEFAULT NULL");
                f9eVar.z("ALTER TABLE divination ADD COLUMN deletedAt TEXT DEFAULT NULL");
                f9eVar.z("ALTER TABLE divination ADD COLUMN physicalDeckReading TEXT DEFAULT NULL");
                f9eVar.z("ALTER TABLE quick_decision ADD COLUMN chatId TEXT NOT NULL DEFAULT ''");
                f9eVar.z("ALTER TABLE quick_decision ADD COLUMN syncedAt TEXT DEFAULT NULL");
                f9eVar.z("UPDATE quick_decision SET chatId = 'qd-' || lower(hex(randomblob(16))) WHERE chatId = ''");
                f9eVar.z("ALTER TABLE divination ADD COLUMN accountId TEXT NOT NULL DEFAULT ''");
                f9eVar.z("ALTER TABLE quick_decision ADD COLUMN accountId TEXT NOT NULL DEFAULT ''");
                f9eVar.z("CREATE INDEX IF NOT EXISTS idx_divination_account ON divination(accountId, deletedAt, createAt)");
                f9eVar.z("CREATE INDEX IF NOT EXISTS idx_quick_decision_account ON quick_decision(accountId)");
                break;
            case 18:
                f9eVar.z("ALTER TABLE divination ADD COLUMN previewMessage TEXT NOT NULL DEFAULT ''");
                f9eVar.z("ALTER TABLE divination ADD COLUMN readState TEXT NOT NULL DEFAULT 'UNREAD'");
                f9eVar.z("ALTER TABLE divination ADD COLUMN summaryCards TEXT DEFAULT NULL");
                f9eVar.z("UPDATE divination SET readState = 'READ' WHERE content LIKE '%\"type\":\"CardsExplanation\"%'");
                break;
            case 19:
                f9eVar.z("CREATE TEMP TABLE divination_canonical_keep AS\nSELECT\n  lower(trim(d1.id)) AS canonicalId,\n  (\n    SELECT d2.id\n    FROM divination d2\n    WHERE lower(trim(d2.id)) = lower(trim(d1.id))\n    ORDER BY\n      CASE WHEN d2.deletedAt IS NULL THEN 0 ELSE 1 END,\n      CASE WHEN d2.id = lower(trim(d2.id)) THEN 0 ELSE 1 END,\n      d2.updateAt DESC,\n      d2.rowid DESC\n    LIMIT 1\n  ) AS keepId\nFROM divination d1\nGROUP BY lower(trim(d1.id))");
                f9eVar.z("CREATE TABLE IF NOT EXISTS divination_canonical (\n  id TEXT NOT NULL,\n  createAt TEXT NOT NULL,\n  updateAt TEXT NOT NULL,\n  drawnAt TEXT,\n  title TEXT NOT NULL,\n  messageCount INTEGER NOT NULL,\n  content TEXT NOT NULL,\n  hasFeedback INTEGER NOT NULL,\n  sceneTarot TEXT DEFAULT NULL,\n  interruptedDrawing TEXT DEFAULT NULL,\n  divinationType TEXT DEFAULT NULL,\n  usedSkinType TEXT DEFAULT NULL,\n  aiRecommendedSpreads TEXT DEFAULT NULL,\n  selectedAiSpreadIndex INTEGER DEFAULT NULL,\n  syncedAt TEXT DEFAULT NULL,\n  deletedAt TEXT DEFAULT NULL,\n  accountId TEXT NOT NULL DEFAULT '',\n  physicalDeckReading TEXT DEFAULT NULL,\n  previewMessage TEXT NOT NULL DEFAULT '',\n  readState TEXT NOT NULL DEFAULT 'UNREAD',\n  summaryCards TEXT DEFAULT NULL,\n  PRIMARY KEY(id)\n)");
                f9eVar.z("INSERT INTO divination_canonical (\n  id, createAt, updateAt, drawnAt, title, messageCount, content,\n  hasFeedback, sceneTarot, interruptedDrawing, divinationType, usedSkinType,\n  aiRecommendedSpreads, selectedAiSpreadIndex, syncedAt, deletedAt,\n  accountId, physicalDeckReading, previewMessage, readState, summaryCards\n)\nSELECT\n  k.canonicalId,\n  b.createAt,\n  b.updateAt,\n  b.drawnAt,\n  b.title,\n  b.messageCount,\n  b.content,\n  (SELECT MAX(x.hasFeedback) FROM divination x WHERE lower(trim(x.id)) = k.canonicalId),\n  COALESCE(\n    b.sceneTarot,\n    (SELECT x.sceneTarot FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.sceneTarot IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  COALESCE(\n    b.interruptedDrawing,\n    (SELECT x.interruptedDrawing FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.interruptedDrawing IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  COALESCE(\n    b.divinationType,\n    (SELECT x.divinationType FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.divinationType IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  COALESCE(\n    b.usedSkinType,\n    (SELECT x.usedSkinType FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.usedSkinType IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  COALESCE(\n    b.aiRecommendedSpreads,\n    (SELECT x.aiRecommendedSpreads FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.aiRecommendedSpreads IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  COALESCE(\n    b.selectedAiSpreadIndex,\n    (SELECT x.selectedAiSpreadIndex FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.selectedAiSpreadIndex IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  COALESCE(\n    b.syncedAt,\n    (SELECT x.syncedAt FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.syncedAt IS NOT NULL ORDER BY x.syncedAt DESC LIMIT 1)\n  ),\n  CASE\n    WHEN EXISTS (SELECT 1 FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.deletedAt IS NULL) THEN NULL\n    ELSE (SELECT MAX(x.deletedAt) FROM divination x WHERE lower(trim(x.id)) = k.canonicalId)\n  END,\n  b.accountId,\n  COALESCE(\n    b.physicalDeckReading,\n    (SELECT x.physicalDeckReading FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.physicalDeckReading IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  ),\n  b.previewMessage,\n  b.readState,\n  COALESCE(\n    b.summaryCards,\n    (SELECT x.summaryCards FROM divination x WHERE lower(trim(x.id)) = k.canonicalId AND x.summaryCards IS NOT NULL ORDER BY x.rowid DESC LIMIT 1)\n  )\nFROM divination_canonical_keep k\nJOIN divination b ON b.id = k.keepId");
                f9eVar.z("DROP TABLE divination");
                f9eVar.z("ALTER TABLE divination_canonical RENAME TO divination");
                f9eVar.z("CREATE INDEX IF NOT EXISTS idx_divination_account ON divination(accountId, deletedAt, createAt)");
                f9eVar.z("UPDATE DivinationPurchaseEntity\nSET chatId = lower(trim(chatId))");
                f9eVar.z("CREATE TEMP TABLE divination_summary_canonical_keep AS\nSELECT\n  lower(trim(s1.divinationId)) AS canonicalId,\n  (\n    SELECT s2.divinationId\n    FROM divination_summary s2\n    WHERE lower(trim(s2.divinationId)) = lower(trim(s1.divinationId))\n    ORDER BY\n      CASE WHEN s2.divinationId = lower(trim(s2.divinationId)) THEN 0 ELSE 1 END,\n      s2.rowid DESC\n    LIMIT 1\n  ) AS keepId\nFROM divination_summary s1\nGROUP BY lower(trim(s1.divinationId))");
                f9eVar.z("CREATE TABLE IF NOT EXISTS divination_summary_canonical (\n  divinationId TEXT NOT NULL,\n  theme TEXT NOT NULL,\n  summary TEXT NOT NULL,\n  advice TEXT NOT NULL,\n  PRIMARY KEY(divinationId)\n)");
                f9eVar.z("INSERT INTO divination_summary_canonical (divinationId, theme, summary, advice)\nSELECT k.canonicalId, s.theme, s.summary, s.advice\nFROM divination_summary_canonical_keep k\nJOIN divination_summary s ON s.divinationId = k.keepId");
                f9eVar.z("DROP TABLE divination_summary");
                f9eVar.z("ALTER TABLE divination_summary_canonical RENAME TO divination_summary");
                f9eVar.z("CREATE TEMP TABLE quick_decision_canonical_keep AS\nSELECT\n  lower(trim(q1.chatId)) AS canonicalChatId,\n  (\n    SELECT q2.id\n    FROM quick_decision q2\n    WHERE lower(trim(q2.chatId)) = lower(trim(q1.chatId))\n    ORDER BY\n      CASE WHEN q2.chatId = lower(trim(q2.chatId)) THEN 0 ELSE 1 END,\n      q2.drawnAt DESC,\n      q2.id DESC\n    LIMIT 1\n  ) AS keepId\nFROM quick_decision q1\nGROUP BY lower(trim(q1.chatId))");
                f9eVar.z("CREATE TABLE IF NOT EXISTS quick_decision_canonical (\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  cardKey TEXT NOT NULL,\n  isReversed INTEGER NOT NULL,\n  answer TEXT NOT NULL,\n  tagline TEXT NOT NULL,\n  reading TEXT NOT NULL,\n  drawnAt TEXT NOT NULL,\n  chatId TEXT NOT NULL DEFAULT '',\n  syncedAt TEXT DEFAULT NULL,\n  accountId TEXT NOT NULL DEFAULT ''\n)");
                f9eVar.z("INSERT INTO quick_decision_canonical (\n  id, cardKey, isReversed, answer, tagline, reading, drawnAt,\n  chatId, syncedAt, accountId\n)\nSELECT\n  q.id,\n  q.cardKey,\n  q.isReversed,\n  q.answer,\n  q.tagline,\n  q.reading,\n  q.drawnAt,\n  k.canonicalChatId,\n  q.syncedAt,\n  q.accountId\nFROM quick_decision_canonical_keep k\nJOIN quick_decision q ON q.id = k.keepId");
                f9eVar.z("DROP TABLE quick_decision");
                f9eVar.z("ALTER TABLE quick_decision_canonical RENAME TO quick_decision");
                f9eVar.z("CREATE INDEX IF NOT EXISTS idx_quick_decision_account ON quick_decision(accountId)");
                f9eVar.z("DROP TABLE divination_canonical_keep");
                f9eVar.z("DROP TABLE divination_summary_canonical_keep");
                f9eVar.z("DROP TABLE quick_decision_canonical_keep");
                break;
            case 20:
                f9eVar.z("CREATE TABLE IF NOT EXISTS `divination_summary` (\n    `divinationId` TEXT NOT NULL, \n    `theme` TEXT NOT NULL, \n    `summary` TEXT NOT NULL, \n    `advice` TEXT NOT NULL, \n    PRIMARY KEY(`divinationId`)\n);");
                break;
            case 21:
                f9eVar.z("ALTER TABLE divination ADD COLUMN isLocalOnly INTEGER NOT NULL DEFAULT 0");
                break;
            case 22:
                f9eVar.z("ALTER TABLE divination ADD COLUMN hasFeedback INTEGER NOT NULL DEFAULT 0");
                break;
            case 23:
                f9eVar.z("ALTER TABLE divination ADD COLUMN tarotRoleId TEXT NOT NULL DEFAULT Iris");
                break;
            case 24:
                f9eVar.z("ALTER TABLE divination ADD COLUMN photoTarot TEXT DEFAULT NULL");
                break;
            case 25:
                f9eVar.z("CREATE TABLE IF NOT EXISTS `tb_in_app_message` (\n    `message_id` TEXT NOT NULL,\n    `message_type` TEXT NOT NULL,\n    `region` TEXT NOT NULL,\n    `title` TEXT,\n    `content` TEXT NOT NULL,\n    `image_url` TEXT,\n    `intensity` TEXT NOT NULL,\n    `action` TEXT,\n    `action_tips` TEXT,\n    `attach` TEXT,\n    `created_at` TEXT NOT NULL,\n    PRIMARY KEY(`message_id`)\n)");
                break;
            case 26:
                f9eVar.z("CREATE TABLE IF NOT EXISTS `PersonalityReportEntity` (\n    `testId` TEXT NOT NULL,\n    `reportData` TEXT NOT NULL,\n    PRIMARY KEY(`testId`)\n)");
                break;
            case 27:
                f9eVar.z("CREATE TABLE IF NOT EXISTS `TarotRoleEntity` (\n    `id` TEXT NOT NULL,\n    `role` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                break;
            case 28:
                f9eVar.z("ALTER TABLE divination ADD COLUMN interruptedDrawing TEXT DEFAULT NULL");
                break;
            default:
                f9eVar.z("ALTER TABLE divination ADD COLUMN sceneTarot TEXT DEFAULT NULL");
                break;
        }
    }
}

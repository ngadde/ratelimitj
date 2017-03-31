package es.moki.ratelimitj.inmemory;

import es.moki.ratelimitj.core.api.LimitRule;
import es.moki.ratelimitj.core.api.RateLimiter;
import es.moki.ratelimitj.core.time.TimeSupplier;
import es.moki.ratelimitj.internal.test.AbstractSyncRateLimiterTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Set;


public class InMemoryTokenBucketSyncRateLimiterTest extends AbstractSyncRateLimiterTest {


    @BeforeAll
    public static void before() {

    }

    @AfterAll
    public static void after() {

    }

    @Override
    protected RateLimiter getRateLimiter(Set<LimitRule> rules, TimeSupplier timeSupplier) {
        return new InMemoryTokenBucketRateLimiter(rules, timeSupplier);
    }

    @Override
    @Test
    @Disabled
    public void shouldResetLimit() {

    }

}
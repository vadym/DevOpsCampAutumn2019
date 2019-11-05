✓ docker inspect --format='{{json
.State.Health}}' << container_name >>
Health statuses: starting, healthy,
unhealthy

The options that can appear before CMD
are:
--interval=DURATION(default:30s)
--timeout=DURATION(default:30s)
--start-period=DURATION(default:0s)
--retries=N(default:3)